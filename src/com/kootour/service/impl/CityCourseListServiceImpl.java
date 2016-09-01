package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.RumdaBase;
import com.kootour.common.RumdaByConditionEx;
import com.kootour.mapper.entity.CityCourseListEntity;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseFilterEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.LanguageMstEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
import com.kootour.service.CityCourseListService;
import com.kootour.service.CourseService;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseScheduleService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.FavoriteService4DB;
import com.kootour.service4db.LanguageMstService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.ScheduleOptionService4DB;

@Configuration
@Service
public class CityCourseListServiceImpl implements CityCourseListService {
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired
	private CoursePictureService4DB coursePictureService4DB;
	@Autowired
	private LanguageMstService4DB languageMstService4DB;
	@Autowired
	private CourseScheduleService4DB courseScheduleService4DB;
	@Autowired
	private ScheduleOptionService4DB scheduleOptionService4DB;
	@Autowired
	private CourseCommentService4DB courseCommentService4DB;

	@Autowired(required = false)
	private CourseService courseService = new CourseServiceImpl();

	private static Logger logger = Logger.getLogger(CityCourseListServiceImpl.class);

	@Override
	public CityCourseListEntity cityChange(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap) {
		CityCourseListEntity rtnResult = new CityCourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public CityCourseListEntity load(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap) {

		CourseFilterEntity courseFilterEntity = new CourseFilterEntity();
		CityCourseListEntity rtnResult = cityCourseListEntity;

		if (paraMap.get(KooConst.ST_COURSEFILTERENTITY) != null) {
			courseFilterEntity = (CourseFilterEntity) paraMap.get(KooConst.ST_COURSEFILTERENTITY);
		} else {
			// Error
		}
		String selectCity = (String) paraMap.get(KooConst.MAP_SELECT_CITY);
		String bgnDate = courseFilterEntity.getBgnDay();
		String endDate = courseFilterEntity.getEndDay();
		String typeFilterFlg = courseFilterEntity.getAllType();
		String discountFlg = courseFilterEntity.getDiscountFlg();

		rtnResult.setLangId(cityCourseListEntity.getLangId());
		rtnResult.setState(cityCourseListEntity.getState());
		rtnResult.setCity(cityCourseListEntity.getCity());
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();

		List<CourseEntity> courseEntityList = courseService4DB.selectAll();
		List<CourseEntity> tList1 = courseService.filterCourseByCity(courseEntityList, selectCity);
		tList1 = courseService.calcMinPrice(tList1, bgnDate, endDate, discountFlg);
		tList1 = courseService.mergeCourseByScheduleWorkDay(tList1, bgnDate, endDate);
		tList1 = courseService.addPictureToCourse(tList1);
		tList1 = courseService.addCommentInfoToCourse(tList1);
		tList1 = courseService.addInExInfoToCourse(tList1);
		tList1 = courseService.addOtherInfoToCourse(tList1);
		if (typeFilterFlg.equals(KooConst.STR_TYPE_CHECK_FALSE)) {
			tList1 = courseService.filterCourseByType(tList1, courseFilterEntity);
		}
		tList1 = courseService.filterCourseByLang(tList1, courseFilterEntity);

		tList1 = courseService.addFavoriteInfoToCourse(tList1, cityCourseListEntity.getCurTouristIdentiNo());

		rtnResult.setBaseCourseList(tList1);
		rtnResult.setTouristIdentiNo(cityCourseListEntity.getTouristIdentiNo());
		double dPrice = 0.0;
		rtnResult.setCourseList(tList1);
		ErrorInfo tErrorInfo1 = new ErrorInfo();
		tErrorInfo1.setItemName(KooConst.INFO_MSG_PARAM004 + "[selectAll]");
		tErrorInfo1.setErrKbn(KooConst.INT_ERROR_KBN);
		tErrorInfo1.setErrMsg(KooConst.INFO_MSG_001);
		tErrorInfo1.setDispOrder(1);
		tList.add(tErrorInfo1);

		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}

	@Override
	public CityCourseListEntity addMyFavorite(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap) {
		CityCourseListEntity rtnResult = new CityCourseListEntity();
		// Write logic here !!!

		FavoriteServiceImpl favoriteServiceImpl = new FavoriteServiceImpl();

		FavoriteEntity favoriteEntity = new FavoriteEntity();
		favoriteEntity.setLangId(cityCourseListEntity.getLangId());
		favoriteEntity.setTouristIdentiNo(cityCourseListEntity.getSessionInfo().getCurTouristIdentiNo());
		favoriteEntity.setObjIdentiNo(paraMap.get("objIdentiNo").toString());
		favoriteServiceImpl.save(favoriteEntity, paraMap);

		return (rtnResult);
	}

	@Override
	public CityCourseListEntity mailConfirm(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap) {
		CityCourseListEntity rtnResult = new CityCourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public CityCourseListEntity courseFilter(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap) {
		CourseFilterEntity courseFilterEntity = new CourseFilterEntity();
		CityCourseListEntity rtnResult = cityCourseListEntity;

		if (paraMap.get(KooConst.ST_COURSEFILTERENTITY) != null) {
			courseFilterEntity = (CourseFilterEntity) paraMap.get(KooConst.ST_COURSEFILTERENTITY);
		} else {
			// Error
		}
		String selectCity = (String) paraMap.get(KooConst.MAP_SELECT_CITY);
		String bgnDate = courseFilterEntity.getBgnDay();
		String endDate = courseFilterEntity.getEndDay();
		String typeFilterFlg = courseFilterEntity.getAllType();
		String discountFlg = courseFilterEntity.getDiscountFlg();

		rtnResult.setLangId(cityCourseListEntity.getLangId());
		rtnResult.setState(cityCourseListEntity.getState());
		rtnResult.setCity(cityCourseListEntity.getCity());
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();

		List<CourseEntity> courseEntityList = cityCourseListEntity.getBaseCourseList();
		// List<CourseEntity> courseEntityList = courseService4DB.selectAll();

		List<CourseEntity> tList1 = courseService.filterCourseByCity(courseEntityList, selectCity);
		tList1 = courseService.calcMinPrice(tList1, bgnDate, endDate, discountFlg);
		tList1 = courseService.mergeCourseByScheduleWorkDay(tList1, bgnDate, endDate);
		tList1 = courseService.addPictureToCourse(tList1);
		tList1 = courseService.addCommentInfoToCourse(tList1);
		tList1 = courseService.addInExInfoToCourse(tList1);
		tList1 = courseService.addOtherInfoToCourse(tList1);
		if (!KooConst.STR_TYPE_CHECK_TRUE.equals(typeFilterFlg)) {
			tList1 = courseService.filterCourseByType(tList1, courseFilterEntity);
		}
		tList1 = courseService.filterCourseByLang(tList1, courseFilterEntity);

		rtnResult.setBaseCourseList(tList1);

		double dPrice = 0.0;
		rtnResult.setCourseList(tList1);
		ErrorInfo tErrorInfo1 = new ErrorInfo();
		tErrorInfo1.setItemName(KooConst.INFO_MSG_PARAM004 + "[selectAll]");
		tErrorInfo1.setErrKbn(KooConst.INT_ERROR_KBN);
		tErrorInfo1.setErrMsg(KooConst.INFO_MSG_001);
		tErrorInfo1.setDispOrder(1);
		tList.add(tErrorInfo1);

		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}

	private List<CourseEntity> selectCourseByLangId(List<CourseEntity> inList, String tLangId) {

		List<CourseEntity> tList = new ArrayList<CourseEntity>();
		Predicate<CourseEntity> tWhere;

		tWhere = (eCourseEntity ->
		// Add Where condition at here
		(eCourseEntity.getLangId() != null && eCourseEntity.getLangId().equals(tLangId)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseLst(inList, tWhere);

		return (tList);
	}

	private List<ScheduleOptionEntity> selectCourseByDiscount(List<ScheduleOptionEntity> inList, String tLangId) {

		List<ScheduleOptionEntity> tList = new ArrayList<ScheduleOptionEntity>();
		Predicate<ScheduleOptionEntity> tWhere;

		tWhere = (eScheduleOption ->
		// Add Where condition at here
		(eScheduleOption.getLangId() != null && eScheduleOption.getLangId().equals(tLangId)
				&& eScheduleOption.getDiscountFlg() != null && eScheduleOption.getDiscountFlg().equals("1")));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekScheduleOptionLst(inList, tWhere);

		return (tList);
	}

	private boolean existSchedule(List<CourseScheduleEntity> inList, String strCourseIdentiNo) {

		List<CourseScheduleEntity> tList = new ArrayList<CourseScheduleEntity>();
		Predicate<CourseScheduleEntity> tWhere;

		tWhere = (eCourseScheduleEntity ->
		// Add Where condition at here
		(eCourseScheduleEntity.getCourseIdentiNo() != null
				&& eCourseScheduleEntity.getCourseIdentiNo().equals(strCourseIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseScheduleLst(inList, tWhere);

		if (tList.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	private boolean existScheduleOption(List<ScheduleOptionEntity> inList, String strCourseIdentiNo) {

		List<ScheduleOptionEntity> tList = new ArrayList<ScheduleOptionEntity>();
		Predicate<ScheduleOptionEntity> tWhere;

		tWhere = (eScheduleOptionEntity ->
		// Add Where condition at here
		(eScheduleOptionEntity.getCourseIdentiNo() != null
				&& eScheduleOptionEntity.getCourseIdentiNo().equals(strCourseIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekScheduleOptionLst(inList, tWhere);

		if (tList.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	private double aveByScore(List<CourseCommentEntity> courseCommentEntityList) {

		double aveScore = 0.00;
		double sumScore = 0.00;
		for (int i = 0; i < courseCommentEntityList.size(); i++) {
			sumScore = sumScore + courseCommentEntityList.get(i).getScore().doubleValue();
		}
		aveScore = sumScore / courseCommentEntityList.size();
		return aveScore;
	}
}
