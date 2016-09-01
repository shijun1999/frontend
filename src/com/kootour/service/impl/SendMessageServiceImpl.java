package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.MessageEntity;
import com.kootour.mapper.entity.SendMessageEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.MessageParamEntity;
import com.kootour.service.SendMessageService;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.MessageService4DB;
import com.kootour.service4db.SequenceService4DB;

@Configuration
@Service
public class SendMessageServiceImpl implements SendMessageService {

	@Autowired
	private MessageService4DB messageService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;
	@Autowired(required = false)
	private CourseCommentService4DB courseCommentService4DB;

	private static Logger logger = Logger.getLogger(MessageListServiceImpl.class);

	@Override
	public SendMessageEntity send(SendMessageEntity sendMessageEntity, Map<String, Object> paraMap) {
		SendMessageEntity rtnResult = new SendMessageEntity();
		rtnResult = sendMessageEntity;
		MessageEntity messageEntity = new MessageEntity();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		String tMessageIdentiNo = "";

		messageEntity.setLangId(sendMessageEntity.getLangId());
		messageEntity.setMessageIdentiNo(sendMessageEntity.getLangId());
		messageEntity.setLocalhostIdentiNo(sendMessageEntity.getLocalhostIdentiNo());
		messageEntity.setTouristIdentiNo(sendMessageEntity.getTouristIdentiNo());
		messageEntity.setMessageType(KooConst.ST_TOURST_MSG);
		messageEntity.setMessageText(sendMessageEntity.getMessageText());
		messageEntity.setMessageTime(new Date());
		messageEntity.setMailFlg(KooConst.ST_FLG_NO);
		messageEntity.setReadFlg(KooConst.ST_FLG_NO);
		messageEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);

		try {
			tMessageIdentiNo = sequenceService4DB.createSequence(KooConst.ST_MESSAGE);
			messageEntity.setMessageIdentiNo(tMessageIdentiNo);
			messageService4DB.insertOne(messageEntity);

		} catch (Exception e) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM015);
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_004);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_004);
			return (rtnResult);
		}

		return (rtnResult);
	}

	@Override
	public SendMessageEntity load(SendMessageEntity sendMessageEntity, Map<String, Object> paraMap) {
		SendMessageEntity rtnResult = new SendMessageEntity();
		rtnResult = sendMessageEntity;
		MessageParamEntity mMessageParamEntity = new MessageParamEntity();
		mMessageParamEntity.setLangId(sendMessageEntity.getLangId());
		mMessageParamEntity.setTouristIdentiNo(sendMessageEntity.getTouristIdentiNo());
		mMessageParamEntity.setLocalhostIdentiNo(sendMessageEntity.getLocalhostIdentiNo());
//		mMessageParamEntity.setReadFlg(KooConst.ST_FLG_NO);
		mMessageParamEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
		List<MessageEntity> mMessageEntityList = messageService4DB.selectByCondition(mMessageParamEntity);
		LocalhostParamEntity localhostParamEntity = new LocalhostParamEntity();
		localhostParamEntity.setLangId(sendMessageEntity.getLangId());
		localhostParamEntity.setLocalhostIdentiNo(sendMessageEntity.getLocalhostIdentiNo());
		List<LocalhostEntity> localhostEntityList = localhostService4DB.selectByPK(localhostParamEntity);
		List<MessageEntity> messageList = new ArrayList<MessageEntity>();
		for (int i = 0; i < mMessageEntityList.size(); i++) {
			MessageEntity mMessageEntity = mMessageEntityList.get(i);
			if ("L".equals(mMessageEntity.getMessageType()) || "T".equals(mMessageEntity.getMessageType())) {
				mMessageEntity.setMessageType(mMessageEntity.getMessageType().trim());
				messageList.add(mMessageEntity);
			}
		}

		rtnResult.setMessageList(messageList);
		if (localhostEntityList != null && localhostEntityList.size() > 0) {
			LocalhostEntity localhostEntity = localhostEntityList.get(0);
			rtnResult.setLocalhostPictureDisp(KooConst.STR_UPLOAD_IMAGES_PATH + localhostEntity.getPhoto());
			rtnResult.setLocalhostFullNameDisp(localhostEntity.getFullName());
			rtnResult.setLocalhostAddrDisp(localhostEntity.getAddr1() + " , " + localhostEntity.getState());
			rtnResult.setTouristIdentiNo(sendMessageEntity.getTouristIdentiNo());
			rtnResult.setLocalhostIdentiNo(localhostEntity.getLocalhostIdentiNo());
			rtnResult.setLangId(sendMessageEntity.getLangId());
			rtnResult.setMemberYearDisp(
					"Member since " + KooUtil.date2String(localhostEntity.getCreateTime(), KooConst.ST_MMMMMyyyy));
		}

		for (int i = 0; i < mMessageEntityList.size(); i++) {
			MessageEntity mMessageEntity = mMessageEntityList.get(i);
			if ("L".equals(mMessageEntity.getMessageType()) || "T".equals(mMessageEntity.getMessageType())) {
				mMessageEntity.setReadFlg(KooConst.ST_FLG_YES);
				messageService4DB.updateByPK(mMessageEntity);
			}
		}
		CourseCommentParamEntity courseCommentParamEntity = new CourseCommentParamEntity();
		courseCommentParamEntity.setLangId(sendMessageEntity.getLangId());
		courseCommentParamEntity.setLocalhostIdentiNo(sendMessageEntity.getLocalhostIdentiNo());

		courseCommentParamEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
		List<CourseCommentEntity> courseCommentEntityList = courseCommentService4DB
				.selectByCondition(courseCommentParamEntity);
		if (courseCommentEntityList != null) {
			rtnResult.setReviewNum(courseCommentEntityList.size());
		}
		return (rtnResult);
	}
}
