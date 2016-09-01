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
import com.kootour.common.KooUtil;
import com.kootour.mapper.CourseMapper;
import com.kootour.mapper.LocalhostMapper;
import com.kootour.mapper.ScheduleOptionMapper;
import com.kootour.mapper.SequenceMapper;
import com.kootour.mapper.UserOrderMapper;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.MessageParamEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
import com.kootour.mapper.paramentity.UserOrderParamEntity;
import com.kootour.service.UserOrderService;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.UserOrderService4DB;
@Configuration
@Service
public class UserOrderService4DBImpl implements UserOrderService4DB  {
	@Autowired
	private UserOrderMapper userOrderMapper;
	@Autowired
	private SequenceMapper sequenceMapper;
	private static Logger logger = Logger.getLogger(UserOrderService4DBImpl.class);
	@Override
	public List<UserOrderEntity> selectAll() {
		List<UserOrderEntity> lstUserOrderEntity = new ArrayList<UserOrderEntity>();
		lstUserOrderEntity = userOrderMapper.selectAll();
		return lstUserOrderEntity;
	}
	@Override
	public List<UserOrderEntity> selectByPK(UserOrderParamEntity tParamEntity) {
		List<UserOrderEntity> lstUserOrderEntity = new ArrayList<UserOrderEntity>();

		lstUserOrderEntity = userOrderMapper.selectByPK(tParamEntity);
		return lstUserOrderEntity;
	}
	@Override
	public List<UserOrderEntity> selectByCondition(UserOrderParamEntity tParamEntity) {
		List<UserOrderEntity> lstUserOrderEntity = new ArrayList<UserOrderEntity>();

		lstUserOrderEntity = userOrderMapper.selectByCondition(tParamEntity);
		return lstUserOrderEntity;
	}
	@Override
	public void insertOne(UserOrderEntity userOrderEntity) {

		userOrderMapper.insertOne(userOrderEntity);
	}
	@Override
	public void updateByPK(UserOrderEntity userOrderEntity) {

		userOrderMapper.updateByPK(userOrderEntity);
	}

	@Override
	public int selectCountByCondition(UserOrderParamEntity tParamEntity){
		int rtnCount;
		rtnCount= userOrderMapper.selectCountByCondition(tParamEntity);
		return  rtnCount;
	}
}
