//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.CourseAction;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

  public class SingleCourseChecker {

	public List <ErrorInfo> nullCheck(CourseAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getFullName())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("fullName");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getCourseContent())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("courseContent");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getAdditionalInfo())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("additionalInfo");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getMaxTouristNum())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("maxTouristNum");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getMinTouristNum())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("minTouristNum");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getMoneyUnit())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("moneyUnit");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getPrice())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("price");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getDiscountPrice())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("discountPrice");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getAdultPrice())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("adultPrice");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getPersonOrGroup())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("personOrGroup");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getMinHourAdvance())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("minHourAdvance");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getTimeInDay())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("timeInDay");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getAdventure())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("adventure");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getCultureArts())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("cultureArts");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getFestivalEvents())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("festivalEvents");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getFoodDrink())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("foodDrink");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getHistorical())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("historical");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getLeisureSports())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("leisureSports");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getNatureRural())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("natureRural");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getNightlifeParty())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("nightlifeParty");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getShoppingMarket())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("shoppingMarket");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
		}

	public List <ErrorInfo> valueCheck(CourseAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getDuration())) {
			if (KooUtil.isNotDouble(tAction.getDuration())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("duration");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMaxTouristNum())) {
			if (KooUtil.isNotInt(tAction.getMaxTouristNum())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("maxTouristNum");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMinTouristNum())) {
			if (KooUtil.isNotInt(tAction.getMinTouristNum())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("minTouristNum");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getPrice())) {
			if (KooUtil.isNotDouble(tAction.getPrice())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("price");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getDiscountPrice())) {
			if (KooUtil.isNotDouble(tAction.getDiscountPrice())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("discountPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getOldPersonPrice())) {
			if (KooUtil.isNotDouble(tAction.getOldPersonPrice())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("oldPersonPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAdultPrice())) {
			if (KooUtil.isNotDouble(tAction.getAdultPrice())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("adultPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getChildPrice())) {
			if (KooUtil.isNotDouble(tAction.getChildPrice())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("childPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getInfantPrice())) {
			if (KooUtil.isNotDouble(tAction.getInfantPrice())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("infantPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMinHourAdvance())) {
			if (KooUtil.isNotInt(tAction.getMinHourAdvance())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("minHourAdvance");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTimeInDay())) {
			if (KooUtil.isNotInt(tAction.getTimeInDay())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timeInDay");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}

	public List <ErrorInfo> sizeCheck(CourseAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getFullName())) {
		    if (KooUtil.isTooLargeString(tAction.getFullName(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("fullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getShortName())) {
		    if (KooUtil.isTooLargeString(tAction.getShortName(),30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shortName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getCourseContent())) {
		    if (KooUtil.isTooLargeString(tAction.getCourseContent(),250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("courseContent");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAdditionalInfo())) {
		    if (KooUtil.isTooLargeString(tAction.getAdditionalInfo(),250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("additionalInfo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getDuration())) {
		   if (KooUtil.isTooLargeDouble(tAction.getDuration(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("duration");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getDurationUnit())) {
		    if (KooUtil.isTooLargeString(tAction.getDurationUnit(),50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("durationUnit");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTourLocation())) {
		    if (KooUtil.isTooLargeString(tAction.getTourLocation(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("tourLocation");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMeetupLocation())) {
		    if (KooUtil.isTooLargeString(tAction.getMeetupLocation(),250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("meetupLocation");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMaxTouristNum())) {
		   if (KooUtil.isTooLargeInt(tAction.getMaxTouristNum(),3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("maxTouristNum");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMinTouristNum())) {
		   if (KooUtil.isTooLargeInt(tAction.getMinTouristNum(),3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("minTouristNum");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMoneyUnit())) {
		    if (KooUtil.isTooLargeString(tAction.getMoneyUnit(),5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("moneyUnit");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getPrice())) {
		   if (KooUtil.isTooLargeDouble(tAction.getPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("price");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getDiscountPrice())) {
		   if (KooUtil.isTooLargeDouble(tAction.getDiscountPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("discountPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getUnitName())) {
		    if (KooUtil.isTooLargeString(tAction.getUnitName(),30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("unitName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getInfantFree())) {
		    if (KooUtil.isTooLargeString(tAction.getInfantFree(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("infantFree");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getOldPersonPrice())) {
		   if (KooUtil.isTooLargeDouble(tAction.getOldPersonPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("oldPersonPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAdultPrice())) {
		   if (KooUtil.isTooLargeDouble(tAction.getAdultPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("adultPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getChildPrice())) {
		   if (KooUtil.isTooLargeDouble(tAction.getChildPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("childPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getInfantPrice())) {
		   if (KooUtil.isTooLargeDouble(tAction.getInfantPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("infantPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getWorkDay())) {
		    if (KooUtil.isTooLargeString(tAction.getWorkDay(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("workDay");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getPersonOrGroup())) {
		    if (KooUtil.isTooLargeString(tAction.getPersonOrGroup(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("personOrGroup");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMinHourAdvance())) {
		   if (KooUtil.isTooLargeInt(tAction.getMinHourAdvance(),3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("minHourAdvance");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTimetable1())) {
		    if (KooUtil.isTooLargeString(tAction.getTimetable1(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable1");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTimetable2())) {
		    if (KooUtil.isTooLargeString(tAction.getTimetable2(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable2");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTimetable3())) {
		    if (KooUtil.isTooLargeString(tAction.getTimetable3(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable3");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTimetable4())) {
		    if (KooUtil.isTooLargeString(tAction.getTimetable4(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable4");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTimetable5())) {
		    if (KooUtil.isTooLargeString(tAction.getTimetable5(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable5");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTimeInDay())) {
		   if (KooUtil.isTooLargeInt(tAction.getTimeInDay(),2)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timeInDay");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAdventure())) {
		    if (KooUtil.isTooLargeString(tAction.getAdventure(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("adventure");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getCultureArts())) {
		    if (KooUtil.isTooLargeString(tAction.getCultureArts(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("cultureArts");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getFestivalEvents())) {
		    if (KooUtil.isTooLargeString(tAction.getFestivalEvents(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("festivalEvents");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getFoodDrink())) {
		    if (KooUtil.isTooLargeString(tAction.getFoodDrink(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("foodDrink");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getHistorical())) {
		    if (KooUtil.isTooLargeString(tAction.getHistorical(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("historical");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getLeisureSports())) {
		    if (KooUtil.isTooLargeString(tAction.getLeisureSports(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("leisureSports");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getNatureRural())) {
		    if (KooUtil.isTooLargeString(tAction.getNatureRural(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("natureRural");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getNightlifeParty())) {
		    if (KooUtil.isTooLargeString(tAction.getNightlifeParty(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("nightlifeParty");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getShoppingMarket())) {
		    if (KooUtil.isTooLargeString(tAction.getShoppingMarket(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shoppingMarket");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}

	public List <ErrorInfo> sizeCheck(CourseEntity tEntity){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getFullName())) {
		    if (KooUtil.isTooLargeString(tEntity.getFullName(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("fullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getShortName())) {
		    if (KooUtil.isTooLargeString(tEntity.getShortName(),30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shortName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getCourseContent())) {
		    if (KooUtil.isTooLargeString(tEntity.getCourseContent(),250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("courseContent");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getAdditionalInfo())) {
		    if (KooUtil.isTooLargeString(tEntity.getAdditionalInfo(),250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("additionalInfo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		   if (KooUtil.isTooLargeDouble(tEntity.getDuration(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("duration");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		if (KooUtil.isNotNull(tEntity.getDurationUnit())) {
		    if (KooUtil.isTooLargeString(tEntity.getDurationUnit(),50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("durationUnit");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getTourLocation())) {
		    if (KooUtil.isTooLargeString(tEntity.getTourLocation(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("tourLocation");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getMeetupLocation())) {
		    if (KooUtil.isTooLargeString(tEntity.getMeetupLocation(),250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("meetupLocation");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		   if (KooUtil.isTooLargeInt(tEntity.getMaxTouristNum(),3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("maxTouristNum");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		   if (KooUtil.isTooLargeInt(tEntity.getMinTouristNum(),3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("minTouristNum");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		if (KooUtil.isNotNull(tEntity.getMoneyUnit())) {
		    if (KooUtil.isTooLargeString(tEntity.getMoneyUnit(),5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("moneyUnit");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		   if (KooUtil.isTooLargeDouble(tEntity.getPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("price");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		   if (KooUtil.isTooLargeDouble(tEntity.getDiscountPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("discountPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		if (KooUtil.isNotNull(tEntity.getUnitName())) {
		    if (KooUtil.isTooLargeString(tEntity.getUnitName(),30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("unitName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getInfantFree())) {
		    if (KooUtil.isTooLargeString(tEntity.getInfantFree(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("infantFree");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		   if (KooUtil.isTooLargeDouble(tEntity.getOldPersonPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("oldPersonPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		   if (KooUtil.isTooLargeDouble(tEntity.getAdultPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("adultPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		   if (KooUtil.isTooLargeDouble(tEntity.getChildPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("childPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		   if (KooUtil.isTooLargeDouble(tEntity.getInfantPrice(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("infantPrice");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		if (KooUtil.isNotNull(tEntity.getWorkDay())) {
		    if (KooUtil.isTooLargeString(tEntity.getWorkDay(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("workDay");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getPersonOrGroup())) {
		    if (KooUtil.isTooLargeString(tEntity.getPersonOrGroup(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("personOrGroup");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		   if (KooUtil.isTooLargeInt(tEntity.getMinHourAdvance(),3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("minHourAdvance");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		if (KooUtil.isNotNull(tEntity.getTimetable1())) {
		    if (KooUtil.isTooLargeString(tEntity.getTimetable1(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable1");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getTimetable2())) {
		    if (KooUtil.isTooLargeString(tEntity.getTimetable2(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable2");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getTimetable3())) {
		    if (KooUtil.isTooLargeString(tEntity.getTimetable3(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable3");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getTimetable4())) {
		    if (KooUtil.isTooLargeString(tEntity.getTimetable4(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable4");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getTimetable5())) {
		    if (KooUtil.isTooLargeString(tEntity.getTimetable5(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timetable5");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		   if (KooUtil.isTooLargeInt(tEntity.getTimeInDay(),2)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("timeInDay");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		if (KooUtil.isNotNull(tEntity.getAdventure())) {
		    if (KooUtil.isTooLargeString(tEntity.getAdventure(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("adventure");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getCultureArts())) {
		    if (KooUtil.isTooLargeString(tEntity.getCultureArts(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("cultureArts");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getFestivalEvents())) {
		    if (KooUtil.isTooLargeString(tEntity.getFestivalEvents(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("festivalEvents");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getFoodDrink())) {
		    if (KooUtil.isTooLargeString(tEntity.getFoodDrink(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("foodDrink");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getHistorical())) {
		    if (KooUtil.isTooLargeString(tEntity.getHistorical(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("historical");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getLeisureSports())) {
		    if (KooUtil.isTooLargeString(tEntity.getLeisureSports(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("leisureSports");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getNatureRural())) {
		    if (KooUtil.isTooLargeString(tEntity.getNatureRural(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("natureRural");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getNightlifeParty())) {
		    if (KooUtil.isTooLargeString(tEntity.getNightlifeParty(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("nightlifeParty");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getShoppingMarket())) {
		    if (KooUtil.isTooLargeString(tEntity.getShoppingMarket(),1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shoppingMarket");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}
 }
