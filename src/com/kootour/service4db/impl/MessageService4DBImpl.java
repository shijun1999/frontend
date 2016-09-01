package com.kootour.service4db.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.kootour.common.KooConst;
import com.kootour.mapper.MessageMapper;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.MessageService4DB;
import com.kootour.mapper.entity.MessageEntity;
import com.kootour.mapper.paramentity.FavoriteParamEntity;
import com.kootour.mapper.paramentity.MessageParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;
@Configuration
@Service
public class MessageService4DBImpl implements MessageService4DB {	
  @Autowired
  private MessageMapper messageMapper;
  @Autowired
  private SequenceMapper sequenceMapper;
  @Override
  public List<MessageEntity> selectAll(){
	  List<MessageEntity> lstMessageEntity=new ArrayList<MessageEntity>();
	  lstMessageEntity = messageMapper.selectAll();
	  return lstMessageEntity;
  }
  @Override
  public List<MessageEntity> selectByPK( MessageParamEntity tParamEntity ){
	  List<MessageEntity> lstMessageEntity=new ArrayList<MessageEntity>();
	  
	  lstMessageEntity = messageMapper.selectByPK(tParamEntity);
	  return lstMessageEntity;
  }
  @Override
  public List<MessageEntity> selectByCondition( MessageParamEntity tParamEntity ){
	  List<MessageEntity> lstMessageEntity=new ArrayList<MessageEntity>();
	  
	  lstMessageEntity = messageMapper.selectByCondition(tParamEntity);
	  return lstMessageEntity;
}
  @Override
  public void insertOne(MessageEntity messageEntity) {
	  
	    messageMapper.insertOne(messageEntity);
}
  @Override
  public void updateByPK(MessageEntity messageEntity) {
	  
	    messageMapper.updateByPK(messageEntity);
}
	@Override
	public int selectCountByCondition(MessageParamEntity tParamEntity){
		int rtnCount;
		rtnCount= messageMapper.selectCountByCondition(tParamEntity);
		return  rtnCount;
	}
}
