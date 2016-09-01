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
import com.kootour.mapper.entity.ChangePasswordEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;
import com.kootour.service.ChangePasswordService;
import com.kootour.service4db.SequenceService4DB;
import com.kootour.service4db.TouristService4DB;
@Configuration
@Service
public class ChangePasswordServiceImpl implements ChangePasswordService {
	@Autowired(required = false)
	private TouristService4DB touristService4DB;
	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;
	private static Logger logger = Logger.getLogger(UserOrderServiceImpl.class);

	@Override
	public ChangePasswordEntity load(ChangePasswordEntity changePasswordEntity, Map<String, Object> paraMap) {
		ChangePasswordEntity rtnResult = new ChangePasswordEntity();
		rtnResult=changePasswordEntity;
		TouristParamEntity touristParamEntity = new TouristParamEntity();
		touristParamEntity.setTouristIdentiNo(changePasswordEntity.getTouristIdentiNo());
		touristParamEntity.setLangId(changePasswordEntity.getSessionInfo().getCurLangId());
		List<TouristEntity> touristEntityList= touristService4DB.selectByPK(touristParamEntity);
		if (touristEntityList != null && touristEntityList.size()>0){
			TouristEntity tTouristEntity=touristEntityList.get(0);
			rtnResult.setLangId(tTouristEntity.getLangId());
			rtnResult.setTouristIdentiNo(tTouristEntity.getCurTouristIdentiNo());
		}
		
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public ChangePasswordEntity changePassword(ChangePasswordEntity changePasswordEntity, Map<String, Object> paraMap) {
		ChangePasswordEntity rtnResult = new ChangePasswordEntity();
		rtnResult=changePasswordEntity;
		
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		
		TouristParamEntity touristParamEntity = new TouristParamEntity();
		touristParamEntity.setTouristIdentiNo(changePasswordEntity.getTouristIdentiNo());
		touristParamEntity.setLangId(changePasswordEntity.getSessionInfo().getCurLangId());
		List<TouristEntity> touristEntityList= touristService4DB.selectByPK(touristParamEntity);
		if (touristEntityList != null && touristEntityList.size()>0){
			TouristEntity tTouristEntity=touristEntityList.get(0);
			tTouristEntity.setPassword(changePasswordEntity.getPassword());
			
			try {				
				touristService4DB.updateByPK(tTouristEntity);
			} catch (Exception e) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM013);
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_004);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
				paraMap.put(KooConst.ST_ERRORINFO, tList);
				logger.error(KooConst.INFO_MSG_004);
				return (rtnResult);
			}
		}
		return (rtnResult);
	}

}
