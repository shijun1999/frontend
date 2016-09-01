package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.KootourMstEntity;
import com.kootour.mapper.paramentity.KootourMstParamEntity;
public interface KootourMstMapper {
List<KootourMstEntity> selectAll();
List<KootourMstEntity> selectByPK( KootourMstParamEntity kootourMstParamEntity );
    List<KootourMstEntity> selectByCondition( KootourMstParamEntity kootourMstParamEntity );

void insertOne( KootourMstEntity kootourMstEntity );

void updateByPK( KootourMstEntity kootourMstEntity );

}
