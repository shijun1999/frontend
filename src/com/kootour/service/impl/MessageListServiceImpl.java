package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.KooConst;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.MessageEntity;
import com.kootour.mapper.entity.MessageListEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.MessageParamEntity;
import com.kootour.service.MessageListService;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.MessageService4DB;
@Configuration
@Service
public class MessageListServiceImpl implements MessageListService{	
	
	@Autowired
	private MessageService4DB messageService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	
	private static Logger logger = Logger.getLogger(MessageListServiceImpl.class);
	

@Override
public MessageListEntity load(MessageListEntity messageListEntity,Map<String,Object> paraMap){
	MessageListEntity rtnResult =  new MessageListEntity();
	MessageParamEntity mMessageParamEntity = new MessageParamEntity();
	rtnResult=messageListEntity;
	mMessageParamEntity.setTouristIdentiNo(messageListEntity.getTouristIdentiNo());
//	mMessageParamEntity.setReadFlg(KooConst.ST_FLG_NO);
	mMessageParamEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
	List<MessageEntity> mMessageEntityList = messageService4DB.selectByCondition(mMessageParamEntity);
	List<MessageEntity> kooTourMessageList = new ArrayList<MessageEntity>();
	List<MessageEntity> localhostMessageList = new ArrayList<MessageEntity>();
	for(int i=0;i<mMessageEntityList.size();i++){
		MessageEntity mMessageEntity = mMessageEntityList.get(i);
		if("S".equals(mMessageEntity.getMessageType())){
			kooTourMessageList.add(mMessageEntity);
		}else if("L".equals(mMessageEntity.getMessageType())){
			LocalhostParamEntity localhostParamEntity = new LocalhostParamEntity();
			localhostParamEntity.setLangId(mMessageEntity.getLangId());
			localhostParamEntity.setLocalhostIdentiNo(mMessageEntity.getLocalhostIdentiNo());
			List<LocalhostEntity> localhostEntityList= localhostService4DB.selectByCondition(localhostParamEntity);

			if (localhostEntityList!=null && localhostEntityList.size()>0){
				mMessageEntity.setLocalhostNameDisp(localhostEntityList.get(0).getLastName());
				mMessageEntity.setLocalhostPictureDisp(KooConst.STR_UPLOAD_IMAGES_PATH+localhostEntityList.get(0).getPhoto());
			}
			localhostMessageList.add(mMessageEntity);
		}
	}
	for(int i=0;i<mMessageEntityList.size();i++){
		MessageEntity mMessageEntity = mMessageEntityList.get(i);
		if("S".equals(mMessageEntity.getMessageType())){
			mMessageEntity.setReadFlg(KooConst.ST_FLG_YES);
			messageService4DB.updateByPK(mMessageEntity);
		}
	}
	rtnResult.setKooTourMessageList(kooTourMessageList);
	rtnResult.setLocalhostMessageList(localhostMessageList);
	rtnResult.setMessageNumDisp(localhostMessageList.size());
return (rtnResult);
}
}
