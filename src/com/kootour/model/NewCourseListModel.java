//Auto Generated 

package com.kootour.model;

import java.util.List;

import com.kootour.action.BaseAction;

import java.util.ArrayList;

public class NewCourseListModel extends BaseAction {
	private List<CourseModel> courseList = new ArrayList<CourseModel>();
//	private String localhostIdentiNo;
	private String createTime;
	private String modifyTime;
	public List<CourseModel> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<CourseModel> courseList) {
		this.courseList = courseList;
	}
//	public String getLocalhostIdentiNo() {
//		return localhostIdentiNo;
//	}
//	public void setLocalhostIdentiNo(String localhostIdentiNo) {
//		this.localhostIdentiNo = localhostIdentiNo;
//	}
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
