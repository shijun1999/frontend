//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.TouristAction;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

public class SingleTouristChecker {

	public List<ErrorInfo> nullCheck(TouristAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getLastName())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("lastName");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getFirstName())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("firstName");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
	}

	public List<ErrorInfo> valueCheck(TouristAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
//		if (KooUtil.isNotNull(tAction.getBirthday())) {
//			if (KooUtil.isNotInt(tAction.getBirthday())) {
//				ErrorInfo tErrorInfo = new ErrorInfo();
//				tErrorInfo.setItemName("birthday");
//				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
//				tErrorInfo.setDispOrder(2);
//				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
//				tList.add(tErrorInfo);
//			}
//		}
		return tList;
	}

	public List<ErrorInfo> sizeCheck(TouristAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getLastName())) {
			if (KooUtil.isTooLargeString(tAction.getLastName(), 40)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("lastName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getFirstName())) {
			if (KooUtil.isTooLargeString(tAction.getFirstName(), 40)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("firstName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}

		if (KooUtil.isNotNull(tAction.getLocation())) {
			if (KooUtil.isTooLargeString(tAction.getLocation(), 1024)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("telNo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}

	public List<ErrorInfo> sizeCheck(TouristEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getLastName())) {
			if (KooUtil.isTooLargeString(tEntity.getLastName(), 40)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("lastName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getFirstName())) {
			if (KooUtil.isTooLargeString(tEntity.getFirstName(), 40)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("firstName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}

		if (KooUtil.isTooLargeInt(tEntity.getBirthday(), 8)) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("birthday");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(2);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
			tList.add(tErrorInfo);
		}

		if (KooUtil.isNotNull(tEntity.getLocation())) {
			if (KooUtil.isTooLargeString(tEntity.getLocation(), 1024)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("loginId");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}

		return tList;
	}
}
