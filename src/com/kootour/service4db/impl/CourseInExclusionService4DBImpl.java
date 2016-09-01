package com.kootour.service4db.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.mapper.CourseInExclusionMapper;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.paramentity.CourseInExclusionParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;
@Configuration
@Service
public class CourseInExclusionService4DBImpl implements CourseInExclusionService4DB {	
  @Autowired
  private CourseInExclusionMapper courseInExclusionMapper;
  @Autowired
  private SequenceMapper sequenceMapper;
  @Override
  public List<CourseInExclusionEntity> selectAll(){
	  List<CourseInExclusionEntity> lstCourseInExclusionEntity=new ArrayList<CourseInExclusionEntity>();
	  lstCourseInExclusionEntity = courseInExclusionMapper.selectAll();
	  return lstCourseInExclusionEntity;
  }
  @Override
  public List<CourseInExclusionEntity> selectByPK( CourseInExclusionParamEntity tParamEntity ){
	  List<CourseInExclusionEntity> lstCourseInExclusionEntity=new ArrayList<CourseInExclusionEntity>();
	  
	  lstCourseInExclusionEntity = courseInExclusionMapper.selectByPK(tParamEntity);
	  return lstCourseInExclusionEntity;
  }
  @Override
  public List<CourseInExclusionEntity> selectByCondition( CourseInExclusionParamEntity tParamEntity ){
	  List<CourseInExclusionEntity> lstCourseInExclusionEntity=new ArrayList<CourseInExclusionEntity>();
	  
	  lstCourseInExclusionEntity = courseInExclusionMapper.selectByCondition(tParamEntity);
	  return lstCourseInExclusionEntity;
}
  @Override
  public void insertOne(CourseInExclusionEntity courseInExclusionEntity) {
	  
	    courseInExclusionMapper.insertOne(courseInExclusionEntity);
}
  @Override
  public void updateByPK(CourseInExclusionEntity courseInExclusionEntity) {
	  
	    courseInExclusionMapper.updateByPK(courseInExclusionEntity);
}
}
