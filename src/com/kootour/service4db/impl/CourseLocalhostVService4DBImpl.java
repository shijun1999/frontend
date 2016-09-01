package com.kootour.service4db.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.mapper.CourseLocalhostVMapper;
import com.kootour.service4db.CourseLocalhostVService4DB;
import com.kootour.mapper.entity.CourseLocalhostVEntity;
import com.kootour.mapper.paramentity.CourseLocalhostVParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;
@Configuration
@Service
public class CourseLocalhostVService4DBImpl implements CourseLocalhostVService4DB{	
  @Autowired
  private CourseLocalhostVMapper courseLocalhostVMapper;
  @Override
  public List<CourseLocalhostVEntity> selectByCondition( CourseLocalhostVParamEntity tParamEntity ){
	  List<CourseLocalhostVEntity> lstCourseLocalhostVEntity=new ArrayList<CourseLocalhostVEntity>();
	  
	  lstCourseLocalhostVEntity = courseLocalhostVMapper.selectByCondition(tParamEntity);
	  return lstCourseLocalhostVEntity;
}
}
