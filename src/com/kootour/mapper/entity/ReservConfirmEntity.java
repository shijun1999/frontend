//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;

public class ReservConfirmEntity extends BaseEntity {
	private String langId;
	private String reservConfirm;
	private Date createTime;
	private Date modifyTime;
	public String getLangId() {
		return langId;
	}
	public void setLangId(String langId) {
		this.langId = langId;
	}
	public String getReservConfirm() {
		return reservConfirm;
	}
	public void setReservConfirm(String reservConfirm) {
		this.reservConfirm = reservConfirm;
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
