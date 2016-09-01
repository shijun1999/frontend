package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.MenuInfo;
import com.kootour.common.PulldownValueBean;
import com.kootour.common.SessionInfo;
import com.kootour.mapper.entity.LanguageMatrixEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.entity.UserOrderExtraOptionEntity;
import com.kootour.mapper.paramentity.LanguageMatrixParamEntity;
import com.kootour.service.CommonService;
import com.kootour.service4db.CommonService4DB;
import com.kootour.service4db.LanguageMatrixService4DB;
import com.kootour.service4db.SequenceService4DB;
import com.kootour.service4db.impl.CommonService4DBImpl;
import com.kootour.service4db.impl.SequenceService4DBImpl;

@Configuration
@Service
public class CommonServiceImpl implements CommonService {

	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB = new SequenceService4DBImpl();
	@Autowired(required = false)
	private CommonService4DB commonService4DB = new CommonService4DBImpl();
	@Autowired
	private LanguageMatrixService4DB languageMatrixService4DB;

	private static Logger logger = Logger.getLogger(CourseFilterServiceImpl.class);

	public SessionInfo initSessionInfo() {
		SessionInfo retVal = new SessionInfo();

		retVal.setCurCity("Beijing");
		retVal.setCurState("China");
		retVal.setCurLangId(KooConst.STR_LANGUAGE_ENGLISH);
		// retVal.setCurTouristIdentiNo(sequenceService4DB.createSequence(KooConst.ST_DUMMY_TOURIST));
		retVal.setCurTouristIdentiNo(KooConst.ST_DUMMY_TOURIST_NO);
		retVal.setCurTouristName(KooConst.ST_DUMMY_TOURIST_NAME);
		retVal.setCurTouristPicture("");
		String t = commonService4DB.selectDate();
		retVal.setCurDate(t);
		retVal.setParaMap(new HashMap<String, Object>());

		List<MenuInfo> tMenuList = new ArrayList<>();
		tMenuList.add(makeMenuLevel_0());
		retVal.setCurMenuList(tMenuList);

		LanguageMatrixParamEntity languageMatrixParamEntity = new LanguageMatrixParamEntity();
		languageMatrixParamEntity.setLangId(KooConst.STR_LANGUAGE_ENGLISH);
		List<LanguageMatrixEntity> languageMatrixEntityList = languageMatrixService4DB
				.selectByCondition(languageMatrixParamEntity);

		if (languageMatrixEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM006 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			logger.error(KooConst.INFO_MSG_001);
		}

		LanguageMatrixEntity languageMatrixEntity = new LanguageMatrixEntity();
		List<PulldownValueBean> langList = new ArrayList<PulldownValueBean>();
		langList.add(new PulldownValueBean("", ""));

		for (int i = 0; i < languageMatrixEntityList.size(); i++) {

			languageMatrixEntity = languageMatrixEntityList.get(i);
			langList.add(
					new PulldownValueBean(languageMatrixEntity.getLangIdRef(), languageMatrixEntity.getNameInLocal()));
		}
		retVal.getParaMap().put(KooConst.ST_LANG_LIST, langList);

		return (retVal);
	}

	public Double calcSubTotalMoney(UserOrderEntity tUserOrderEntity, ScheduleOptionEntity tScheduleOptionEntity) {
		Double retVal = 0.0;
		if (tUserOrderEntity.getPersonOrGroup().equals(KooConst.STR_TYPE_DIV_GROUP)) {
			retVal = tScheduleOptionEntity.getPrice();
		} else {
			retVal = tScheduleOptionEntity.getPrice() * tUserOrderEntity.getTouristNum();
			if (tScheduleOptionEntity.getLargeDiscountFlg().equals(KooConst.ST_FLG_YES)) {
				if (tUserOrderEntity.getTouristNum() >= tScheduleOptionEntity.getLargeGroupLimit()) {
					if (tScheduleOptionEntity.getLargeDiscountType().equals(KooConst.STR_DISCOUNT_PERCENT)) {
						retVal = retVal - retVal * tScheduleOptionEntity.getLargeDiscountPercent();
					} else {
						retVal = retVal - tScheduleOptionEntity.getLargeDiscountValue();
					}
				}
			}
		}

		return (retVal);
	}

	public Double calcExtraMoney(UserOrderEntity tUserOrderEntity, ScheduleOptionEntity tScheduleOptionEntity) {
		Double retVal = 0.0;
		for (UserOrderExtraOptionEntity t : tUserOrderEntity.getUserOrderExtraOptionEntityList()) {

			if (tUserOrderEntity.getPersonOrGroup().equals(KooConst.STR_TYPE_DIV_GROUP)) {
				retVal = retVal + t.getExtraPrice();
			} else {
				retVal = retVal + t.getExtraPrice() * tUserOrderEntity.getTouristNum();
				if (tScheduleOptionEntity.getLargeDiscountFlg().equals(KooConst.ST_FLG_YES)) {
					if (tUserOrderEntity.getTouristNum() >= tScheduleOptionEntity.getLargeGroupLimit()) {
						if (tScheduleOptionEntity.getLargeDiscountType().equals(KooConst.STR_DISCOUNT_PERCENT)) {
							retVal = retVal - retVal * tScheduleOptionEntity.getLargeDiscountPercent();
						} else {
							retVal = retVal - tScheduleOptionEntity.getLargeDiscountValue();
						}
					}
				}
			}

		}

		return (retVal);
	}

	public Double calcTotalMoney(Double tSubTotalMoney, Double tExtraTotalMoney, Double tTax) {

		Double retVal = 0.0;
		retVal=tSubTotalMoney+tExtraTotalMoney;
		retVal=retVal+retVal*tTax;
		return (retVal);
	}

	
	public MenuInfo makeMenuLevel_0() {
		MenuInfo tMenuInfo = new MenuInfo();
		tMenuInfo.setMenuLevel(KooConst.ST_MENU_0);
		tMenuInfo.setMenuDispName(KooConst.ST_MENU_HOME);
		tMenuInfo.setMenuClassName(KooConst.ST_CLASS_STATE_COURSE_LIST);
		tMenuInfo.setMenuMethodName(KooConst.ST_METHOD_LOAD);
		tMenuInfo.setMenuParaMap(new HashMap<String, Object>());
		return tMenuInfo;
	}

	public MenuInfo makeMenuLevel_1(String inCityName, String inCityId) {
		MenuInfo tMenuInfo = new MenuInfo();
		tMenuInfo.setMenuLevel(KooConst.ST_MENU_1);
		tMenuInfo.setMenuDispName(inCityName);
		tMenuInfo.setMenuClassName(KooConst.ST_CLASS_CITY_LIST);
		tMenuInfo.setMenuMethodName(KooConst.ST_METHOD_LOAD);
		tMenuInfo.setMenuParaMap(new HashMap<String, Object>());
		return tMenuInfo;
	}

	public MenuInfo makeMenuLevel_2(String inCourseName, String inCourseId) {
		MenuInfo tMenuInfo = new MenuInfo();
		tMenuInfo.setMenuLevel(KooConst.ST_MENU_2);
		tMenuInfo.setMenuDispName(inCourseName);
		tMenuInfo.setMenuClassName(KooConst.ST_CLASS_COURSE_DETAIL);
		tMenuInfo.setMenuMethodName(KooConst.ST_METHOD_LOAD);
		/*
		 * Map tMap =new HashMap<String, Object>(); tMap.put(KooConst.ST_COURSE,
		 * inCourseId); tMenuInfo.setMenuParaMap(tMap);
		 */
		tMenuInfo.setMenuParaMap(new HashMap<String, Object>());
		return tMenuInfo;
	}

	public MenuInfo makeMenuLevel_3() {
		MenuInfo tMenuInfo = new MenuInfo();
		tMenuInfo.setMenuLevel(KooConst.ST_MENU_4);
		tMenuInfo.setMenuDispName(KooConst.ST_CLASS_ACCOUNT_SUMMARY);
		tMenuInfo.setMenuClassName(KooConst.ST_CLASS_ACCOUNT_SUMMARY);
		tMenuInfo.setMenuMethodName(KooConst.ST_METHOD_LOAD);

		tMenuInfo.setMenuParaMap(new HashMap<String, Object>());
		return tMenuInfo;
	}

	public MenuInfo makeMenuLevel_4() {
		MenuInfo tMenuInfo = new MenuInfo();
		tMenuInfo.setMenuLevel(KooConst.ST_MENU_5);
		tMenuInfo.setMenuDispName(KooConst.ST_CLASS_PAYMENT);
		tMenuInfo.setMenuClassName(KooConst.ST_CLASS_PAYMENT);
		tMenuInfo.setMenuMethodName(KooConst.ST_METHOD_LOAD);

		tMenuInfo.setMenuParaMap(new HashMap<String, Object>());
		return tMenuInfo;
	}


}
