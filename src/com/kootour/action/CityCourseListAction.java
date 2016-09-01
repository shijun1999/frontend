//Auto Generated 

package com.kootour.action;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import com.kootour.mapper.entity.CityCourseListEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseFilterEntity;
import com.kootour.model.CityCourseListModel;
import com.kootour.model.CourseModel;
import com.kootour.service.CityCourseListService;
import com.kootour.service.CommonService;
import com.kootour.service.FavoriteService;
import com.kootour.service.impl.CityCourseListServiceImpl;
import com.kootour.service.impl.CommonServiceImpl;
import com.kootour.service.impl.FavoriteServiceImpl;

@Results({ @Result(name = "gotocitychange", value = "stateCourseList!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotocourse", value = "course!load", type = ServletActionRedirectResult.class) })
public class CityCourseListAction extends CityCourseListModel {

	@Autowired(required = false)
	private CityCourseListService cityCourseListService = new CityCourseListServiceImpl();

	@Autowired(required = false)
	private CommonService commonService = new CommonServiceImpl();

	@Autowired(required = false)
	private FavoriteService favoriteService = new FavoriteServiceImpl();

	public String cityChange() {
		String rtnStr = "gotocitychange";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity((CityCourseListModel) this);
		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
		outCityCourseListEntity = cityCourseListService.cityChange(inCityCourseListEntity, paraMap);

		return rtnStr;
	}

	public String load() {

		CourseFilterEntity courseFilterEntity = new CourseFilterEntity();
		this.setLangId(getSessionInfo().getCurLangId());
		this.setState(getSessionInfo().getCurState());

		Map<String, Object> sessionParaMap = getSessionInfo().getParaMap();

		this.setCity((String) sessionParaMap.get(KooConst.MAP_SELECT_CITY));

		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity((CityCourseListModel) this);
		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
		String prectionId = "";
		if (getSessionInfo().getPreActionId() != null) {
			prectionId = getSessionInfo().getPreActionId();
		} else {
			prectionId = "";
		}

		Map<String, Object> paraMap = new HashMap<String, Object>();

		switch (prectionId) {
		case KooConst.ST_COURSE_FILTER_ACTION:
			courseFilterEntity = (CourseFilterEntity) sessionParaMap.get(KooConst.ST_COURSEFILTERENTITY);
			break;
		default:
			String tmpSelectDate = (String) sessionParaMap.get(KooConst.MAP_SELECT_DATE);
			if ("".equals(tmpSelectDate) || tmpSelectDate == null) {
				courseFilterEntity.setBgnDay(getSessionInfo().getCurDate());
			} else {
				courseFilterEntity.setBgnDay(KooUtil.convertDate2Yyyymmdd(tmpSelectDate));// MM/dd/yyyy->yyyyMMdd
			}
			LocalDate date1 = LocalDate.parse(courseFilterEntity.getBgnDay(), DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"
			// Todo
			date1 = date1.plusDays(7);
			courseFilterEntity.setEndDay(date1.format(DateTimeFormatter.BASIC_ISO_DATE));
			courseFilterEntity.setAllType(KooConst.STR_TYPE_CHECK_TRUE);
			courseFilterEntity.setDiscountFlg(KooConst.STR_TYPE_CHECK_FALSE);
			break;
		}

		paraMap.put(KooConst.ST_COURSEFILTERENTITY, courseFilterEntity);
		paraMap.put(KooConst.MAP_SELECT_CITY, sessionParaMap.get(KooConst.MAP_SELECT_CITY));
		inCityCourseListEntity.setTouristIdentiNo(inCityCourseListEntity.getCurTouristIdentiNo());
		outCityCourseListEntity = cityCourseListService.load(inCityCourseListEntity, paraMap);

		if (outCityCourseListEntity.getCourseList().isEmpty() || outCityCourseListEntity.getCourseList().size() < 3) {

			// TODO

		}
		copyEntity2EntityAction(outCityCourseListEntity);
		formatEntityAction();
		List<MenuInfo> tMenuList = new ArrayList<>();
		tMenuList.add(commonService.makeMenuLevel_0());
		tMenuList.add(commonService.makeMenuLevel_1(this.getCity(), this.getCity()));
		this.setCurMenuList(tMenuList);

		List languageList = (List) paraMap.get(KooConst.MAP_LANGUAGELIST);
		getSession().put(KooConst.ST_LANGUAGELIST, languageList);

		getSessionInfo().setPreActionId(KooConst.ST_CITY_COURSE_LIST_ACTION);
		sessionParaMap.put(KooConst.ST_BASE_COURSE_LIST, outCityCourseListEntity.getBaseCourseList());
		getSessionInfo().setParaMap(sessionParaMap);

		SessionInfo retVal = this.getSessionInfo();

		retVal.setCurMenuList(tMenuList);

		this.setSessionInfo(retVal);

		return "";
	}

	public String addMyFavorite() {
		String rtnStr = "success";
		String strCourseIdentiNo = getRequest().getParameter("courseIdentiNo").toString();

		Map<String, Object> paraMap = new HashMap<String, Object>();
		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity((CityCourseListModel) this);
		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
		outCityCourseListEntity = cityCourseListService.addMyFavorite(inCityCourseListEntity, paraMap);

		// FavoriteEntity favoriteEntity
		this.load();
		return rtnStr;
	}

	public String mailConfirm() {
		String rtnStr = "gotoemail";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity((CityCourseListModel) this);
		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
		outCityCourseListEntity = cityCourseListService.mailConfirm(inCityCourseListEntity, paraMap);

		return rtnStr;
	}

	public String courseFilterTest() {
		String rtnStr = "";

		CourseFilterEntity courseFilterEntity = new CourseFilterEntity();
		this.setLangId(getSessionInfo().getCurLangId());
		this.setState(getSessionInfo().getCurState());

		Map<String, Object> sessionParaMap = getSessionInfo().getParaMap();

		this.setCity((String) sessionParaMap.get(KooConst.MAP_SELECT_CITY));

		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity((CityCourseListModel) this);
		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
		String prectionId = "";
		if (getSessionInfo().getPreActionId() != null) {
			prectionId = getSessionInfo().getPreActionId();
		} else {
			prectionId = "";
		}

		Map<String, Object> paraMap = new HashMap<String, Object>();

		switch (prectionId) {
		case KooConst.ST_COURSE_FILTER_ACTION:
			courseFilterEntity = (CourseFilterEntity) sessionParaMap.get(KooConst.ST_COURSEFILTERENTITY);
			break;
		default:
			String tmpSelectDate = inCityCourseListEntity.getSearchDate();
			if ("".equals(tmpSelectDate) || tmpSelectDate == null) {
				courseFilterEntity.setBgnDay(getSessionInfo().getCurDate());
			} else {
				courseFilterEntity.setBgnDay(KooUtil.convertDate2Yyyymmdd(tmpSelectDate));// MM/dd/yyyy->yyyyMMdd
			}
			LocalDate date1 = LocalDate.parse(courseFilterEntity.getBgnDay(), DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"
			date1 = date1.plusDays(7);
			courseFilterEntity.setEndDay(date1.format(DateTimeFormatter.BASIC_ISO_DATE));
			if ("0".equals(inCityCourseListEntity.getCategory())) {
				courseFilterEntity.setAllType(KooConst.STR_TYPE_CHECK_TRUE);
			} else {
				courseFilterEntity.setAllType(KooConst.STR_TYPE_CHECK_FALSE);
			}

			courseFilterEntity.setDiscountFlg(KooConst.STR_TYPE_CHECK_FALSE);
			break;
		}

		paraMap.put(KooConst.ST_COURSEFILTERENTITY, courseFilterEntity);
		paraMap.put(KooConst.MAP_SELECT_CITY, sessionParaMap.get(KooConst.MAP_SELECT_CITY));
		inCityCourseListEntity.setBaseCourseList((List<CourseEntity>) sessionParaMap.get(KooConst.ST_BASE_COURSE_LIST));
		outCityCourseListEntity = cityCourseListService.courseFilter(inCityCourseListEntity, paraMap);

		if (outCityCourseListEntity.getCourseList().isEmpty() || outCityCourseListEntity.getCourseList().size() < 3) {

			// TODO

		}
		copyEntity2EntityAction(outCityCourseListEntity);
		formatEntityAction();

		List languageList = (List) paraMap.get(KooConst.MAP_LANGUAGELIST);
		getSession().put(KooConst.ST_LANGUAGELIST, languageList);

		getSessionInfo().setPreActionId(KooConst.ST_CITY_COURSE_LIST_ACTION);
		sessionParaMap.put(KooConst.ST_BASE_COURSE_LIST, outCityCourseListEntity.getBaseCourseList());
		getSessionInfo().setParaMap(sessionParaMap);

		return rtnStr;
	}

	public String courseFilter() {
		String rtnStr = "";

		CourseFilterEntity courseFilterEntity = new CourseFilterEntity();
		this.setLangId(getSessionInfo().getCurLangId());
		this.setState(getSessionInfo().getCurState());

		Map<String, Object> sessionParaMap = getSessionInfo().getParaMap();

		this.setCity((String) sessionParaMap.get(KooConst.MAP_SELECT_CITY));

		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity((CityCourseListModel) this);
		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();

		Map<String, Object> paraMap = new HashMap<String, Object>();

		String[] categoryArr = inCityCourseListEntity.getCategory().split(",");
		String[] langArr = inCityCourseListEntity.getLangSelect().split(",");

		int inCategory = Integer.parseInt(categoryArr[0]);

		courseFilterEntity = KooUtil.makeCategory(inCategory);
		courseFilterEntity.setSelectLangId1(KooUtil.makeSelectLang(langArr[0]));
		String tmpSelectDate = inCityCourseListEntity.getSearchDate();

		if ("".equals(tmpSelectDate) || tmpSelectDate == null) {
			courseFilterEntity.setBgnDay(getSessionInfo().getCurDate());
		} else {
			courseFilterEntity.setBgnDay(KooUtil.convertDate2Yyyymmdd(tmpSelectDate.split(",")[0]));// MM/dd/yyyy->yyyyMMdd
		}

		LocalDate date1 = LocalDate.parse(courseFilterEntity.getBgnDay(), DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"
		date1 = date1.plusDays(7);
		courseFilterEntity.setEndDay(date1.format(DateTimeFormatter.BASIC_ISO_DATE));

		courseFilterEntity.setDiscountFlg(KooConst.STR_TYPE_CHECK_FALSE);

		paraMap.put(KooConst.ST_COURSEFILTERENTITY, courseFilterEntity);
		paraMap.put(KooConst.MAP_SELECT_CITY, sessionParaMap.get(KooConst.MAP_SELECT_CITY));
		inCityCourseListEntity.setBaseCourseList((List<CourseEntity>) sessionParaMap.get(KooConst.ST_BASE_COURSE_LIST));
		outCityCourseListEntity = cityCourseListService.courseFilter(inCityCourseListEntity, paraMap);

		if (outCityCourseListEntity.getCourseList().isEmpty() || outCityCourseListEntity.getCourseList().size() < 3) {

			// TODO

		}
		outCityCourseListEntity.setLangSelect(langArr[0]);
		outCityCourseListEntity.setCategory(categoryArr[0]);
		outCityCourseListEntity.setSearchDate(tmpSelectDate.split(",")[0]);
		
		copyEntity2EntityAction(outCityCourseListEntity);
		formatEntityAction();

		List languageList = (List) paraMap.get(KooConst.MAP_LANGUAGELIST);
		getSession().put(KooConst.ST_LANGUAGELIST, languageList);

		getSessionInfo().setPreActionId(KooConst.ST_CITY_COURSE_LIST_ACTION);
//		sessionParaMap.put(KooConst.ST_BASE_COURSE_LIST, outCityCourseListEntity.getBaseCourseList());
//		getSessionInfo().setParaMap(sessionParaMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(CityCourseListEntity tEntity) {
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

		if (tEntity.getState() == null) {
			setState("");
		} else {
			setState(tEntity.getState());
		}
		if (tEntity.getCity() == null) {
			setCity("");
		} else {
			setCity(tEntity.getCity());
		}
		if (tEntity.getLangSelect() == null) {
			setLangSelect("");
		} else {
			setLangSelect(tEntity.getLangSelect());
		}
		if (tEntity.getSearchDate() == null) {
			setSearchDate("");
		} else {
			setSearchDate(tEntity.getSearchDate());
		}
		if (tEntity.getCategory() == null) {
			setCategory("");
		} else {
			setCategory(tEntity.getCategory());
		}
		if (tEntity.getCourseNum() == null) {
			setCourseNum("");
		} else {
			setCourseNum(String.valueOf(tEntity.getCourseNum()));
		}
		List<CourseModel> tmpCourseActionList1 = new ArrayList<CourseModel>();
		for (CourseEntity tmpVal : tEntity.getCourseList()) {
			CourseAction tmpCourseList = new CourseAction();
			tmpCourseList.copyEntity2EntityAction(tmpVal);
			tmpCourseActionList1.add(tmpCourseList);
		}
		setCourseList(tmpCourseActionList1);
		List<CourseModel> tmpCourseActionList2 = new ArrayList<CourseModel>();
		for (CourseEntity tmpVal : tEntity.getBaseCourseList()) {
			CourseAction tmpBaseCourseList = new CourseAction();
			tmpBaseCourseList.copyEntity2EntityAction(tmpVal);
			tmpCourseActionList2.add(tmpBaseCourseList);
		}
		setBaseCourseList(tmpCourseActionList2);
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

	public CityCourseListEntity copyEntityAction2Entity(CityCourseListModel tCityCourseListModel) {
		CityCourseListEntity tEntity = new CityCourseListEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tCityCourseListModel.getLangId());
		tEntity.setTouristIdentiNo(tCityCourseListModel.getTouristIdentiNo());

		tEntity.setState(tCityCourseListModel.getState());
		tEntity.setCity(tCityCourseListModel.getCity());
		tEntity.setLangSelect(tCityCourseListModel.getLangSelect());
		tEntity.setSearchDate(tCityCourseListModel.getSearchDate());
		tEntity.setCategory(tCityCourseListModel.getCategory());
		if (KooUtil.isNotInt(tCityCourseListModel.getCourseNum())) {
			tEntity.setCourseNum(null);
		} else {
			tEntity.setCourseNum(Integer.parseInt(tCityCourseListModel.getCourseNum()));
		}
		List<CourseEntity> tmpCourseEntityList1 = new ArrayList<CourseEntity>();
		for (CourseModel tmpVal : tCityCourseListModel.getCourseList()) {
			CourseEntity tmpCourse = new CourseEntity();
			CourseAction tmpAction = (CourseAction) tmpVal;
			tmpCourse = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseEntityList1.add(tmpCourse);
		}
		tEntity.setCourseList(tmpCourseEntityList1);
		List<CourseEntity> tmpCourseEntityList2 = new ArrayList<CourseEntity>();
		for (CourseModel tmpVal : tCityCourseListModel.getBaseCourseList()) {
			CourseEntity tmpCourse = new CourseEntity();
			CourseAction tmpAction = (CourseAction) tmpVal;
			tmpCourse = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseEntityList2.add(tmpCourse);
		}
		tEntity.setBaseCourseList(tmpCourseEntityList2);
		if (KooUtil.isNotDate(tCityCourseListModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(
					KooUtil.string2Date(tCityCourseListModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tCityCourseListModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(
					KooUtil.string2Date(tCityCourseListModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}

	public void formatEntityAction() {

		List<CourseModel> courseList = new ArrayList<CourseModel>();
		for (CourseModel tmpVal : this.getCourseList()) {
			if (tmpVal.getDiscountPrice().equals("") || tmpVal.getDiscountPrice().equals(tmpVal.getPrice())) {
				tmpVal.setDiscountPrice(KooUtil.formatMoney(tmpVal.getMoneyUnit(), tmpVal.getPrice()));
				tmpVal.setPrice("");
			} else {
				tmpVal.setPrice(KooUtil.formatMoney(tmpVal.getMoneyUnit(), tmpVal.getPrice()));
				tmpVal.setDiscountPrice(KooUtil.formatMoney(tmpVal.getMoneyUnit(), tmpVal.getDiscountPrice()));
			}

			tmpVal.setPersonOrGroup(KooUtil.formatPersonOrGroup(tmpVal.getPersonOrGroup()));

			tmpVal.setDuration(KooUtil.formatDuration(tmpVal.getDuration()));
			tmpVal.setDurationUnit(KooUtil.formatDurationUnit(tmpVal.getDurationUnit()));
			tmpVal.setLocalhostNameDisp("By " + tmpVal.getLocalhostNameDisp());

			courseList.add(tmpVal);
		}
		this.setCourseList(courseList);

	}

}
