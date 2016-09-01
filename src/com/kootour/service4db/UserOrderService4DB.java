package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.UserOrderParamEntity;

public interface UserOrderService4DB {

	List<UserOrderEntity> selectAll();

	List<UserOrderEntity> selectByPK(UserOrderParamEntity userOrderParamEntity);

	List<UserOrderEntity> selectByCondition(UserOrderParamEntity userOrderParamEntity);

	void insertOne(UserOrderEntity UserOrderEntity);

	void updateByPK(UserOrderEntity UserOrderEntity);

	int selectCountByCondition(UserOrderParamEntity userOrderParamEntity);

}
