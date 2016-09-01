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
import com.kootour.common.MenuInfo;
import com.kootour.common.SessionInfo;
import com.kootour.mapper.entity.BookSummaryEntity;
import com.kootour.mapper.entity.ExtraOptionEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.model.BookSummaryModel;
import com.kootour.model.CourseDetailModel;
import com.kootour.model.ExtraOptionModel;
import com.kootour.model.UserOrderExtraOptionModel;
import com.kootour.model.UserOrderModel;
import com.kootour.service.BookSummaryService;
import com.kootour.service.CommonService;
import com.kootour.service.impl.BookSummaryServiceImpl;
import com.kootour.service.impl.CommonServiceImpl;

@Results({@Result(name = "gotonext", value = "payment!load", type = ServletActionRedirectResult.class)})
public class BookSummaryAction extends BookSummaryModel {

	@Autowired(required = false)
	private BookSummaryService bookSummaryService = new BookSummaryServiceImpl();
	
	@Autowired(required = false)
	private CommonService commonService = new CommonServiceImpl();

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		BookSummaryEntity inBookSummaryEntity = copyEntityAction2Entity((BookSummaryModel)this);
		BookSummaryEntity outBookSummaryEntity = new BookSummaryEntity();
		Map<String, Object> sessionParaMap = getSessionInfo().getParaMap();
		CourseDetailModel preCourseDetailModel = (CourseDetailModel) sessionParaMap.get(KooConst.ST_COURSE_DETAIL);
		paraMap.put(KooConst.ST_COURSE_DETAIL, (CourseDetailModel) preCourseDetailModel);
		outBookSummaryEntity = bookSummaryService.load(inBookSummaryEntity, paraMap);
		copyEntity2EntityAction(outBookSummaryEntity);

		formatEntityAction();

		getSessionInfo().getParaMap().put(KooConst.ST_BOOK_SUMMARY,this);
		
		List<MenuInfo> preMenuList = getSessionInfo().getCurMenuList();
		List<MenuInfo> tMenuList = new ArrayList<>();
		for(MenuInfo t :preMenuList){
			if(t.getMenuLevel().equals(KooConst.ST_MENU_0)||t.getMenuLevel().equals(KooConst.ST_MENU_1)||t.getMenuLevel().equals(KooConst.ST_MENU_2)){
				tMenuList.add(t);
			}
		}
		tMenuList.add(commonService.makeMenuLevel_3());
		this.setCurMenuList(tMenuList);
		SessionInfo retVal = this.getSessionInfo();

		retVal.setCurMenuList(tMenuList);
		this.setSessionInfo(retVal);
		return rtnStr;
	}

	public String book() {
		String rtnStr = "gotonext";
//		Map<String, Object> paraMap = new HashMap<String, Object>();
//		BookSummaryEntity inBookSummaryEntity = copyEntityAction2Entity((BookSummaryModel)this);
//		BookSummaryEntity outBookSummaryEntity = new BookSummaryEntity();
//		outBookSummaryEntity = bookSummaryService.load(inBookSummaryEntity, paraMap);

//		copyEntity2EntityAction(inBookSummaryEntity);
//
//		formatEntityAction();

		//getSessionInfo().getParaMap().put(KooConst.ST_BOOK_SUMMARY,this);

		return rtnStr;
	}
	
	public void copyEntity2EntityAction(BookSummaryEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		
		if (tEntity.getFavoriteIdentiNo() == null) {
			setFavoriteIdentiNo("");
		} else {
			setFavoriteIdentiNo(tEntity.getFavoriteIdentiNo());
		}

		if (tEntity.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(tEntity.getTouristIdentiNo());
		}
		if (tEntity.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(tEntity.getCourseIdentiNo());
		}
		if (tEntity.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(tEntity.getLocalhostIdentiNo());
		}
		UserOrderEntity tmpUserOrderEntity = tEntity.getUserOrder();
		UserOrderAction tmpUserOrder = new UserOrderAction();
		tmpUserOrder.copyEntity2EntityAction(tEntity.getUserOrder());
		this.setUserOrder( tmpUserOrder);

		List<ExtraOptionModel> tmpExtraOptionActionList2 = new ArrayList<ExtraOptionModel>();
		for (ExtraOptionEntity tmpVal : tEntity.getExtraOptionList()) {
			ExtraOptionAction tmpExtraOptionList = new ExtraOptionAction();
			tmpExtraOptionList.copyEntity2EntityAction(tmpVal);
			tmpExtraOptionActionList2.add(tmpExtraOptionList);
		}
		setExtraOptionList(tmpExtraOptionActionList2);
		if (tEntity.getSubTotal() == null) {
			setSubTotal("");
		} else {
			setSubTotal(String.valueOf(tEntity.getSubTotal()));
		}
		if (tEntity.getTax() == null) {
			setTax("");
		} else {
			setTax(String.valueOf(tEntity.getTax()));
		}
		if (tEntity.getDiscount() == null) {
			setDiscount("");
		} else {
			setDiscount(String.valueOf(tEntity.getDiscount()));
		}
		if (tEntity.getPromoCode() == null) {
			setPromoCode("");
		} else {
			setPromoCode(tEntity.getPromoCode());
		}
		if (tEntity.getTotal() == null) {
			setTotal("");
		} else {
			setTotal(String.valueOf(tEntity.getTotal()));
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
		//this.setUserOrder(userOrderModel);
	}
}
