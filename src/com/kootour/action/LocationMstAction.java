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

import com.kootour.mapper.paramentity.LocationMstParamEntity;
import com.kootour.model.LocationMstModel;
import com.kootour.service.LocationMstService;
import com.kootour.service.impl.LocationMstServiceImpl;
import com.kootour.checker.SingleLocationMstChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.LocationMstEntity;

public class LocationMstAction extends LocationMstModel {

	@Autowired(required = false)
	private LocationMstService locationMstService = new LocationMstServiceImpl();

	public void copyEntity2EntityAction(LocationMstEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getIdentiNo() == null) {
			setIdentiNo("");
		} else {
			setIdentiNo(tEntity.getIdentiNo());
		}
		if (tEntity.getStateName() == null) {
			setStateName("");
		} else {
			setStateName(tEntity.getStateName());
		}
		if (tEntity.getProvinceName() == null) {
			setProvinceName("");
		} else {
			setProvinceName(tEntity.getProvinceName());
		}
		if (tEntity.getCityName() == null) {
			setCityName("");
		} else {
			setCityName(tEntity.getCityName());
		}
		if (tEntity.getType() == null) {
			setType("");
		} else {
			setType(tEntity.getType());
		}
		if (tEntity.getShortName() == null) {
			setShortName("");
		} else {
			setShortName(tEntity.getShortName());
		}
		if (tEntity.getUseName() == null) {
			setUseName("");
		} else {
			setUseName(tEntity.getUseName());
		}
		if (tEntity.getPhoto() == null) {
			setPhoto("");
		} else {
			setPhoto(tEntity.getPhoto());
		}
		if (tEntity.getAdventure() == null) {
			setAdventure("");
		} else {
			setAdventure(tEntity.getAdventure());
		}
		if (tEntity.getCultureArts() == null) {
			setCultureArts("");
		} else {
			setCultureArts(tEntity.getCultureArts());
		}
		if (tEntity.getFestivalEvents() == null) {
			setFestivalEvents("");
		} else {
			setFestivalEvents(tEntity.getFestivalEvents());
		}
		if (tEntity.getFoodDrink() == null) {
			setFoodDrink("");
		} else {
			setFoodDrink(tEntity.getFoodDrink());
		}
		if (tEntity.getHistorical() == null) {
			setHistorical("");
		} else {
			setHistorical(tEntity.getHistorical());
		}
		if (tEntity.getLeisureSports() == null) {
			setLeisureSports("");
		} else {
			setLeisureSports(tEntity.getLeisureSports());
		}
		if (tEntity.getNatureRural() == null) {
			setNatureRural("");
		} else {
			setNatureRural(tEntity.getNatureRural());
		}
		if (tEntity.getNightlifeParty() == null) {
			setNightlifeParty("");
		} else {
			setNightlifeParty(tEntity.getNightlifeParty());
		}
		if (tEntity.getShoppingMarket() == null) {
			setShoppingMarket("");
		} else {
			setShoppingMarket(tEntity.getShoppingMarket());
		}
		if (tEntity.getOtherType1() == null) {
			setOtherType1("");
		} else {
			setOtherType1(tEntity.getOtherType1());
		}
		if (tEntity.getOtherType2() == null) {
			setOtherType2("");
		} else {
			setOtherType2(tEntity.getOtherType2());
		}
		if (tEntity.getOtherType3() == null) {
			setOtherType3("");
		} else {
			setOtherType3(tEntity.getOtherType3());
		}
		if (tEntity.getLongitudeLeft() == null) {
			setLongitudeLeft("");
		} else {
			setLongitudeLeft(String.valueOf(tEntity.getLongitudeLeft()));
		}
		if (tEntity.getLatitudeTop() == null) {
			setLatitudeTop("");
		} else {
			setLatitudeTop(String.valueOf(tEntity.getLatitudeTop()));
		}
		if (tEntity.getLongitudeRight() == null) {
			setLongitudeRight("");
		} else {
			setLongitudeRight(String.valueOf(tEntity.getLongitudeRight()));
		}
		if (tEntity.getLatitudeBottom() == null) {
			setLatitudeBottom("");
		} else {
			setLatitudeBottom(String.valueOf(tEntity.getLatitudeBottom()));
		}
		if (tEntity.getPoliArray() == null) {
			setPoliArray("");
		} else {
			setPoliArray(tEntity.getPoliArray());
		}
		if (tEntity.getScore() == null) {
			setScore("");
		} else {
			setScore(String.valueOf(tEntity.getScore()));
		}
		if (tEntity.getRank() == null) {
			setRank("");
		} else {
			setRank(String.valueOf(tEntity.getRank()));
		}
		if (tEntity.getMemo() == null) {
			setMemo("");
		} else {
			setMemo(tEntity.getMemo());
		}
		if (tEntity.getDelFlg() == null) {
			setDelFlg("");
		} else {
			setDelFlg(tEntity.getDelFlg());
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

	public LocationMstEntity copyEntityAction2Entity(LocationMstModel tLocationMstModel) {
		LocationMstEntity tEntity = new LocationMstEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tLocationMstModel.getLangId());
		tEntity.setIdentiNo(tLocationMstModel.getIdentiNo());
		tEntity.setStateName(tLocationMstModel.getStateName());
		tEntity.setProvinceName(tLocationMstModel.getProvinceName());
		tEntity.setCityName(tLocationMstModel.getCityName());
		tEntity.setType(tLocationMstModel.getType());
		tEntity.setShortName(tLocationMstModel.getShortName());
		tEntity.setUseName(tLocationMstModel.getUseName());
		tEntity.setPhoto(tLocationMstModel.getPhoto());
		tEntity.setAdventure(tLocationMstModel.getAdventure());
		tEntity.setCultureArts(tLocationMstModel.getCultureArts());
		tEntity.setFestivalEvents(tLocationMstModel.getFestivalEvents());
		tEntity.setFoodDrink(tLocationMstModel.getFoodDrink());
		tEntity.setHistorical(tLocationMstModel.getHistorical());
		tEntity.setLeisureSports(tLocationMstModel.getLeisureSports());
		tEntity.setNatureRural(tLocationMstModel.getNatureRural());
		tEntity.setNightlifeParty(tLocationMstModel.getNightlifeParty());
		tEntity.setShoppingMarket(tLocationMstModel.getShoppingMarket());
		tEntity.setOtherType1(tLocationMstModel.getOtherType1());
		tEntity.setOtherType2(tLocationMstModel.getOtherType2());
		tEntity.setOtherType3(tLocationMstModel.getOtherType3());
		if (KooUtil.isNotDouble(tLocationMstModel.getLongitudeLeft())) {
			tEntity.setLongitudeLeft(null);
		} else {
			tEntity.setLongitudeLeft(Double.parseDouble(tLocationMstModel.getLongitudeLeft()));
		}
		if (KooUtil.isNotDouble(tLocationMstModel.getLatitudeTop())) {
			tEntity.setLatitudeTop(null);
		} else {
			tEntity.setLatitudeTop(Double.parseDouble(tLocationMstModel.getLatitudeTop()));
		}
		if (KooUtil.isNotDouble(tLocationMstModel.getLongitudeRight())) {
			tEntity.setLongitudeRight(null);
		} else {
			tEntity.setLongitudeRight(Double.parseDouble(tLocationMstModel.getLongitudeRight()));
		}
		if (KooUtil.isNotDouble(tLocationMstModel.getLatitudeBottom())) {
			tEntity.setLatitudeBottom(null);
		} else {
			tEntity.setLatitudeBottom(Double.parseDouble(tLocationMstModel.getLatitudeBottom()));
		}
		tEntity.setPoliArray(tLocationMstModel.getPoliArray());
		if (KooUtil.isNotDouble(tLocationMstModel.getScore())) {
			tEntity.setScore(null);
		} else {
			tEntity.setScore(Double.parseDouble(tLocationMstModel.getScore()));
		}
		if (KooUtil.isNotInt(tLocationMstModel.getRank())) {
			tEntity.setRank(null);
		} else {
			tEntity.setRank(Integer.parseInt(tLocationMstModel.getRank()));
		}
		tEntity.setMemo(tLocationMstModel.getMemo());
		tEntity.setDelFlg(tLocationMstModel.getDelFlg());
		if (KooUtil.isNotDate(tLocationMstModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tLocationMstModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tLocationMstModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tLocationMstModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
