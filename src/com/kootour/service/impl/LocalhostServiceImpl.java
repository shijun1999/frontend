package com.kootour.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.exception.BusinessException;
import com.kootour.exception.SystemException;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.service.LocalhostService;
import com.kootour.service4db.LocalhostService4DB;

@Configuration
@Service
public class LocalhostServiceImpl implements LocalhostService {
	@Autowired
	private LocalhostService4DB localhostService4DB;


}
