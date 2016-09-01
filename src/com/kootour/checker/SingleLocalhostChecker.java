//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.LocalhostAction;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

public class SingleLocalhostChecker {

	public List<ErrorInfo> nullCheck(LocalhostAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getFullName())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("fullName");
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
		if (!KooUtil.isNotNull(tAction.getPostCode())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("postCode");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getState())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("state");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getAddr1())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("addr1");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getTelCode())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("telCode");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getTelNo())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("telNo");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getEmail())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("email");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		if (!KooUtil.isNotNull(tAction.getPhoto())) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("photo");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
	}

	public List<ErrorInfo> valueCheck(LocalhostAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
	}

	public List<ErrorInfo> sizeCheck(LocalhostAction tAction) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getFullName())) {
			if (KooUtil.isTooLargeString(tAction.getFullName(), 30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("fullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getShortName())) {
			if (KooUtil.isTooLargeString(tAction.getShortName(), 20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shortName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
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
			if (KooUtil.isTooLargeString(tAction.getPassword(), 20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("password");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getPostCode())) {
			if (KooUtil.isTooLargeString(tAction.getPostCode(), 10)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("postCode");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getState())) {
			if (KooUtil.isTooLargeString(tAction.getState(), 50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("state");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAddr1())) {
			if (KooUtil.isTooLargeString(tAction.getAddr1(), 80)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("addr1");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAddr2())) {
			if (KooUtil.isTooLargeString(tAction.getAddr2(), 80)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("addr2");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAddr3())) {
			if (KooUtil.isTooLargeString(tAction.getAddr3(), 80)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("addr3");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTelCode())) {
			if (KooUtil.isTooLargeString(tAction.getTelCode(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("telCode");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getTelNo())) {
			if (KooUtil.isTooLargeString(tAction.getTelNo(), 15)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("telNo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getEmail())) {
			if (KooUtil.isTooLargeString(tAction.getEmail(), 50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("email");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getPhoto())) {
			if (KooUtil.isTooLargeString(tAction.getPhoto(), 200)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("photo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getMemo())) {
			if (KooUtil.isTooLargeString(tAction.getMemo(), 30)) {
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

	public List<ErrorInfo> sizeCheck(LocalhostEntity tEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getFullName())) {
			if (KooUtil.isTooLargeString(tEntity.getFullName(), 30)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("fullName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getShortName())) {
			if (KooUtil.isTooLargeString(tEntity.getShortName(), 20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("shortName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
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
			if (KooUtil.isTooLargeString(tEntity.getPassword(), 20)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("password");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getPostCode())) {
			if (KooUtil.isTooLargeString(tEntity.getPostCode(), 10)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("postCode");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getState())) {
			if (KooUtil.isTooLargeString(tEntity.getState(), 50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("state");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getAddr1())) {
			if (KooUtil.isTooLargeString(tEntity.getAddr1(), 80)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("addr1");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getAddr2())) {
			if (KooUtil.isTooLargeString(tEntity.getAddr2(), 80)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("addr2");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getAddr3())) {
			if (KooUtil.isTooLargeString(tEntity.getAddr3(), 80)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("addr3");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getTelCode())) {
			if (KooUtil.isTooLargeString(tEntity.getTelCode(), 5)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("telCode");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getTelNo())) {
			if (KooUtil.isTooLargeString(tEntity.getTelNo(), 15)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("telNo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getEmail())) {
			if (KooUtil.isTooLargeString(tEntity.getEmail(), 50)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("email");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getPhoto())) {
			if (KooUtil.isTooLargeString(tEntity.getPhoto(), 200)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("photo");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getMemo())) {
			if (KooUtil.isTooLargeString(tEntity.getMemo(), 30)) {
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
