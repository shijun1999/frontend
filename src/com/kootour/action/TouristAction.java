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

import com.kootour.mapper.paramentity.TouristParamEntity;
import com.kootour.model.TouristModel;
import com.kootour.service.TouristService;
import com.kootour.service.impl.TouristServiceImpl;
import com.kootour.checker.SingleTouristChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.SessionInfo;
import com.kootour.mapper.entity.TouristEntity;

@Results({ @Result(name = "gotonext", value = "cityCourseList!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "cityCourseList!load", type = ServletActionRedirectResult.class) })
public class TouristAction extends TouristModel {

	@Autowired(required = false)
	private TouristService touristService = new TouristServiceImpl();

//	public String clear() {
//		String rtnStr = "input";
//		Map<String, Object> paraMap = new HashMap<String, Object>();
//		TouristEntity inTouristEntity = copyEntityAction2Entity();
//		TouristEntity outTouristEntity = new TouristEntity();
//		outTouristEntity = touristService.clear(inTouristEntity, paraMap);
//
//		return rtnStr;
//	}

	public String save() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		SingleTouristChecker tSingleCheck = new SingleTouristChecker();
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
			TouristEntity inTouristEntity = copyEntityAction2Entity((TouristModel)this);
			TouristEntity outTouristEntity = new TouristEntity();
			inTouristEntity.setTouristIdentiNo(inTouristEntity.getCurTouristIdentiNo());
			outTouristEntity = touristService.save(inTouristEntity, paraMap);
			SessionInfo retVal = this.getSessionInfo();
			retVal.setCurTouristIdentiNo(outTouristEntity.getTouristIdentiNo());
			retVal.setCurTouristName(outTouristEntity.getFirstName());
			retVal.setCurTouristPicture((String)paraMap.get(KooConst.ST_TOURIST_PICTURE));
			this.setSessionInfo(retVal);
			copyEntity2EntityAction(outTouristEntity);
			this.setCurTouristIdentiNo(outTouristEntity.getTouristIdentiNo());
			this.setCurTouristName(outTouristEntity.getFirstName());
			this.setCurTouristPicture((String)paraMap.get(KooConst.ST_TOURIST_PICTURE));
		} else {
			makeErrorList(this.getErrInfoList());
			rtnStr = "error";
		}
		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();

		TouristEntity inTouristEntity = copyEntityAction2Entity((TouristModel)this);
		inTouristEntity.setLangId(getSessionInfo().getCurLangId());

		TouristEntity outTouristEntity = new TouristEntity();
		outTouristEntity = touristService.load(inTouristEntity, paraMap);
		copyEntity2EntityAction(outTouristEntity);
		List<String> yearListDisp = new ArrayList<>();
		yearListDisp.add("");
		for (int i = 1950; i < 2010; i++) {
			yearListDisp.add("" + i);
		}
		this.setYearListDisp(yearListDisp);

		return rtnStr;
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
		if (tEntity.getPicture() == null) {
			setPicture("");
		} else {
			setPicture(tEntity.getPicture());
		}
		if (tEntity.getLocation() == null) {
			setLocation("");
		} else {
			setLocation(tEntity.getLocation());
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

	public TouristEntity copyEntityAction2Entity(TouristModel tTouristModel) {
		TouristEntity tEntity = new TouristEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tTouristModel.getLangId());
		tEntity.setTouristIdentiNo(tTouristModel.getTouristIdentiNo());
		tEntity.setLastName(tTouristModel.getLastName());
		tEntity.setFirstName(tTouristModel.getFirstName());
		tEntity.setShortName(tTouristModel.getShortName());
		tEntity.setSex(tTouristModel.getSex());
		if (KooUtil.isNotInt(tTouristModel.getBirthday())) {
			tEntity.setBirthday(null);
		} else {
			tEntity.setBirthday(Integer.parseInt(tTouristModel.getBirthday()));
		}
		tEntity.setLoginType(tTouristModel.getLoginType());
		tEntity.setLoginId(tTouristModel.getLoginId());
		tEntity.setPassword(tTouristModel.getPassword());
		tEntity.setTelCode(tTouristModel.getTelCode());
		tEntity.setTelNo(tTouristModel.getTelNo());
		tEntity.setEmail(tTouristModel.getEmail());
		tEntity.setPicture(tTouristModel.getPicture());
		tEntity.setLocation(tTouristModel.getLocation());
		if (KooUtil.isNotDate(tTouristModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tTouristModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tTouristModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tTouristModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
