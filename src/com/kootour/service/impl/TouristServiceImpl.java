package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;
import com.kootour.service.TouristService;
import com.kootour.service4db.SequenceService4DB;
import com.kootour.service4db.TouristService4DB;

@Configuration
@Service
public class TouristServiceImpl implements TouristService {
	@Autowired
	private TouristService4DB touristService4DB;
	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;

	private static Logger logger = Logger.getLogger(TouristServiceImpl.class);


	@Override
	public TouristEntity save(TouristEntity touristEntity, Map<String, Object> paraMap) {
		TouristEntity rtnResult = new TouristEntity();
		rtnResult=touristEntity;
		TouristParamEntity touristParamEntity = new TouristParamEntity();
		touristParamEntity.setTouristIdentiNo(touristEntity.getTouristIdentiNo());
		touristParamEntity.setLangId(touristEntity.getSessionInfo().getCurLangId());

		List<TouristEntity> touristEntityList = touristService4DB.selectByPK(touristParamEntity);
		if (touristEntityList != null && touristEntityList.size() > 0) {
			rtnResult = touristEntityList.get(0);
		}
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		rtnResult.setFirstName(touristEntity.getFirstName());
		rtnResult.setLastName(touristEntity.getLastName());
		rtnResult.setSex(touristEntity.getSex());
		rtnResult.setLocation(touristEntity.getLocation());
		if (!KooUtil.isNotDate(""+touristEntity.getBirthday())){
			rtnResult.setBirthday(touristEntity.getBirthday());			
		}
//		rtnResult.setPicture(touristEntity.getPicture());

		try {

			touristService4DB.updateByPK(rtnResult);
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM007);
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_003);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} catch (Exception e) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM007 + "[" + touristEntity.getLangId() + ","
					+ touristEntity.getTouristIdentiNo() + "]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_005);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			logger.error(KooConst.INFO_MSG_005);
		}
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		paraMap.put(KooConst.ST_TOURIST_PICTURE, KooConst.STR_UPLOAD_IMAGES_PATH + rtnResult.getPicture());
		return (rtnResult);
	}


	@Override
	public TouristEntity load(TouristEntity touristEntity, Map<String, Object> paraMap) {
		
		TouristEntity rtnResult = new TouristEntity();
		rtnResult=touristEntity;
		TouristParamEntity touristParamEntity = new TouristParamEntity();
		touristParamEntity.setLangId(touristEntity.getLangId());
		touristParamEntity.setTouristIdentiNo(touristEntity.getCurTouristIdentiNo());
		List<TouristEntity> touristEntityList = touristService4DB.selectByPK(touristParamEntity);
		if(touristEntityList!=null && touristEntityList.size()>0){
			rtnResult = touristEntityList.get(0);
			rtnResult.setPicture(KooConst.STR_UPLOAD_IMAGES_PATH + rtnResult.getPicture());
		}
		return (rtnResult);
	}

}
