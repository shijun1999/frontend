//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.UserOrderEntity;

public class OrderListEntity extends BaseEntity {
	private String langId;
	private List<UserOrderEntity> userOrderList = new ArrayList<UserOrderEntity>();
	private Date createTime;
	private Date modifyTime;
	private Date dummy1;
	private Date dummy2;
	private Date dummy3;
	private Date dummy4;
	public String getLangId() {
		return langId;
	}
	public void setLangId(String langId) {
		this.langId = langId;
	}
	public List<UserOrderEntity> getUserOrderList() {
		return userOrderList;
	}
	public void setUserOrderList(List<UserOrderEntity> userOrderList) {
		this.userOrderList = userOrderList;
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
	public Date getDummy1() {
		return dummy1;
	}
	public void setDummy1(Date dummy1) {
		this.dummy1 = dummy1;
	}
	public Date getDummy2() {
		return dummy2;
	}
	public void setDummy2(Date dummy2) {
		this.dummy2 = dummy2;
	}
	public Date getDummy3() {
		return dummy3;
	}
	public void setDummy3(Date dummy3) {
		this.dummy3 = dummy3;
	}
	public Date getDummy4() {
		return dummy4;
	}
	public void setDummy4(Date dummy4) {
		this.dummy4 = dummy4;
	}

}
