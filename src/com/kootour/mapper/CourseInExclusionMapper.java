package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.paramentity.CourseInExclusionParamEntity;
public interface CourseInExclusionMapper {
List<CourseInExclusionEntity> selectAll();
List<CourseInExclusionEntity> selectByPK( CourseInExclusionParamEntity courseInExclusionParamEntity );
    List<CourseInExclusionEntity> selectByCondition( CourseInExclusionParamEntity courseInExclusionParamEntity );

void insertOne( CourseInExclusionEntity courseInExclusionEntity );

void updateByPK( CourseInExclusionEntity courseInExclusionEntity );

}
