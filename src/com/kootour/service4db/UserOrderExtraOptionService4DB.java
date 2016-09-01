package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.UserOrderExtraOptionEntity;
import com.kootour.mapper.paramentity.UserOrderExtraOptionParamEntity;
public interface UserOrderExtraOptionService4DB {
List<UserOrderExtraOptionEntity> selectAll();
List<UserOrderExtraOptionEntity> selectByPK( UserOrderExtraOptionParamEntity userOrderExtraOptionParamEntity );
List<UserOrderExtraOptionEntity> selectByCondition( UserOrderExtraOptionParamEntity userOrderExtraOptionParamEntity );

void insertOne( UserOrderExtraOptionEntity UserOrderExtraOptionEntity );

void updateByPK( UserOrderExtraOptionEntity UserOrderExtraOptionEntity );

}
