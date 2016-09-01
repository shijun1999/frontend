//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;

public class ReviewConfirmEntity extends BaseEntity {
	private String langId;
	private String reviewList;
	private Double allScoe;
	private Integer allRank;
	private String scoreList;
	private Date createTime;
	private Date modifyTime;
	public String getLangId() {
		return langId;
	}
	public void setLangId(String langId) {
		this.langId = langId;
	}
	public String getReviewList() {
		return reviewList;
	}
	public void setReviewList(String reviewList) {
		this.reviewList = reviewList;
	}
	public Double getAllScoe() {
		return allScoe;
	}
	public void setAllScoe(Double allScoe) {
		this.allScoe = allScoe;
	}
	public Integer getAllRank() {
		return allRank;
	}
	public void setAllRank(Integer allRank) {
		this.allRank = allRank;
	}
	public String getScoreList() {
		return scoreList;
	}
	public void setScoreList(String scoreList) {
		this.scoreList = scoreList;
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
