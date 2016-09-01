//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.common.KooConst;

public class CourseCommentEntity extends BaseEntity {
	private String langId;
	private String courseCommentIdentiNo;
	private Integer commentType;
	private String courseIdentiNo;
	private String touristIdentiNo;
	private String commentDate;
	private Double score;
    private Double accuracy;
    private Double communication;
    private Double services;
    private Double knowledge;
    private Double value;
    private String comment;
	private String courseFullNameDisp;
	private String localhostFullNameDisp;
	private List<String> scoreIconListDisp = new ArrayList<String>();
	private List<String> coursePictureListDisp = new ArrayList<String>();
	private String localhostPictureDisp;
	private Date createTime;
	private Date modifyTime;
    private String delFlg;
    private String localhostIdentiNo;
    private String touristFirstName;
    private String touristLastName;
    private String touristPicture;

public String getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}
	public String getLangId() {
		return langId;
	}
	public void setLangId(String langId) {
		this.langId = langId;
	}
	public String getCourseCommentIdentiNo() {
		return courseCommentIdentiNo;
	}
	public void setCourseCommentIdentiNo(String courseCommentIdentiNo) {
		this.courseCommentIdentiNo = courseCommentIdentiNo;
	}
	public Integer getCommentType() {
		return commentType;
	}
	public void setCommentType(Integer commentType) {
		this.commentType = commentType;
	}
	public String getCourseIdentiNo() {
		return courseIdentiNo;
	}
	public void setCourseIdentiNo(String courseIdentiNo) {
		this.courseIdentiNo = courseIdentiNo;
	}
	public String getTouristIdentiNo() {
		return touristIdentiNo;
	}
	public void setTouristIdentiNo(String touristIdentiNo) {
		this.touristIdentiNo = touristIdentiNo;
	}
	public String getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Double getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(Double accuracy) {
		this.accuracy = accuracy;
	}
	public Double getCommunication() {
		return communication;
	}
	public void setCommunication(Double communication) {
		this.communication = communication;
	}
	public Double getServices() {
		return services;
	}
	public void setServices(Double services) {
		this.services = services;
	}
	public Double getKnowledge() {
		return knowledge;
	}
	public void setKnowledge(Double knowledge) {
		this.knowledge = knowledge;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCourseFullNameDisp() {
		return courseFullNameDisp;
	}
	public void setCourseFullNameDisp(String courseFullNameDisp) {
		this.courseFullNameDisp = courseFullNameDisp;
	}
	public String getLocalhostFullNameDisp() {
		return localhostFullNameDisp;
	}
	public void setLocalhostFullNameDisp(String localhostFullNameDisp) {
		this.localhostFullNameDisp = localhostFullNameDisp;
	}
	public List<String> getScoreIconListDisp() {
		return scoreIconListDisp;
	}
	public void setScoreIconListDisp(List<String> scoreIconListDisp) {
		this.scoreIconListDisp = scoreIconListDisp;
	}
	public List<String> getCoursePictureListDisp() {
		return coursePictureListDisp;
	}
	public void setCoursePictureListDisp(List<String> coursePictureListDisp) {
		this.coursePictureListDisp = coursePictureListDisp;
	}
	public String getLocalhostPictureDisp() {
		return localhostPictureDisp;
	}
	public void setLocalhostPictureDisp(String localhostPictureDisp) {
		this.localhostPictureDisp = localhostPictureDisp;
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
	public String getLocalhostIdentiNo() {
		return localhostIdentiNo;
	}
	public void setLocalhostIdentiNo(String localhostIdentiNo) {
		this.localhostIdentiNo = localhostIdentiNo;
	}
	public String getTouristFirstName() {
		return touristFirstName;
	}
	public void setTouristFirstName(String touristFirstName) {
		this.touristFirstName = touristFirstName;
	}
	public String getTouristLastName() {
		return touristLastName;
	}
	public void setTouristLastName(String touristLastName) {
		this.touristLastName = touristLastName;
	}
	public String getTouristPicture() {
		return touristPicture;
	}
	public void setTouristPicture(String touristPicture) {
		this.touristPicture = touristPicture;
	}
}
