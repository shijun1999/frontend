package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.mapper.SequenceMapper;
import com.kootour.mapper.TouristMapper;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;
import com.kootour.service.QuicklySignUpService;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.QuicklySignUpService4DB;

@Configuration
@Service
public class QuicklySignUpService4DBImpl implements QuicklySignUpService4DB  {
	@Autowired
	private TouristMapper touristMapper;
	@Autowired
	private SequenceMapper sequenceMapper;
	@Override
	public TouristEntity clear(TouristEntity touristEntity, Map<String, Object> paraMap) {
		TouristEntity rtnResult = new TouristEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public List<TouristEntity> selectAll() {
		List<TouristEntity> lstTouristEntity = new ArrayList<TouristEntity>();
		lstTouristEntity = touristMapper.selectAll();
		return lstTouristEntity;
	}

	@Override
	public List<TouristEntity> selectByPK(TouristParamEntity tParamEntity) {
		List<TouristEntity> lstTouristEntity = new ArrayList<TouristEntity>();

		lstTouristEntity = touristMapper.selectByPK(tParamEntity);
		return lstTouristEntity;
	}

	@Override
	public List<TouristEntity> selectByCondition(TouristParamEntity tParamEntity) {
		List<TouristEntity> lstTouristEntity = new ArrayList<TouristEntity>();

		lstTouristEntity = touristMapper.selectByCondition(tParamEntity);
		return lstTouristEntity;
	}

	@Override
	public void insertOne(TouristEntity touristEntity) {

		touristMapper.insertOne(touristEntity);
	}

	@Override
	public void updateByPK(TouristEntity touristEntity) {

		touristMapper.updateByPK(touristEntity);
	}

}
