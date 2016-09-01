package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.ExtraOptionEntity;
import com.kootour.mapper.paramentity.ExtraOptionParamEntity;
public interface ExtraOptionMapper {
List<ExtraOptionEntity> selectAll();
List<ExtraOptionEntity> selectByPK( ExtraOptionParamEntity extraOptionParamEntity );
    List<ExtraOptionEntity> selectByCondition( ExtraOptionParamEntity extraOptionParamEntity );

void insertOne( ExtraOptionEntity extraOptionEntity );

void updateByPK( ExtraOptionEntity extraOptionEntity );

}
