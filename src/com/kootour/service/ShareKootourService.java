package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.ShareKootourEntity;
public interface ShareKootourService {
ShareKootourEntity load(ShareKootourEntity shareKootourEntity,Map<String,Object> paraMap);
}
