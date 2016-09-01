package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.SendMessageEntity;
public interface SendMessageService {
SendMessageEntity send(SendMessageEntity sendMessageEntity,Map<String,Object> paraMap);
SendMessageEntity load(SendMessageEntity sendMessageEntity,Map<String,Object> paraMap);
}
