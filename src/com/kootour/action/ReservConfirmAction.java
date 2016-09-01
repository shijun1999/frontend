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

import com.kootour.service.ReservConfirmService;
import com.kootour.service.impl.ReservConfirmServiceImpl;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.ReservConfirmEntity;
import com.kootour.model.ReservConfirmModel;

@Results({@Result(name = "okexit", value = "orderList!load", type = ServletActionRedirectResult.class), @Result(name = "gotoback", value = "orderList!load", type = ServletActionRedirectResult.class),
		@Result(name = "goto_orderdetail", value = "userOrder!load", type = ServletActionRedirectResult.class)})
public class ReservConfirmAction extends ReservConfirmModel {

	@Autowired(required = false)
	private ReservConfirmService reservConfirmService = new ReservConfirmServiceImpl();
	public String okExit() {
		String rtnStr = "okexit";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		ReservConfirmEntity inReservConfirmEntity = copyEntityAction2Entity();
		ReservConfirmEntity outReservConfirmEntity = new ReservConfirmEntity();
		outReservConfirmEntity = reservConfirmService.okExit(inReservConfirmEntity, paraMap);

		return rtnStr;
	}

	public String back() {
		String rtnStr = "gotoback";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		ReservConfirmEntity inReservConfirmEntity = copyEntityAction2Entity();
		ReservConfirmEntity outReservConfirmEntity = new ReservConfirmEntity();
		outReservConfirmEntity = reservConfirmService.back(inReservConfirmEntity, paraMap);

		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		ReservConfirmEntity inReservConfirmEntity = copyEntityAction2Entity();
		ReservConfirmEntity outReservConfirmEntity = new ReservConfirmEntity();
		outReservConfirmEntity = reservConfirmService.load(inReservConfirmEntity, paraMap);

		return rtnStr;
	}

	public String orderDetail() {
		String rtnStr = "goto_orderdetail";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		ReservConfirmEntity inReservConfirmEntity = copyEntityAction2Entity();
		ReservConfirmEntity outReservConfirmEntity = new ReservConfirmEntity();
		outReservConfirmEntity = reservConfirmService.orderDetail(inReservConfirmEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(ReservConfirmEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getReservConfirm() == null) {
			setReservConfirm("");
		} else {
			setReservConfirm(tEntity.getReservConfirm());
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
	public ReservConfirmEntity copyEntityAction2Entity() {
		ReservConfirmEntity tEntity = new ReservConfirmEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(getLangId());
		tEntity.setReservConfirm(getReservConfirm());
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
