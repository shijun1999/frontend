package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseDetailEntity;
public interface CourseDetailService {
CourseDetailEntity save(CourseDetailEntity courseDetailEntity,Map<String,Object> paraMap);
CourseDetailEntity bookSummary(CourseDetailEntity courseDetailEntity,Map<String,Object> paraMap);
CourseDetailEntity changeDate(CourseDetailEntity courseDetailEntity,Map<String,Object> paraMap);
CourseDetailEntity load(CourseDetailEntity courseDetailEntity,Map<String,Object> paraMap);
}
