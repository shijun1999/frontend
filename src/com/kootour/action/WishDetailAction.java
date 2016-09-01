//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.config.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.WishDetailEntity;
import com.kootour.model.WishDetailModel;
import com.kootour.service.WishDetailService;
import com.kootour.service.impl.WishDetailServiceImpl;

@Results({})
public class WishDetailAction extends WishDetailModel {

	@Autowired(required = false)
	private WishDetailService wishDetailService = new WishDetailServiceImpl();

	public void copyEntity2EntityAction(WishDetailEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);

		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}

		if (tEntity.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(tEntity.getCourseIdentiNo());
		}

		if (tEntity.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(tEntity.getLocalhostIdentiNo());
		}

		List<String> tmpStringActionList1 = new ArrayList<String>();
		for (String tmpVal : tEntity.getCoursePictureListDisp()) {
			tmpStringActionList1.add(tmpVal);
		}
		setCoursePictureListDisp(tmpStringActionList1);
		List<String> tmpStringActionList2 = new ArrayList<String>();
		for (String tmpVal : tEntity.getScoreIconListDisp()) {
			tmpStringActionList2.add(tmpVal);
		}
		setScoreIconListDisp(tmpStringActionList2);
		if (tEntity.getScoreDisp() == null) {
			setScoreDisp("");
		} else {
			setScoreDisp(String.valueOf(tEntity.getScoreDisp()));
		}
		if (tEntity.getReviewNumDisp() == null) {
			setReviewNumDisp("");
		} else {
			setReviewNumDisp(String.valueOf(tEntity.getReviewNumDisp()));
		}
		if (tEntity.getLocalhostNameDisp() == null) {
			setLocalhostNameDisp("");
		} else {
			setLocalhostNameDisp(tEntity.getLocalhostNameDisp());
		}
		if (tEntity.getLocalhostPictureDisp() == null) {
			setLocalhostPictureDisp("");
		} else {
			setLocalhostPictureDisp(tEntity.getLocalhostPictureDisp());
		}
		if (tEntity.getCourseName() == null) {
			setCourseName("");
		} else {
			setCourseName(tEntity.getCourseName());
		}
		if (tEntity.getPrice() == null) {
			setPrice("");
		} else {
			setPrice(String.valueOf(tEntity.getPrice()));
		}
		if (tEntity.getDiscountPrice() == null) {
			setDiscountPrice("");
		} else {
			setDiscountPrice(String.valueOf(tEntity.getDiscountPrice()));
		}
		if (tEntity.getUnitName() == null) {
			setUnitName("");
		} else {
			setUnitName(tEntity.getUnitName());
		}
		if (tEntity.getInfantFree() == null) {
			setInfantFree("");
		} else {
			setInfantFree(tEntity.getInfantFree());
		}
		if (tEntity.getPersonOrGroupText() == null) {
			setPersonOrGroupText("");
		} else {
			setPersonOrGroupText(tEntity.getPersonOrGroupText());
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

	public WishDetailEntity copyEntityAction2Entity(WishDetailModel tWishDetailModel) {
		WishDetailEntity tEntity = new WishDetailEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tWishDetailModel.getLangId());
		tEntity.setCourseIdentiNo(tWishDetailModel.getCourseIdentiNo());
		tEntity.setLocalhostIdentiNo(tWishDetailModel.getLocalhostIdentiNo());
		List<String> tmpStringEntityList1 = new ArrayList<String>();
		for (String tmpVal : tWishDetailModel.getCoursePictureListDisp()) {
			tmpStringEntityList1.add(tmpVal);
		}
		tEntity.setCoursePictureListDisp(tmpStringEntityList1);
		List<String> tmpStringEntityList2 = new ArrayList<String>();
		for (String tmpVal : tWishDetailModel.getScoreIconListDisp()) {
			tmpStringEntityList2.add(tmpVal);
		}
		tEntity.setScoreIconListDisp(tmpStringEntityList2);
		if (KooUtil.isNotDouble(tWishDetailModel.getScoreDisp())) {
			tEntity.setScoreDisp(null);
		} else {
			tEntity.setScoreDisp(Double.parseDouble(tWishDetailModel.getScoreDisp()));
		}
		if (KooUtil.isNotInt(tWishDetailModel.getReviewNumDisp())) {
			tEntity.setReviewNumDisp(null);
		} else {
			tEntity.setReviewNumDisp(Integer.parseInt(tWishDetailModel.getReviewNumDisp()));
		}
		tEntity.setLocalhostNameDisp(tWishDetailModel.getLocalhostNameDisp());
		tEntity.setLocalhostPictureDisp(tWishDetailModel.getLocalhostPictureDisp());
		tEntity.setCourseName(tWishDetailModel.getCourseName());
		if (KooUtil.isNotDouble(tWishDetailModel.getPrice())) {
			tEntity.setPrice(null);
		} else {
			tEntity.setPrice(Double.parseDouble(tWishDetailModel.getPrice()));
		}
		if (KooUtil.isNotDouble(tWishDetailModel.getDiscountPrice())) {
			tEntity.setDiscountPrice(null);
		} else {
			tEntity.setDiscountPrice(Double.parseDouble(tWishDetailModel.getDiscountPrice()));
		}
		tEntity.setUnitName(tWishDetailModel.getUnitName());
		tEntity.setInfantFree(tWishDetailModel.getInfantFree());
		tEntity.setPersonOrGroupText(tWishDetailModel.getPersonOrGroupText());
		if (KooUtil.isNotDate(tWishDetailModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tWishDetailModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tWishDetailModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tWishDetailModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
