//Auto Generated 

package com.kootour.model;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.BaseAction;
import com.kootour.action.UserOrderAction;

public class BookSummaryModel extends BaseAction {
	private String touristIdentiNo;
	private String courseIdentiNo;
	private String localhostIdentiNo;
	private UserOrderModel userOrder = new UserOrderModel();
	private List<ExtraOptionModel> extraOptionList = new ArrayList<ExtraOptionModel>();
	private String subTotal;
	private String tax;
	private String discount;
	private String promoCode;
	private String total;
	private String createTime;
	private String modifyTime;
	private String favoriteIdentiNo;
	public String getFavoriteIdentiNo() {
		return favoriteIdentiNo;
	}
	public void setFavoriteIdentiNo(String favoriteIdentiNo) {
		this.favoriteIdentiNo = favoriteIdentiNo;
	}

	public String getTouristIdentiNo() {
		return touristIdentiNo;
	}

	public void setTouristIdentiNo(String touristIdentiNo) {
		this.touristIdentiNo = touristIdentiNo;
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

	public UserOrderModel getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(UserOrderModel userOrder) {
		this.userOrder = userOrder;
	}

	public List<ExtraOptionModel> getExtraOptionList() {
		return extraOptionList;
	}

	public void setExtraOptionList(List<ExtraOptionModel> extraOptionList) {
		this.extraOptionList = extraOptionList;
	}

	public String getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
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
