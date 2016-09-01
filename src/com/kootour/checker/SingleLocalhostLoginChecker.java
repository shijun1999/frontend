//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.LocalhostLoginAction;
import com.kootour.mapper.entity.LocalhostLoginEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

public class SingleLocalhostLoginChecker {

	public List<ErrorInfo> nullCheck(LocalhostLoginAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getLoginType())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("loginType");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
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

	public List<ErrorInfo> valueCheck(LocalhostLoginAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
	}

	public List<ErrorInfo> sizeCheck(LocalhostLoginAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getTouristIdentiNo())) {
			if (KooUtil.isTooLargeString(tAction.getTouristIdentiNo(), 12)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("touristIdentiNo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getLoginType())) {
			if (KooUtil.isTooLargeString(tAction.getLoginType(), 3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("loginType");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getLoginId())) {
			if (KooUtil.isTooLargeString(tAction.getLoginId(), 20)) {
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

	public List<ErrorInfo> sizeCheck(LocalhostLoginEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getTouristIdentiNo())) {
			if (KooUtil.isTooLargeString(tEntity.getTouristIdentiNo(), 12)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("touristIdentiNo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getLoginType())) {
			if (KooUtil.isTooLargeString(tEntity.getLoginType(), 3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("loginType");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getLoginId())) {
			if (KooUtil.isTooLargeString(tEntity.getLoginId(), 20)) {
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
