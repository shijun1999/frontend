package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.service.OrderListService;
import com.kootour.mapper.entity.OrderListEntity;
import freemarker.core.Environment;
@Configuration
@Service
public class OrderListServiceImpl implements OrderListService {
	@Override
	public OrderListEntity cancel(OrderListEntity orderListEntity, Map<String, Object> paraMap) {
		OrderListEntity rtnResult = new OrderListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderListEntity orderConfirm(OrderListEntity orderListEntity, Map<String, Object> paraMap) {
		OrderListEntity rtnResult = new OrderListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderListEntity reservConfirm(OrderListEntity orderListEntity, Map<String, Object> paraMap) {
		OrderListEntity rtnResult = new OrderListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderListEntity back(OrderListEntity orderListEntity, Map<String, Object> paraMap) {
		OrderListEntity rtnResult = new OrderListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderListEntity reviewConfirm(OrderListEntity orderListEntity, Map<String, Object> paraMap) {
		OrderListEntity rtnResult = new OrderListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderListEntity couseRegi(OrderListEntity orderListEntity, Map<String, Object> paraMap) {
		OrderListEntity rtnResult = new OrderListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderListEntity orderDetail(OrderListEntity orderListEntity, Map<String, Object> paraMap) {
		OrderListEntity rtnResult = new OrderListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public OrderListEntity load(OrderListEntity orderListEntity, Map<String, Object> paraMap) {
		OrderListEntity rtnResult = new OrderListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
}
