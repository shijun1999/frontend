package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.OrderConfirmEntity;
public interface OrderConfirmService {
	OrderConfirmEntity cancel(OrderConfirmEntity orderConfirmEntity, Map<String, Object> paraMap);
	OrderConfirmEntity save(OrderConfirmEntity orderConfirmEntity, Map<String, Object> paraMap);
	OrderConfirmEntity back(OrderConfirmEntity orderConfirmEntity, Map<String, Object> paraMap);
	OrderConfirmEntity load(OrderConfirmEntity orderConfirmEntity, Map<String, Object> paraMap);
}
