package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.service.WelcomeService;
import com.kootour.mapper.entity.WelcomeEntity;
import freemarker.core.Environment;

@Configuration
@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public WelcomeEntity load(WelcomeEntity welcomeEntity, Map<String, Object> paraMap) {
		WelcomeEntity rtnResult = new WelcomeEntity();
		return (rtnResult);
	}
}
