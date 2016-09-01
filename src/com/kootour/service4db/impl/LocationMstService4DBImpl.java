package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.mapper.LocationMstMapper;
import com.kootour.service.LocationMstService;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.LocationMstService4DB;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.paramentity.LocationMstParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;

@Configuration
@Service
public class LocationMstService4DBImpl implements LocationMstService4DB  {
	@Autowired
	private LocationMstMapper locationMstMapper;
	@Autowired
	private SequenceMapper sequenceMapper;

	@Override
	public List<LocationMstEntity> selectAll() {
		List<LocationMstEntity> lstLocationMstEntity = new ArrayList<LocationMstEntity>();
		lstLocationMstEntity = locationMstMapper.selectAll();
		return lstLocationMstEntity;
	}

	@Override
	public List<LocationMstEntity> selectByPK(LocationMstParamEntity tParamEntity) {
		List<LocationMstEntity> lstLocationMstEntity = new ArrayList<LocationMstEntity>();

		lstLocationMstEntity = locationMstMapper.selectByPK(tParamEntity);
		return lstLocationMstEntity;
	}

	@Override
	public List<LocationMstEntity> selectByCondition(LocationMstParamEntity tParamEntity) {
		List<LocationMstEntity> lstLocationMstEntity = new ArrayList<LocationMstEntity>();

		lstLocationMstEntity = locationMstMapper.selectByCondition(tParamEntity);
		return lstLocationMstEntity;
	}

	@Override
	public void insertOne(LocationMstEntity locationMstEntity) {

		locationMstMapper.insertOne(locationMstEntity);
	}

	@Override
	public void updateByPK(LocationMstEntity locationMstEntity) {

		locationMstMapper.updateByPK(locationMstEntity);
	}

}
