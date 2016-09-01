package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
public interface ScheduleOptionService4DB {
List<ScheduleOptionEntity> selectAll();
List<ScheduleOptionEntity> selectByPK( ScheduleOptionParamEntity scheduleOptionParamEntity );
List<ScheduleOptionEntity> selectByCondition( ScheduleOptionParamEntity scheduleOptionParamEntity );

void insertOne( ScheduleOptionEntity ScheduleOptionEntity );

void updateByPK( ScheduleOptionEntity ScheduleOptionEntity );

}
