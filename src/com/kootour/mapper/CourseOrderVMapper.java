package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.CourseOrderVEntity;
import com.kootour.mapper.paramentity.CourseOrderVParamEntity;
public interface CourseOrderVMapper {
List<CourseOrderVEntity> selectAll();
List<CourseOrderVEntity> selectByPK( CourseOrderVParamEntity courseOrderVParamEntity );
    List<CourseOrderVEntity> selectByCondition( CourseOrderVParamEntity courseOrderVParamEntity );

void insertOne( CourseOrderVEntity courseOrderVEntity );

void updateByPK( CourseOrderVEntity courseOrderVEntity );

}
