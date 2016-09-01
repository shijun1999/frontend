//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.CoursePictureAction;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

public class SingleCoursePictureChecker {

	public List<ErrorInfo> nullCheck(CoursePictureAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getMemo())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("memo");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
	}

	public List<ErrorInfo> valueCheck(CoursePictureAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
	}

	public List<ErrorInfo> sizeCheck(CoursePictureAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getFullName())) {
			if (KooUtil.isTooLargeString(tAction.getFullName(), 50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("fullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getType())) {
			if (KooUtil.isTooLargeString(tAction.getType(), 12)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("type");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMemo())) {
			if (KooUtil.isTooLargeString(tAction.getMemo(), 250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("memo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}

	public List<ErrorInfo> sizeCheck(CoursePictureEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getFullName())) {
			if (KooUtil.isTooLargeString(tEntity.getFullName(), 50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("fullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getType())) {
			if (KooUtil.isTooLargeString(tEntity.getType(), 12)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("type");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getMemo())) {
			if (KooUtil.isTooLargeString(tEntity.getMemo(), 250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("memo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}
}
