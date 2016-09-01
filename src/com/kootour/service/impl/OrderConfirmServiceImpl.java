package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.service.OrderConfirmService;
import com.kootour.mapper.entity.OrderConfirmEntity;
import freemarker.core.Environment;
@Configuration
@Service
public class OrderConfirmServiceImpl implements OrderConfirmService {
	@Override
	public OrderConfirmEntity cancel(OrderConfirmEntity orderConfirmEntity, Map<String, Object> paraMap) {
		OrderConfirmEntity rtnResult = new OrderConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderConfirmEntity save(OrderConfirmEntity orderConfirmEntity, Map<String, Object> paraMap) {
		OrderConfirmEntity rtnResult = new OrderConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderConfirmEntity back(OrderConfirmEntity orderConfirmEntity, Map<String, Object> paraMap) {
		OrderConfirmEntity rtnResult = new OrderConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderConfirmEntity load(OrderConfirmEntity orderConfirmEntity, Map<String, Object> paraMap) {
		OrderConfirmEntity rtnResult = new OrderConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
}
