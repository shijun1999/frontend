//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.CourseFilterAction;
import com.kootour.mapper.entity.CourseFilterEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

public class SingleCourseFilterChecker {

	public List<ErrorInfo> nullCheck(CourseFilterAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
	}

	public List<ErrorInfo> valueCheck(CourseFilterAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
	}

	public List<ErrorInfo> sizeCheck(CourseFilterAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getAdventure())) {
			if (KooUtil.isTooLargeString(tAction.getAdventure(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("adventure");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getCultureArts())) {
			if (KooUtil.isTooLargeString(tAction.getCultureArts(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("cultureArts");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getFestivalEvents())) {
			if (KooUtil.isTooLargeString(tAction.getFestivalEvents(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("festivalEvents");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getFoodDrink())) {
			if (KooUtil.isTooLargeString(tAction.getFoodDrink(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("foodDrink");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getHistorical())) {
			if (KooUtil.isTooLargeString(tAction.getHistorical(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("historical");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getLeisureSports())) {
			if (KooUtil.isTooLargeString(tAction.getLeisureSports(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("leisureSports");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getNatureRural())) {
			if (KooUtil.isTooLargeString(tAction.getNatureRural(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("natureRural");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getNightlifeParty())) {
			if (KooUtil.isTooLargeString(tAction.getNightlifeParty(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("nightlifeParty");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getShoppingMarket())) {
			if (KooUtil.isTooLargeString(tAction.getShoppingMarket(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shoppingMarket");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAllType())) {
			if (KooUtil.isTooLargeString(tAction.getAllType(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("allType");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getSelectLangId1())) {
			if (KooUtil.isTooLargeString(tAction.getSelectLangId1(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("selectLangId1");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getSelectLangId2())) {
			if (KooUtil.isTooLargeString(tAction.getSelectLangId2(), 3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("selectLangId2");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getSelectLangId3())) {
			if (KooUtil.isTooLargeString(tAction.getSelectLangId3(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("selectLangId3");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getSelectDay())) {
			if (KooUtil.isTooLargeString(tAction.getSelectDay(), 50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("selectDay");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}

	public List<ErrorInfo> sizeCheck(CourseFilterEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getAdventure())) {
			if (KooUtil.isTooLargeString(tEntity.getAdventure(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("adventure");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getCultureArts())) {
			if (KooUtil.isTooLargeString(tEntity.getCultureArts(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("cultureArts");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getFestivalEvents())) {
			if (KooUtil.isTooLargeString(tEntity.getFestivalEvents(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("festivalEvents");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getFoodDrink())) {
			if (KooUtil.isTooLargeString(tEntity.getFoodDrink(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("foodDrink");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getHistorical())) {
			if (KooUtil.isTooLargeString(tEntity.getHistorical(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("historical");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getLeisureSports())) {
			if (KooUtil.isTooLargeString(tEntity.getLeisureSports(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("leisureSports");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getNatureRural())) {
			if (KooUtil.isTooLargeString(tEntity.getNatureRural(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("natureRural");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getNightlifeParty())) {
			if (KooUtil.isTooLargeString(tEntity.getNightlifeParty(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("nightlifeParty");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getShoppingMarket())) {
			if (KooUtil.isTooLargeString(tEntity.getShoppingMarket(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shoppingMarket");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getAllType())) {
			if (KooUtil.isTooLargeString(tEntity.getAllType(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("allType");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getSelectLangId1())) {
			if (KooUtil.isTooLargeString(tEntity.getSelectLangId1(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("selectLangId1");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getSelectLangId2())) {
			if (KooUtil.isTooLargeString(tEntity.getSelectLangId2(), 3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("selectLangId2");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getSelectLangId3())) {
			if (KooUtil.isTooLargeString(tEntity.getSelectLangId3(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("selectLangId3");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getSelectDay())) {
			if (KooUtil.isTooLargeString(tEntity.getSelectDay(), 50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("selectDay");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}
}
