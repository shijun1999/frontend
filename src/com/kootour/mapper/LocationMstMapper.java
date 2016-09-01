package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.paramentity.LocationMstParamEntity;
public interface LocationMstMapper {
List<LocationMstEntity> selectAll();
List<LocationMstEntity> selectByPK( LocationMstParamEntity locationMstParamEntity );
    List<LocationMstEntity> selectByCondition( LocationMstParamEntity locationMstParamEntity );

void insertOne( LocationMstEntity locationMstEntity );

void updateByPK( LocationMstEntity locationMstEntity );

}
