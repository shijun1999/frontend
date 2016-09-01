//Auto Generated 

package com.kootour.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.MessageEntity;
import com.kootour.model.MessageModel;

public class MessageAction extends MessageModel {

	@Autowired(required = false)
	public void copyEntity2EntityAction(MessageEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getMessageIdentiNo() == null) {
			setMessageIdentiNo("");
		} else {
			setMessageIdentiNo(tEntity.getMessageIdentiNo());
		}
		if (tEntity.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(tEntity.getLocalhostIdentiNo());
		}
		if (tEntity.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(tEntity.getTouristIdentiNo());
		}
		if (tEntity.getMessageType() == null) {
			setMessageType("");
		} else {
			setMessageType(tEntity.getMessageType());
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
		if (tEntity.getMailFlg() == null) {
			setMailFlg("");
		} else {
			setMailFlg(tEntity.getMailFlg());
		}
		if (tEntity.getReadFlg() == null) {
			setReadFlg("");
		} else {
			setReadFlg(tEntity.getReadFlg());
		}

		if (tEntity.getLocalhostPictureDisp() == null) {
			setLocalhostPictureDisp("");
		} else {
			setLocalhostPictureDisp(tEntity.getLocalhostPictureDisp());
		}
		if (tEntity.getLocalhostNameDisp() == null) {
			setLocalhostNameDisp("");
		} else {
			setLocalhostNameDisp(tEntity.getLocalhostNameDisp());
		}
		if (tEntity.getTouristNameDisp() == null) {
			setTouristNameDisp("");
		} else {
			setTouristNameDisp(tEntity.getTouristNameDisp());
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

	public MessageEntity copyEntityAction2Entity(MessageModel tMessageModel) {
		MessageEntity tEntity = new MessageEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tMessageModel.getLangId());
		tEntity.setMessageIdentiNo(tMessageModel.getMessageIdentiNo());
		tEntity.setLocalhostIdentiNo(tMessageModel.getLocalhostIdentiNo());
		tEntity.setTouristIdentiNo(tMessageModel.getTouristIdentiNo());
		tEntity.setMessageType(tMessageModel.getMessageType());
		tEntity.setMessageText(tMessageModel.getMessageText());
		if (KooUtil.isNotDate(tMessageModel.getMessageTime())) {
			tEntity.setMessageTime(null);
		} else {
			tEntity.setMessageTime(KooUtil.string2Date(tMessageModel.getMessageTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		tEntity.setMailFlg(tMessageModel.getMailFlg());
		tEntity.setReadFlg(tMessageModel.getReadFlg());
		tEntity.setLocalhostPictureDisp(tMessageModel.getLocalhostPictureDisp());
		tEntity.setLocalhostNameDisp(tMessageModel.getLocalhostNameDisp());
		tEntity.setTouristNameDisp(tMessageModel.getTouristNameDisp());
		if (KooUtil.isNotDate(tMessageModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tMessageModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tMessageModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tMessageModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
