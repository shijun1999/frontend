package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.ExtraOptionEntity;
import com.kootour.mapper.paramentity.ExtraOptionParamEntity;

public interface ExtraOptionService4DB {
	List<ExtraOptionEntity> selectAll();

	List<ExtraOptionEntity> selectByPK(ExtraOptionParamEntity extraOptionParamEntity);

	List<ExtraOptionEntity> selectByCondition(ExtraOptionParamEntity extraOptionParamEntity);

	void insertOne(ExtraOptionEntity ExtraOptionEntity);

	void updateByPK(ExtraOptionEntity ExtraOptionEntity);
}
