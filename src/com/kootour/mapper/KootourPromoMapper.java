package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.KootourPromoEntity;
import com.kootour.mapper.paramentity.KootourPromoParamEntity;
public interface KootourPromoMapper {
List<KootourPromoEntity> selectAll();
List<KootourPromoEntity> selectByPK( KootourPromoParamEntity kootourPromoParamEntity );
    List<KootourPromoEntity> selectByCondition( KootourPromoParamEntity kootourPromoParamEntity );

void insertOne( KootourPromoEntity kootourPromoEntity );

void updateByPK( KootourPromoEntity kootourPromoEntity );

}
