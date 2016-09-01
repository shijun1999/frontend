//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.ErrInfoConst;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.ChangePasswordEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.model.QuicklySignUpModel;
import com.kootour.service.QuicklySignUpService;
import com.kootour.service.TouristService;
import com.kootour.service.impl.QuicklySignUpServiceImpl;
import com.kootour.service.impl.TouristServiceImpl;

@Results({@Result(name = "gotonext", value = "cityCourseList!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "cityCourseList!load", type = ServletActionRedirectResult.class)})
public class QuicklySignUpAction extends QuicklySignUpModel {
//	private static Logger logger = Logger.getLogger(JsonServiceChangePasswordAction.class);

	@Autowired(required = false)
	private QuicklySignUpService quicklySignUpService = new QuicklySignUpServiceImpl();

	public String clear() {
		String rtnStr = "input";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		TouristEntity inTouristEntity = copyEntityAction2Entity();
		TouristEntity outTouristEntity = new TouristEntity();
		outTouristEntity = quicklySignUpService.clear(inTouristEntity, paraMap);

		return rtnStr;
	}

	public String save() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();

		return rtnStr;
	}

	public String back() {
		String rtnStr = "gotoback";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		TouristEntity inTouristEntity = copyEntityAction2Entity();
		TouristEntity outTouristEntity = new TouristEntity();
		outTouristEntity = quicklySignUpService.back(inTouristEntity, paraMap);

		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();

		TouristEntity inTouristEntity = copyEntityAction2Entity();
		TouristEntity outTouristEntity = new TouristEntity();
		outTouristEntity = quicklySignUpService.load(inTouristEntity, paraMap);
		return rtnStr;
	}

	public String facebooklogin() {
		String rtnStr = "true";
		try {
			TouristEntity inTouristEntity = copyEntityAction2Entity(); 

			Map<String, Object> paraMap = new HashMap<String, Object>();
			TouristEntity outTouristEntity = new TouristEntity();
			outTouristEntity = quicklySignUpService.save(inTouristEntity, paraMap);

			byte[] jsonBytes = rtnStr.getBytes("utf-8");

			getResponse().setContentLength(jsonBytes.length);
			getResponse().getOutputStream().write(jsonBytes);
			getResponse().getOutputStream().flush();
			getResponse().getOutputStream().close();

		} catch (Exception e) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName("QuicklySignUpAction");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(ErrInfoConst.ST_KOOE00001);
			makeErrorOne(tErrorInfo);
//			logger.error(getLstErrorMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void copyEntity2EntityAction(TouristEntity tEntity) {
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
		if (tEntity.getShortName() == null) {
			setShortName("");
		} else {
			setShortName(tEntity.getShortName());
		}
		if (tEntity.getSex() == null) {
			setSex("");
		} else {
			setSex(tEntity.getSex());
		}
		if (tEntity.getBirthday() == null) {
			setBirthday("");
		} else {
			setBirthday(String.valueOf(tEntity.getBirthday()));
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
		if (tEntity.getTelCode() == null) {
			setTelCode("");
		} else {
			setTelCode(tEntity.getTelCode());
		}
		if (tEntity.getTelNo() == null) {
			setTelNo("");
		} else {
			setTelNo(tEntity.getTelNo());
		}
		if (tEntity.getEmail() == null) {
			setEmail("");
		} else {
			setEmail(tEntity.getEmail());
		}
//		if (tEntity.getMemo() == null) {
//			setMemo("");
//		} else {
//			setMemo(tEntity.getMemo());
//		}
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

	public TouristEntity copyEntityAction2Entity() {
		TouristEntity tEntity = new TouristEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(getLangId());
		tEntity.setTouristIdentiNo(getTouristIdentiNo());
		tEntity.setLastName(getLastName());
		tEntity.setFirstName(getFirstName());
		tEntity.setShortName(getShortName());
		tEntity.setSex(getSex());
		if (KooUtil.isNotInt(getBirthday())) {
			tEntity.setBirthday(null);
		} else {
			tEntity.setBirthday(Integer.parseInt(getBirthday()));
		}
		tEntity.setLoginType(getLoginType());
		tEntity.setLoginId(getLoginId());
		tEntity.setPassword(getPassword());
		tEntity.setTelCode(getTelCode());
		tEntity.setTelNo(getTelNo());
		tEntity.setEmail(getEmail());
//		tEntity.setMemo(getMemo());
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
