package com.kootour.service.impl;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.PulldownValueBean;
import com.kootour.mapper.entity.CourseFilterEntity;
import com.kootour.mapper.entity.LanguageMatrixEntity;
import com.kootour.mapper.paramentity.LanguageMatrixParamEntity;
import com.kootour.service.CourseFilterService;
import com.kootour.service4db.LanguageMatrixService4DB;

@Configuration
@Service
public class CourseFilterServiceImpl implements CourseFilterService {
	@Autowired
	private LanguageMatrixService4DB languageMatrixService4DB;
	private static Logger logger = Logger.getLogger(CourseFilterServiceImpl.class);
	@Override
	public CourseFilterEntity cancel(CourseFilterEntity courseFilterEntity, Map<String, Object> paraMap) {
		CourseFilterEntity rtnResult = new CourseFilterEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public CourseFilterEntity filterOk(CourseFilterEntity courseFilterEntity, Map<String, Object> paraMap) {
		CourseFilterEntity rtnResult = new CourseFilterEntity();
		String strSelectDay = courseFilterEntity.getSelectDay();
		String strSelectLangId1 = courseFilterEntity.getSelectLangId1();
		String strSelectLangId2 = courseFilterEntity.getSelectLangId2();
		String strSelectLangId3 = courseFilterEntity.getSelectLangId3();
		String strAdventure = courseFilterEntity.getAdventure();
		String strCultureArts = courseFilterEntity.getCultureArts();
		String strFestivalEvents = courseFilterEntity.getFestivalEvents();
		String strFoodDrink = courseFilterEntity.getFoodDrink();
		String strHistorical = courseFilterEntity.getHistorical();
		String strLeisureSports = courseFilterEntity.getLeisureSports();
		String strNatureRural = courseFilterEntity.getNatureRural();
		String strNightlifeParty = courseFilterEntity.getNightlifeParty();
		String strShoppingMarket = courseFilterEntity.getShoppingMarket();
		rtnResult.setAdventure(strAdventure);
		rtnResult.setCultureArts(strCultureArts);
		rtnResult.setFestivalEvents(strFestivalEvents);
		rtnResult.setFoodDrink(strFoodDrink);
		rtnResult.setHistorical(strHistorical);
		rtnResult.setLeisureSports(strLeisureSports);
		rtnResult.setNatureRural(strNatureRural);
		rtnResult.setNightlifeParty(strNightlifeParty);
		rtnResult.setShoppingMarket(strShoppingMarket);
		rtnResult.setAllType(courseFilterEntity.getAllType());
		rtnResult.setSelectLangId1(strSelectLangId1);
		rtnResult.setSelectLangId2(strSelectLangId2);
		rtnResult.setSelectLangId3(strSelectLangId3);
		rtnResult.setSelectDay(strSelectDay);
		rtnResult.setWithinDays(courseFilterEntity.getWithinDays());
		rtnResult.setDiscountFlg(courseFilterEntity.getDiscountFlg());
		
		if (rtnResult.getWithinDays().equals(KooConst.STR_TYPE_CHECK_TRUE)) {

			String curDate = courseFilterEntity.getSessionInfo().getCurDate();
			LocalDate curDay =LocalDate.parse(curDate, DateTimeFormatter.BASIC_ISO_DATE);//"YYYYMMDD"
			LocalDate selectDay =LocalDate.parse(strSelectDay, DateTimeFormatter.BASIC_ISO_DATE);//"YYYYMMDD"
			
			int days= (int) curDay.until(selectDay, ChronoUnit.DAYS); 

			String strEndDate = "";
			String strStartDate = "";
			if (days<=0){
				strStartDate=curDate;
				strEndDate=curDay.plusDays(6).format(DateTimeFormatter.BASIC_ISO_DATE);;				
			}else if (days<3){
				strStartDate=curDate;
				strEndDate=curDay.plusDays(7-days+1).format(DateTimeFormatter.BASIC_ISO_DATE);;				
			}else{
				strStartDate=selectDay.plusDays(-2).format(DateTimeFormatter.BASIC_ISO_DATE);
				strEndDate=selectDay.plusDays(4).format(DateTimeFormatter.BASIC_ISO_DATE);;				
			}
			rtnResult.setBgnDay(strStartDate);
			rtnResult.setEndDay(strEndDate);
		} else {

			rtnResult.setBgnDay(courseFilterEntity.getSelectDay());
			rtnResult.setEndDay(courseFilterEntity.getSelectDay());
		}

		return (rtnResult);
	}

	@Override
	public CourseFilterEntity back(CourseFilterEntity courseFilterEntity, Map<String, Object> paraMap) {
		CourseFilterEntity rtnResult = new CourseFilterEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public CourseFilterEntity load(CourseFilterEntity courseFilterEntity, Map<String, Object> paraMap) {
		CourseFilterEntity rtnResult = courseFilterEntity;
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();

		LanguageMatrixParamEntity languageMatrixParamEntity = new LanguageMatrixParamEntity();
		languageMatrixParamEntity.setLangId(courseFilterEntity.getLangId());
		List<LanguageMatrixEntity> languageMatrixEntityList = languageMatrixService4DB.selectByCondition(languageMatrixParamEntity);

		if (languageMatrixEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM006 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			logger.error(KooConst.INFO_MSG_001);
		}

		LanguageMatrixEntity languageMatrixEntity = new LanguageMatrixEntity();
		List<PulldownValueBean> langList = new ArrayList<PulldownValueBean>();
		langList.add(new PulldownValueBean("", ""));

		for (int i = 0; i < languageMatrixEntityList.size(); i++) {

			languageMatrixEntity = languageMatrixEntityList.get(i);
			langList.add(new PulldownValueBean(languageMatrixEntity.getLangIdRef(), languageMatrixEntity.getNameInLocal()));
		}

		String strSelectDay = courseFilterEntity.getSelectDay();
		String strSelectLangId1 = courseFilterEntity.getSelectLangId1();
		String strSelectLangId2 = courseFilterEntity.getSelectLangId2();
		String strSelectLangId3 = courseFilterEntity.getSelectLangId3();
		String strAdventure = courseFilterEntity.getAdventure();
		String strCultureArts = courseFilterEntity.getCultureArts();
		String strFestivalEvents = courseFilterEntity.getFestivalEvents();
		String strFoodDrink = courseFilterEntity.getFoodDrink();
		String strHistorical = courseFilterEntity.getHistorical();
		String strLeisureSports = courseFilterEntity.getLeisureSports();
		String strNatureRural = courseFilterEntity.getNatureRural();
		String strNightlifeParty = courseFilterEntity.getNightlifeParty();
		String strShoppingMarket = courseFilterEntity.getShoppingMarket();

		if (KooUtil.isNotNull(strAdventure)) {
			rtnResult.setAdventure(strSelectDay);
		}

		if (KooUtil.isNotNull(strCultureArts)) {
			rtnResult.setCultureArts(strCultureArts);
		}
		if (KooUtil.isNotNull(strFestivalEvents)) {
			rtnResult.setFestivalEvents(strFestivalEvents);
		}
		if (KooUtil.isNotNull(strFoodDrink)) {
			rtnResult.setFoodDrink(strFoodDrink);
		}
		if (KooUtil.isNotNull(strHistorical)) {
			rtnResult.setHistorical(strHistorical);
		}
		if (KooUtil.isNotNull(strLeisureSports)) {
			rtnResult.setLeisureSports(strLeisureSports);
		}
		if (KooUtil.isNotNull(strNatureRural)) {
			rtnResult.setNatureRural(strNatureRural);
		}

		if (KooUtil.isNotNull(strNightlifeParty)) {
			rtnResult.setNightlifeParty(strNightlifeParty);
		}
		if (KooUtil.isNotNull(strShoppingMarket)) {
			rtnResult.setShoppingMarket(strShoppingMarket);
		}

		if (KooUtil.isNotNull(strSelectLangId1)) {
			rtnResult.setSelectLangId1(strSelectLangId1);
		}

		if (KooUtil.isNotNull(strSelectLangId2)) {
			rtnResult.setSelectLangId2(strSelectLangId2);
		}
		if (KooUtil.isNotNull(strSelectLangId3)) {
			rtnResult.setSelectLangId3(strSelectLangId3);
		}
		paraMap.put(KooConst.ST_LANG_LIST, langList);

		return (rtnResult);
	}

	public Map<String, Object> init(CourseFilterEntity courseFilterEntity) {
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		LanguageMatrixParamEntity languageMatrixParamEntity = new LanguageMatrixParamEntity();
		languageMatrixParamEntity.setLangId(courseFilterEntity.getLangId());
		List<LanguageMatrixEntity> languageMatrixEntityList = languageMatrixService4DB.selectByCondition(languageMatrixParamEntity);

		if (languageMatrixEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM006 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			rtnMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_001);
			return (rtnMap);
		}

		LanguageMatrixEntity languageMatrixEntity = new LanguageMatrixEntity();
		List<PulldownValueBean> langList = new ArrayList<PulldownValueBean>();
		langList.add(new PulldownValueBean("", ""));

		for (int i = 0; i < languageMatrixEntityList.size(); i++) {

			languageMatrixEntity = languageMatrixEntityList.get(i);
			langList.add(new PulldownValueBean(languageMatrixEntity.getLangIdRef(), languageMatrixEntity.getNameInLocal()));
		}

		rtnMap.put(KooConst.ST_LANG_LIST, langList);
		rtnMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnMap);
	}
}
