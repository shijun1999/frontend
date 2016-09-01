package com.kootour.service4db.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.mapper.CourseOrderVMapper;
import com.kootour.service4db.CourseOrderVService4DB;
import com.kootour.mapper.entity.CourseOrderVEntity;
import com.kootour.mapper.paramentity.CourseOrderVParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;
@Configuration
@Service
public class CourseOrderVService4DBImpl implements CourseOrderVService4DB{	
  @Autowired
  private CourseOrderVMapper courseOrderVMapper;

  @Override
  public List<CourseOrderVEntity> selectByCondition( CourseOrderVParamEntity tParamEntity ){
	  List<CourseOrderVEntity> lstCourseOrderVEntity=new ArrayList<CourseOrderVEntity>();
	  
	  lstCourseOrderVEntity = courseOrderVMapper.selectByCondition(tParamEntity);
	  return lstCourseOrderVEntity;
}
}
