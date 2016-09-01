//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;

import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
//import com.kootour.mapper.entity.PulldownValueBeanEntity;

public class UserOrderEntity extends BaseEntity {
	private String langId;
	private String orderIdentiNo;
	private String courseIdentiNo;
	private String localhostIdentiNo;
	private String touristIdentiNo;
	private String reservationDate;
	private String scheduleOptionIdentiNo;
	private String bgnTime;
	private String status;
	private String consent;
	private String cancelDate;
	private String orderDate;
	private String moneyUnit;
	private Integer touristNum;
	private String infantFree;
	private Double price;
	private Double discountPrice;
	private String personOrGroup;
	private String unitName;
	private Double duration;
	private String durationUnit;
	private Double totalMoney;
	private Double tips;
	private String touristFullName;
	private String localhostFullName;
	private String courseFullName;
	private Double score;
	private String comment;
	private String coursePicture;
	private String localhostPicture;
	private String commentIdentiNo;
	private List<String> scoreIconListDisp = new ArrayList<String>();
	// private List<PulldownValueBeanEntity> timetableListDisp = new
	// ArrayList<PulldownValueBeanEntity>();
	private List<UserOrderExtraOptionEntity> userOrderExtraOptionEntityList = new ArrayList<>();
	private Date createTime;
	private Date modifyTime;
	private String delFlg;
	private String location;
	private Double taxVal;
	private Double discountMoney;
	private Double paidMoney;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getTaxVal() {
		return taxVal;
	}

	public void setTaxVal(Double taxVal) {
		this.taxVal = taxVal;
	}

	public Double getDiscountMoney() {
		return discountMoney;
	}

	public void setDiscountMoney(Double discountMoney) {
		this.discountMoney = discountMoney;
	}

	public Double getPaidMoney() {
		return paidMoney;
	}

	public void setPaidMoney(Double paidMoney) {
		this.paidMoney = paidMoney;
	}

	public String getScheduleOptionIdentiNo() {
		return scheduleOptionIdentiNo;
	}

	public void setScheduleOptionIdentiNo(String scheduleOptionIdentiNo) {
		this.scheduleOptionIdentiNo = scheduleOptionIdentiNo;
	}

	public String getCoursePicture() {
		return coursePicture;
	}

	public void setCoursePicture(String coursePicture) {
		this.coursePicture = coursePicture;
	}

	public String getLocalhostPicture() {
		return localhostPicture;
	}

	public void setLocalhostPicture(String localhostPicture) {
		this.localhostPicture = localhostPicture;
	}

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

	public String getOrderIdentiNo() {
		return orderIdentiNo;
	}

	public void setOrderIdentiNo(String orderIdentiNo) {
		this.orderIdentiNo = orderIdentiNo;
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

	public String getTouristIdentiNo() {
		return touristIdentiNo;
	}

	public void setTouristIdentiNo(String touristIdentiNo) {
		this.touristIdentiNo = touristIdentiNo;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getBgnTime() {
		return bgnTime;
	}

	public void setBgnTime(String bgnTime) {
		this.bgnTime = bgnTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConsent() {
		return consent;
	}

	public void setConsent(String consent) {
		this.consent = consent;
	}

	public String getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getMoneyUnit() {
		return moneyUnit;
	}

	public void setMoneyUnit(String moneyUnit) {
		this.moneyUnit = moneyUnit;
	}

	public Integer getTouristNum() {
		return touristNum;
	}

	public void setTouristNum(Integer touristNum) {
		this.touristNum = touristNum;
	}

	public String getInfantFree() {
		return infantFree;
	}

	public void setInfantFree(String infantFree) {
		this.infantFree = infantFree;
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

	public String getPersonOrGroup() {
		return personOrGroup;
	}

	public void setPersonOrGroup(String personOrGroup) {
		this.personOrGroup = personOrGroup;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}

	public Double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Double getTips() {
		return tips;
	}

	public void setTips(Double tips) {
		this.tips = tips;
	}

	public String getTouristFullName() {
		return touristFullName;
	}

	public void setTouristFullName(String touristFullName) {
		this.touristFullName = touristFullName;
	}

	public String getCourseFullName() {
		return courseFullName;
	}

	public void setCourseFullName(String courseFullName) {
		this.courseFullName = courseFullName;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentIdentiNo() {
		return commentIdentiNo;
	}

	public void setCommentIdentiNo(String commentIdentiNo) {
		this.commentIdentiNo = commentIdentiNo;
	}

	public List<String> getScoreIconListDisp() {
		return scoreIconListDisp;
	}

	public void setScoreIconListDisp(List<String> scoreIconListDisp) {
		this.scoreIconListDisp = scoreIconListDisp;
	}

	// public List<PulldownValueBeanEntity> getTimetableListDisp() {
	// return timetableListDisp;
	// }
	// public void setTimetableListDisp(List<PulldownValueBeanEntity>
	// timetableListDisp) {
	// this.timetableListDisp = timetableListDisp;
	// }
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

	public List<UserOrderExtraOptionEntity> getUserOrderExtraOptionEntityList() {
		return userOrderExtraOptionEntityList;
	}

	public void setUserOrderExtraOptionEntityList(List<UserOrderExtraOptionEntity> userOrderExtraOptionEntityList) {
		this.userOrderExtraOptionEntityList = userOrderExtraOptionEntityList;
	}

	public String getLocalhostFullName() {
		return localhostFullName;
	}

	public void setLocalhostFullName(String localhostFullName) {
		this.localhostFullName = localhostFullName;
	}

}
