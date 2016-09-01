//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.service.ReviewConfirmService;
import com.kootour.service.impl.ReviewConfirmServiceImpl;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.ReviewConfirmEntity;
import com.kootour.model.ReviewConfirmModel;

@Results({@Result(name = "okexit", value = "orderList!load", type = ServletActionRedirectResult.class), @Result(name = "gotoback", value = "orderList!load", type = ServletActionRedirectResult.class),
		@Result(name = "goto_reviewdetail", value = "courseComment!load", type = ServletActionRedirectResult.class)})
public class ReviewConfirmAction extends ReviewConfirmModel {

	@Autowired(required = false)
	private ReviewConfirmService reviewConfirmService = new ReviewConfirmServiceImpl();
	public String okExit() {
		String rtnStr = "okexit";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		ReviewConfirmEntity inReviewConfirmEntity = copyEntityAction2Entity();
		ReviewConfirmEntity outReviewConfirmEntity = new ReviewConfirmEntity();
		outReviewConfirmEntity = reviewConfirmService.okExit(inReviewConfirmEntity, paraMap);

		return rtnStr;
	}

	public String back() {
		String rtnStr = "gotoback";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		ReviewConfirmEntity inReviewConfirmEntity = copyEntityAction2Entity();
		ReviewConfirmEntity outReviewConfirmEntity = new ReviewConfirmEntity();
		outReviewConfirmEntity = reviewConfirmService.back(inReviewConfirmEntity, paraMap);

		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		ReviewConfirmEntity inReviewConfirmEntity = copyEntityAction2Entity();
		ReviewConfirmEntity outReviewConfirmEntity = new ReviewConfirmEntity();
		outReviewConfirmEntity = reviewConfirmService.load(inReviewConfirmEntity, paraMap);

		return rtnStr;
	}

	public String reviewDetail() {
		String rtnStr = "goto_reviewdetail";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		ReviewConfirmEntity inReviewConfirmEntity = copyEntityAction2Entity();
		ReviewConfirmEntity outReviewConfirmEntity = new ReviewConfirmEntity();
		outReviewConfirmEntity = reviewConfirmService.reviewDetail(inReviewConfirmEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(ReviewConfirmEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getReviewList() == null) {
			setReviewList("");
		} else {
			setReviewList(tEntity.getReviewList());
		}
		if (tEntity.getAllScoe() == null) {
			setAllScoe("");
		} else {
			setAllScoe(String.valueOf(tEntity.getAllScoe()));
		}
		if (tEntity.getAllRank() == null) {
			setAllRank("");
		} else {
			setAllRank(String.valueOf(tEntity.getAllRank()));
		}
		if (tEntity.getScoreList() == null) {
			setScoreList("");
		} else {
			setScoreList(tEntity.getScoreList());
		}
		if (tEntity.getCreateTime() == null) {
			setCreateTime("");
		} else {
			setCreateTime(KooUtil.date2String(tEntity.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (tEntity.getModifyTime() == null) {
			setModifyTime("");
		} else {
			setModifyTime(KooUtil.date2String(tEntity.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}

	}
	public ReviewConfirmEntity copyEntityAction2Entity() {
		ReviewConfirmEntity tEntity = new ReviewConfirmEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(getLangId());
		tEntity.setReviewList(getReviewList());
		if (KooUtil.isNotDouble(getAllScoe())) {
			tEntity.setAllScoe(null);
		} else {
			tEntity.setAllScoe(Double.parseDouble(getAllScoe()));
		}
		if (KooUtil.isNotInt(getAllRank())) {
			tEntity.setAllRank(null);
		} else {
			tEntity.setAllRank(Integer.parseInt(getAllRank()));
		}
		tEntity.setScoreList(getScoreList());
		if (KooUtil.isNotDate(getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
