package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.paramentity.CourseInExclusionParamEntity;
public interface CourseInExclusionService4DB {
List<CourseInExclusionEntity> selectAll();
List<CourseInExclusionEntity> selectByPK( CourseInExclusionParamEntity courseInExclusionParamEntity );
List<CourseInExclusionEntity> selectByCondition( CourseInExclusionParamEntity courseInExclusionParamEntity );

void insertOne( CourseInExclusionEntity CourseInExclusionEntity );

void updateByPK( CourseInExclusionEntity CourseInExclusionEntity );

}
