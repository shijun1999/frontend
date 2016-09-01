package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.KootourMstEntity;
import com.kootour.mapper.paramentity.KootourMstParamEntity;
public interface KootourMstService4DB {
List<KootourMstEntity> selectAll();
List<KootourMstEntity> selectByPK( KootourMstParamEntity kootourMstParamEntity );
List<KootourMstEntity> selectByCondition( KootourMstParamEntity kootourMstParamEntity );

void insertOne( KootourMstEntity KootourMstEntity );

void updateByPK( KootourMstEntity KootourMstEntity );

}
