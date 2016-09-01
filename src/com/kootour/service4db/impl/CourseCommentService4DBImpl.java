package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.mapper.CourseCommentMapper;
import com.kootour.mapper.CourseMapper;
import com.kootour.mapper.CoursePictureMapper;
import com.kootour.mapper.LocalhostMapper;
import com.kootour.mapper.SequenceMapper;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.UserOrderParamEntity;
import com.kootour.service.CourseCommentService;
import com.kootour.service4db.CourseCommentService4DB;

@Configuration
@Service
public class CourseCommentService4DBImpl implements CourseCommentService4DB {
	@Autowired
	private CourseCommentMapper courseCommentMapper;
	@Autowired
	private SequenceMapper sequenceMapper;
	private static Logger logger = Logger.getLogger(CourseCommentService4DBImpl.class);

	@Override
	public List<CourseCommentEntity> selectAll() {
		List<CourseCommentEntity> lstCourseCommentEntity = new ArrayList<CourseCommentEntity>();
		lstCourseCommentEntity = courseCommentMapper.selectAll();
		return lstCourseCommentEntity;
	}

	@Override
	public List<CourseCommentEntity> selectByPK(CourseCommentParamEntity tParamEntity) {
		List<CourseCommentEntity> lstCourseCommentEntity = new ArrayList<CourseCommentEntity>();

		lstCourseCommentEntity = courseCommentMapper.selectByPK(tParamEntity);
		return lstCourseCommentEntity;
	}

	@Override
	public List<CourseCommentEntity> selectByCondition(CourseCommentParamEntity tParamEntity) {
		List<CourseCommentEntity> lstCourseCommentEntity = new ArrayList<CourseCommentEntity>();

		lstCourseCommentEntity = courseCommentMapper.selectByCondition(tParamEntity);
		return lstCourseCommentEntity;
	}

	@Override
	public void insertOne(CourseCommentEntity courseCommentEntity) {

		courseCommentMapper.insertOne(courseCommentEntity);
	}

	@Override
	public void updateByPK(CourseCommentEntity courseCommentEntity) {

		courseCommentMapper.updateByPK(courseCommentEntity);
	}

	@Override
	public int selectCountByCondition(CourseCommentParamEntity tParamEntity){
		int rtnCount;
		rtnCount= courseCommentMapper.selectCountByCondition(tParamEntity);
		return  rtnCount;
	}

}
