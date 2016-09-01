//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.UserOrderAction;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

  public class SingleUserOrderChecker {

	public List <ErrorInfo> nullCheck(UserOrderAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getReservationDate())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("reservationDate");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getBgnTime())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("bgnTime");
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
		if (!KooUtil.isNotNull(tAction.getPersonOrGroup())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("personOrGroup");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
		}

	public List <ErrorInfo> valueCheck(UserOrderAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getTouristNum())) {
			if (KooUtil.isNotInt(tAction.getTouristNum())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("touristNum");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getInfantFree())) {
			if (KooUtil.isNotInt(tAction.getInfantFree())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("infantFree");
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
		if (KooUtil.isNotNull(tAction.getTotalMoney())) {
			if (KooUtil.isNotDouble(tAction.getTotalMoney())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("totalMoney");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}

	public List <ErrorInfo> sizeCheck(UserOrderAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getReservationDate())) {
		    if (KooUtil.isTooLargeString(tAction.getReservationDate(),8)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("reservationDate");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getBgnTime())) {
		    if (KooUtil.isTooLargeString(tAction.getBgnTime(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("bgnTime");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
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
		if (KooUtil.isNotNull(tAction.getTouristNum())) {
		   if (KooUtil.isTooLargeInt(tAction.getTouristNum(),2)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("touristNum");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getInfantFree())) {
		   if (KooUtil.isTooLargeInt(tAction.getInfantFree(),2)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("infantFree");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
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
		if (KooUtil.isNotNull(tAction.getTotalMoney())) {
		   if (KooUtil.isTooLargeDouble(tAction.getTotalMoney(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("totalMoney");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTouristFullName())) {
		    if (KooUtil.isTooLargeString(tAction.getTouristFullName(),50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("touristFullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getCourseFullName())) {
		    if (KooUtil.isTooLargeString(tAction.getCourseFullName(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("courseFullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}

	public List <ErrorInfo> sizeCheck(UserOrderEntity tEntity){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getReservationDate())) {
		    if (KooUtil.isTooLargeString(tEntity.getReservationDate(),8)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("reservationDate");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getBgnTime())) {
		    if (KooUtil.isTooLargeString(tEntity.getBgnTime(),20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("bgnTime");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
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
		   if (KooUtil.isTooLargeInt(tEntity.getTouristNum(),2)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("touristNum");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		   if (KooUtil.isTooLargeInt(tEntity.getInfantFree(),2)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("infantFree");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
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
		   if (KooUtil.isTooLargeDouble(tEntity.getTotalMoney(),0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("totalMoney");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		if (KooUtil.isNotNull(tEntity.getTouristFullName())) {
		    if (KooUtil.isTooLargeString(tEntity.getTouristFullName(),50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("touristFullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getCourseFullName())) {
		    if (KooUtil.isTooLargeString(tEntity.getCourseFullName(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("courseFullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}
 }
