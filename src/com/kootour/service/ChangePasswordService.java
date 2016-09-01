package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.ChangePasswordEntity;
public interface ChangePasswordService {
	ChangePasswordEntity load(ChangePasswordEntity changePasswordEntity, Map<String, Object> paraMap);
	ChangePasswordEntity changePassword(ChangePasswordEntity changePasswordEntity, Map<String, Object> paraMap);
}
