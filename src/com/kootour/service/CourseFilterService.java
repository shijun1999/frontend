package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseFilterEntity;
public interface CourseFilterService {
	CourseFilterEntity cancel(CourseFilterEntity courseFilterEntity, Map<String, Object> paraMap);
	CourseFilterEntity filterOk(CourseFilterEntity courseFilterEntity, Map<String, Object> paraMap);
	CourseFilterEntity back(CourseFilterEntity courseFilterEntity, Map<String, Object> paraMap);
	CourseFilterEntity load(CourseFilterEntity courseFilterEntity, Map<String, Object> paraMap);
	Map<String, Object> init(CourseFilterEntity courseFilterEntity);
}
