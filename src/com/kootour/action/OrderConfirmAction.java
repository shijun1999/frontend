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

import com.kootour.service.OrderConfirmService;
import com.kootour.service.impl.OrderConfirmServiceImpl;
import com.kootour.checker.SingleOrderConfirmChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.OrderConfirmEntity;
import com.kootour.model.OrderConfirmModel;

@Results({@Result(name = "cancel", value = "orderList!load", type = ServletActionRedirectResult.class), @Result(name = "gotonext", value = "orderList!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "orderList!load", type = ServletActionRedirectResult.class)})
public class OrderConfirmAction extends OrderConfirmModel {

	@Autowired(required = false)
	private OrderConfirmService orderConfirmService = new OrderConfirmServiceImpl();
	public String cancel() {
		String rtnStr = "cancel";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderConfirmEntity inOrderConfirmEntity = copyEntityAction2Entity();
		OrderConfirmEntity outOrderConfirmEntity = new OrderConfirmEntity();
		outOrderConfirmEntity = orderConfirmService.cancel(inOrderConfirmEntity, paraMap);

		return rtnStr;
	}

	public String save() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		SingleOrderConfirmChecker tSingleCheck = new SingleOrderConfirmChecker();
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
			OrderConfirmEntity inOrderConfirmEntity = copyEntityAction2Entity();
			OrderConfirmEntity outOrderConfirmEntity = new OrderConfirmEntity();
			outOrderConfirmEntity = orderConfirmService.save(inOrderConfirmEntity, paraMap);

		} else {
			rtnStr = "error";
		}
		return rtnStr;
	}

	public String back() {
		String rtnStr = "gotoback";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderConfirmEntity inOrderConfirmEntity = copyEntityAction2Entity();
		OrderConfirmEntity outOrderConfirmEntity = new OrderConfirmEntity();
		outOrderConfirmEntity = orderConfirmService.back(inOrderConfirmEntity, paraMap);

		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderConfirmEntity inOrderConfirmEntity = copyEntityAction2Entity();
		OrderConfirmEntity outOrderConfirmEntity = new OrderConfirmEntity();
		outOrderConfirmEntity = orderConfirmService.load(inOrderConfirmEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(OrderConfirmEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getCurOrderList() == null) {
			setCurOrderList("");
		} else {
			setCurOrderList(tEntity.getCurOrderList());
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
	public OrderConfirmEntity copyEntityAction2Entity() {
		OrderConfirmEntity tEntity = new OrderConfirmEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(getLangId());
		tEntity.setCurOrderList(getCurOrderList());
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
