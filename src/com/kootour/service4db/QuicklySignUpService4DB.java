package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;

public interface QuicklySignUpService4DB {
	TouristEntity clear(TouristEntity touristEntity, Map<String, Object> paraMap);

	List<TouristEntity> selectAll();

	List<TouristEntity> selectByPK(TouristParamEntity touristParamEntity);

	List<TouristEntity> selectByCondition(TouristParamEntity touristParamEntity);

	void insertOne(TouristEntity TouristEntity);

	void updateByPK(TouristEntity TouristEntity);

}
