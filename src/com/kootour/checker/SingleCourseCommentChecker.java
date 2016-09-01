//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.CourseCommentAction;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

public class SingleCourseCommentChecker {

	public List<ErrorInfo> nullCheck(CourseCommentAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
//		if (!KooUtil.isNotNull(tAction.getCommentDate())) {
//			ErrorInfo tErrorInfo = new ErrorInfo();
//			tErrorInfo.setItemName("commentDate");
//			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
//			tErrorInfo.setDispOrder(1);
//			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
//			tList.add(tErrorInfo);
//		}
//		if (!KooUtil.isNotNull(tAction.getScore())) {
//			ErrorInfo tErrorInfo = new ErrorInfo();
//			tErrorInfo.setItemName("score");
//			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
//			tErrorInfo.setDispOrder(1);
//			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
//			tList.add(tErrorInfo);
//		}
		if (!KooUtil.isNotNull(tAction.getComment())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("comment");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
	}

	public List<ErrorInfo> valueCheck(CourseCommentAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getCommentDate())) {
			if (KooUtil.isNotInt(tAction.getCommentDate())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("commentDate");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			} else {
				if (KooUtil.isNotDate(tAction.getCommentDate())) {
					ErrorInfo tErrorInfo = new ErrorInfo();
					tErrorInfo.setItemName("commentDate");
					tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
					tErrorInfo.setDispOrder(2);
					tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
					tList.add(tErrorInfo);
				}
			}
		}
		if (KooUtil.isNotNull(tAction.getScore())) {
			if (KooUtil.isNotDouble(tAction.getScore())) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("score");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_002);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}

	public List<ErrorInfo> sizeCheck(CourseCommentAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getCommentDate())) {
			if (KooUtil.isTooLargeInt(tAction.getCommentDate(), 8)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("commentDate");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getScore())) {
			if (KooUtil.isTooLargeDouble(tAction.getScore(), 0)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("score");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getComment())) {
			if (KooUtil.isTooLargeString(tAction.getComment(), 250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("comment");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}

	public List<ErrorInfo> sizeCheck(CourseCommentEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isTooLargeInt(tEntity.getCommentDate(), 8)) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("commentDate");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(2);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_004);
			tList.add(tErrorInfo);
		}
		if (KooUtil.isTooLargeDouble(tEntity.getScore(), 0)) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("score");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(2);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_005);
			tList.add(tErrorInfo);
		}
		if (KooUtil.isNotNull(tEntity.getComment())) {
			if (KooUtil.isTooLargeString(tEntity.getComment(), 250)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("comment");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
	}
}
