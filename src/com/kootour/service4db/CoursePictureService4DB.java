package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;

public interface CoursePictureService4DB {

	List<CoursePictureEntity> selectAll();

	List<CoursePictureEntity> selectByPK(CoursePictureParamEntity coursePictureParamEntity);

	List<CoursePictureEntity> selectByCondition(CoursePictureParamEntity coursePictureParamEntity);

	void insertOne(CoursePictureEntity CoursePictureEntity);

	void updateByPK(CoursePictureEntity CoursePictureEntity);

}
