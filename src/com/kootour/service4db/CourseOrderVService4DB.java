package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseOrderVEntity;
import com.kootour.mapper.paramentity.CourseOrderVParamEntity;
public interface CourseOrderVService4DB {
List<CourseOrderVEntity> selectByCondition( CourseOrderVParamEntity courseOrderVParamEntity );

}
