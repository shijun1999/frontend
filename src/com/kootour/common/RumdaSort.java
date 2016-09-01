package com.kootour.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;

public class RumdaSort {
	
	//Courseを降順By表示順番値
	public static  List<CourseEntity> courseEntitySortByScore(List<CourseEntity> courseEntityList){
		List<CourseEntity> rtnResult = new ArrayList<CourseEntity>();
		
		if (courseEntityList != null && courseEntityList.size() > 0) {
			rtnResult =courseEntityList.stream()
					.sorted(KooComparator.compareCourseByScore)
					.collect(Collectors.toList());
		}
		
		return (rtnResult);
	}

	//ScheduleOptionを昇順By開始時間
	public static  List<ScheduleOptionEntity> scheduleOptionEntitySortByStartTime(List<ScheduleOptionEntity> scheduleOptionEntityList){
		List<ScheduleOptionEntity> rtnResult = new ArrayList<ScheduleOptionEntity>();
		
		if (scheduleOptionEntityList != null && scheduleOptionEntityList.size() > 0) {
			rtnResult =scheduleOptionEntityList.stream()
					.sorted(KooComparator.compareScheduleOptionByStartTime)
					.collect(Collectors.toList());			
		}
		
		return (rtnResult);
	}

	//ScheduleOptionを昇順By開始時間
	public static  List<CourseCommentEntity> courseCommentByCommentDate(List<CourseCommentEntity> scheduleOptionEntityList){
		List<CourseCommentEntity> rtnResult = new ArrayList<CourseCommentEntity>();
		
		if (scheduleOptionEntityList != null && scheduleOptionEntityList.size() > 0) {
			rtnResult =scheduleOptionEntityList.stream()
					.sorted(KooComparator.compareCourseCommentByCommentDate)
					.collect(Collectors.toList());			
		}
		
		return (rtnResult);
	}

}
