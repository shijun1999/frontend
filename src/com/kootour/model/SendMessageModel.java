//Auto Generated 

package com.kootour.model;

import java.util.List;

import com.kootour.action.BaseAction;

import java.util.ArrayList;

public class SendMessageModel extends BaseAction {
	private String touristIdentiNo;
	private String localhostIdentiNo;
	private String messageText;
	private String messageTime;
	private List<MessageModel> messageList = new ArrayList<MessageModel>();
	private String localhostFullNameDisp;
	private String localhostPictureDisp;
	private String localhostAddrDisp;
	private String memberYearDisp;
	private List<String> scoreIconListDisp = new ArrayList<String>();
	private String scoreDisp;
	private String courseName;
	private String reviewNum;
	private String reservationDate;
	private String startHour;
	private String touristNum;
	private String createTime;
	private String modifyTime;

	public String getTouristIdentiNo() {
		return touristIdentiNo;
	}

	public void setTouristIdentiNo(String touristIdentiNo) {
		this.touristIdentiNo = touristIdentiNo;
	}

	public String getLocalhostIdentiNo() {
		return localhostIdentiNo;
	}

	public void setLocalhostIdentiNo(String localhostIdentiNo) {
		this.localhostIdentiNo = localhostIdentiNo;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
	}

	public List<MessageModel> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<MessageModel> messageList) {
		this.messageList = messageList;
	}

	public String getLocalhostFullNameDisp() {
		return localhostFullNameDisp;
	}

	public void setLocalhostFullNameDisp(String localhostFullNameDisp) {
		this.localhostFullNameDisp = localhostFullNameDisp;
	}

	public String getLocalhostPictureDisp() {
		return localhostPictureDisp;
	}

	public void setLocalhostPictureDisp(String localhostPictureDisp) {
		this.localhostPictureDisp = localhostPictureDisp;
	}

	public String getLocalhostAddrDisp() {
		return localhostAddrDisp;
	}

	public void setLocalhostAddrDisp(String localhostAddrDisp) {
		this.localhostAddrDisp = localhostAddrDisp;
	}

	public String getMemberYearDisp() {
		return memberYearDisp;
	}

	public void setMemberYearDisp(String memberYearDisp) {
		this.memberYearDisp = memberYearDisp;
	}

	public List<String> getScoreIconListDisp() {
		return scoreIconListDisp;
	}

	public void setScoreIconListDisp(List<String> scoreIconListDisp) {
		this.scoreIconListDisp = scoreIconListDisp;
	}

	public String getScoreDisp() {
		return scoreDisp;
	}

	public void setScoreDisp(String scoreDisp) {
		this.scoreDisp = scoreDisp;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getTouristNum() {
		return touristNum;
	}

	public void setTouristNum(String touristNum) {
		this.touristNum = touristNum;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(String reviewNum) {
		this.reviewNum = reviewNum;
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
