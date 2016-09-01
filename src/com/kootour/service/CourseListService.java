package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseListEntity;
public interface CourseListService {
	CourseListEntity back(CourseListEntity courseListEntity, Map<String, Object> paraMap);
	CourseListEntity load(CourseListEntity courseListEntity, Map<String, Object> paraMap);
	CourseListEntity changeCity(CourseListEntity courseListEntity, Map<String, Object> paraMap);
	CourseListEntity attrFilter(CourseListEntity courseListEntity, Map<String, Object> paraMap);
}
