package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.OrderListEntity;
public interface OrderListService {
	OrderListEntity cancel(OrderListEntity orderListEntity, Map<String, Object> paraMap);
	OrderListEntity orderConfirm(OrderListEntity orderListEntity, Map<String, Object> paraMap);
	OrderListEntity reservConfirm(OrderListEntity orderListEntity, Map<String, Object> paraMap);
	OrderListEntity back(OrderListEntity orderListEntity, Map<String, Object> paraMap);
	OrderListEntity reviewConfirm(OrderListEntity orderListEntity, Map<String, Object> paraMap);
	OrderListEntity couseRegi(OrderListEntity orderListEntity, Map<String, Object> paraMap);
	OrderListEntity orderDetail(OrderListEntity orderListEntity, Map<String, Object> paraMap);
	OrderListEntity load(OrderListEntity orderListEntity, Map<String, Object> paraMap);
}
