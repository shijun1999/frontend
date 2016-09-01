//Auto Generated 

package com.kootour.action;

import org.apache.struts2.config.Results;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.UserOrderExtraOptionEntity;
import com.kootour.model.UserOrderExtraOptionModel;

@Results({})
public class UserOrderExtraOptionAction extends UserOrderExtraOptionModel {

	public void copyEntity2EntityAction(UserOrderExtraOptionEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getUserOrderExtraOptionIdentiNo() == null) {
			setUserOrderExtraOptionIdentiNo("");
		} else {
			setUserOrderExtraOptionIdentiNo(tEntity.getUserOrderExtraOptionIdentiNo());
		}
		if (tEntity.getOrderIdentiNo() == null) {
			setOrderIdentiNo("");
		} else {
			setOrderIdentiNo(tEntity.getOrderIdentiNo());
		}
		if (tEntity.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(tEntity.getCourseIdentiNo());
		}
		if (tEntity.getExtraOptionIdentiNo() == null) {
			setExtraOptionIdentiNo("");
		} else {
			setExtraOptionIdentiNo(tEntity.getExtraOptionIdentiNo());
		}
		if (tEntity.getDispOrder() == null) {
			setDispOrder("");
		} else {
			setDispOrder(String.valueOf(tEntity.getDispOrder()));
		}
		if (tEntity.getTouristNum() == null) {
			setTouristNum("");
		} else {
			setTouristNum(String.valueOf(tEntity.getTouristNum()));
		}
		if (tEntity.getInfantFree() == null) {
			setInfantFree("");
		} else {
			setInfantFree(tEntity.getInfantFree());
		}
		if (tEntity.getPersonOrGroup() == null) {
			setPersonOrGroup("");
		} else {
			setPersonOrGroup(tEntity.getPersonOrGroup());
		}
		if (tEntity.getUnitName() == null) {
			setUnitName("");
		} else {
			setUnitName(tEntity.getUnitName());
		}
		if (tEntity.getTotalMoney() == null) {
			setTotalMoney("");
		} else {
			setTotalMoney(String.valueOf(tEntity.getTotalMoney()));
		}
		if (tEntity.getDelFlg() == null) {
			setDelFlg("");
		} else {
			setDelFlg(tEntity.getDelFlg());
		}
		if (tEntity.getExtraOptionName() == null) {
			setExtraOptionName("");
		} else {
			setExtraOptionName(tEntity.getExtraOptionName());
		}
		if (tEntity.getExtraPrice() == null) {
			setExtraPrice("");
		} else {
			setExtraPrice(String.valueOf(tEntity.getExtraPrice()));
		}
		if (tEntity.getExtraTime() == null) {
			setExtraTime("");
		} else {
			setExtraTime(String.valueOf(tEntity.getExtraTime()));
		}
		if (tEntity.getExtraUnit() == null) {
			setExtraUnit("");
		} else {
			setExtraUnit(tEntity.getExtraUnit());
		}
		if (tEntity.getMoneyUnit() == null) {
			setMoneyUnit("");
		} else {
			setMoneyUnit(tEntity.getMoneyUnit());
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

	public UserOrderExtraOptionEntity copyEntityAction2Entity(UserOrderExtraOptionModel tUserOrderExtraOptionModel) {
		UserOrderExtraOptionEntity tEntity = new UserOrderExtraOptionEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tUserOrderExtraOptionModel.getLangId());
		tEntity.setUserOrderExtraOptionIdentiNo(tUserOrderExtraOptionModel.getUserOrderExtraOptionIdentiNo());
		tEntity.setOrderIdentiNo(tUserOrderExtraOptionModel.getOrderIdentiNo());
		tEntity.setCourseIdentiNo(tUserOrderExtraOptionModel.getCourseIdentiNo());
		tEntity.setExtraOptionIdentiNo(tUserOrderExtraOptionModel.getExtraOptionIdentiNo());
		if (KooUtil.isNotInt(tUserOrderExtraOptionModel.getDispOrder())) {
			tEntity.setDispOrder(null);
		} else {
			tEntity.setDispOrder(Integer.parseInt(tUserOrderExtraOptionModel.getDispOrder()));
		}
		if (KooUtil.isNotInt(tUserOrderExtraOptionModel.getTouristNum())) {
			tEntity.setTouristNum(null);
		} else {
			tEntity.setTouristNum(Integer.parseInt(tUserOrderExtraOptionModel.getTouristNum()));
		}
		tEntity.setInfantFree(tUserOrderExtraOptionModel.getInfantFree());
		tEntity.setPersonOrGroup(tUserOrderExtraOptionModel.getPersonOrGroup());
		tEntity.setUnitName(tUserOrderExtraOptionModel.getUnitName());
		if (KooUtil.isNotDouble(tUserOrderExtraOptionModel.getTotalMoney())) {
			tEntity.setTotalMoney(null);
		} else {
			tEntity.setTotalMoney(Double.parseDouble(tUserOrderExtraOptionModel.getTotalMoney()));
		}
		tEntity.setDelFlg(tUserOrderExtraOptionModel.getDelFlg());
		tEntity.setExtraOptionName(tUserOrderExtraOptionModel.getExtraOptionName());
		if (KooUtil.isNotDouble(tUserOrderExtraOptionModel.getExtraPrice())) {
			tEntity.setExtraPrice(null);
		} else {
			tEntity.setExtraPrice(Double.parseDouble(tUserOrderExtraOptionModel.getExtraPrice()));
		}
		if (KooUtil.isNotDouble(tUserOrderExtraOptionModel.getExtraTime())) {
			tEntity.setExtraTime(null);
		} else {
			tEntity.setExtraTime(Double.parseDouble(tUserOrderExtraOptionModel.getExtraTime()));
		}
		tEntity.setExtraUnit(tUserOrderExtraOptionModel.getExtraUnit());
		tEntity.setMoneyUnit(tUserOrderExtraOptionModel.getMoneyUnit());
		if (KooUtil.isNotDate(tUserOrderExtraOptionModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tUserOrderExtraOptionModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tUserOrderExtraOptionModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tUserOrderExtraOptionModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
