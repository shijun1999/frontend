package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.service.SignupService;
import com.kootour.service4db.SequenceService4DB;
import com.kootour.service4db.TouristService4DB;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.mapper.entity.SignupEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;

import freemarker.core.Environment;

@Configuration
@Service
public class SignupServiceImpl implements SignupService {
	@Autowired
	private TouristService4DB touristService4DB;
	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;

	private static Logger logger = Logger.getLogger(TouristServiceImpl.class);

	@Override
	public SignupEntity login(SignupEntity signupEntity, Map<String, Object> paraMap) {
		SignupEntity rtnResult = new SignupEntity();
		rtnResult = signupEntity;
		return (rtnResult);
	}

	@Override
	public SignupEntity signup(SignupEntity signupEntity, Map<String, Object> paraMap) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		SignupEntity rtnResult = new SignupEntity();
		rtnResult=signupEntity;
		TouristEntity mTouristEntity = new TouristEntity();
		TouristParamEntity touristParamEntity = new TouristParamEntity();
		touristParamEntity.setLangId(signupEntity.getLangId());
		touristParamEntity.setLoginId(signupEntity.getLoginId());
		touristParamEntity.setLoginType("en");
		List<TouristEntity> touristEntityList = touristService4DB.selectByPK(touristParamEntity);
		if (touristEntityList != null && touristEntityList.size() > 0) {
			mTouristEntity = touristEntityList.get(0);
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM008);
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_004);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_004);
			return (signupEntity);
		}
		mTouristEntity.setFirstName(signupEntity.getFirstName());
		mTouristEntity.setLastName(signupEntity.getLastName());
		mTouristEntity.setLoginId(signupEntity.getLoginId());
		mTouristEntity.setPassword(signupEntity.getPassword());
		mTouristEntity.setLangId("en");
		mTouristEntity.setLoginType("1");
		mTouristEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
		mTouristEntity.setEmail(signupEntity.getLoginId());
		try {

			String strTouristIdentiNo = sequenceService4DB.createSequence(KooConst.ST_TOURIST);

			mTouristEntity.setTouristIdentiNo(strTouristIdentiNo);
		} catch (Exception e) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM008);
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_004);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_004);
			return (signupEntity);
		}

		try {

			touristService4DB.insertOne(mTouristEntity);
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM007);
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_003);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} catch (Exception e) {

			rtnResult.setResultStatus(KooConst.INT_NG);
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM007 + "[" + signupEntity.getLangId() + ","
					+ signupEntity.getTouristIdentiNo() + "]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_005);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			logger.error(KooConst.INFO_MSG_005);
		}
		signupEntity.setResultStatus(KooConst.INT_OK);
		signupEntity.setTouristIdentiNo(mTouristEntity.getTouristIdentiNo());
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		
		return signupEntity;
	}

	@Override
	public SignupEntity load(SignupEntity signupEntity, Map<String, Object> paraMap) {
		SignupEntity rtnResult = new SignupEntity();
		rtnResult = signupEntity;
		return (rtnResult);
	}
}
