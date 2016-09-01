//Auto Generated 

package com.kootour.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.config.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.WelcomeEntity;
import com.kootour.model.WelcomeModel;
import com.kootour.service.WelcomeService;
import com.kootour.service.impl.WelcomeServiceImpl;

@Results({})
public class WelcomeAction extends WelcomeModel {

	@Autowired(required = false)
	private WelcomeService welcomeService = new WelcomeServiceImpl();

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		WelcomeEntity inWelcomeEntity = copyEntityAction2Entity();
		WelcomeEntity outWelcomeEntity = new WelcomeEntity();
		outWelcomeEntity = welcomeService.load(inWelcomeEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(WelcomeEntity tEntity) {
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

	public WelcomeEntity copyEntityAction2Entity() {
		WelcomeEntity tEntity = new WelcomeEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(getLangId());
		tEntity.setTouristIdentiNo(getTouristIdentiNo());
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
