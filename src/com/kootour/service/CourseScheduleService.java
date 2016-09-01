package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.paramentity.CourseScheduleParamEntity;

public interface CourseScheduleService {
	CourseScheduleEntity cancel(CourseScheduleEntity courseScheduleEntity, Map<String, Object> paraMap);

	CourseScheduleEntity save(CourseScheduleEntity courseScheduleEntity, Map<String, Object> paraMap);

	CourseScheduleEntity back(CourseScheduleEntity courseScheduleEntity, Map<String, Object> paraMap);

	CourseScheduleEntity load(CourseScheduleEntity courseScheduleEntity, Map<String, Object> paraMap);

	int insertOneYear(String langId,String courseIdentiNo);

	int changeToInactive(String langId,String courseIdentiNo,String strYyyymmdd);
	
	int changeToActive(String langId,String courseIdentiNo,String strYyyymmdd);

	Boolean checkDeleteOk(String langId,String courseIdentiNo,String strYyyymmdd);

	List<String> calcCourseStatus(String langId,String courseIdentiNo,String strYyyymm);

	List<List<ScheduleOptionEntity>> calcScheduleOption(String langId, String courseIdentiNo, String strYyyymm);
   
	String calcTimeTable(String langId, String courseIdentiNo, String strYyyymmdd);
	

}
