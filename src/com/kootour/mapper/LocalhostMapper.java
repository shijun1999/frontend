package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
public interface LocalhostMapper {
List<LocalhostEntity> selectAll();
List<LocalhostEntity> selectByPK( LocalhostParamEntity localhostParamEntity );
    List<LocalhostEntity> selectByCondition( LocalhostParamEntity localhostParamEntity );

void insertOne( LocalhostEntity localhostEntity );

void updateByPK( LocalhostEntity localhostEntity );

}
