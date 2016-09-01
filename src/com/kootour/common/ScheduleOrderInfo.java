package com.kootour.common;

import java.util.List;

import com.kootour.mapper.entity.CourseOrderVEntity;

public class ScheduleOrderInfo {

	private String processDate;
	private String courseStatus;
	private List<CourseOrderVEntity> courseOrderVEntityList;

	public String getProcessDate() {
		return processDate;
	}

	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public List<CourseOrderVEntity> getCourseOrderVEntityList() {
		return courseOrderVEntityList;
	}

	public void setCourseOrderVEntityList(List<CourseOrderVEntity> courseOrderVEntityList) {
		this.courseOrderVEntityList = courseOrderVEntityList;
	}
}
