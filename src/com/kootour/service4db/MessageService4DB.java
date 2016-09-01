package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.MessageEntity;
import com.kootour.mapper.paramentity.MessageParamEntity;
public interface MessageService4DB {
List<MessageEntity> selectAll();
List<MessageEntity> selectByPK( MessageParamEntity messageParamEntity );
List<MessageEntity> selectByCondition( MessageParamEntity messageParamEntity );

void insertOne( MessageEntity MessageEntity );

void updateByPK( MessageEntity MessageEntity );

int selectCountByCondition(MessageParamEntity messageParamEntity );

}
