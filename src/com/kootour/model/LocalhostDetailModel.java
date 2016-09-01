//Auto Generated 

package com.kootour.model;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.BaseAction;
import com.kootour.action.CourseAction;
import com.kootour.action.CourseCommentAction;
import com.kootour.action.LocalhostAction;

public class LocalhostDetailModel extends BaseAction {
	private String localhostIdentiNo;
	private LocalhostModel localhost = new LocalhostModel();
	private List<CourseCommentModel> courseCommentList = new ArrayList<CourseCommentModel>();
	private String courseCommentNum;
	private List<CourseModel> courseList = new ArrayList<>();
	private List<String> scoreIconListDisp = new ArrayList<String>();

	private String createTime;
	private String modifyTime;

	public String getLocalhostIdentiNo() {
		return localhostIdentiNo;
	}

	public void setLocalhostIdentiNo(String localhostIdentiNo) {
		this.localhostIdentiNo = localhostIdentiNo;
	}


	public List<CourseModel> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseModel> courseList) {
		this.courseList = courseList;
	}

	public LocalhostModel getLocalhost() {
		return localhost;
	}

	public void setLocalhost(LocalhostModel localhost) {
		this.localhost = localhost;
	}

	public List<CourseCommentModel> getCourseCommentList() {
		return courseCommentList;
	}

	public void setCourseCommentList(List<CourseCommentModel> courseCommentList) {
		this.courseCommentList = courseCommentList;
	}

	public String getCourseCommentNum() {
		return courseCommentNum;
	}

	public void setCourseCommentNum(String courseCommentNum) {
		this.courseCommentNum = courseCommentNum;
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

	public List<String> getScoreIconListDisp() {
		return scoreIconListDisp;
	}

	public void setScoreIconListDisp(List<String> scoreIconListDisp) {
		this.scoreIconListDisp = scoreIconListDisp;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

}
