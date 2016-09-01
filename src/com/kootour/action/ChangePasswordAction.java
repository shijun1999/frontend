//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.service.ChangePasswordService;
import com.kootour.service.impl.ChangePasswordServiceImpl;
import com.kootour.checker.SingleChangePasswordChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.ChangePasswordEntity;
import com.kootour.model.ChangePasswordModel;

@Results({ @Result(name = "changePassword", value = "tourist!load", type = ServletActionRedirectResult.class) })
public class ChangePasswordAction extends ChangePasswordModel {

	@Autowired(required = false)
	private ChangePasswordService changePasswordService = new ChangePasswordServiceImpl();

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		ChangePasswordEntity inChangePasswordEntity = copyEntityAction2Entity((ChangePasswordModel)this);
		ChangePasswordEntity outChangePasswordEntity = new ChangePasswordEntity();
		outChangePasswordEntity = changePasswordService.load(inChangePasswordEntity, paraMap);
		this.setChangeOK(KooConst.ST_FLG_NG);
		return rtnStr;
	}

	public String changePassword() {
		String rtnStr = "changePassword";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		SingleChangePasswordChecker tSingleCheck = new SingleChangePasswordChecker();
		tList = tSingleCheck.nullCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		tList = tSingleCheck.valueCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		tList = tSingleCheck.sizeCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		if (getErrInfoList().isEmpty()) {
			ChangePasswordEntity inChangePasswordEntity = copyEntityAction2Entity((ChangePasswordModel)this);
			inChangePasswordEntity.setTouristIdentiNo(inChangePasswordEntity.getCurTouristIdentiNo());
			ChangePasswordEntity outChangePasswordEntity = new ChangePasswordEntity();
			outChangePasswordEntity = changePasswordService.changePassword(inChangePasswordEntity, paraMap);
			this.setChangeOK(KooConst.ST_FLG_OK);

		} else {
			rtnStr = "";
		}
		return rtnStr;
	}

	public void copyEntity2EntityAction(ChangePasswordEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);

		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(tEntity.getTouristIdentiNo());
		}
		if (tEntity.getLoginId() == null) {
			setLoginId("");
		} else {
			setLoginId(tEntity.getLoginId());
		}
		if (tEntity.getPassword() == null) {
			setPassword("");
		} else {
			setPassword(tEntity.getPassword());
		}
		if (tEntity.getNewPassword() == null) {
			setNewPassword("");
		} else {
			setNewPassword(tEntity.getNewPassword());
		}
		if (tEntity.getConfirmPassword() == null) {
			setConfirmPassword("");
		} else {
			setConfirmPassword(tEntity.getConfirmPassword());
		}

	}

	public ChangePasswordEntity copyEntityAction2Entity(ChangePasswordModel tChangePasswordModel) {
		ChangePasswordEntity tEntity = new ChangePasswordEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tChangePasswordModel.getLangId());
		tEntity.setTouristIdentiNo(tChangePasswordModel.getTouristIdentiNo());
		tEntity.setLoginId(tChangePasswordModel.getLoginId());
		tEntity.setPassword(tChangePasswordModel.getPassword());
		tEntity.setNewPassword(tChangePasswordModel.getNewPassword());
		tEntity.setConfirmPassword(tChangePasswordModel.getConfirmPassword());
		return tEntity;

	}
}
