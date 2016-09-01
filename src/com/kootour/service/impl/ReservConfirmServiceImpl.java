package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.service.ReservConfirmService;
import com.kootour.mapper.entity.ReservConfirmEntity;
import freemarker.core.Environment;
@Configuration
@Service
public class ReservConfirmServiceImpl implements ReservConfirmService {
	@Override
	public ReservConfirmEntity okExit(ReservConfirmEntity reservConfirmEntity, Map<String, Object> paraMap) {
		ReservConfirmEntity rtnResult = new ReservConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public ReservConfirmEntity back(ReservConfirmEntity reservConfirmEntity, Map<String, Object> paraMap) {
		ReservConfirmEntity rtnResult = new ReservConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public ReservConfirmEntity load(ReservConfirmEntity reservConfirmEntity, Map<String, Object> paraMap) {
		ReservConfirmEntity rtnResult = new ReservConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public ReservConfirmEntity orderDetail(ReservConfirmEntity reservConfirmEntity, Map<String, Object> paraMap) {
		ReservConfirmEntity rtnResult = new ReservConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
}
