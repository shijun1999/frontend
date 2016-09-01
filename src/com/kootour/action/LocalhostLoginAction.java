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

import com.kootour.service.LocalhostLoginService;
import com.kootour.service.impl.LocalhostLoginServiceImpl;
import com.kootour.checker.SingleLocalhostLoginChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.LocalhostLoginEntity;
import com.kootour.model.LocalhostLoginModel;

@Results({@Result(name = "gotonext", value = "tourist!load", type = ServletActionRedirectResult.class),
		@Result(name = "changePassword", value = "changePassword!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoregistration", value = "tourist!load", type = ServletActionRedirectResult.class)})
public class LocalhostLoginAction extends LocalhostLoginModel {

	@Autowired(required = false)
	private LocalhostLoginService localhostLoginService = new LocalhostLoginServiceImpl();
	public String login() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		SingleLocalhostLoginChecker tSingleCheck = new SingleLocalhostLoginChecker();
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
			LocalhostLoginEntity inLocalhostLoginEntity = copyEntityAction2Entity();
			LocalhostLoginEntity outLocalhostLoginEntity = new LocalhostLoginEntity();
			outLocalhostLoginEntity = localhostLoginService.login(inLocalhostLoginEntity, paraMap);

		} else {
			rtnStr = "error";
		}
		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		LocalhostLoginEntity inLocalhostLoginEntity = copyEntityAction2Entity();
		LocalhostLoginEntity outLocalhostLoginEntity = new LocalhostLoginEntity();
		outLocalhostLoginEntity = localhostLoginService.load(inLocalhostLoginEntity, paraMap);

		return rtnStr;
	}

	public String changePassword() {
		String rtnStr = "changePassword";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		LocalhostLoginEntity inLocalhostLoginEntity = copyEntityAction2Entity();
		LocalhostLoginEntity outLocalhostLoginEntity = new LocalhostLoginEntity();
		outLocalhostLoginEntity = localhostLoginService.changePassword(inLocalhostLoginEntity, paraMap);

		return rtnStr;
	}

	public String registration() {
		String rtnStr = "gotoregistration";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		LocalhostLoginEntity inLocalhostLoginEntity = copyEntityAction2Entity();
		LocalhostLoginEntity outLocalhostLoginEntity = new LocalhostLoginEntity();
		outLocalhostLoginEntity = localhostLoginService.registration(inLocalhostLoginEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(LocalhostLoginEntity tEntity) {
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
	public LocalhostLoginEntity copyEntityAction2Entity() {
		LocalhostLoginEntity tEntity = new LocalhostLoginEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(getLangId());
		tEntity.setTouristIdentiNo(getTouristIdentiNo());
		tEntity.setLoginType(getLoginType());
		tEntity.setLoginId(getLoginId());
		tEntity.setPassword(getPassword());
		if (KooUtil.isNotDate(getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
