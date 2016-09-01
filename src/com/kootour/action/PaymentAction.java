//Auto Generated

package com.kootour.action;

import com.google.gson.Gson;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.MenuInfo;
import com.kootour.common.SessionInfo;
import com.kootour.mapper.entity.BookSummaryEntity;
import com.kootour.mapper.entity.ExtraOptionEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.model.*;
import com.kootour.service.BookSummaryService;
import com.kootour.service.CommonService;
import com.kootour.service.LocalhostLoginService;
import com.kootour.service.impl.BookSummaryServiceImpl;
import com.kootour.service.impl.CommonServiceImpl;
import com.kootour.service.impl.PaymentServiceImpl;
import com.stripe.Stripe;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;


@ParentPackage("json-default")
@Results({
    @Result(name = "json", type="json", params={"root", "jsonStr"})
})
public class PaymentAction extends PaymentModel {

	private PaymentServiceImpl paymentServiceImpl = new PaymentServiceImpl();

	private CommonService commonService = new CommonServiceImpl();


	@Resource
	LocalhostLoginService localhostLoginService;

	private String jsonStr;
	private String jsonFromWeb;

    public String getJsonStr() {
		return jsonStr;
	}

	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
	}

	public String getJsonFromWeb() {
		return jsonFromWeb;
	}

	public void setJsonFromWeb(String jsonFromWeb) {
		this.jsonFromWeb = jsonFromWeb;
	}

	public String load() {
		String rtnStr = "success";

		BookSummaryModel bookSummaryModel = (BookSummaryModel)getSessionInfo().getParaMap().get(KooConst.ST_BOOK_SUMMARY);

		copyBookSummary2EntityAction(bookSummaryModel);

		List<MenuInfo> preMenuList = getSessionInfo().getCurMenuList();
		List<MenuInfo> tMenuList = new ArrayList<>();
		for(MenuInfo t :preMenuList){
			if(t.getMenuLevel().equals(KooConst.ST_MENU_0)||t.getMenuLevel().equals(KooConst.ST_MENU_1)||t.getMenuLevel().equals(KooConst.ST_MENU_2) || t.getMenuLevel().equals(KooConst.ST_MENU_3)){
				tMenuList.add(t);
			}
		}
		tMenuList.add(commonService.makeMenuLevel_4());
		this.setCurMenuList(tMenuList);
		SessionInfo retVal = this.getSessionInfo();

		retVal.setCurMenuList(tMenuList);
		this.setSessionInfo(retVal);
		return rtnStr;
	}

	@Action(value="payment")
	public String payment() {
		String rtnStr = "json";
		Map<String, Object> jsonMap = new HashMap<String, Object> ();
		Gson gson = new Gson();

		Stripe.apiKey = "sk_test_lJWjjntq2iHbYMCetf6GhfWf";

		try {
			PaymentModel paymentBean = gson.fromJson(jsonFromWeb, PaymentModel.class);

			Map<String, Object> chargeParams = new HashMap<String, Object>();
			//chargeParams.put("amount", paymentBean.getAmount());
			chargeParams.put("currency", "usd");
			chargeParams.put("source", paymentBean.getToken());
			//chargeParams.put("description", paymentBean.getDescription());

			Map<String, String> initialMetadata = new HashMap<String, String>();
			initialMetadata.put("Order Id", "6735");

			String loginId = "unknown";
			String name = "unknown";
			String email = "unknown";
			Map<String, Object> session = getSession();
//			if (session!=null &&  session.get(KooConst.LT_SESSION_KEY_LOCALHOSTENTITY) !=null){
//				LocalhostEntity localhostEntity = (LocalhostEntity) getSession().get(KooConst.LT_SESSION_KEY_LOCALHOSTENTITY);
//				loginId = localhostEntity.getLoginId();
//				name = localhostEntity.getFirstName() + " " + localhostEntity.getLastName();
//				email = localhostEntity.getEmail();
//			}
			initialMetadata.put("Login Id", loginId);
			initialMetadata.put("Full Name", name);
			initialMetadata.put("email", email);

			chargeParams.put("metadata", initialMetadata);

			Charge charge = Charge.create(chargeParams);

			// Display the success page, with the charge ID
			String chargeId = charge.getId();

			if (chargeId == null) {
				jsonMap.put("result", "error");
				jsonMap.put("data", "charge failed");
				jsonStr = gson.toJson(jsonMap);
			} else {

				jsonMap.put("result", "success");
				jsonStr = gson.toJson(jsonMap);
			}
		} catch (Exception e) {
			jsonMap.put("result", "error");
			jsonMap.put("data", "Uncatched error");
			jsonStr = gson.toJson(jsonMap);
		}
		return rtnStr;
	}


	public void copyBookSummary2EntityAction(BookSummaryModel bookSummaryModel) {

			setCurTouristIdentiNo(bookSummaryModel.getCurTouristIdentiNo() == null?"":bookSummaryModel.getCurTouristIdentiNo());

		if (bookSummaryModel.getCurDate() == null) {
			setCurDate("");
		} else {
			setCurDate(bookSummaryModel.getCurDate());
		}

		if (bookSummaryModel.getCurLangId() == null) {
			setCurLangId("");
		} else {
			setCurLangId(bookSummaryModel.getCurLangId());
		}

		if (bookSummaryModel.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(bookSummaryModel.getLangId());
		}

		if (bookSummaryModel.getFavoriteIdentiNo() == null) {
			setFavoriteIdentiNo("");
		} else {
			setFavoriteIdentiNo(bookSummaryModel.getFavoriteIdentiNo());
		}

		if (bookSummaryModel.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(bookSummaryModel.getTouristIdentiNo());
		}
		if (bookSummaryModel.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(bookSummaryModel.getCourseIdentiNo());
		}
		if (bookSummaryModel.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(bookSummaryModel.getLocalhostIdentiNo());
		}

		this.setUserOrder( bookSummaryModel.getUserOrder());

		List<ExtraOptionModel> tmpExtraOptionActionList2 = new ArrayList<ExtraOptionModel>();
		for (ExtraOptionModel tmpVal : bookSummaryModel.getExtraOptionList()) {
			tmpExtraOptionActionList2.add(tmpVal);
		}

		setExtraOptionList(tmpExtraOptionActionList2);

		if (bookSummaryModel.getSubTotal() == null) {
			setSubTotal("");
		} else {
			setSubTotal(String.valueOf(bookSummaryModel.getSubTotal()));
		}
		if (bookSummaryModel.getTax() == null) {
			setTax("");
		} else {
			setTax(String.valueOf(bookSummaryModel.getTax()));
		}
		if (bookSummaryModel.getDiscount() == null) {
			setDiscount("");
		} else {
			setDiscount(String.valueOf(bookSummaryModel.getDiscount()));
		}
		if (bookSummaryModel.getPromoCode() == null) {
			setPromoCode("");
		} else {
			setPromoCode(bookSummaryModel.getPromoCode());
		}
		if (bookSummaryModel.getTotal() == null) {
			setTotal("");
		} else {
			setTotal(String.valueOf(bookSummaryModel.getTotal()));
		}
		if (bookSummaryModel.getCreateTime() == null) {
			setCreateTime("");
		} else {
			setCreateTime(KooUtil.date2String(new Date(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (bookSummaryModel.getModifyTime() == null) {
			setModifyTime("");
		} else {
			setModifyTime(KooUtil.date2String(new Date(), KooConst.ST_yyyyMMddHHmmss));
		}

	}

	public BookSummaryEntity copyEntityAction2Entity(BookSummaryModel tBookSummaryModel) {
		BookSummaryEntity tEntity = new BookSummaryEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tBookSummaryModel.getLangId());
		tEntity.setFavoriteIdentiNo(tBookSummaryModel.getFavoriteIdentiNo());
		tEntity.setTouristIdentiNo(tBookSummaryModel.getTouristIdentiNo());
		tEntity.setCourseIdentiNo(tBookSummaryModel.getCourseIdentiNo());
		tEntity.setLocalhostIdentiNo(tBookSummaryModel.getLocalhostIdentiNo());

		UserOrderAction tmpUserOrderAction = new UserOrderAction();
		tEntity.setUserOrder(tmpUserOrderAction.copyEntityAction2Entity(tBookSummaryModel.getUserOrder()));

		List<ExtraOptionEntity> tmpExtraOptionEntityList2 = new ArrayList<ExtraOptionEntity>();
		for (ExtraOptionModel tmpVal : tBookSummaryModel.getExtraOptionList()) {
			ExtraOptionEntity tmpExtraOption = new ExtraOptionEntity();
			ExtraOptionAction tmpAction = (ExtraOptionAction) tmpVal;
			tmpExtraOption = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpExtraOptionEntityList2.add(tmpExtraOption);
		}
		tEntity.setExtraOptionList(tmpExtraOptionEntityList2);

		if (KooUtil.isNotDouble(tBookSummaryModel.getSubTotal())) {
			tEntity.setSubTotal(null);
		} else {
			tEntity.setSubTotal(Double.parseDouble(tBookSummaryModel.getSubTotal()));
		}
		if (KooUtil.isNotDouble(tBookSummaryModel.getTax())) {
			tEntity.setTax(null);
		} else {
			tEntity.setTax(Double.parseDouble(tBookSummaryModel.getTax()));
		}
		if (KooUtil.isNotDouble(tBookSummaryModel.getDiscount())) {
			tEntity.setDiscount(null);
		} else {
			tEntity.setDiscount(Double.parseDouble(tBookSummaryModel.getDiscount()));
		}
		tEntity.setPromoCode(tBookSummaryModel.getPromoCode());
		if (KooUtil.isNotDouble(tBookSummaryModel.getTotal())) {
			tEntity.setTotal(null);
		} else {
			tEntity.setTotal(Double.parseDouble(tBookSummaryModel.getTotal()));
		}
		if (KooUtil.isNotDate(tBookSummaryModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tBookSummaryModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tBookSummaryModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tBookSummaryModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}

	public void formatEntityAction() {

		UserOrderModel userOrderModel =this.getUserOrder();
		userOrderModel.setOrderDate( KooUtil.formatDate(userOrderModel.getOrderDate()));
		userOrderModel.setTaxVal(KooUtil.formatPercentage(userOrderModel.getTaxVal()));
		userOrderModel.setTotalMoney(KooUtil.formatMoney("$",userOrderModel.getTotalMoney()));
		userOrderModel.setPaidMoney(KooUtil.formatMoney("$",userOrderModel.getPaidMoney()));

		List<ExtraOptionModel> extraOptionList = new ArrayList<>();
		for (ExtraOptionModel tmpVal : this.getExtraOptionList()) {
			tmpVal.setExtraUnit(KooUtil.formatDurationUnit(tmpVal.getExtraUnit()));
			tmpVal.setExtraTime(KooUtil.formatDuration(tmpVal.getExtraTime()));
			if ("".equals(tmpVal.getExtraUnit())) {
				tmpVal.setExtraTime("");
			}

			tmpVal.setExtraPrice(KooUtil.formatMoney("$", tmpVal.getExtraPrice()));

			extraOptionList.add(tmpVal);
		}
		this.setExtraOptionList(extraOptionList);
		this.setUserOrder(userOrderModel);
	}
}
