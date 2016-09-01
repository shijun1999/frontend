package com.kootour.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.mapper.entity.PictureEntity;
import com.kootour.service.PictureService;
import com.kootour.service4db.PictureService4DB;

@Configuration
@Service
public class PictureServiceImpl implements PictureService {
	@Autowired
	private PictureService4DB pictureService4DB;


}
