package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.mapper.SequenceMapper;
import com.kootour.mapper.TouristMapper;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;
import com.kootour.service.QuicklySignUpService;
import com.kootour.service4db.SequenceService4DB;
import com.kootour.service4db.TouristService4DB;

@Configuration
@Service
public class QuicklySignUpServiceImpl implements QuicklySignUpService {
	@Autowired
	private TouristService4DB touristService4DB;
	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;
	@Override
	public TouristEntity clear(TouristEntity touristEntity, Map<String, Object> paraMap) {
		TouristEntity rtnResult = new TouristEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public TouristEntity save(TouristEntity touristEntity, Map<String, Object> paraMap) {
		TouristEntity rtnResult = new TouristEntity();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		String strTouristIdentiNo = "";
		rtnResult.setLangId(touristEntity.getLangId());
		rtnResult.setFirstName(touristEntity.getFirstName());
		rtnResult.setLastName(touristEntity.getLastName());
		rtnResult.setShortName(touristEntity.getShortName());
		rtnResult.setSex(touristEntity.getSex());
		rtnResult.setLoginType(touristEntity.getLoginType());

		rtnResult.setLoginId(touristEntity.getLoginId());
		rtnResult.setPassword(touristEntity.getPassword());
		rtnResult.setTelCode(touristEntity.getTelCode());

//		rtnResult.setMemo(touristEntity.getMemo());
		rtnResult.setEmail(touristEntity.getEmail());

		try {

			strTouristIdentiNo = sequenceService4DB.createSequence(KooConst.ST_TOURIST);
			rtnResult.setTouristIdentiNo(strTouristIdentiNo);
		} catch (Exception e) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM008);
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_004);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			return (rtnResult);
		}

		try {

			touristService4DB.insertOne(rtnResult);
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM007);
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_003);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} catch (Exception e) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM007 + "[" + touristEntity.getLangId() + "," + strTouristIdentiNo + "]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_005);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		}

		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}

	@Override
	public TouristEntity back(TouristEntity touristEntity, Map<String, Object> paraMap) {
		TouristEntity rtnResult = new TouristEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public TouristEntity load(TouristEntity touristEntity, Map<String, Object> paraMap) {
		TouristEntity rtnResult = new TouristEntity();
		// Write logic here !!!
		return (rtnResult);
	}


}
