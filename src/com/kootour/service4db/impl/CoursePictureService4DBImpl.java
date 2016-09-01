package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.mapper.CoursePictureMapper;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;

@Configuration
@Service
public class CoursePictureService4DBImpl implements CoursePictureService4DB  {
	@Autowired
	private CoursePictureMapper coursePictureMapper;
	@Autowired
	private SequenceMapper sequenceMapper;

	@Override
	public List<CoursePictureEntity> selectAll() {
		List<CoursePictureEntity> lstCoursePictureEntity = new ArrayList<CoursePictureEntity>();
		lstCoursePictureEntity = coursePictureMapper.selectAll();
		return lstCoursePictureEntity;
	}

	@Override
	public List<CoursePictureEntity> selectByPK(CoursePictureParamEntity tParamEntity) {
		List<CoursePictureEntity> lstCoursePictureEntity = new ArrayList<CoursePictureEntity>();

		lstCoursePictureEntity = coursePictureMapper.selectByPK(tParamEntity);
		return lstCoursePictureEntity;
	}

	@Override
	public List<CoursePictureEntity> selectByCondition(CoursePictureParamEntity tParamEntity) {
		List<CoursePictureEntity> lstCoursePictureEntity = new ArrayList<CoursePictureEntity>();

		lstCoursePictureEntity = coursePictureMapper.selectByCondition(tParamEntity);
		return lstCoursePictureEntity;
	}

	@Override
	public void insertOne(CoursePictureEntity coursePictureEntity) {

		coursePictureMapper.insertOne(coursePictureEntity);
	}

	@Override
	public void updateByPK(CoursePictureEntity coursePictureEntity) {

		coursePictureMapper.updateByPK(coursePictureEntity);
	}

}
