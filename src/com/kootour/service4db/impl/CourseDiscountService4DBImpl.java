package com.kootour.service4db.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.mapper.CourseDiscountMapper;
import com.kootour.mapper.SequenceMapper;
import com.kootour.mapper.entity.CourseDiscountEntity;
import com.kootour.mapper.paramentity.CourseDiscountParamEntity;
import com.kootour.service4db.CourseDiscountService4DB;
@Configuration
@Service
public class CourseDiscountService4DBImpl implements CourseDiscountService4DB{	
  @Autowired
  private CourseDiscountMapper courseDiscountMapper;
  @Autowired
  private SequenceMapper sequenceMapper;
  @Override
  public List<CourseDiscountEntity> selectAll(){
	  List<CourseDiscountEntity> lstCourseDiscountEntity=new ArrayList<CourseDiscountEntity>();
	  lstCourseDiscountEntity = courseDiscountMapper.selectAll();
	  return lstCourseDiscountEntity;
  }
  @Override
  public List<CourseDiscountEntity> selectByPK( CourseDiscountParamEntity tParamEntity ){
	  List<CourseDiscountEntity> lstCourseDiscountEntity=new ArrayList<CourseDiscountEntity>();
	  
	  lstCourseDiscountEntity = courseDiscountMapper.selectByPK(tParamEntity);
	  return lstCourseDiscountEntity;
  }
  @Override
  public List<CourseDiscountEntity> selectByCondition( CourseDiscountParamEntity tParamEntity ){
	  List<CourseDiscountEntity> lstCourseDiscountEntity=new ArrayList<CourseDiscountEntity>();
	  
	  lstCourseDiscountEntity = courseDiscountMapper.selectByCondition(tParamEntity);
	  return lstCourseDiscountEntity;
}
  @Override
  public void insertOne(CourseDiscountEntity courseDiscountEntity) {
	  
	    courseDiscountMapper.insertOne(courseDiscountEntity);
}
  @Override
  public void updateByPK(CourseDiscountEntity courseDiscountEntity) {
	  
	    courseDiscountMapper.updateByPK(courseDiscountEntity);
}

}
