package com.kootour.service4db.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.mapper.LanguageMatrixMapper;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.LanguageMatrixService4DB;
import com.kootour.mapper.entity.LanguageMatrixEntity;
import com.kootour.mapper.paramentity.LanguageMatrixParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;
@Configuration
@Service
public class LanguageMatrixService4DBImpl implements LanguageMatrixService4DB {	
  @Autowired
  private LanguageMatrixMapper languageMatrixMapper;
  @Autowired
  private SequenceMapper sequenceMapper;
  @Override
  public List<LanguageMatrixEntity> selectAll(){
	  List<LanguageMatrixEntity> lstLanguageMatrixEntity=new ArrayList<LanguageMatrixEntity>();
	  lstLanguageMatrixEntity = languageMatrixMapper.selectAll();
	  return lstLanguageMatrixEntity;
  }
  @Override
  public List<LanguageMatrixEntity> selectByPK( LanguageMatrixParamEntity tParamEntity ){
	  List<LanguageMatrixEntity> lstLanguageMatrixEntity=new ArrayList<LanguageMatrixEntity>();
	  
	  lstLanguageMatrixEntity = languageMatrixMapper.selectByPK(tParamEntity);
	  return lstLanguageMatrixEntity;
  }
  @Override
  public List<LanguageMatrixEntity> selectByCondition( LanguageMatrixParamEntity tParamEntity ){
	  List<LanguageMatrixEntity> lstLanguageMatrixEntity=new ArrayList<LanguageMatrixEntity>();
	  
	  lstLanguageMatrixEntity = languageMatrixMapper.selectByCondition(tParamEntity);
	  return lstLanguageMatrixEntity;
}
  @Override
  public void insertOne(LanguageMatrixEntity languageMatrixEntity) {
	  
	    languageMatrixMapper.insertOne(languageMatrixEntity);
}
  @Override
  public void updateByPK(LanguageMatrixEntity languageMatrixEntity) {
	  
	    languageMatrixMapper.updateByPK(languageMatrixEntity);
}
}
