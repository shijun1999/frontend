package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.CourseLocalhostVEntity;
import com.kootour.mapper.paramentity.CourseLocalhostVParamEntity;
public interface CourseLocalhostVMapper {
    List<CourseLocalhostVEntity> selectByCondition( CourseLocalhostVParamEntity courseLocalhostVParamEntity );

}
