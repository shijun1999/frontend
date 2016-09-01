//Auto Generated 

package com.kootour.action;

import org.apache.struts2.config.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.model.ScheduleOptionModel;

@Results({})
public class ScheduleOptionAction extends ScheduleOptionModel {

	@Autowired(required = false)
	public void copyEntity2EntityAction(ScheduleOptionEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getScheduleOptionIdentiNo() == null) {
			setScheduleOptionIdentiNo("");
		} else {
			setScheduleOptionIdentiNo(tEntity.getScheduleOptionIdentiNo());
		}
		if (tEntity.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(tEntity.getCourseIdentiNo());
		}
		if (tEntity.getCourseScheuleName() == null) {
			setCourseScheuleName("");
		} else {
			setCourseScheuleName(tEntity.getCourseScheuleName());
		}
		if (tEntity.getBgnDate() == null) {
			setBgnDate("");
		} else {
			setBgnDate(tEntity.getBgnDate());
		}
		if (tEntity.getEndDate() == null) {
			setEndDate("");
		} else {
			setEndDate(tEntity.getEndDate());
		}
		if (tEntity.getStartHour() == null) {
			setStartHour("");
		} else {
			setStartHour(tEntity.getStartHour());
		}
		if (tEntity.getRetailPrice() == null) {
			setRetailPrice("");
		} else {
			setRetailPrice(String.valueOf(tEntity.getRetailPrice()));
		}
		if (tEntity.getCommision() == null) {
			setCommision("");
		} else {
			setCommision(String.valueOf(tEntity.getCommision()));
		}
		if (tEntity.getPrice() == null) {
			setPrice("");
		} else {
			setPrice(String.valueOf(tEntity.getPrice()));
		}
		if (tEntity.getInfantFree() == null) {
			setInfantFree("");
		} else {
			setInfantFree(tEntity.getInfantFree());
		}
		if (tEntity.getPromotionFLg() == null) {
			setPromotionFLg("");
		} else {
			setPromotionFLg(tEntity.getPromotionFLg());
		}
		if (tEntity.getPromotionBgnDate() == null) {
			setPromotionBgnDate("");
		} else {
			setPromotionBgnDate(tEntity.getPromotionBgnDate());
		}
		if (tEntity.getPromotionEndDate() == null) {
			setPromotionEndDate("");
		} else {
			setPromotionEndDate(tEntity.getPromotionEndDate());
		}
		if (tEntity.getDiscountFlg() == null) {
			setDiscountFlg("");
		} else {
			setDiscountFlg(tEntity.getDiscountFlg());
		}
		if (tEntity.getDiscountPercent() == null) {
			setDiscountPercent("");
		} else {
			setDiscountPercent(String.valueOf(tEntity.getDiscountPercent()));
		}
		if (tEntity.getDiscountValue() == null) {
			setDiscountValue("");
		} else {
			setDiscountValue(String.valueOf(tEntity.getDiscountValue()));
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

	public ScheduleOptionEntity copyEntityAction2Entity(ScheduleOptionModel tScheduleOptionModel) {
		ScheduleOptionEntity tEntity = new ScheduleOptionEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tScheduleOptionModel.getLangId());
		tEntity.setScheduleOptionIdentiNo(tScheduleOptionModel.getScheduleOptionIdentiNo());
		tEntity.setCourseIdentiNo(tScheduleOptionModel.getCourseIdentiNo());
		tEntity.setCourseScheuleName(tScheduleOptionModel.getCourseScheuleName());
		tEntity.setBgnDate(tScheduleOptionModel.getBgnDate());
		tEntity.setEndDate(tScheduleOptionModel.getEndDate());
		tEntity.setStartHour(tScheduleOptionModel.getStartHour());
		if (KooUtil.isNotDouble(tScheduleOptionModel.getRetailPrice())) {
			tEntity.setRetailPrice(null);
		} else {
			tEntity.setRetailPrice(Double.parseDouble(tScheduleOptionModel.getRetailPrice()));
		}
		if (KooUtil.isNotDouble(tScheduleOptionModel.getCommision())) {
			tEntity.setCommision(null);
		} else {
			tEntity.setCommision(Double.parseDouble(tScheduleOptionModel.getCommision()));
		}
		if (KooUtil.isNotDouble(tScheduleOptionModel.getPrice())) {
			tEntity.setPrice(null);
		} else {
			tEntity.setPrice(Double.parseDouble(tScheduleOptionModel.getPrice()));
		}
		tEntity.setInfantFree(tScheduleOptionModel.getInfantFree());
		tEntity.setPromotionFLg(tScheduleOptionModel.getPromotionFLg());
		tEntity.setPromotionBgnDate(tScheduleOptionModel.getPromotionBgnDate());
		tEntity.setPromotionEndDate(tScheduleOptionModel.getPromotionEndDate());
		tEntity.setDiscountFlg(tScheduleOptionModel.getDiscountFlg());
		if (KooUtil.isNotDouble(tScheduleOptionModel.getDiscountPercent())) {
			tEntity.setDiscountPercent(null);
		} else {
			tEntity.setDiscountPercent(Double.parseDouble(tScheduleOptionModel.getDiscountPercent()));
		}
		if (KooUtil.isNotDouble(tScheduleOptionModel.getDiscountValue())) {
			tEntity.setDiscountValue(null);
		} else {
			tEntity.setDiscountValue(Double.parseDouble(tScheduleOptionModel.getDiscountValue()));
		}
		if (KooUtil.isNotDate(tScheduleOptionModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tScheduleOptionModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tScheduleOptionModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tScheduleOptionModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
