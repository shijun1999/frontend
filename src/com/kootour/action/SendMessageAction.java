//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.service.SendMessageService;
import com.kootour.service.impl.SendMessageServiceImpl;
import com.kootour.checker.SingleSendMessageChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.SendMessageEntity;
import com.kootour.model.MessageModel;
import com.kootour.model.SendMessageModel;
import com.kootour.mapper.entity.MessageEntity;

@Results({ @Result(name = "send", value = "cityCourseList!load", type = ServletActionRedirectResult.class) })
public class SendMessageAction extends SendMessageModel {

	@Autowired(required = false)
	private SendMessageService sendMessageService = new SendMessageServiceImpl();

	public String send() {
		String rtnStr = "send";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		SingleSendMessageChecker tSingleCheck = new SingleSendMessageChecker();
		tList = tSingleCheck.nullCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		tList = tSingleCheck.valueCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		tList = tSingleCheck.sizeCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		if (getErrInfoList().isEmpty()) {
			SendMessageEntity inSendMessageEntity = copyEntityAction2Entity((SendMessageModel)this);
			SendMessageEntity outSendMessageEntity = new SendMessageEntity();
			outSendMessageEntity = sendMessageService.send(inSendMessageEntity, paraMap);

		} else {
			makeErrorList(this.getErrInfoList());
			rtnStr = "error";
		}
		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		SendMessageEntity inSendMessageEntity = copyEntityAction2Entity((SendMessageModel)this);
		SendMessageEntity outSendMessageEntity = new SendMessageEntity();
		inSendMessageEntity.setLangId(getSessionInfo().getCurLangId());
		inSendMessageEntity.setTouristIdentiNo(inSendMessageEntity.getCurTouristIdentiNo());
		outSendMessageEntity = sendMessageService.load(inSendMessageEntity, paraMap);
		copyEntity2EntityAction(outSendMessageEntity);
		return rtnStr;
	}

	public void copyEntity2EntityAction(SendMessageEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);

		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(tEntity.getTouristIdentiNo());
		}
		if (tEntity.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(tEntity.getLocalhostIdentiNo());
		}
		if (tEntity.getMessageText() == null) {
			setMessageText("");
		} else {
			setMessageText(tEntity.getMessageText());
		}
		if (tEntity.getMessageTime() == null) {
			setMessageTime("");
		} else {
			setMessageTime(KooUtil.date2String(tEntity.getMessageTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		List<MessageModel> tmpMessageActionList1 = new ArrayList<MessageModel>();
		for (MessageEntity tmpVal : tEntity.getMessageList()) {
			MessageAction tmpMessageList = new MessageAction();
			tmpMessageList.copyEntity2EntityAction(tmpVal);
			tmpMessageActionList1.add(tmpMessageList);
		}
		setMessageList(tmpMessageActionList1);
		if (tEntity.getLocalhostFullNameDisp() == null) {
			setLocalhostFullNameDisp("");
		} else {
			setLocalhostFullNameDisp(tEntity.getLocalhostFullNameDisp());
		}
		if (tEntity.getLocalhostPictureDisp() == null) {
			setLocalhostPictureDisp("");
		} else {
			setLocalhostPictureDisp(tEntity.getLocalhostPictureDisp());
		}
		if (tEntity.getLocalhostAddrDisp() == null) {
			setLocalhostAddrDisp("");
		} else {
			setLocalhostAddrDisp(tEntity.getLocalhostAddrDisp());
		}
		if (tEntity.getMemberYearDisp() == null) {
			setMemberYearDisp("");
		} else {
			setMemberYearDisp(tEntity.getMemberYearDisp());
		}
		List<String> tmpStringActionList2 = new ArrayList<String>();
		for (String tmpVal : tEntity.getScoreIconListDisp()) {
			tmpStringActionList2.add(tmpVal);
		}
		setScoreIconListDisp(tmpStringActionList2);
		if (tEntity.getScoreDisp() == null) {
			setScoreDisp("");
		} else {
			setScoreDisp(String.valueOf(tEntity.getScoreDisp()));
		}
		if (tEntity.getCourseName() == null) {
			setCourseName("");
		} else {
			setCourseName(tEntity.getCourseName());
		}
		if (tEntity.getReservationDate() == null) {
			setReservationDate("");
		} else {
			setReservationDate(tEntity.getReservationDate());
		}
		if (tEntity.getStartHour() == null) {
			setStartHour("");
		} else {
			setStartHour(tEntity.getStartHour());
		}
		if (tEntity.getTouristNum() == null) {
			setTouristNum("");
		} else {
			setTouristNum(String.valueOf(tEntity.getTouristNum()));
		}
		if (tEntity.getReviewNum() == null) {
			setReviewNum("");
		} else {
			setReviewNum(String.valueOf(tEntity.getReviewNum()));
		}
		if (tEntity.getCreateTime() == null) {
			setCreateTime("");
		} else {
			setCreateTime(KooUtil.date2String(tEntity.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (tEntity.getModifyTime() == null) {
			setModifyTime("");
		} else {
			setModifyTime(KooUtil.date2String(tEntity.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}

	}

	public SendMessageEntity copyEntityAction2Entity(SendMessageModel tSendMessageModel) {
		SendMessageEntity tEntity = new SendMessageEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tSendMessageModel.getLangId());
		tEntity.setTouristIdentiNo(tSendMessageModel.getTouristIdentiNo());
		tEntity.setLocalhostIdentiNo(tSendMessageModel.getLocalhostIdentiNo());
		tEntity.setMessageText(tSendMessageModel.getMessageText());
		if (KooUtil.isNotDate(tSendMessageModel.getMessageTime())) {
			tEntity.setMessageTime(null);
		} else {
			tEntity.setMessageTime(KooUtil.string2Date(tSendMessageModel.getMessageTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		List<MessageEntity> tmpMessageEntityList1 = new ArrayList<MessageEntity>();
		for (MessageModel tmpVal : tSendMessageModel.getMessageList()) {
			MessageEntity tmpMessage = new MessageEntity();
			MessageAction tmpAction = (MessageAction) tmpVal;
			tmpMessage = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpMessageEntityList1.add(tmpMessage);
		}
		tEntity.setMessageList(tmpMessageEntityList1);
		tEntity.setLocalhostFullNameDisp(tSendMessageModel.getLocalhostFullNameDisp());
		tEntity.setLocalhostPictureDisp(tSendMessageModel.getLocalhostPictureDisp());
		tEntity.setLocalhostAddrDisp(tSendMessageModel.getLocalhostAddrDisp());
		tEntity.setMemberYearDisp(tSendMessageModel.getMemberYearDisp());
		List<String> tmpStringEntityList2 = new ArrayList<String>();
		for (String tmpVal : tSendMessageModel.getScoreIconListDisp()) {
			tmpStringEntityList2.add(tmpVal);
		}
		tEntity.setScoreIconListDisp(tmpStringEntityList2);
		if (KooUtil.isNotDouble(tSendMessageModel.getScoreDisp())) {
			tEntity.setScoreDisp(null);
		} else {
			tEntity.setScoreDisp(Double.parseDouble(tSendMessageModel.getScoreDisp()));
		}
		tEntity.setCourseName(tSendMessageModel.getCourseName());
		tEntity.setReservationDate(tSendMessageModel.getReservationDate());
		tEntity.setStartHour(tSendMessageModel.getStartHour());
		if (KooUtil.isNotInt(tSendMessageModel.getTouristNum())) {
			tEntity.setTouristNum(null);
		} else {
			tEntity.setTouristNum(Integer.parseInt(tSendMessageModel.getTouristNum()));
		}
		if (KooUtil.isNotInt(tSendMessageModel.getReviewNum())) {
			tEntity.setReviewNum(null);
		} else {
			tEntity.setReviewNum(Integer.parseInt(tSendMessageModel.getReviewNum()));
		}
		if (KooUtil.isNotDate(tSendMessageModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tSendMessageModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tSendMessageModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tSendMessageModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
