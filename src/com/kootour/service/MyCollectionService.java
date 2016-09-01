package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.MyCollectionEntity;
public interface MyCollectionService {
MyCollectionEntity cancel(MyCollectionEntity myCollectionEntity,Map<String,Object> paraMap);
MyCollectionEntity comment(MyCollectionEntity myCollectionEntity,Map<String,Object> paraMap);
MyCollectionEntity load(MyCollectionEntity myCollectionEntity,Map<String,Object> paraMap);
MyCollectionEntity commentDisp(MyCollectionEntity myCollectionEntity,Map<String,Object> paraMap);
}
