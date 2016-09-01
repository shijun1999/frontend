package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.mapper.SequenceMapper;
import com.kootour.mapper.UserOrderExtraOptionMapper;
import com.kootour.mapper.entity.UserOrderExtraOptionEntity;
import com.kootour.mapper.paramentity.UserOrderExtraOptionParamEntity;
import com.kootour.service4db.UserOrderExtraOptionService4DB;

@Configuration
@Service
public class UserOrderExtraOptionService4DBImpl implements UserOrderExtraOptionService4DB {
	@Autowired
	private UserOrderExtraOptionMapper userOrderExtraOptionMapper;
	@Autowired
	private SequenceMapper sequenceMapper;

	@Override
	public List<UserOrderExtraOptionEntity> selectAll() {
		List<UserOrderExtraOptionEntity> lstUserOrderExtraOptionEntity = new ArrayList<UserOrderExtraOptionEntity>();
		lstUserOrderExtraOptionEntity = userOrderExtraOptionMapper.selectAll();
		return lstUserOrderExtraOptionEntity;
	}

	@Override
	public List<UserOrderExtraOptionEntity> selectByPK(UserOrderExtraOptionParamEntity tParamEntity) {
		List<UserOrderExtraOptionEntity> lstUserOrderExtraOptionEntity = new ArrayList<UserOrderExtraOptionEntity>();

		lstUserOrderExtraOptionEntity = userOrderExtraOptionMapper.selectByPK(tParamEntity);
		return lstUserOrderExtraOptionEntity;
	}

	@Override
	public List<UserOrderExtraOptionEntity> selectByCondition(UserOrderExtraOptionParamEntity tParamEntity) {
		List<UserOrderExtraOptionEntity> lstUserOrderExtraOptionEntity = new ArrayList<UserOrderExtraOptionEntity>();

		lstUserOrderExtraOptionEntity = userOrderExtraOptionMapper.selectByCondition(tParamEntity);
		return lstUserOrderExtraOptionEntity;
	}

	@Override
	public void insertOne(UserOrderExtraOptionEntity userOrderExtraOptionEntity) {

		userOrderExtraOptionMapper.insertOne(userOrderExtraOptionEntity);
	}

	@Override
	public void updateByPK(UserOrderExtraOptionEntity userOrderExtraOptionEntity) {

		userOrderExtraOptionMapper.updateByPK(userOrderExtraOptionEntity);
	}
}
