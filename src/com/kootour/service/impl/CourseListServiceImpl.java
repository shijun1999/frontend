package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.service.CourseListService;
import com.kootour.mapper.entity.CourseListEntity;
import freemarker.core.Environment;
@Configuration
@Service
public class CourseListServiceImpl implements CourseListService {
	@Override
	public CourseListEntity back(CourseListEntity courseListEntity, Map<String, Object> paraMap) {
		CourseListEntity rtnResult = new CourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public CourseListEntity load(CourseListEntity courseListEntity, Map<String, Object> paraMap) {
		CourseListEntity rtnResult = new CourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public CourseListEntity changeCity(CourseListEntity courseListEntity, Map<String, Object> paraMap) {
		CourseListEntity rtnResult = new CourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public CourseListEntity attrFilter(CourseListEntity courseListEntity, Map<String, Object> paraMap) {
		CourseListEntity rtnResult = new CourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
}
