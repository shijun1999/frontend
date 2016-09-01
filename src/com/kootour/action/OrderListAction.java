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

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.OrderListEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.model.OrderListModel;
import com.kootour.model.UserOrderModel;
import com.kootour.service.OrderListService;
import com.kootour.service.impl.OrderListServiceImpl;

@Results({ @Result(name = "cancel", value = "login!loginInit", type = ServletActionRedirectResult.class),
		@Result(name = "goto_orderconfirm", value = "orderConfirm!load", type = ServletActionRedirectResult.class),
		@Result(name = "goto_reservconfirm", value = "reservConfirm!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "login!loginInit", type = ServletActionRedirectResult.class),
		@Result(name = "goto_reviewconfirm", value = "reviewConfirm!load", type = ServletActionRedirectResult.class),
		@Result(name = "goto_cousesave", value = "couseRegi!load", type = ServletActionRedirectResult.class),
		@Result(name = "goto_orderdetail", value = "orderDetail!load", type = ServletActionRedirectResult.class) })
public class OrderListAction extends OrderListModel {

	@Autowired(required = false)
	private OrderListService orderListService = new OrderListServiceImpl();

	public String cancel() {
		String rtnStr = "cancel";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderListEntity inOrderListEntity = copyEntityAction2Entity();
		OrderListEntity outOrderListEntity = new OrderListEntity();
		outOrderListEntity = orderListService.cancel(inOrderListEntity, paraMap);

		return rtnStr;
	}

	public String orderConfirm() {
		String rtnStr = "goto_orderconfirm";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderListEntity inOrderListEntity = copyEntityAction2Entity();
		OrderListEntity outOrderListEntity = new OrderListEntity();
		outOrderListEntity = orderListService.orderConfirm(inOrderListEntity, paraMap);

		return rtnStr;
	}

	public String reservConfirm() {
		String rtnStr = "goto_reservconfirm";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderListEntity inOrderListEntity = copyEntityAction2Entity();
		OrderListEntity outOrderListEntity = new OrderListEntity();
		outOrderListEntity = orderListService.reservConfirm(inOrderListEntity, paraMap);

		return rtnStr;
	}

	public String back() {
		String rtnStr = "gotoback";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderListEntity inOrderListEntity = copyEntityAction2Entity();
		OrderListEntity outOrderListEntity = new OrderListEntity();
		outOrderListEntity = orderListService.back(inOrderListEntity, paraMap);

		return rtnStr;
	}

	public String reviewConfirm() {
		String rtnStr = "goto_reviewconfirm";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderListEntity inOrderListEntity = copyEntityAction2Entity();
		OrderListEntity outOrderListEntity = new OrderListEntity();
		outOrderListEntity = orderListService.reviewConfirm(inOrderListEntity, paraMap);

		return rtnStr;
	}

	public String couseRegi() {
		String rtnStr = "goto_cousesave";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderListEntity inOrderListEntity = copyEntityAction2Entity();
		OrderListEntity outOrderListEntity = new OrderListEntity();
		outOrderListEntity = orderListService.couseRegi(inOrderListEntity, paraMap);

		return rtnStr;
	}

	public String orderDetail() {
		String rtnStr = "goto_orderdetail";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderListEntity inOrderListEntity = copyEntityAction2Entity();
		OrderListEntity outOrderListEntity = new OrderListEntity();
		outOrderListEntity = orderListService.orderDetail(inOrderListEntity, paraMap);

		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		OrderListEntity inOrderListEntity = copyEntityAction2Entity();
		OrderListEntity outOrderListEntity = new OrderListEntity();
		outOrderListEntity = orderListService.load(inOrderListEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(OrderListEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		List<UserOrderModel> tmpUserOrderActionList = new ArrayList<UserOrderModel>();
		for (UserOrderEntity tmpVal : tEntity.getUserOrderList()) {
			UserOrderAction tmpUserOrderEntityAction = new UserOrderAction();
			tmpUserOrderEntityAction.copyEntity2EntityAction(tmpVal);
			tmpUserOrderActionList.add(tmpUserOrderEntityAction);
		}
		setUserOrderList(tmpUserOrderActionList);
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
		if (tEntity.getDummy1() == null) {
			setDummy1("");
		} else {
			setDummy1(KooUtil.date2String(tEntity.getDummy1(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (tEntity.getDummy2() == null) {
			setDummy2("");
		} else {
			setDummy2(KooUtil.date2String(tEntity.getDummy2(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (tEntity.getDummy3() == null) {
			setDummy3("");
		} else {
			setDummy3(KooUtil.date2String(tEntity.getDummy3(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (tEntity.getDummy4() == null) {
			setDummy4("");
		} else {
			setDummy4(KooUtil.date2String(tEntity.getDummy4(), KooConst.ST_yyyyMMddHHmmss));
		}

	}

	public OrderListEntity copyEntityAction2Entity() {
		OrderListEntity tEntity = new OrderListEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(getLangId());
		List<UserOrderEntity> tmpUserOrderEntityList = new ArrayList<UserOrderEntity>();
		for (UserOrderModel tmpVal : getUserOrderList()) {
			UserOrderEntity tmpUserOrderEntity = new UserOrderEntity();
			UserOrderAction tmpAction = (UserOrderAction) tmpVal;
			tmpUserOrderEntity = tmpAction.copyEntityAction2Entity((UserOrderModel)tmpVal);
			tmpUserOrderEntityList.add(tmpUserOrderEntity);
		}
		tEntity.setUserOrderList(tmpUserOrderEntityList);
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
		if (KooUtil.isNotDate(getDummy1())) {
			tEntity.setDummy1(null);
		} else {
			tEntity.setDummy1(KooUtil.string2Date(getDummy1(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(getDummy2())) {
			tEntity.setDummy2(null);
		} else {
			tEntity.setDummy2(KooUtil.string2Date(getDummy2(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(getDummy3())) {
			tEntity.setDummy3(null);
		} else {
			tEntity.setDummy3(KooUtil.string2Date(getDummy3(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(getDummy4())) {
			tEntity.setDummy4(null);
		} else {
			tEntity.setDummy4(KooUtil.string2Date(getDummy4(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
