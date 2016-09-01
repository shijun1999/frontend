package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.KooConst;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.entity.TouristLoginEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;
import com.kootour.service.TouristLoginService;
import com.kootour.service4db.TouristService4DB;

@Configuration
@Service
public class TouristLoginServiceImpl implements TouristLoginService {
	@Autowired
	private TouristService4DB touristService4DB;

	@Override
	public TouristLoginEntity login(TouristLoginEntity touristLoginEntity, Map<String, Object> paraMap) {
		TouristLoginEntity rtnResult = new TouristLoginEntity();
		List<TouristEntity> lstTouristEntity = new ArrayList<TouristEntity>();
		TouristParamEntity touristParamEntity = new TouristParamEntity();
		touristParamEntity.setLangId(touristLoginEntity.getLangId());
		touristParamEntity.setLoginId(touristLoginEntity.getLoginId());
		touristParamEntity.setPassword(touristLoginEntity.getPassword());
		lstTouristEntity = touristService4DB.selectByCondition(touristParamEntity);
		if (lstTouristEntity.size() > 0) {
			rtnResult.setTouristIdentiNo(lstTouristEntity.get(0).getTouristIdentiNo());
			paraMap.put(KooConst.ST_TOURIST_NAME, lstTouristEntity.get(0).getFirstName());
			paraMap.put(KooConst.ST_TOURIST_PICTURE, KooConst.STR_UPLOAD_IMAGES_PATH + lstTouristEntity.get(0).getPicture());
			rtnResult.setResultStatus(KooConst.INT_OK);
		} else {
			rtnResult.setResultStatus(KooConst.INT_NG);
		}
		return (rtnResult);
	}

	@Override
	public TouristLoginEntity load(TouristLoginEntity touristLoginEntity, Map<String, Object> paraMap) {
		TouristLoginEntity rtnResult = new TouristLoginEntity();
		rtnResult = touristLoginEntity;
		return (rtnResult);
	}

	@Override
	public TouristLoginEntity changePassword(TouristLoginEntity touristLoginEntity, Map<String, Object> paraMap) {
		TouristLoginEntity rtnResult = new TouristLoginEntity();
		rtnResult = touristLoginEntity;
		return (rtnResult);
	}

	@Override
	public TouristLoginEntity registration(TouristLoginEntity touristLoginEntity, Map<String, Object> paraMap) {
		TouristLoginEntity rtnResult = new TouristLoginEntity();
		rtnResult = touristLoginEntity;
		return (rtnResult);
	}
}
