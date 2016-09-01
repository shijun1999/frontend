//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.SignupAction;
import com.kootour.mapper.entity.SignupEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

  public class SingleSignupChecker {

	public List <ErrorInfo> nullCheck(SignupAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getAgreeCheck())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("agreeCheck");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
		}

	public List <ErrorInfo> valueCheck(SignupAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
		}

	public List <ErrorInfo> sizeCheck(SignupAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getLastName())) {
		    if (KooUtil.isTooLargeString(tAction.getLastName(),40)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("lastName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getFirstName())) {
		    if (KooUtil.isTooLargeString(tAction.getFirstName(),40)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("firstName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getLoginId())) {
		    if (KooUtil.isTooLargeString(tAction.getLoginId(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("loginId");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getPassword())) {
		    if (KooUtil.isTooLargeString(tAction.getPassword(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("password");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getRePassword())) {
		    if (KooUtil.isTooLargeString(tAction.getRePassword(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("rePassword");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tAction.getAgreeCheck())) {
		    if (KooUtil.isTooLargeString(tAction.getAgreeCheck(),2)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("agreeCheck");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}

	public List <ErrorInfo> sizeCheck(SignupEntity tEntity){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getLastName())) {
		    if (KooUtil.isTooLargeString(tEntity.getLastName(),40)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("lastName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getFirstName())) {
		    if (KooUtil.isTooLargeString(tEntity.getFirstName(),40)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("firstName");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getLoginId())) {
		    if (KooUtil.isTooLargeString(tEntity.getLoginId(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("loginId");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getPassword())) {
		    if (KooUtil.isTooLargeString(tEntity.getPassword(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("password");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getRePassword())) {
		    if (KooUtil.isTooLargeString(tEntity.getRePassword(),100)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("rePassword");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		if (KooUtil.isNotNull(tEntity.getAgreeCheck())) {
		    if (KooUtil.isTooLargeString(tEntity.getAgreeCheck(),2)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("agreeCheck");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}
 }
