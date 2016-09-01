//Auto Generated 

package com.kootour.model;

import com.kootour.action.BaseAction;

public class PaymentModel extends BookSummaryModel {
	private String last4Number;
	private String token;
	private String createTime;
	private String modifyTime;

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

	public String getLast4Number() {
		return last4Number;
	}

	public void setLast4Number(String last4Number) {
		this.last4Number = last4Number;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
