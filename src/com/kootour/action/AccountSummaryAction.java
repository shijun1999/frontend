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

import com.kootour.service.AccountSummaryService;
import com.kootour.service.impl.AccountSummaryServiceImpl;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.AccountSummaryEntity;
import com.kootour.mapper.entity.WishDetailEntity;
import com.kootour.model.AccountSummaryModel;
import com.kootour.model.UserOrderExtraOptionModel;
import com.kootour.model.UserOrderModel;
import com.kootour.model.WishDetailModel;
import com.kootour.mapper.entity.UserOrderEntity;

@Results({ @Result(name = "editprofile", value = "courseComment!load", type = ServletActionRedirectResult.class),
		@Result(name = "Invite", value = "courseComment!load", type = ServletActionRedirectResult.class) })
public class AccountSummaryAction extends AccountSummaryModel {

	@Autowired(required = false)
	private AccountSummaryService accountSummaryService = new AccountSummaryServiceImpl();


	public String load() {
		String rtnStr = "success";
		setLangId(getSessionInfo().getCurLangId());
		Map<String, Object> sessionParaMap = getSessionInfo().getParaMap();

		Map<String, Object> paraMap = new HashMap<String, Object>();
		AccountSummaryEntity inAccountSummaryEntity = copyEntityAction2Entity((AccountSummaryModel)this);
		inAccountSummaryEntity.setTouristIdentiNo(this.getCurTouristIdentiNo());
		paraMap.put(KooConst.ST_SYSDATE, this.getCurDate());
		AccountSummaryEntity outAccountSummaryEntity = new AccountSummaryEntity();
		outAccountSummaryEntity = accountSummaryService.load(inAccountSummaryEntity, paraMap);
		copyEntity2EntityAction(outAccountSummaryEntity);
		formatEntityAction();
		return rtnStr;
	}


	public void copyEntity2EntityAction(AccountSummaryEntity tEntity) {
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
		List<WishDetailModel> tmpWishDetailActionList1 = new ArrayList<WishDetailModel>();
		for (WishDetailEntity tmpVal : tEntity.getWishDetailListDisp()) {
			WishDetailAction tmpWishDetailListDisp = new WishDetailAction();
			tmpWishDetailListDisp.copyEntity2EntityAction(tmpVal);
			tmpWishDetailActionList1.add(tmpWishDetailListDisp);
		}
		setWishDetailListDisp(tmpWishDetailActionList1);
		List<UserOrderModel> tmpUserOrderActionList2 = new ArrayList<UserOrderModel>();
		for (UserOrderEntity tmpVal : tEntity.getUserOrderList()) {
			UserOrderAction tmpUserOrderList = new UserOrderAction();
			tmpUserOrderList.copyEntity2EntityAction(tmpVal);
			tmpUserOrderActionList2.add(tmpUserOrderList);
		}
		setUserOrderList(tmpUserOrderActionList2);
		if (tEntity.getKootourPoint() == null) {
			setKootourPoint("");
		} else {
			setKootourPoint(String.valueOf(tEntity.getKootourPoint()));
		}
		if (tEntity.getTouristIcon() == null) {
			setTouristIcon("");
		} else {
			setTouristIcon(tEntity.getTouristIcon());
		}
		if (tEntity.getEmailOkFlag() == null) {
			setEmailOkFlag("");
		} else {
			setEmailOkFlag(tEntity.getEmailOkFlag());
		}
		if (tEntity.getPhoneOkFlg() == null) {
			setPhoneOkFlg("");
		} else {
			setPhoneOkFlg(tEntity.getPhoneOkFlg());
		}

		if (tEntity.getTouristName() == null) {
			setTouristName("");
		} else {
			setTouristName(tEntity.getTouristName());
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

	public AccountSummaryEntity copyEntityAction2Entity(AccountSummaryModel tAccountSummaryModel) {
		AccountSummaryEntity tEntity = new AccountSummaryEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tAccountSummaryModel.getLangId());
		tEntity.setTouristIdentiNo(tAccountSummaryModel.getTouristIdentiNo());
		List<WishDetailEntity> tmpWishDetailEntityList1 = new ArrayList<WishDetailEntity>();
		for (WishDetailModel tmpVal : tAccountSummaryModel.getWishDetailListDisp()) {
			WishDetailEntity tmpWishDetail = new WishDetailEntity();
			WishDetailAction tmpAction = (WishDetailAction) tmpVal;
			tmpWishDetail = tmpAction.copyEntityAction2Entity((WishDetailModel) tmpVal);
			tmpWishDetailEntityList1.add(tmpWishDetail);
		}
		tEntity.setWishDetailListDisp(tmpWishDetailEntityList1);
		List<UserOrderEntity> tmpUserOrderEntityList2 = new ArrayList<UserOrderEntity>();
		for (UserOrderModel tmpVal : tAccountSummaryModel.getUserOrderList()) {
			UserOrderEntity tmpUserOrder = new UserOrderEntity();
			UserOrderAction tmpAction = (UserOrderAction) tmpVal;
			tmpUserOrder = tmpAction.copyEntityAction2Entity((UserOrderModel) tmpVal);
			tmpUserOrderEntityList2.add(tmpUserOrder);
		}
		tEntity.setUserOrderList(tmpUserOrderEntityList2);
		if (KooUtil.isNotInt(tAccountSummaryModel.getKootourPoint())) {
			tEntity.setKootourPoint(null);
		} else {
			tEntity.setKootourPoint(Integer.parseInt(tAccountSummaryModel.getKootourPoint()));
		}
		tEntity.setTouristIcon(tAccountSummaryModel.getTouristIcon());
		tEntity.setEmailOkFlag(tAccountSummaryModel.getEmailOkFlag());
		tEntity.setPhoneOkFlg(tAccountSummaryModel.getPhoneOkFlg());
		tEntity.setTouristName(tAccountSummaryModel.getTouristName());

		if (KooUtil.isNotDate(tAccountSummaryModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tAccountSummaryModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tAccountSummaryModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tAccountSummaryModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}

	public void formatEntityAction() {

		List<WishDetailModel> tmpWishDetailActionList1 = new ArrayList<WishDetailModel>();
		for (WishDetailModel tmpVal : this.getWishDetailListDisp()) {
			if (tmpVal.getDiscountPrice().equals("") || tmpVal.getDiscountPrice().equals(tmpVal.getPrice())) {
				tmpVal.setDiscountPrice(KooUtil.formatMoney(tmpVal.getUnitName(), tmpVal.getPrice()));
				tmpVal.setPrice("");
			} else {
				tmpVal.setPrice(KooUtil.formatMoney(tmpVal.getUnitName(), tmpVal.getPrice()));
				tmpVal.setDiscountPrice(KooUtil.formatMoney(tmpVal.getUnitName(), tmpVal.getDiscountPrice()));
			}
			tmpVal.setPersonOrGroupText(KooUtil.formatPersonOrGroup(tmpVal.getPersonOrGroupText()));

			tmpWishDetailActionList1.add(tmpVal);
		}
		this.setWishDetailListDisp(tmpWishDetailActionList1);

		List<UserOrderModel> tmpUserOrderList = new ArrayList<>();
		for (UserOrderModel tmpVal : this.getUserOrderList()) {
			tmpVal.setUnitName("$");
			tmpVal.setOrderDate(KooUtil.formatDate(tmpVal.getOrderDate()));
			tmpVal.setTaxVal(KooUtil.formatPercentage(tmpVal.getTaxVal()));
			tmpVal.setPaidMoney(KooUtil.formatMoney(tmpVal.getUnitName(), tmpVal.getPaidMoney()));
			tmpVal.setDiscountMoney(KooUtil.formatMoney(tmpVal.getUnitName(), tmpVal.getDiscountMoney()));
			tmpVal.setTotalMoney(KooUtil.formatMoney(tmpVal.getUnitName(), tmpVal.getTotalMoney()));
			List<UserOrderExtraOptionModel> tmpUserOrderExtraOptionModelList = new ArrayList<>();
			for (UserOrderExtraOptionModel tmpValSub : tmpVal.getUserOrderExtraOptionModelList()) {
				tmpValSub.setMoneyUnit("$");
				tmpValSub.setExtraPrice(KooUtil.formatMoney(tmpValSub.getMoneyUnit(), tmpValSub.getExtraPrice()));
				tmpValSub.setExtraTime(KooUtil.formatDuration(tmpValSub.getExtraTime()));
				tmpValSub.setExtraUnit(KooUtil.formatDurationUnit(tmpValSub.getExtraUnit()));
				tmpUserOrderExtraOptionModelList.add(tmpValSub);
			}
			tmpVal.setUserOrderExtraOptionModelList(tmpUserOrderExtraOptionModelList);

			tmpUserOrderList.add(tmpVal);
		}
		this.setUserOrderList(tmpUserOrderList);
	}
}
