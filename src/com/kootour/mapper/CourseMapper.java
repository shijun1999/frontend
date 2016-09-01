package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
public interface CourseMapper {
List<CourseEntity> selectAll();
List<CourseEntity> selectByPK( CourseParamEntity courseParamEntity );
    List<CourseEntity> selectByCondition( CourseParamEntity courseParamEntity );

void insertOne( CourseEntity courseEntity );

void updateByPK( CourseEntity courseEntity );

int selectCountByCondition( CourseParamEntity courseParamEntity );

}
