package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.NewCourseListEntity;
public interface NewCourseListService {
NewCourseListEntity cancel(NewCourseListEntity newCourseListEntity,Map<String,Object> paraMap);
NewCourseListEntity save(NewCourseListEntity newCourseListEntity,Map<String,Object> paraMap);
NewCourseListEntity courseDetail(NewCourseListEntity newCourseListEntity,Map<String,Object> paraMap);
NewCourseListEntity load(NewCourseListEntity newCourseListEntity,Map<String,Object> paraMap);
}
