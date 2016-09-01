//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;

public class WishDetailEntity extends BaseEntity {
	private String langId;
    private String courseIdentiNo;
    private String localhostIdentiNo;
	private List<String> coursePictureListDisp = new ArrayList<String>();
	private List<String> scoreIconListDisp = new ArrayList<String>();
	private Double scoreDisp;
	private Integer reviewNumDisp;
	private String localhostNameDisp;
	private String localhostPictureDisp;
	private String courseName;
	private Double price;
	private Double discountPrice;
	private String unitName;
	private String infantFree;
	private String personOrGroupText;

	private Date createTime;
	private Date modifyTime;

	public String getLangId() {
		return langId;
	}

	public void setLangId(String langId) {
		this.langId = langId;
	}

	public List<String> getCoursePictureListDisp() {
		return coursePictureListDisp;
	}

	public void setCoursePictureListDisp(List<String> coursePictureListDisp) {
		this.coursePictureListDisp = coursePictureListDisp;
	}

	public List<String> getScoreIconListDisp() {
		return scoreIconListDisp;
	}

	public void setScoreIconListDisp(List<String> scoreIconListDisp) {
		this.scoreIconListDisp = scoreIconListDisp;
	}

	public Double getScoreDisp() {
		return scoreDisp;
	}

	public void setScoreDisp(Double scoreDisp) {
		this.scoreDisp = scoreDisp;
	}

	public Integer getReviewNumDisp() {
		return reviewNumDisp;
	}

	public void setReviewNumDisp(Integer reviewNumDisp) {
		this.reviewNumDisp = reviewNumDisp;
	}

	public String getLocalhostNameDisp() {
		return localhostNameDisp;
	}

	public void setLocalhostNameDisp(String localhostNameDisp) {
		this.localhostNameDisp = localhostNameDisp;
	}

	public String getLocalhostPictureDisp() {
		return localhostPictureDisp;
	}

	public void setLocalhostPictureDisp(String localhostPictureDisp) {
		this.localhostPictureDisp = localhostPictureDisp;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getInfantFree() {
		return infantFree;
	}

	public void setInfantFree(String infantFree) {
		this.infantFree = infantFree;
	}

	public String getPersonOrGroupText() {
		return personOrGroupText;
	}

	public void setPersonOrGroupText(String personOrGroupText) {
		this.personOrGroupText = personOrGroupText;
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

	public String getCourseIdentiNo() {
		return courseIdentiNo;
	}

	public void setCourseIdentiNo(String courseIdentiNo) {
		this.courseIdentiNo = courseIdentiNo;
	}

	public String getLocalhostIdentiNo() {
		return localhostIdentiNo;
	}

	public void setLocalhostIdentiNo(String localhostIdentiNo) {
		this.localhostIdentiNo = localhostIdentiNo;
	}

}
