//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.WishDetailEntity;
import com.kootour.mapper.entity.UserOrderEntity;

public class AccountSummaryEntity extends BaseEntity {
	private String langId;
	private String touristIdentiNo;
	private List<WishDetailEntity> wishDetailListDisp = new ArrayList<WishDetailEntity>();
	private List<UserOrderEntity> userOrderList = new ArrayList<UserOrderEntity>();
	private Integer kootourPoint;
	private String touristIcon;
	private String emailOkFlag;
	private String phoneOkFlg;
	private String touristName;
	private Date createTime;
	private Date modifyTime;

	public String getTouristName() {
		return touristName;
	}

	public void setTouristName(String touristName) {
		this.touristName = touristName;
	}
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

	public List<WishDetailEntity> getWishDetailListDisp() {
		return wishDetailListDisp;
	}

	public void setWishDetailListDisp(List<WishDetailEntity> wishDetailListDisp) {
		this.wishDetailListDisp = wishDetailListDisp;
	}

	public List<UserOrderEntity> getUserOrderList() {
		return userOrderList;
	}

	public void setUserOrderList(List<UserOrderEntity> userOrderList) {
		this.userOrderList = userOrderList;
	}

	public Integer getKootourPoint() {
		return kootourPoint;
	}

	public void setKootourPoint(Integer kootourPoint) {
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
