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

import com.kootour.service.MessageListService;
import com.kootour.service.impl.MessageListServiceImpl;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.MessageListEntity;
import com.kootour.model.MessageModel;
import com.kootour.model.MessageListModel;
import com.kootour.mapper.entity.MessageEntity;

@Results({ @Result(name = "ｃlose", value = "cityCourseList!load", type = ServletActionRedirectResult.class) })
public class MessageListAction extends MessageListModel {

	@Autowired(required = false)
	private MessageListService messageListService = new MessageListServiceImpl();

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		MessageListEntity inMessageListEntity = copyEntityAction2Entity((MessageListModel)this);
		MessageListEntity outMessageListEntity = new MessageListEntity();
		inMessageListEntity.setTouristIdentiNo(inMessageListEntity.getCurTouristIdentiNo());
		outMessageListEntity = messageListService.load(inMessageListEntity, paraMap);
		copyEntity2EntityAction(outMessageListEntity);
		return rtnStr;
	}

	public void copyEntity2EntityAction(MessageListEntity tEntity) {
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
		List<MessageModel> tmpMessageActionList1 = new ArrayList<MessageModel>();
		for (MessageEntity tmpVal : tEntity.getKooTourMessageList()) {
			MessageAction tmpKooTourMessageList = new MessageAction();
			tmpKooTourMessageList.copyEntity2EntityAction(tmpVal);
			tmpMessageActionList1.add(tmpKooTourMessageList);
		}
		setKooTourMessageList(tmpMessageActionList1);
		List<MessageModel> tmpMessageActionList2 = new ArrayList<MessageModel>();
		for (MessageEntity tmpVal : tEntity.getLocalhostMessageList()) {
			MessageAction tmpLocalhostMessageList = new MessageAction();
			tmpLocalhostMessageList.copyEntity2EntityAction(tmpVal);
			tmpMessageActionList2.add(tmpLocalhostMessageList);
		}
		setLocalhostMessageList(tmpMessageActionList2);
		if (tEntity.getMessageNumDisp() == null) {
			setMessageNumDisp("");
		} else {
			setMessageNumDisp(String.valueOf(tEntity.getMessageNumDisp()));
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

	public MessageListEntity copyEntityAction2Entity(MessageListModel tMessageListModel) {
		MessageListEntity tEntity = new MessageListEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tMessageListModel.getLangId());
		tEntity.setTouristIdentiNo(tMessageListModel.getTouristIdentiNo());
		List<MessageEntity> tmpMessageEntityList1 = new ArrayList<MessageEntity>();
		for (MessageModel tmpVal : tMessageListModel.getKooTourMessageList()) {
			MessageEntity tmpMessage = new MessageEntity();
			MessageAction tmpAction = (MessageAction) tmpVal;
			tmpMessage = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpMessageEntityList1.add(tmpMessage);
		}
		tEntity.setKooTourMessageList(tmpMessageEntityList1);
		List<MessageEntity> tmpMessageEntityList2 = new ArrayList<MessageEntity>();
		for (MessageModel tmpVal : tMessageListModel.getLocalhostMessageList()) {
			MessageEntity tmpMessage = new MessageEntity();
			MessageAction tmpAction = (MessageAction) tmpVal;
			tmpMessage = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpMessageEntityList2.add(tmpMessage);
		}
		tEntity.setLocalhostMessageList(tmpMessageEntityList2);
		if (KooUtil.isNotInt(tMessageListModel.getMessageNumDisp())) {
			tEntity.setMessageNumDisp(null);
		} else {
			tEntity.setMessageNumDisp(Integer.parseInt(tMessageListModel.getMessageNumDisp()));
		}
		if (KooUtil.isNotDate(tMessageListModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tMessageListModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tMessageListModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tMessageListModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
