//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.TouristLoginAction;
import com.kootour.mapper.entity.TouristLoginEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

public class SingleTouristLoginChecker {

	public List<ErrorInfo> nullCheck(TouristLoginAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getLoginId())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("loginId");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getPassword())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("password");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
	}

	public List<ErrorInfo> valueCheck(TouristLoginAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
	}

	public List<ErrorInfo> sizeCheck(TouristLoginAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getLoginId())) {
			if (KooUtil.isTooLargeString(tAction.getLoginId(), 30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("loginId");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getPassword())) {
			if (KooUtil.isTooLargeString(tAction.getPassword(), 100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("password");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}

	public List<ErrorInfo> sizeCheck(TouristLoginEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getLoginId())) {
			if (KooUtil.isTooLargeString(tEntity.getLoginId(), 30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("loginId");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getPassword())) {
			if (KooUtil.isTooLargeString(tEntity.getPassword(), 100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("password");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}
}
