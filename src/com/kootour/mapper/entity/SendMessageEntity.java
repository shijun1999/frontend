//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.MessageEntity;

public class SendMessageEntity extends BaseEntity {
	private String langId;
	private String touristIdentiNo;
	private String localhostIdentiNo;
	private String messageText;
	private Date messageTime;
	private List<MessageEntity> messageList = new ArrayList<MessageEntity>();
	private String localhostFullNameDisp;
	private String localhostPictureDisp;
	private String localhostAddrDisp;
	private String memberYearDisp;
	private List<String> scoreIconListDisp = new ArrayList<String>();
	private Double scoreDisp;
	private String courseName;
	private String reservationDate;
	private String startHour;
	private Integer touristNum;
	private Integer reviewNum;
	private Date createTime;
	private Date modifyTime;

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

	public Date getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}

	public List<MessageEntity> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<MessageEntity> messageList) {
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

	public Double getScoreDisp() {
		return scoreDisp;
	}

	public void setScoreDisp(Double scoreDisp) {
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

	public Integer getTouristNum() {
		return touristNum;
	}

	public Integer getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(Integer reviewNum) {
		this.reviewNum = reviewNum;
	}

	public void setTouristNum(Integer touristNum) {
		this.touristNum = touristNum;
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
