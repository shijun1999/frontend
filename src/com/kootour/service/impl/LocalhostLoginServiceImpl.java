package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.service.LocalhostLoginService;
import com.kootour.mapper.entity.LocalhostLoginEntity;
import freemarker.core.Environment;
@Configuration
@Service
public class LocalhostLoginServiceImpl implements LocalhostLoginService {
	@Override
	public LocalhostLoginEntity login(LocalhostLoginEntity localhostLoginEntity, Map<String, Object> paraMap) {
		LocalhostLoginEntity rtnResult = new LocalhostLoginEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public LocalhostLoginEntity load(LocalhostLoginEntity localhostLoginEntity, Map<String, Object> paraMap) {
		LocalhostLoginEntity rtnResult = new LocalhostLoginEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public LocalhostLoginEntity changePassword(LocalhostLoginEntity localhostLoginEntity, Map<String, Object> paraMap) {
		LocalhostLoginEntity rtnResult = new LocalhostLoginEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public LocalhostLoginEntity registration(LocalhostLoginEntity localhostLoginEntity, Map<String, Object> paraMap) {
		LocalhostLoginEntity rtnResult = new LocalhostLoginEntity();
		// Write logic here !!!
		return (rtnResult);
	}
}
