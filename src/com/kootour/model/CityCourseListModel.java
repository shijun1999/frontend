//Auto Generated 

package com.kootour.model;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.BaseAction;

public class CityCourseListModel extends BaseAction {
	private String langId;
	private String touristIdentiNo;
	private String state;
	private String city;
	private String langSelect;
	private String searchDate;
	private String category;
	private String courseNum;
	private List<CourseModel> courseList = new ArrayList<CourseModel>();
	private List<CourseModel> baseCourseList = new ArrayList<CourseModel>();
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

	public String getLangSelect() {
		return langSelect;
	}

	public void setLangSelect(String langSelect) {
		this.langSelect = langSelect;
	}

	public String getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public List<CourseModel> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseModel> courseList) {
		this.courseList = courseList;
	}

	public List<CourseModel> getBaseCourseList() {
		return baseCourseList;
	}

	public void setBaseCourseList(List<CourseModel> baseCourseList) {
		this.baseCourseList = baseCourseList;
	}

	public String getLangId() {
		return langId;
	}

	public void setLangId(String langId) {
		this.langId = langId;
	}

	public String getTouristIdentiNo() {
		return touristIdentiNo;
	}

	public void setTouristIdentiNo(String touristIdentiNo) {
		this.touristIdentiNo = touristIdentiNo;
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
