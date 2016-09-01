package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;

public interface CourseService4DB {

	List<CourseEntity> selectAll();

	List<CourseEntity> selectByPK(CourseParamEntity courseParamEntity);

	List<CourseEntity> selectByCondition(CourseParamEntity courseParamEntity);

	void insertOne(CourseEntity CourseEntity);

	void updateByPK(CourseEntity CourseEntity);

	int selectCountByCondition(CourseParamEntity courseParamEntity);

}
