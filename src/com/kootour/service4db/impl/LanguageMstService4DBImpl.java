package com.kootour.service4db.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.mapper.LanguageMstMapper;
import com.kootour.service.LanguageMstService;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.LanguageMstService4DB;
import com.kootour.mapper.entity.LanguageMstEntity;
import com.kootour.mapper.paramentity.LanguageMstParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;
@Configuration
@Service
public class LanguageMstService4DBImpl implements LanguageMstService4DB {	
  @Autowired
  private LanguageMstMapper languageMstMapper;
  @Autowired
  private SequenceMapper sequenceMapper;
  @Override
  public List<LanguageMstEntity> selectAll(){
	  List<LanguageMstEntity> lstLanguageMstEntity=new ArrayList<LanguageMstEntity>();
	  lstLanguageMstEntity = languageMstMapper.selectAll();
	  return lstLanguageMstEntity;
  }
  @Override
  public List<LanguageMstEntity> selectByPK( LanguageMstParamEntity tParamEntity ){
	  List<LanguageMstEntity> lstLanguageMstEntity=new ArrayList<LanguageMstEntity>();
	  
	  lstLanguageMstEntity = languageMstMapper.selectByPK(tParamEntity);
	  return lstLanguageMstEntity;
  }
  @Override
  public List<LanguageMstEntity> selectByCondition( LanguageMstParamEntity tParamEntity ){
	  List<LanguageMstEntity> lstLanguageMstEntity=new ArrayList<LanguageMstEntity>();
	  
	  lstLanguageMstEntity = languageMstMapper.selectByCondition(tParamEntity);
	  return lstLanguageMstEntity;
}
  @Override
  public void insertOne(LanguageMstEntity languageMstEntity) {
	  
	    languageMstMapper.insertOne(languageMstEntity);
}
  @Override
  public void updateByPK(LanguageMstEntity languageMstEntity) {
	  
	    languageMstMapper.updateByPK(languageMstEntity);
}
}
