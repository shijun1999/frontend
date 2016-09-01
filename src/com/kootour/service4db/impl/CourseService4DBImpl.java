package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.KooConst;
import com.kootour.mapper.CourseCommentMapper;
import com.kootour.mapper.CourseMapper;
import com.kootour.mapper.LocalhostMapper;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.SequenceMapper;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.service.CourseService;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.CourseService4DB;

@Configuration
@Service
public class CourseService4DBImpl implements CourseService4DB  {
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public List<CourseEntity> selectAll() {
		List<CourseEntity> lstCourseEntity = new ArrayList<CourseEntity>();
		lstCourseEntity = courseMapper.selectAll();
		return lstCourseEntity;
	}

	@Override
	public List<CourseEntity> selectByPK(CourseParamEntity tParamEntity) {
		List<CourseEntity> lstCourseEntity = new ArrayList<CourseEntity>();

		lstCourseEntity = courseMapper.selectByPK(tParamEntity);
		return lstCourseEntity;
	}

	@Override
	public List<CourseEntity> selectByCondition(CourseParamEntity tParamEntity) {
		List<CourseEntity> lstCourseEntity = new ArrayList<CourseEntity>();

		lstCourseEntity = courseMapper.selectByCondition(tParamEntity);
		return lstCourseEntity;
	}

	@Override
	public void insertOne(CourseEntity courseEntity) {

		courseMapper.insertOne(courseEntity);
	}

	@Override
	public void updateByPK(CourseEntity courseEntity) {

		courseMapper.updateByPK(courseEntity);
	}

	@Override
	public int selectCountByCondition(CourseParamEntity courseParamEntity){
		int rtnCount;
		rtnCount= courseMapper.selectCountByCondition(courseParamEntity);
		return  rtnCount;
	}

}
