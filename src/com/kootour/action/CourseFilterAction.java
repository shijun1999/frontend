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

import com.kootour.checker.SingleCourseFilterChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.PulldownValueBean;
import com.kootour.mapper.entity.CourseFilterEntity;
import com.kootour.model.CourseFilterModel;
import com.kootour.service.CourseFilterService;
import com.kootour.service.impl.CourseFilterServiceImpl;

@Results({ @Result(name = "cancel", value = "cityCourseList!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotonext", value = "cityCourseList!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "cityCourseList!load", type = ServletActionRedirectResult.class) })
public class CourseFilterAction extends CourseFilterModel {

	@Autowired(required = false)
	private CourseFilterService courseFilterService = new CourseFilterServiceImpl();

	public String cancel() {
		String rtnStr = "cancel";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CourseFilterEntity inCourseFilterEntity = copyEntityAction2Entity((CourseFilterModel)this);
		CourseFilterEntity outCourseFilterEntity = new CourseFilterEntity();
		outCourseFilterEntity = courseFilterService.cancel(inCourseFilterEntity, paraMap);

		return rtnStr;
	}

	public String filterOk() {

		String rtnStr = "gotonext";

		setLangId(getSessionInfo().getCurLangId());
		Map<String, Object> sessionParaMap = getSessionInfo().getParaMap();

		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();

		Map<String, Object> session = getSession();
		if (getSession().isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_009);
			tList.add(tErrorInfo);

			this.setErrInfoList(tList);
			makeErrorList(this.getErrInfoList());
			return rtnStr;
		}

		SingleCourseFilterChecker tSingleCheck = new SingleCourseFilterChecker();
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
			String strSelectDay = this.getSelectDay();
			CourseFilterEntity inCourseFilterEntity = copyEntityAction2Entity((CourseFilterModel)this);
			CourseFilterEntity outCourseFilterEntity = new CourseFilterEntity();
			outCourseFilterEntity = courseFilterService.filterOk(inCourseFilterEntity, paraMap);
			getSessionInfo().setPreActionId(KooConst.ST_COURSE_FILTER_ACTION);
			sessionParaMap.put(KooConst.ST_COURSEFILTERENTITY, outCourseFilterEntity);
			getSessionInfo().setParaMap(sessionParaMap);
			copyEntity2EntityAction(outCourseFilterEntity);
		} else {
			rtnStr = "error";
		}

		return rtnStr;
	}

	public String back() {
		String rtnStr = "gotoback";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CourseFilterEntity inCourseFilterEntity = copyEntityAction2Entity((CourseFilterModel)this);
		CourseFilterEntity outCourseFilterEntity = new CourseFilterEntity();
		outCourseFilterEntity = courseFilterService.back(inCourseFilterEntity, paraMap);

		return rtnStr;
	}

	public String load() {

		String rtnStr = "success";
		setLangId(getSessionInfo().getCurLangId());
		Map<String, Object> sessionParaMap = getSessionInfo().getParaMap();

		Map<String, Object> session = getSession();
		if (session == null) {

			List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_009);
			tList.add(tErrorInfo);

			this.setErrInfoList(tList);
			makeErrorList(this.getErrInfoList());
			return rtnStr;
		}

		initEntityAction();
		CourseFilterEntity inCourseFilterEntity = copyEntityAction2Entity((CourseFilterModel)this);
		CourseFilterEntity outCourseFilterEntity = new CourseFilterEntity();

		Map<String, Object> paraMap = new HashMap<String, Object>();

		outCourseFilterEntity = courseFilterService.load(inCourseFilterEntity, paraMap);
		List languageList = (List) paraMap.get(KooConst.ST_LANG_LIST);
//		getSession().put(KooConst.ST_LANG_LIST, languageList);
		return rtnStr;
	}

	public void copyEntity2EntityAction(CourseFilterEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);

		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getAdventure() == null) {
			setAdventure("");
		} else {
			setAdventure(tEntity.getAdventure());
		}
		if (tEntity.getCultureArts() == null) {
			setCultureArts("");
		} else {
			setCultureArts(tEntity.getCultureArts());
		}
		if (tEntity.getFestivalEvents() == null) {
			setFestivalEvents("");
		} else {
			setFestivalEvents(tEntity.getFestivalEvents());
		}
		if (tEntity.getFoodDrink() == null) {
			setFoodDrink("");
		} else {
			setFoodDrink(tEntity.getFoodDrink());
		}
		if (tEntity.getHistorical() == null) {
			setHistorical("");
		} else {
			setHistorical(tEntity.getHistorical());
		}
		if (tEntity.getLeisureSports() == null) {
			setLeisureSports("");
		} else {
			setLeisureSports(tEntity.getLeisureSports());
		}
		if (tEntity.getNatureRural() == null) {
			setNatureRural("");
		} else {
			setNatureRural(tEntity.getNatureRural());
		}
		if (tEntity.getNightlifeParty() == null) {
			setNightlifeParty("");
		} else {
			setNightlifeParty(tEntity.getNightlifeParty());
		}
		if (tEntity.getShoppingMarket() == null) {
			setShoppingMarket("");
		} else {
			setShoppingMarket(tEntity.getShoppingMarket());
		}
		
		if (tEntity.getAllType() == null) {
			setAllType("");
		} else {
			setAllType(tEntity.getAllType());
		}
		if (tEntity.getSelectLangId1() == null) {
			setSelectLangId1("");
		} else {
			setSelectLangId1(tEntity.getSelectLangId1());
		}
		if (tEntity.getSelectLangId2() == null) {
			setSelectLangId2("");
		} else {
			setSelectLangId2(tEntity.getSelectLangId2());
		}
		if (tEntity.getSelectLangId3() == null) {
			setSelectLangId3("");
		} else {
			setSelectLangId3(tEntity.getSelectLangId3());
		}
		if (tEntity.getSelectDay() == null) {
			setSelectDay("");
		} else {
			setSelectDay(tEntity.getSelectDay());
		}
		if (tEntity.getWithinDays() == null) {
			setWithinDays("");
		} else {
			setWithinDays(tEntity.getWithinDays());
		}
		if (tEntity.getDiscountFlg() == null) {
			setDiscountFlg("");
		} else {
			setDiscountFlg(tEntity.getDiscountFlg());
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

	public CourseFilterEntity copyEntityAction2Entity(CourseFilterModel tCourseFilterModel) {
		CourseFilterEntity tEntity = new CourseFilterEntity();

        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tCourseFilterModel.getLangId());

		if (tCourseFilterModel.getAdventure().equals(KooConst.STR_TYPE_CHECK_TRUE)) {
			tEntity.setAdventure(KooConst.ST_FLG_YES);
		}

		if (tCourseFilterModel.getCultureArts().equals(KooConst.STR_TYPE_CHECK_TRUE)) {
			tEntity.setCultureArts(KooConst.ST_FLG_YES);
		}

		if (tCourseFilterModel.getFoodDrink().equals(KooConst.STR_TYPE_CHECK_TRUE)) {
			tEntity.setFoodDrink(KooConst.ST_FLG_YES);
		}

		if (tCourseFilterModel.getFestivalEvents().equals(KooConst.STR_TYPE_CHECK_TRUE)) {
			tEntity.setFestivalEvents(KooConst.ST_FLG_YES);
		}

		if (tCourseFilterModel.getLeisureSports().equals(KooConst.STR_TYPE_CHECK_TRUE)) {
			tEntity.setLeisureSports(KooConst.ST_FLG_YES);
		}

		if (tCourseFilterModel.getNightlifeParty().equals(KooConst.STR_TYPE_CHECK_TRUE)) {
			tEntity.setNightlifeParty(KooConst.ST_FLG_YES);
		}

		if (tCourseFilterModel.getNatureRural().equals(KooConst.STR_TYPE_CHECK_TRUE)) {
			tEntity.setNatureRural(KooConst.ST_FLG_YES);
		}

		if (tCourseFilterModel.getHistorical().equals(KooConst.STR_TYPE_CHECK_TRUE)) {
			tEntity.setHistorical(KooConst.ST_FLG_YES);
		}

		if (tCourseFilterModel.getShoppingMarket().equals(KooConst.STR_TYPE_CHECK_TRUE)) {
			tEntity.setShoppingMarket(KooConst.ST_FLG_YES);
		}

		tEntity.setAllType(tCourseFilterModel.getAllType());
		tEntity.setSelectLangId1(tCourseFilterModel.getSelectLangId1());
		tEntity.setSelectLangId2(tCourseFilterModel.getSelectLangId2());
		tEntity.setSelectLangId3(tCourseFilterModel.getSelectLangId3());
		tEntity.setSelectDay(tCourseFilterModel.getSelectDay());
		tEntity.setWithinDays(tCourseFilterModel.getWithinDays());
		tEntity.setDiscountFlg(tCourseFilterModel.getDiscountFlg());

		if (KooUtil.isNotDate(tCourseFilterModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tCourseFilterModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tCourseFilterModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tCourseFilterModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;
	}

	public void initEntityAction() {
		setAdventure(KooConst.STR_TYPE_CHECK_TRUE);
		setCultureArts(KooConst.STR_TYPE_CHECK_TRUE);
		setFestivalEvents(KooConst.STR_TYPE_CHECK_TRUE);
		setFoodDrink(KooConst.STR_TYPE_CHECK_TRUE);
		setHistorical(KooConst.STR_TYPE_CHECK_TRUE);
		setLeisureSports(KooConst.STR_TYPE_CHECK_TRUE);
		setNatureRural(KooConst.STR_TYPE_CHECK_TRUE);
		setNightlifeParty(KooConst.STR_TYPE_CHECK_TRUE);
		setShoppingMarket(KooConst.STR_TYPE_CHECK_TRUE);
		setAllType(KooConst.STR_TYPE_CHECK_TRUE);
		// setSelectLangId1("en");
		setWithinDays(KooConst.STR_TYPE_CHECK_TRUE);
		setDiscountFlg(KooConst.STR_TYPE_CHECK_FALSE);
	}

}
