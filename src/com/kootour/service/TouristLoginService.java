package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.TouristLoginEntity;
public interface TouristLoginService {
	TouristLoginEntity login(TouristLoginEntity touristLoginEntity, Map<String, Object> paraMap);
	TouristLoginEntity load(TouristLoginEntity touristLoginEntity, Map<String, Object> paraMap);
	TouristLoginEntity changePassword(TouristLoginEntity touristLoginEntity, Map<String, Object> paraMap);
	TouristLoginEntity registration(TouristLoginEntity touristLoginEntity, Map<String, Object> paraMap);
}
