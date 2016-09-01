package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.ReservConfirmEntity;
public interface ReservConfirmService {
	ReservConfirmEntity okExit(ReservConfirmEntity reservConfirmEntity, Map<String, Object> paraMap);
	ReservConfirmEntity back(ReservConfirmEntity reservConfirmEntity, Map<String, Object> paraMap);
	ReservConfirmEntity load(ReservConfirmEntity reservConfirmEntity, Map<String, Object> paraMap);
	ReservConfirmEntity orderDetail(ReservConfirmEntity reservConfirmEntity, Map<String, Object> paraMap);
}
