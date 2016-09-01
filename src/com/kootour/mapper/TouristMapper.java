package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;
public interface TouristMapper {
List<TouristEntity> selectAll();
List<TouristEntity> selectByPK( TouristParamEntity touristParamEntity );
    List<TouristEntity> selectByCondition( TouristParamEntity touristParamEntity );

void insertOne( TouristEntity touristEntity );

void updateByPK( TouristEntity touristEntity );

}
