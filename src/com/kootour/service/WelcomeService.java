package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.WelcomeEntity;
public interface WelcomeService {
WelcomeEntity load(WelcomeEntity welcomeEntity,Map<String,Object> paraMap);
}
