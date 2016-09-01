package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;

public interface QuicklySignUpService {
	TouristEntity clear(TouristEntity touristEntity, Map<String, Object> paraMap);

	TouristEntity save(TouristEntity touristEntity, Map<String, Object> paraMap);

	TouristEntity back(TouristEntity touristEntity, Map<String, Object> paraMap);

	TouristEntity load(TouristEntity touristEntity, Map<String, Object> paraMap);

}
