//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.LocationMstAction;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

public class SingleLocationMstChecker {

	public List<ErrorInfo> nullCheck(LocationMstAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getShortName())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("shortName");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getUseName())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("useName");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
	}

	public List<ErrorInfo> valueCheck(LocationMstAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
	}

	public List<ErrorInfo> sizeCheck(LocationMstAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getShortName())) {
			if (KooUtil.isTooLargeString(tAction.getShortName(), 30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shortName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getUseName())) {
			if (KooUtil.isTooLargeString(tAction.getUseName(), 80)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("useName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAdventure())) {
			if (KooUtil.isTooLargeString(tAction.getAdventure(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("adventure");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getCultureArts())) {
			if (KooUtil.isTooLargeString(tAction.getCultureArts(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("cultureArts");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getFestivalEvents())) {
			if (KooUtil.isTooLargeString(tAction.getFestivalEvents(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("festivalEvents");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getFoodDrink())) {
			if (KooUtil.isTooLargeString(tAction.getFoodDrink(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("foodDrink");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getHistorical())) {
			if (KooUtil.isTooLargeString(tAction.getHistorical(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("historical");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getLeisureSports())) {
			if (KooUtil.isTooLargeString(tAction.getLeisureSports(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("leisureSports");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getNatureRural())) {
			if (KooUtil.isTooLargeString(tAction.getNatureRural(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("natureRural");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getNightlifeParty())) {
			if (KooUtil.isTooLargeString(tAction.getNightlifeParty(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("nightlifeParty");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}

	public List<ErrorInfo> sizeCheck(LocationMstEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getShortName())) {
			if (KooUtil.isTooLargeString(tEntity.getShortName(), 30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shortName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getUseName())) {
			if (KooUtil.isTooLargeString(tEntity.getUseName(), 80)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("useName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getAdventure())) {
			if (KooUtil.isTooLargeString(tEntity.getAdventure(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("adventure");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getCultureArts())) {
			if (KooUtil.isTooLargeString(tEntity.getCultureArts(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("cultureArts");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getFestivalEvents())) {
			if (KooUtil.isTooLargeString(tEntity.getFestivalEvents(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("festivalEvents");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getFoodDrink())) {
			if (KooUtil.isTooLargeString(tEntity.getFoodDrink(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("foodDrink");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getHistorical())) {
			if (KooUtil.isTooLargeString(tEntity.getHistorical(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("historical");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getLeisureSports())) {
			if (KooUtil.isTooLargeString(tEntity.getLeisureSports(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("leisureSports");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getNatureRural())) {
			if (KooUtil.isTooLargeString(tEntity.getNatureRural(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("natureRural");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getNightlifeParty())) {
			if (KooUtil.isTooLargeString(tEntity.getNightlifeParty(), 1)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("nightlifeParty");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}
}
