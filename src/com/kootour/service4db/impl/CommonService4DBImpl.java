package com.kootour.service4db.impl;

import java.sql.Timestamp;
import java.sql.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.mapper.CommonMapper;
import com.kootour.service4db.CommonService4DB;

@Configuration
@Service
public class CommonService4DBImpl implements CommonService4DB {
	@Autowired
	private CommonMapper commonMapper;
	private static Logger logger = Logger.getLogger(CommonService4DBImpl.class);

	@Override
	public String selectDate() {
		String sysDate ;
		sysDate=commonMapper.selectDate();
		return sysDate;
	}

	@Override
	public String selectTimestamp() {
		String sysTimestamp=null;
		sysTimestamp=commonMapper.selectTimestamp();
		return sysTimestamp;
	}


}
