//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.CourseScheduleAction;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

public class SingleCourseScheduleChecker {

	public List<ErrorInfo> nullCheck(CourseScheduleAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getStatus())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("status");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
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

	public List<ErrorInfo> valueCheck(CourseScheduleAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
	}

	public List<ErrorInfo> sizeCheck(CourseScheduleAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getWorkDate())) {
			if (KooUtil.isTooLargeString(tAction.getWorkDate(), 8)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("workDate");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getStatus())) {
			if (KooUtil.isTooLargeString(tAction.getStatus(), 3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("status");
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

	public List<ErrorInfo> sizeCheck(CourseScheduleEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getWorkDate())) {
			if (KooUtil.isTooLargeString(tEntity.getWorkDate(), 8)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("workDate");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getStatus())) {
			if (KooUtil.isTooLargeString(tEntity.getStatus(), 3)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("status");
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
