package com.kootour.service4db.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.mapper.CourseFavoriteVMapper;
import com.kootour.mapper.entity.CourseFavoriteVEntity;
import com.kootour.mapper.paramentity.CourseFavoriteVParamEntity;
import com.kootour.service4db.CourseFavoriteVService4DB;
@Configuration
@Service
public class CourseFavoriteVServiceImpl implements CourseFavoriteVService4DB{	
  @Autowired
  private CourseFavoriteVMapper courseFavoriteVMapper;
  @Override
  public List<CourseFavoriteVEntity> selectByCondition( CourseFavoriteVParamEntity tParamEntity ){
	  List<CourseFavoriteVEntity> lstCourseFavoriteVEntity=new ArrayList<CourseFavoriteVEntity>();
	  
	  lstCourseFavoriteVEntity = courseFavoriteVMapper.selectByCondition(tParamEntity);
	  return lstCourseFavoriteVEntity;
}
}
