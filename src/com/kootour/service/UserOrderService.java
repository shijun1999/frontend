package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.kootour.common.ScheduleOrderInfo;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.UserOrderParamEntity;

public interface UserOrderService {
//	UserOrderEntity cancel(UserOrderEntity userOrderEntity, Map<String, Object> paraMap);

	UserOrderEntity save(UserOrderEntity userOrderEntity, Map<String, Object> paraMap);

//	UserOrderEntity back(UserOrderEntity userOrderEntity, Map<String, Object> paraMap);

	UserOrderEntity load(UserOrderEntity userOrderEntity, Map<String, Object> paraMap);
	
	List<ScheduleOrderInfo> calcOrderInfoForMonth(String langId, String localhostIdentiNo, String strYyyymm);

	void testCreateUserOrder();
}
