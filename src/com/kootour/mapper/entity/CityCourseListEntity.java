//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.CourseEntity;

public class CityCourseListEntity extends BaseEntity {
	private String langId;
	private String touristIdentiNo;
	private String state;
	private String city;
	private String langSelect;
	private String searchDate;
	private String category;
	private Integer courseNum;
	private List<CourseEntity> courseList = new ArrayList<CourseEntity>();
	private List<CourseEntity> baseCourseList = new ArrayList<CourseEntity>();
	private Date createTime;
	private Date modifyTime;

	public String getTouristIdentiNo() {
		return touristIdentiNo;
	}

	public void setTouristIdentiNo(String touristIdentiNo) {
		this.touristIdentiNo = touristIdentiNo;
	}

	public String getLangId() {
		return langId;
	}

	public void setLangId(String langId) {
		this.langId = langId;
	}

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

	public Integer getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(Integer courseNum) {
		this.courseNum = courseNum;
	}

	public List<CourseEntity> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseEntity> courseList) {
		this.courseList = courseList;
	}

	public List<CourseEntity> getBaseCourseList() {
		return baseCourseList;
	}

	public void setBaseCourseList(List<CourseEntity> baseCourseList) {
		this.baseCourseList = baseCourseList;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
