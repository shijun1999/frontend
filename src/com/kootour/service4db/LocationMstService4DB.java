package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.paramentity.LocationMstParamEntity;

public interface LocationMstService4DB {

	List<LocationMstEntity> selectAll();

	List<LocationMstEntity> selectByPK(LocationMstParamEntity locationMstParamEntity);

	List<LocationMstEntity> selectByCondition(LocationMstParamEntity locationMstParamEntity);

	void insertOne(LocationMstEntity LocationMstEntity);

	void updateByPK(LocationMstEntity LocationMstEntity);

}
