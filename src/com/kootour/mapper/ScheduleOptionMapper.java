package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
public interface ScheduleOptionMapper {
List<ScheduleOptionEntity> selectAll();
List<ScheduleOptionEntity> selectByPK( ScheduleOptionParamEntity scheduleOptionParamEntity );
    List<ScheduleOptionEntity> selectByCondition( ScheduleOptionParamEntity scheduleOptionParamEntity );

void insertOne( ScheduleOptionEntity scheduleOptionEntity );

void updateByPK( ScheduleOptionEntity scheduleOptionEntity );

}
