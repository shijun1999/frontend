package com.kootour.common;

import java.util.Comparator;

import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;

public class KooComparator {

	public static Comparator<CourseEntity> compareCourseByScore = (Course1, Course2) -> {
		int retVal = 0;
		Integer scoreDisp1 = Course1.getTimeInDay();
		Integer scoreDisp2 = Course2.getTimeInDay();
		retVal = scoreDisp2.compareTo(scoreDisp1);

		return (retVal);
	};

	public static Comparator<ScheduleOptionEntity> compareScheduleOptionByStartTime = (ScheduleOption1, ScheduleOption2) -> {
		int retVal = 0;
		String scheduleOption1 = ScheduleOption1.getStartHour();
		String scheduleOption2 = ScheduleOption2.getStartHour();
		retVal = scheduleOption1.compareTo(scheduleOption2);

		return (retVal);
	};

	public static Comparator<CourseCommentEntity> compareCourseCommentByCommentDate = (Course1, Course2) -> {
		int retVal = 0;
		String scoreDisp1 = Course1.getCommentDate();
		String scoreDisp2 = Course2.getCommentDate();
		retVal = scoreDisp2.compareTo(scoreDisp1);

		return (retVal);
	};

}
