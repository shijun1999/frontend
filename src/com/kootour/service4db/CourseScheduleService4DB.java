package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.paramentity.CourseScheduleParamEntity;

public interface CourseScheduleService4DB {

	List<CourseScheduleEntity> selectAll();

	List<CourseScheduleEntity> selectByPK(CourseScheduleParamEntity courseScheduleParamEntity);

	List<CourseScheduleEntity> selectByCondition(CourseScheduleParamEntity courseScheduleParamEntity);

	void insertOne(CourseScheduleEntity CourseScheduleEntity);

	void updateByPK(CourseScheduleEntity CourseScheduleEntity);

}
