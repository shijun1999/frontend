//Auto Generated 

package com.kootour.model;

import java.util.List;

import com.kootour.action.BaseAction;
import com.kootour.mapper.entity.UserOrderExtraOptionEntity;

import java.util.ArrayList;

public class UserOrderModel extends BaseAction {
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
	private String touristNum;
	private String infantFree;
	private String price;
	private String discountPrice;
	private String personOrGroup;
	private String unitName;
	private String duration;
	private String durationUnit;
	private String totalMoney;
	private String tips;
	private String touristFullName;
	private String localhostFullName;
	private String courseFullName;
	private String score;
	private String comment;
    private String coursePicture;
    private String localhostPicture;
	private List<String> scoreIconListDisp = new ArrayList<String>();
	// private List<PulldownValueBeanEntityAction> timetableListDisp= new ArrayList<PulldownValueBeanEntityAction>();
	private List<UserOrderExtraOptionModel> userOrderExtraOptionModelList = new ArrayList<>();
	private String commentIdentiNo;

	private String location;
    private String taxVal;
    private String discountMoney;
    private String paidMoney;

	private String createTime;
	private String modifyTime;

    public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTaxVal() {
		return taxVal;
	}
	public void setTaxVal(String taxVal) {
		this.taxVal = taxVal;
	}
	public String getDiscountMoney() {
		return discountMoney;
	}
	public void setDiscountMoney(String discountMoney) {
		this.discountMoney = discountMoney;
	}
	public String getPaidMoney() {
		return paidMoney;
	}
	public void setPaidMoney(String paidMoney) {
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
	public String getTouristNum() {
		return touristNum;
	}
	public void setTouristNum(String touristNum) {
		this.touristNum = touristNum;
	}
	public String getInfantFree() {
		return infantFree;
	}
	public void setInfantFree(String infantFree) {
		this.infantFree = infantFree;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
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
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}
	public String getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
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
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public List<String> getScoreIconListDisp() {
		return scoreIconListDisp;
	}
	public void setScoreIconListDisp(List<String> scoreIconListDisp) {
		this.scoreIconListDisp = scoreIconListDisp;
	}
	public String getCommentIdentiNo() {
		return commentIdentiNo;
	}
	public void setCommentIdentiNo(String commentIdentiNo) {
		this.commentIdentiNo = commentIdentiNo;
	}
	// public List<PulldownValueBeanEntityAction> getTimetableListDisp() {
	// return timetableListDisp;
	// }
	// public void setTimetableListDisp(List<PulldownValueBeanEntityAction> timetableListDisp) {
	// this.timetableListDisp = timetableListDisp;
	// }
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
	public List<UserOrderExtraOptionModel> getUserOrderExtraOptionModelList() {
		return userOrderExtraOptionModelList;
	}
	public void setUserOrderExtraOptionModelList(List<UserOrderExtraOptionModel> userOrderExtraOptionModelList) {
		this.userOrderExtraOptionModelList = userOrderExtraOptionModelList;
	}
	public String getLocalhostFullName() {
		return localhostFullName;
	}
	public void setLocalhostFullName(String localhostFullName) {
		this.localhostFullName = localhostFullName;
	}

}
