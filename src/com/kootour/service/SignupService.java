package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.SignupEntity;
public interface SignupService {
SignupEntity login(SignupEntity signupEntity,Map<String,Object> paraMap);
SignupEntity signup(SignupEntity signupEntity,Map<String,Object> paraMap);
SignupEntity load(SignupEntity signupEntity,Map<String,Object> paraMap);
}
