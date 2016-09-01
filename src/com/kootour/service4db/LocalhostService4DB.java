package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;

public interface LocalhostService4DB {

	List<LocalhostEntity> selectAll();

	List<LocalhostEntity> selectByPK(LocalhostParamEntity localhostParamEntity);

	List<LocalhostEntity> selectByCondition(LocalhostParamEntity localhostParamEntity);

	void insertOne(LocalhostEntity LocalhostEntity);

	void updateByPK(LocalhostEntity LocalhostEntity);

}
