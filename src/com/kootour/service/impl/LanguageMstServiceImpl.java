package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.mapper.entity.LanguageMstEntity;
import com.kootour.mapper.paramentity.LanguageMstParamEntity;
import com.kootour.service.LanguageMstService;
import com.kootour.service4db.LanguageMstService4DB;
import com.kootour.service4db.SequenceService4DB;
@Configuration
@Service
public class LanguageMstServiceImpl implements LanguageMstService{	
  @Autowired
  private LanguageMstService4DB languageMstService4DB;
  @Autowired
  private SequenceService4DB sequenceService4DB;
  @Override
  public List<LanguageMstEntity> selectAll(){
	  List<LanguageMstEntity> lstLanguageMstEntity=new ArrayList<LanguageMstEntity>();
	  lstLanguageMstEntity = languageMstService4DB.selectAll();
	  return lstLanguageMstEntity;
  }
  @Override
  public List<LanguageMstEntity> selectByPK( LanguageMstParamEntity tParamEntity ){
	  List<LanguageMstEntity> lstLanguageMstEntity=new ArrayList<LanguageMstEntity>();
	  
	  lstLanguageMstEntity = languageMstService4DB.selectByPK(tParamEntity);
	  return lstLanguageMstEntity;
  }
  @Override
  public List<LanguageMstEntity> selectByCondition( LanguageMstParamEntity tParamEntity ){
	  List<LanguageMstEntity> lstLanguageMstEntity=new ArrayList<LanguageMstEntity>();
	  
	  lstLanguageMstEntity = languageMstService4DB.selectByCondition(tParamEntity);
	  return lstLanguageMstEntity;
}
  @Override
  public void insertOne(LanguageMstEntity languageMstEntity) {
	  
	    languageMstService4DB.insertOne(languageMstEntity);
}
  @Override
  public void updateByPK(LanguageMstEntity languageMstEntity) {
	  
	    languageMstService4DB.updateByPK(languageMstEntity);
}

}
