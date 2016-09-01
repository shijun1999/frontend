package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.MessageListEntity;
public interface MessageListService {
//MessageListEntity close(MessageListEntity messageListEntity,Map<String,Object> paraMap);
//MessageListEntity cancel(MessageListEntity messageListEntity,Map<String,Object> paraMap);
MessageListEntity load(MessageListEntity messageListEntity,Map<String,Object> paraMap);
}
