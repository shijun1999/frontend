package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseLocalhostVEntity;
import com.kootour.mapper.paramentity.CourseLocalhostVParamEntity;
public interface CourseLocalhostVService4DB {
List<CourseLocalhostVEntity> selectByCondition( CourseLocalhostVParamEntity courseLocalhostVParamEntity );
}
