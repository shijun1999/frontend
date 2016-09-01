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

import com.kootour.mapper.paramentity.PictureParamEntity;
import com.kootour.model.PictureModel;
import com.kootour.service.PictureService;
import com.kootour.service.impl.PictureServiceImpl;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.PictureEntity;

public class PictureAction extends PictureModel {

	@Autowired(required = false)
	private PictureService pictureService = new PictureServiceImpl();

	public void copyEntity2EntityAction(PictureEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getIdentiNo() == null) {
			setIdentiNo("");
		} else {
			setIdentiNo(tEntity.getIdentiNo());
		}
		if (tEntity.getSearchWord() == null) {
			setSearchWord("");
		} else {
			setSearchWord(tEntity.getSearchWord());
		}
		if (tEntity.getFullName() == null) {
			setFullName("");
		} else {
			setFullName(tEntity.getFullName());
		}
		if (tEntity.getOwnerIdentiNo() == null) {
			setOwnerIdentiNo("");
		} else {
			setOwnerIdentiNo(tEntity.getOwnerIdentiNo());
		}
		if (tEntity.getFullPath() == null) {
			setFullPath("");
		} else {
			setFullPath(tEntity.getFullPath());
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
	public PictureEntity copyEntityAction2Entity() {
		PictureEntity tEntity = new PictureEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setIdentiNo(getIdentiNo());
		tEntity.setSearchWord(getSearchWord());
		tEntity.setFullName(getFullName());
		tEntity.setOwnerIdentiNo(getOwnerIdentiNo());
		tEntity.setFullPath(getFullPath());
		tEntity.setAdventure(getAdventure());
		tEntity.setCultureArts(getCultureArts());
		tEntity.setFestivalEvents(getFestivalEvents());
		tEntity.setFoodDrink(getFoodDrink());
		tEntity.setHistorical(getHistorical());
		tEntity.setLeisureSports(getLeisureSports());
		tEntity.setNatureRural(getNatureRural());
		tEntity.setNightlifeParty(getNightlifeParty());
		tEntity.setShoppingMarket(getShoppingMarket());
		tEntity.setOtherType1(getOtherType1());
		tEntity.setOtherType2(getOtherType2());
		tEntity.setOtherType3(getOtherType3());
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
