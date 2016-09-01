//Auto Generated 

package com.kootour.model;

import java.util.List;

import com.kootour.action.BaseAction;

import java.util.ArrayList;

public class AccountSummaryModel extends BaseAction {
	private String touristIdentiNo;
	private List<WishDetailModel> wishDetailListDisp = new ArrayList<WishDetailModel>();
	private List<UserOrderModel> userOrderList = new ArrayList<UserOrderModel>();
	private String kootourPoint;
	private String touristIcon;
	private String emailOkFlag;
	private String phoneOkFlg;
	private String touristName;

	public String getTouristName() {
		return touristName;
	}

	public void setTouristName(String touristName) {
		this.touristName = touristName;
	}

	private String createTime;
	private String modifyTime;

	public String getTouristIdentiNo() {
		return touristIdentiNo;
	}

	public void setTouristIdentiNo(String touristIdentiNo) {
		this.touristIdentiNo = touristIdentiNo;
	}

	public List<WishDetailModel> getWishDetailListDisp() {
		return wishDetailListDisp;
	}

	public void setWishDetailListDisp(List<WishDetailModel> wishDetailListDisp) {
		this.wishDetailListDisp = wishDetailListDisp;
	}

	public List<UserOrderModel> getUserOrderList() {
		return userOrderList;
	}

	public void setUserOrderList(List<UserOrderModel> userOrderList) {
		this.userOrderList = userOrderList;
	}

	public String getKootourPoint() {
		return kootourPoint;
	}

	public void setKootourPoint(String kootourPoint) {
		this.kootourPoint = kootourPoint;
	}

	public String getTouristIcon() {
		return touristIcon;
	}

	public void setTouristIcon(String touristIcon) {
		this.touristIcon = touristIcon;
	}

	public String getEmailOkFlag() {
		return emailOkFlag;
	}

	public void setEmailOkFlag(String emailOkFlag) {
		this.emailOkFlag = emailOkFlag;
	}

	public String getPhoneOkFlg() {
		return phoneOkFlg;
	}

	public void setPhoneOkFlg(String phoneOkFlg) {
		this.phoneOkFlg = phoneOkFlg;
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
