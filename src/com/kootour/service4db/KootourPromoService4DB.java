package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.KootourPromoEntity;
import com.kootour.mapper.paramentity.KootourPromoParamEntity;
public interface KootourPromoService4DB {
List<KootourPromoEntity> selectAll();
List<KootourPromoEntity> selectByPK( KootourPromoParamEntity kootourPromoParamEntity );
List<KootourPromoEntity> selectByCondition( KootourPromoParamEntity kootourPromoParamEntity );

void insertOne( KootourPromoEntity KootourPromoEntity );

void updateByPK( KootourPromoEntity KootourPromoEntity );

}
