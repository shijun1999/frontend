//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.checker.SingleSignupChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.SessionInfo;
import com.kootour.mapper.entity.SignupEntity;
import com.kootour.model.SignupModel;
import com.kootour.service.SignupService;
import com.kootour.service.impl.SignupServiceImpl;

@Results({ 
	@Result(name = "gotonext", value = "welcome!load", type = ServletActionRedirectResult.class)
})

public class SignupAction extends SignupModel {

	@Autowired(required = false)
	private SignupService signupService = new SignupServiceImpl();

	public String login() {
		String rtnStr = "";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		SignupEntity inSignupEntity = copyEntityAction2Entity((SignupModel)this);
		SignupEntity outSignupEntity = new SignupEntity();
		outSignupEntity = signupService.login(inSignupEntity, paraMap);

		return rtnStr;
	}

	public String signup() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		SingleSignupChecker tSingleCheck = new SingleSignupChecker();
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
			SignupEntity inSignupEntity = copyEntityAction2Entity((SignupModel)this);
			SignupEntity outSignupEntity = new SignupEntity();
			outSignupEntity = signupService.signup(inSignupEntity, paraMap);
			if (outSignupEntity.getResultStatus() == KooConst.INT_OK) {
				// set Login tourist IdentiNo
				SessionInfo retVal = this.getSessionInfo();
				retVal.setCurTouristIdentiNo(outSignupEntity.getTouristIdentiNo());
				this.setSessionInfo(retVal);
			} else {
				rtnStr = "Loginerror";
			}

		} else {
			makeErrorList(this.getErrInfoList());
			rtnStr = "error";
		}
		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		SignupEntity inSignupEntity = copyEntityAction2Entity((SignupModel)this);
		SignupEntity outSignupEntity = new SignupEntity();
		outSignupEntity = signupService.load(inSignupEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(SignupEntity tEntity) {
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
		if (tEntity.getLastName() == null) {
			setLastName("");
		} else {
			setLastName(tEntity.getLastName());
		}
		if (tEntity.getFirstName() == null) {
			setFirstName("");
		} else {
			setFirstName(tEntity.getFirstName());
		}
		if (tEntity.getLoginType() == null) {
			setLoginType("");
		} else {
			setLoginType(tEntity.getLoginType());
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
		if (tEntity.getRePassword() == null) {
			setRePassword("");
		} else {
			setRePassword(tEntity.getRePassword());
		}
		if (tEntity.getAgreeCheck() == null) {
			setAgreeCheck("");
		} else {
			setAgreeCheck(tEntity.getAgreeCheck());
		}
		if (tEntity.getCreateTime() == null) {
			setCreateTime("");
		} else {
			setCreateTime(KooUtil.date2String(tEntity.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (tEntity.getModifyTime() == null) {
			setModifyTime("");
		} else {
			setModifyTime(KooUtil.date2String(tEntity.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}

	}

	public SignupEntity copyEntityAction2Entity(SignupModel tSignupModel) {
		SignupEntity tEntity = new SignupEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tSignupModel.getLangId());
		tEntity.setTouristIdentiNo(tSignupModel.getTouristIdentiNo());
		tEntity.setLastName(tSignupModel.getLastName());
		tEntity.setFirstName(tSignupModel.getFirstName());
		tEntity.setLoginType(tSignupModel.getLoginType());
		tEntity.setLoginId(tSignupModel.getLoginId());
		tEntity.setPassword(tSignupModel.getPassword());
		tEntity.setRePassword(tSignupModel.getRePassword());
		tEntity.setAgreeCheck(tSignupModel.getAgreeCheck());
		if (KooUtil.isNotDate(tSignupModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tSignupModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tSignupModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tSignupModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
