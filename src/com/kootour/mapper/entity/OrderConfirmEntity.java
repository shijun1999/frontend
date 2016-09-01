//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;

public class OrderConfirmEntity extends BaseEntity {
	private String langId;
	private String curOrderList;
	private Date createTime;
	private Date modifyTime;
	public String getLangId() {
		return langId;
	}
	public void setLangId(String langId) {
		this.langId = langId;
	}
	public String getCurOrderList() {
		return curOrderList;
	}
	public void setCurOrderList(String curOrderList) {
		this.curOrderList = curOrderList;
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
