package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.PictureEntity;
import com.kootour.mapper.paramentity.PictureParamEntity;

public interface PictureService4DB {

	List<PictureEntity> selectAll();
	
	List<PictureEntity> selectByPK(PictureParamEntity pictureParamEntity);

	List<PictureEntity> selectByCondition(PictureParamEntity pictureParamEntity);

	void insertOne(PictureEntity PictureEntity);

	void updateByPK(PictureEntity PictureEntity);

}
