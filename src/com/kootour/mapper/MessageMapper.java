package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.MessageEntity;
import com.kootour.mapper.paramentity.MessageParamEntity;
public interface MessageMapper {
List<MessageEntity> selectAll();
List<MessageEntity> selectByPK( MessageParamEntity messageParamEntity );
    List<MessageEntity> selectByCondition( MessageParamEntity messageParamEntity );

void insertOne( MessageEntity messageEntity );

void updateByPK( MessageEntity messageEntity );
int selectCountByCondition(MessageParamEntity messageParamEntity );
}
