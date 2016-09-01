package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.UserOrderExtraOptionEntity;
import com.kootour.mapper.paramentity.UserOrderExtraOptionParamEntity;
public interface UserOrderExtraOptionMapper {
List<UserOrderExtraOptionEntity> selectAll();
List<UserOrderExtraOptionEntity> selectByPK( UserOrderExtraOptionParamEntity userOrderExtraOptionParamEntity );
    List<UserOrderExtraOptionEntity> selectByCondition( UserOrderExtraOptionParamEntity userOrderExtraOptionParamEntity );

void insertOne( UserOrderExtraOptionEntity userOrderExtraOptionEntity );

void updateByPK( UserOrderExtraOptionEntity userOrderExtraOptionEntity );

}
