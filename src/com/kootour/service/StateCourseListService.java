package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.StateCourseListEntity;
public interface StateCourseListService {
	StateCourseListEntity search(StateCourseListEntity stateCourseListEntity, Map<String, Object> paraMap);
	StateCourseListEntity load(StateCourseListEntity stateCourseListEntity, Map<String, Object> paraMap);
	StateCourseListEntity courseDetail(StateCourseListEntity stateCourseListEntity, Map<String, Object> paraMap);
	StateCourseListEntity cityCourseList(StateCourseListEntity stateCourseListEntity, Map<String, Object> paraMap);
}
