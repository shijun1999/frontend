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

import com.kootour.service.TouristLoginService;
import com.kootour.service.impl.TouristLoginServiceImpl;
import com.kootour.checker.SingleTouristLoginChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.SessionInfo;
import com.kootour.mapper.entity.TouristLoginEntity;
import com.kootour.model.TouristLoginModel;

@Results({ @Result(name = "gotonext", value = "stateCourseList!load", type = ServletActionRedirectResult.class),
		@Result(name = "changePassword", value = "changePassword!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoregistration", value = "tourist!load", type = ServletActionRedirectResult.class) })
public class TouristLoginAction extends TouristLoginModel {

	@Autowired(required = false)
	private TouristLoginService touristLoginService = new TouristLoginServiceImpl();

	public String login() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		SingleTouristLoginChecker tSingleCheck = new SingleTouristLoginChecker();
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
			TouristLoginEntity inTouristLoginEntity = copyEntityAction2Entity((TouristLoginModel)this);
			TouristLoginEntity outTouristLoginEntity = new TouristLoginEntity();
			outTouristLoginEntity = touristLoginService.login(inTouristLoginEntity, paraMap);
			if (outTouristLoginEntity.getResultStatus() == KooConst.INT_OK) {
				this.setCurTouristIdentiNo(outTouristLoginEntity.getTouristIdentiNo());
				this.setCurTouristName((String)paraMap.get(KooConst.ST_TOURIST_NAME));
				this.setCurTouristPicture((String)paraMap.get(KooConst.ST_TOURIST_PICTURE));
				// set Login tourist IdentiNo
				SessionInfo retVal = this.getSessionInfo();
				retVal.setCurTouristIdentiNo(outTouristLoginEntity.getTouristIdentiNo());
				retVal.setCurTouristName((String)paraMap.get(KooConst.ST_TOURIST_NAME));
				retVal.setCurTouristPicture((String)paraMap.get(KooConst.ST_TOURIST_PICTURE));
				this.setSessionInfo(retVal);
			} else {
				rtnStr = "Loginerror";
			}

		} else {
			rtnStr = "Loginerror";
			makeErrorList(this.getErrInfoList());

		}
		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		TouristLoginEntity inTouristLoginEntity = copyEntityAction2Entity((TouristLoginModel)this);
		TouristLoginEntity outTouristLoginEntity = new TouristLoginEntity();
		outTouristLoginEntity = touristLoginService.load(inTouristLoginEntity, paraMap);

		return rtnStr;
	}

	public String changePassword() {
		String rtnStr = "changePassword";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		TouristLoginEntity inTouristLoginEntity = copyEntityAction2Entity((TouristLoginModel)this);
		TouristLoginEntity outTouristLoginEntity = new TouristLoginEntity();
		outTouristLoginEntity = touristLoginService.changePassword(inTouristLoginEntity, paraMap);

		return rtnStr;
	}

	public String registration() {
		String rtnStr = "gotoregistration";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		TouristLoginEntity inTouristLoginEntity = copyEntityAction2Entity((TouristLoginModel)this);
		TouristLoginEntity outTouristLoginEntity = new TouristLoginEntity();
		outTouristLoginEntity = touristLoginService.registration(inTouristLoginEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(TouristLoginEntity tEntity) {
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
		if (tEntity.getSelectLangId() == null) {
			setSelectLangId("");
		} else {
			setSelectLangId(tEntity.getSelectLangId());
		}

	}

	public TouristLoginEntity copyEntityAction2Entity(TouristLoginModel tTouristLoginModel) {
		TouristLoginEntity tEntity = new TouristLoginEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tTouristLoginModel.getLangId());
		tEntity.setTouristIdentiNo(tTouristLoginModel.getTouristIdentiNo());
		tEntity.setLoginType(tTouristLoginModel.getLoginType());
		tEntity.setLoginId(tTouristLoginModel.getLoginId());
		tEntity.setPassword(tTouristLoginModel.getPassword());
		if (KooUtil.isNotDate(tTouristLoginModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tTouristLoginModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tTouristLoginModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tTouristLoginModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		tEntity.setSelectLangId(tTouristLoginModel.getSelectLangId());
		return tEntity;

	}
}
