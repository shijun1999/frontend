//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.ChangePasswordAction;
import com.kootour.mapper.entity.ChangePasswordEntity;
import com.kootour.mapper.entity.PictureEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;
import com.kootour.exception.BusinessException;
import com.kootour.exception.SystemException;

public class SingleChangePasswordChecker {

	public List<ErrorInfo> nullCheck(ChangePasswordAction tAction) {

		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getPassword())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("password");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getConfirmPassword())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("confirmPassword");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
	}

	public List<ErrorInfo> valueCheck(ChangePasswordAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
	}

	public List<ErrorInfo> sizeCheck(ChangePasswordAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
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

		if (KooUtil.isNotNull(tAction.getConfirmPassword())) {
			if (KooUtil.isTooLargeString(tAction.getConfirmPassword(), 100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("confirmPassword");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}

	public List<ErrorInfo> sizeCheck(ChangePasswordEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
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
		if (KooUtil.isNotNull(tEntity.getConfirmPassword())) {
			if (KooUtil.isTooLargeString(tEntity.getConfirmPassword(), 100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("confirmPassword");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}
}
