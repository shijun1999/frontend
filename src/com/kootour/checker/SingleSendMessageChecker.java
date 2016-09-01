//Auto Generated 

package com.kootour.checker;

import java.util.ArrayList;
import java.util.List;

import com.kootour.action.SendMessageAction;
import com.kootour.mapper.entity.SendMessageEntity;
import com.kootour.common.KooConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooUtil;

  public class SingleSendMessageChecker {

	public List <ErrorInfo> nullCheck(SendMessageAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (!KooUtil.isNotNull(tAction.getMessageText())){
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("messageText");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_001);
			tList.add(tErrorInfo);
		}
		return tList;
		}

	public List <ErrorInfo> valueCheck(SendMessageAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		return tList;
		}

	public List <ErrorInfo> sizeCheck(SendMessageAction tAction){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tAction.getMessageText())) {
		    if (KooUtil.isTooLargeString(tAction.getMessageText(),300)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("messageText");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}

	public List <ErrorInfo> sizeCheck(SendMessageEntity tEntity){
		List <ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (KooUtil.isNotNull(tEntity.getMessageText())) {
		    if (KooUtil.isTooLargeString(tEntity.getMessageText(),300)) {
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName("messageText");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setDispOrder(2);
				tErrorInfo.setErrMsg(KooConst.ERR_MSG_006);
				tList.add(tErrorInfo);
			}
		}
		return tList;
		}
 }
