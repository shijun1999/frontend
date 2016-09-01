package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.kootour.exception.BusinessException;
import com.kootour.exception.SystemException;
import com.kootour.mapper.LocalhostMapper;
import com.kootour.mapper.SequenceMapper;
import com.kootour.service.LocalhostService;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import freemarker.core.Environment;

@Configuration
@Service
public class LocalhostService4DBImpl implements LocalhostService4DB  {
	@Autowired
	private LocalhostMapper localhostMapper;
	@Autowired
	private SequenceMapper sequenceMapper;


	@Override
	public List<LocalhostEntity> selectAll() {
		List<LocalhostEntity> lstLocalhostEntity = new ArrayList<LocalhostEntity>();
		lstLocalhostEntity = localhostMapper.selectAll();
		return lstLocalhostEntity;
	}

	@Override
	public List<LocalhostEntity> selectByPK(LocalhostParamEntity tParamEntity) {
		List<LocalhostEntity> lstLocalhostEntity = new ArrayList<LocalhostEntity>();

		lstLocalhostEntity = localhostMapper.selectByPK(tParamEntity);
		return lstLocalhostEntity;
	}

	@Override
	public List<LocalhostEntity> selectByCondition(LocalhostParamEntity tParamEntity) {
		List<LocalhostEntity> lstLocalhostEntity = new ArrayList<LocalhostEntity>();

		lstLocalhostEntity = localhostMapper.selectByCondition(tParamEntity);
		return lstLocalhostEntity;
	}

	@Override
	public void insertOne(LocalhostEntity localhostEntity) {

		localhostMapper.insertOne(localhostEntity);
	}

	@Override
	public void updateByPK(LocalhostEntity localhostEntity) {

		localhostMapper.updateByPK(localhostEntity);
	}

}
