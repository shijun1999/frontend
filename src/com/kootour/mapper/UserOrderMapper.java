package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.UserOrderParamEntity;
public interface UserOrderMapper {
List<UserOrderEntity> selectAll();
List<UserOrderEntity> selectByPK( UserOrderParamEntity userOrderParamEntity );
    List<UserOrderEntity> selectByCondition( UserOrderParamEntity userOrderParamEntity );

void insertOne( UserOrderEntity userOrderEntity );

void updateByPK( UserOrderEntity userOrderEntity );

int selectCountByCondition(UserOrderParamEntity userOrderParamEntity );
}
