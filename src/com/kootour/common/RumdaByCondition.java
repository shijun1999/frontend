//Auto Generated 
package com.kootour.common;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.entity.PictureCommentEntity;
import com.kootour.mapper.entity.PictureEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.PictureParamEntity;

public class RumdaByCondition {

	public List<CourseInExclusionEntity> selectCourseInExclusionByCondition(List<CourseInExclusionEntity> inList, String tLangId, String tCourseIdentiNo) {

		List<CourseInExclusionEntity> tList = new ArrayList<CourseInExclusionEntity>();
		Predicate<CourseInExclusionEntity> tWhere;

		tWhere = (eCourseInExclusionEntity ->
		// Add Where condition at here
		(eCourseInExclusionEntity.getLangId() != null && eCourseInExclusionEntity.getLangId().equals(tLangId) && eCourseInExclusionEntity.getCourseIdentiNo() != null && eCourseInExclusionEntity.getCourseIdentiNo().equals(tCourseIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseInExclusionLst(inList, tWhere);

		return (tList);
	}



	public List<CourseCommentEntity> selectCourseCommentByCondition(List<CourseCommentEntity> inList, String tLangId, String tCourseCommentIdentiNo) {

		List<CourseCommentEntity> tList = new ArrayList<CourseCommentEntity>();
		Predicate<CourseCommentEntity> tWhere;

		tWhere = (eCourseCommentEntity ->
		// Add Where condition at here
		(eCourseCommentEntity.getLangId() != null && eCourseCommentEntity.getLangId().equals(tLangId) && eCourseCommentEntity.getCourseCommentIdentiNo() != null
				&& eCourseCommentEntity.getCourseCommentIdentiNo().equals(tCourseCommentIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseCommentLst(inList, tWhere);

		return (tList);
	}

	public List<CoursePictureEntity> selectCoursePictureByCondition(List<CoursePictureEntity> inList, String tLangId, String tCoursePictureIdentiNo) {

		List<CoursePictureEntity> tList = new ArrayList<CoursePictureEntity>();
		Predicate<CoursePictureEntity> tWhere;

		tWhere = (eCoursePictureEntity ->
		// Add Where condition at here
		(eCoursePictureEntity.getLangId() != null && eCoursePictureEntity.getLangId().equals(tLangId) && eCoursePictureEntity.getCoursePictureIdentiNo() != null
				&& eCoursePictureEntity.getCoursePictureIdentiNo().equals(tCoursePictureIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCoursePictureLst(inList, tWhere);

		return (tList);
	}

	public List<CourseScheduleEntity> selectCourseScheduleByCondition(List<CourseScheduleEntity> inList, String tLangId, String tCourseScheduleIdentiNo) {

		List<CourseScheduleEntity> tList = new ArrayList<CourseScheduleEntity>();
		Predicate<CourseScheduleEntity> tWhere;

		tWhere = (eCourseScheduleEntity ->
		// Add Where condition at here
		(eCourseScheduleEntity.getLangId() != null && eCourseScheduleEntity.getLangId().equals(tLangId) && eCourseScheduleEntity.getCourseScheduleIdentiNo() != null
				&& eCourseScheduleEntity.getCourseScheduleIdentiNo().equals(tCourseScheduleIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseScheduleLst(inList, tWhere);

		return (tList);
	}

	public List<LocalhostEntity> selectLocalhostByCondition(List<LocalhostEntity> inList, String tLangId, String tLocalhostIdentiNo) {

		List<LocalhostEntity> tList = new ArrayList<LocalhostEntity>();
		Predicate<LocalhostEntity> tWhere;

		tWhere = (eLocalhostEntity ->
		// Add Where condition at here
		(eLocalhostEntity.getLangId() != null && eLocalhostEntity.getLangId().equals(tLangId) && eLocalhostEntity.getLocalhostIdentiNo() != null
				&& eLocalhostEntity.getLocalhostIdentiNo().equals(tLocalhostIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekLocalhostLst(inList, tWhere);

		return (tList);
	}

	public List<LocationMstEntity> selectLocationMstByCondition(List<LocationMstEntity> inList, String tLangId, String tIdentiNo) {

		List<LocationMstEntity> tList = new ArrayList<LocationMstEntity>();
		Predicate<LocationMstEntity> tWhere;

		tWhere = (eLocationMstEntity ->
		// Add Where condition at here
		(eLocationMstEntity.getLangId() != null && eLocationMstEntity.getLangId().equals(tLangId) && eLocationMstEntity.getIdentiNo() != null && eLocationMstEntity.getIdentiNo().equals(tIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekLocationMstLst(inList, tWhere);

		return (tList);
	}

	public List<PictureEntity> selectPictureByCondition(List<PictureEntity> inList, String tIdentiNo) {

		List<PictureEntity> tList = new ArrayList<PictureEntity>();
		Predicate<PictureEntity> tWhere;

		tWhere = (ePictureEntity ->
		// Add Where condition at here
		(ePictureEntity.getIdentiNo() != null && ePictureEntity.getIdentiNo().equals(tIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekPictureLst(inList, tWhere);

		return (tList);
	}

	public List<PictureEntity> selectPictureByORCondition(List<PictureEntity> inList, PictureParamEntity pictureParamEntity) {

		List<PictureEntity> tList =  new ArrayList<PictureEntity>();
		Predicate<PictureEntity> tWhere;

		tWhere = (ePictureEntity ->
		// Add Where condition at here
		(ePictureEntity.getAdventure() != null && ePictureEntity.getAdventure().equals(pictureParamEntity.getAdventure())
				|| ePictureEntity.getCultureArts() != null && ePictureEntity.getCultureArts().equals(pictureParamEntity.getCultureArts())
				|| ePictureEntity.getFestivalEvents() != null && ePictureEntity.getFestivalEvents().equals(pictureParamEntity.getFestivalEvents())
				|| ePictureEntity.getFoodDrink() != null && ePictureEntity.getFoodDrink().equals(pictureParamEntity.getFoodDrink())
				|| ePictureEntity.getHistorical() != null && ePictureEntity.getHistorical().equals(pictureParamEntity.getHistorical())
				|| ePictureEntity.getLeisureSports() != null && ePictureEntity.getLeisureSports().equals(pictureParamEntity.getLeisureSports())
				|| ePictureEntity.getNatureRural() != null && ePictureEntity.getNatureRural().equals(pictureParamEntity.getNatureRural())
				|| ePictureEntity.getNightlifeParty() != null && ePictureEntity.getNightlifeParty().equals(pictureParamEntity.getNightlifeParty())
				|| ePictureEntity.getShoppingMarket() != null && ePictureEntity.getShoppingMarket().equals(pictureParamEntity.getShoppingMarket())
				|| ePictureEntity.getOtherType1() != null && ePictureEntity.getOtherType1().equals(pictureParamEntity.getOtherType1())
				|| ePictureEntity.getOtherType2() != null && ePictureEntity.getOtherType2().equals(pictureParamEntity.getOtherType2())
				|| ePictureEntity.getOtherType3() != null && ePictureEntity.getOtherType3().equals(pictureParamEntity.getOtherType3())));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekPictureLst(inList, tWhere);

		return (tList);
	}

	public List<PictureCommentEntity> selectPictureCommentByCondition(List<PictureCommentEntity> inList, String tLangId, String tPictureIdentiNo) {

		List<PictureCommentEntity> tList = new ArrayList<PictureCommentEntity>();
		Predicate<PictureCommentEntity> tWhere;

		tWhere = (ePictureCommentEntity ->
		// Add Where condition at here
		(ePictureCommentEntity.getLangId() != null && ePictureCommentEntity.getLangId().equals(tLangId) && ePictureCommentEntity.getPictureIdentiNo() != null
				&& ePictureCommentEntity.getPictureIdentiNo().equals(tPictureIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekPictureCommentLst(inList, tWhere);

		return (tList);
	}

	public List<TouristEntity> selectTouristByCondition(List<TouristEntity> inList, String tLangId, String tTouristIdentiNo) {

		List<TouristEntity> tList = new ArrayList<TouristEntity>();
		Predicate<TouristEntity> tWhere;

		tWhere = (eTouristEntity ->
		// Add Where condition at here
		(eTouristEntity.getLangId() != null && eTouristEntity.getLangId().equals(tLangId) && eTouristEntity.getTouristIdentiNo() != null
				&& eTouristEntity.getTouristIdentiNo().equals(tTouristIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekTouristLst(inList, tWhere);

		return (tList);
	}

	public List<UserOrderEntity> selectUserOrderByCondition(List<UserOrderEntity> inList, String tLangId, String tOrderIdentiNo, String tCourseIdentiNo, String tLocalhostIdentiNo,
			String tTouristIdentiNo, Integer tReservationDate) {

		List<UserOrderEntity> tList = new ArrayList<UserOrderEntity>();
		Predicate<UserOrderEntity> tWhere;

		tWhere = (eUserOrderEntity ->
		// Add Where condition at here
		(eUserOrderEntity.getLangId() != null && eUserOrderEntity.getLangId().equals(tLangId) && eUserOrderEntity.getOrderIdentiNo() != null
				&& eUserOrderEntity.getOrderIdentiNo().equals(tOrderIdentiNo) && eUserOrderEntity.getCourseIdentiNo() != null && eUserOrderEntity.getCourseIdentiNo().equals(tCourseIdentiNo)
				&& eUserOrderEntity.getLocalhostIdentiNo() != null && eUserOrderEntity.getLocalhostIdentiNo().equals(tLocalhostIdentiNo) && eUserOrderEntity.getTouristIdentiNo() != null
				&& eUserOrderEntity.getTouristIdentiNo().equals(tTouristIdentiNo) && eUserOrderEntity.getReservationDate() != null && eUserOrderEntity.getReservationDate().equals(tReservationDate)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekUserOrderLst(inList, tWhere);

		return (tList);
	}
	
	public List<ScheduleOptionEntity> selectScheduleOptionByCondition(List<ScheduleOptionEntity> inList, String tLangId,
			String tScheduleOptionIdentiNo) {
		ScheduleOptionEntity tScheduleOptionEntity = null;

		List<ScheduleOptionEntity> tList = null;
		Predicate<ScheduleOptionEntity> tWhere;

		tWhere = (eScheduleOptionEntity ->
		// Add Where condition at here
		(eScheduleOptionEntity.getLangId() != null && eScheduleOptionEntity.getLangId().equals(tLangId)
				&& eScheduleOptionEntity.getScheduleOptionIdentiNo() != null
				&& eScheduleOptionEntity.getScheduleOptionIdentiNo().equals(tScheduleOptionIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekScheduleOptionLst(inList, tWhere);

		return (tList);
	}
	
}
