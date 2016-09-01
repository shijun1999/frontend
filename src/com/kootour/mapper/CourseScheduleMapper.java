package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.paramentity.CourseScheduleParamEntity;
public interface CourseScheduleMapper {
List<CourseScheduleEntity> selectAll();
List<CourseScheduleEntity> selectByPK( CourseScheduleParamEntity courseScheduleParamEntity );
    List<CourseScheduleEntity> selectByCondition( CourseScheduleParamEntity courseScheduleParamEntity );

void insertOne( CourseScheduleEntity courseScheduleEntity );

void updateByPK( CourseScheduleEntity courseScheduleEntity );

}
