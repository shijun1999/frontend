package com.kootour.service4db.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.kootour.common.KooConst;
import com.kootour.mapper.CourseMapper;
import com.kootour.mapper.CourseScheduleMapper;
import com.kootour.mapper.ScheduleOptionMapper;
import com.kootour.service.CourseScheduleService;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.CourseScheduleService4DB;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CourseScheduleParamEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;

@Configuration
@Service
public class CourseScheduleService4DBImpl implements CourseScheduleService4DB  {
	@Autowired
	private CourseScheduleMapper courseScheduleMapper;


	@Override
	public List<CourseScheduleEntity> selectAll() {
		List<CourseScheduleEntity> lstCourseScheduleEntity = new ArrayList<CourseScheduleEntity>();
		lstCourseScheduleEntity = courseScheduleMapper.selectAll();
		return lstCourseScheduleEntity;
	}

	@Override
	public List<CourseScheduleEntity> selectByPK(CourseScheduleParamEntity tParamEntity) {
		List<CourseScheduleEntity> lstCourseScheduleEntity = new ArrayList<CourseScheduleEntity>();

		lstCourseScheduleEntity = courseScheduleMapper.selectByPK(tParamEntity);
		return lstCourseScheduleEntity;
	}

	@Override
	public List<CourseScheduleEntity> selectByCondition(CourseScheduleParamEntity tParamEntity) {
		List<CourseScheduleEntity> lstCourseScheduleEntity = new ArrayList<CourseScheduleEntity>();

		lstCourseScheduleEntity = courseScheduleMapper.selectByCondition(tParamEntity);
		return lstCourseScheduleEntity;
	}

	@Override
	public void insertOne(CourseScheduleEntity courseScheduleEntity) {

		courseScheduleMapper.insertOne(courseScheduleEntity);
	}

	@Override
	public void updateByPK(CourseScheduleEntity courseScheduleEntity) {

		courseScheduleMapper.updateByPK(courseScheduleEntity);
	}

	

}
