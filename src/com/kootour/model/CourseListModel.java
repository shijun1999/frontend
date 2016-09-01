//Auto Generated 

package com.kootour.model;

import java.util.List;

import com.kootour.action.BaseAction;

import java.util.ArrayList;

public class CourseListModel extends BaseAction {
	private String state;
	private String city;
	private List<CourseModel> courseList = new ArrayList<CourseModel>();
	private String createTime;
	private String modifyTime;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<CourseModel> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<CourseModel> courseList) {
		this.courseList = courseList;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

}
