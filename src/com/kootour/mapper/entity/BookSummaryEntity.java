//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.entity.ExtraOptionEntity;

public class BookSummaryEntity extends BaseEntity {
	private String langId;
	private String touristIdentiNo;
	private String courseIdentiNo;
	private String localhostIdentiNo;
	private UserOrderEntity userOrder = new UserOrderEntity();
	private List<ExtraOptionEntity> extraOptionList = new ArrayList<ExtraOptionEntity>();
	private Double subTotal;
	private Double tax;
	private Double discount;
	private String promoCode;
	private Double total;
	private Date createTime;
	private Date modifyTime;
	private String favoriteIdentiNo;
	public String getFavoriteIdentiNo() {
		return favoriteIdentiNo;
	}
	public void setFavoriteIdentiNo(String favoriteIdentiNo) {
		this.favoriteIdentiNo = favoriteIdentiNo;
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

	public UserOrderEntity getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(UserOrderEntity userOrder) {
		this.userOrder = userOrder;
	}

	public List<ExtraOptionEntity> getExtraOptionList() {
		return extraOptionList;
	}

	public void setExtraOptionList(List<ExtraOptionEntity> extraOptionList) {
		this.extraOptionList = extraOptionList;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
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
