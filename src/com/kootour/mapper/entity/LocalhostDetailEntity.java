//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.model.CourseCommentModel;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;

public class LocalhostDetailEntity extends BaseEntity {
	private String langId;
	private String localhostIdentiNo;
	private LocalhostEntity localhost = new LocalhostEntity();
	private List<CourseCommentEntity> courseCommentList = new ArrayList<CourseCommentEntity>();
	private Integer courseCommentNum;
	private List<CourseEntity> courseList = new ArrayList<CourseEntity>();
	private List<String> scoreIconListDisp = new ArrayList<String>();
	private Date createTime;
	private Date modifyTime;

	public String getLangId() {
		return langId;
	}

	public void setLangId(String langId) {
		this.langId = langId;
	}

	public String getLocalhostIdentiNo() {
		return localhostIdentiNo;
	}

	public void setLocalhostIdentiNo(String localhostIdentiNo) {
		this.localhostIdentiNo = localhostIdentiNo;
	}

	public List<CourseEntity> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseEntity> courseList) {
		this.courseList = courseList;
	}

	public LocalhostEntity getLocalhost() {
		return localhost;
	}

	public void setLocalhost(LocalhostEntity localhost) {
		this.localhost = localhost;
	}

	public List<CourseCommentEntity> getCourseCommentList() {
		return courseCommentList;
	}

	public void setCourseCommentList(List<CourseCommentEntity> courseCommentList) {
		this.courseCommentList = courseCommentList;
	}

	public Integer getCourseCommentNum() {
		return courseCommentNum;
	}

	public void setCourseCommentNum(Integer courseCommentNum) {
		this.courseCommentNum = courseCommentNum;
	}

	public List<String> getScoreIconListDisp() {
		return scoreIconListDisp;
	}

	public void setScoreIconListDisp(List<String> scoreIconListDisp) {
		this.scoreIconListDisp = scoreIconListDisp;
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
