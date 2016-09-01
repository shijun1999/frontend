package com.kootour.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.service.LocationMstService;
import com.kootour.service4db.LocationMstService4DB;

@Configuration
@Service
public class LocationMstServiceImpl implements LocationMstService {
	@Autowired
	private LocationMstService4DB locationMstService4DB;


}
