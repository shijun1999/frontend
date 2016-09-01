package com.kootour.service4db.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.mapper.ScheduleOptionMapper;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.ScheduleOptionService4DB;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;
@Configuration
@Service
public class ScheduleOptionService4DBImpl implements ScheduleOptionService4DB {	
  @Autowired
  private ScheduleOptionMapper scheduleOptionMapper;
  @Autowired
  private SequenceMapper sequenceMapper;
  @Override
  public List<ScheduleOptionEntity> selectAll(){
	  List<ScheduleOptionEntity> lstScheduleOptionEntity=new ArrayList<ScheduleOptionEntity>();
	  lstScheduleOptionEntity = scheduleOptionMapper.selectAll();
	  return lstScheduleOptionEntity;
  }
  @Override
  public List<ScheduleOptionEntity> selectByPK( ScheduleOptionParamEntity tParamEntity ){
	  List<ScheduleOptionEntity> lstScheduleOptionEntity=new ArrayList<ScheduleOptionEntity>();
	  
	  lstScheduleOptionEntity = scheduleOptionMapper.selectByPK(tParamEntity);
	  return lstScheduleOptionEntity;
  }
  @Override
  public List<ScheduleOptionEntity> selectByCondition( ScheduleOptionParamEntity tParamEntity ){
	  List<ScheduleOptionEntity> lstScheduleOptionEntity=new ArrayList<ScheduleOptionEntity>();
	  
	  lstScheduleOptionEntity = scheduleOptionMapper.selectByCondition(tParamEntity);
	  return lstScheduleOptionEntity;
}
  @Override
  public void insertOne(ScheduleOptionEntity scheduleOptionEntity) {
	  
	    scheduleOptionMapper.insertOne(scheduleOptionEntity);
}
  @Override
  public void updateByPK(ScheduleOptionEntity scheduleOptionEntity) {
	  
	    scheduleOptionMapper.updateByPK(scheduleOptionEntity);
}
}
