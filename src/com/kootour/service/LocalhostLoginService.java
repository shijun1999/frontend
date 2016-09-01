package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.LocalhostLoginEntity;
public interface LocalhostLoginService {
	LocalhostLoginEntity login(LocalhostLoginEntity localhostLoginEntity, Map<String, Object> paraMap);
	LocalhostLoginEntity load(LocalhostLoginEntity localhostLoginEntity, Map<String, Object> paraMap);
	LocalhostLoginEntity changePassword(LocalhostLoginEntity localhostLoginEntity, Map<String, Object> paraMap);
	LocalhostLoginEntity registration(LocalhostLoginEntity localhostLoginEntity, Map<String, Object> paraMap);
}
