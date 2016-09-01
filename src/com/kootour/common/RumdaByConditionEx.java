package com.kootour.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.entity.CourseOrderVEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;

public class RumdaByConditionEx {

	public List<CourseEntity> selectCourseByCity(List<CourseEntity> inList, String tCity) {

		List<CourseEntity> tList = new ArrayList<CourseEntity>();
		Predicate<CourseEntity> tWhere;

		tWhere = (eCourseEntity ->
		// Add Where condition at here
		(eCourseEntity.getLocationKey().contains(tCity)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseLst(inList, tWhere);

		return (tList);
	}

	public List<CourseEntity> selectCourseByLang(List<CourseEntity> inList, String tLangId, String tCourseIdentiNo) {

		List<CourseEntity> tList = new ArrayList<CourseEntity>();
		Predicate<CourseEntity> tWhere;

		tWhere = (eCourseEntity ->
		// Add Where condition at here
		(eCourseEntity.getLangId() != null && eCourseEntity.getLangId().equals(tLangId)
				&& eCourseEntity.getCourseIdentiNo() != null
				&& eCourseEntity.getCourseIdentiNo().equals(tCourseIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseLst(inList, tWhere);

		return (tList);
	}

	public List<CourseEntity> selectCourseByType(List<CourseEntity> inList, CourseParamEntity courseParamEntity) {

		List<CourseEntity> tList = new ArrayList<CourseEntity>();
		Predicate<CourseEntity> tWhere;

		tWhere = (eCourseEntity ->
		// Add Where condition at here
		(eCourseEntity.getAdventure() != null && eCourseEntity.getAdventure().equals(courseParamEntity.getAdventure())
				|| eCourseEntity.getCultureArts() != null
						&& eCourseEntity.getCultureArts().equals(courseParamEntity.getCultureArts())
				|| eCourseEntity.getFestivalEvents() != null
						&& eCourseEntity.getFestivalEvents().equals(courseParamEntity.getFestivalEvents())
				|| eCourseEntity.getFoodDrink() != null
						&& eCourseEntity.getFoodDrink().equals(courseParamEntity.getFoodDrink())
				|| eCourseEntity.getHistorical() != null
						&& eCourseEntity.getHistorical().equals(courseParamEntity.getHistorical())
				|| eCourseEntity.getLeisureSports() != null
						&& eCourseEntity.getLeisureSports().equals(courseParamEntity.getLeisureSports())
				|| eCourseEntity.getNatureRural() != null
						&& eCourseEntity.getNatureRural().equals(courseParamEntity.getNatureRural())
				|| eCourseEntity.getNightlifeParty() != null
						&& eCourseEntity.getNightlifeParty().equals(courseParamEntity.getNightlifeParty())
				|| eCourseEntity.getShoppingMarket() != null
						&& eCourseEntity.getShoppingMarket().equals(courseParamEntity.getShoppingMarket())
				|| eCourseEntity.getOtherType1() != null
						&& eCourseEntity.getOtherType1().equals(courseParamEntity.getOtherType1())
				|| eCourseEntity.getOtherType2() != null
						&& eCourseEntity.getOtherType2().equals(courseParamEntity.getOtherType2())
				|| eCourseEntity.getOtherType3() != null
						&& eCourseEntity.getOtherType3().equals(courseParamEntity.getOtherType3())));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseLst(inList, tWhere);

		return (tList);
	}

	public List<CourseEntity> selectCourseByInCondition(List<CourseEntity> inList,
			CourseParamEntity courseParamEntity) {

		List<CourseEntity> tList = new ArrayList<CourseEntity>();
		Predicate<CourseEntity> tWhere;

		tWhere = (eCourseEntity -> eCourseEntity.getUseLangId().contains(courseParamEntity.getUseLangId1Disp())
				&& courseParamEntity.getUseLangId1Disp().length() > 0
				|| eCourseEntity.getUseLangId().contains(courseParamEntity.getUseLangId2Disp())
						&& courseParamEntity.getUseLangId2Disp().length() > 0
				|| eCourseEntity.getUseLangId().contains(courseParamEntity.getUseLangId3Disp())
						&& courseParamEntity.getUseLangId3Disp().length() > 0);

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseLst(inList, tWhere);

		return (tList);
	}

	public List<CourseScheduleEntity> selectCourseByBetweenAndCondition(List<CourseScheduleEntity> inList,
			String strStartDate, String strEndDate) {

		List<CourseScheduleEntity> tList = new ArrayList<CourseScheduleEntity>();
		Predicate<CourseScheduleEntity> tWhere;

		tWhere = (eCourseScheduleEntity -> eCourseScheduleEntity.getStatus().equals("1")
				&& eCourseScheduleEntity.getWorkDate().compareTo(strStartDate) >= 0
				&& eCourseScheduleEntity.getWorkDate().compareTo(strEndDate) <= 0);

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseScheduleLst(inList, tWhere);

		return (tList);
	}

	public List<CourseCommentEntity> selectCourseCommentByCourseIdentiNo(List<CourseCommentEntity> inList,
			String strCourseIdentiNo) {

		List<CourseCommentEntity> tList = new ArrayList<CourseCommentEntity>();
		Predicate<CourseCommentEntity> tWhere;

		tWhere = (eCourseCommentEntity -> (KooUtil.isNotNull(strCourseIdentiNo)
				&& eCourseCommentEntity.getCourseIdentiNo().equals(strCourseIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseCommentLst(inList, tWhere);

		return (tList);
	}

	public List<TouristEntity> selectTouristByCondition(List<TouristEntity> inList, String strDateYM) {

		List<TouristEntity> tList = new ArrayList<TouristEntity>();
		Predicate<TouristEntity> tWhere;

		SimpleDateFormat df = new SimpleDateFormat("yyyyMM");

		tWhere = (eTouristEntity -> df.format(eTouristEntity.getCreateTime()).equals(strDateYM));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekTouristLst(inList, tWhere);

		return (tList);
	}

	public List<LocalhostEntity> selectLocalhostBylocalhostIdentiNo(List<LocalhostEntity> inList,
			String tLocalhostIdentiNo) {

		List<LocalhostEntity> tList = new ArrayList<LocalhostEntity>();
		Predicate<LocalhostEntity> tWhere;

		tWhere = (eCoursePictureEntity -> (eCoursePictureEntity.getLocalhostIdentiNo() != null
				&& eCoursePictureEntity.getLocalhostIdentiNo().equals(tLocalhostIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekLocalhostLst(inList, tWhere);

		return (tList);
	}

	public List<LocalhostEntity> selectLocalhostByCondition(List<LocalhostEntity> inList, String strDateYM) {

		List<LocalhostEntity> tList = new ArrayList<LocalhostEntity>();
		Predicate<LocalhostEntity> tWhere;

		SimpleDateFormat df = new SimpleDateFormat("yyyyMM");

		tWhere = (eLocalhostEntity -> df.format(eLocalhostEntity.getCreateTime()).equals(strDateYM));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekLocalhostLst(inList, tWhere);

		return (tList);
	}

	public List<CourseEntity> selectCourseByCondition(List<CourseEntity> inList, String strDateYM) {

		List<CourseEntity> tList = new ArrayList<CourseEntity>();
		Predicate<CourseEntity> tWhere;

		SimpleDateFormat df = new SimpleDateFormat("yyyyMM");

		tWhere = (eCourseEntity -> df.format(eCourseEntity.getCreateTime()).equals(strDateYM));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseLst(inList, tWhere);

		return (tList);
	}

	public List<UserOrderEntity> selectUserOrderByCreateYyyyMM(List<UserOrderEntity> inList, String strDateYM) {

		List<UserOrderEntity> tList = new ArrayList<UserOrderEntity>();
		Predicate<UserOrderEntity> tWhere;

		SimpleDateFormat df = new SimpleDateFormat("yyyyMM");

		tWhere = (eUserOrderEntity -> df.format(eUserOrderEntity.getCreateTime()).equals(strDateYM));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekUserOrderLst(inList, tWhere);

		return (tList);
	}

	public List<UserOrderEntity> selectUserOrderByOrderYyyyMMdd(List<UserOrderEntity> inList, String strDateYMD) {

		List<UserOrderEntity> tList = new ArrayList<UserOrderEntity>();
		Predicate<UserOrderEntity> tWhere;

		tWhere = (eUserOrderEntity -> eUserOrderEntity.getOrderDate().equals(strDateYMD));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekUserOrderLst(inList, tWhere);

		return (tList);
	}

	public List<CourseScheduleEntity> selectCourseScheduleByStatusBgnDate(List<CourseScheduleEntity> inList,
			String status, String bgnDate) {

		List<CourseScheduleEntity> tList = new ArrayList<CourseScheduleEntity>();
		Predicate<CourseScheduleEntity> tWhere;

		tWhere = (eCourseScheduleEntity -> (eCourseScheduleEntity.getStatus().equals(status)
				&& eCourseScheduleEntity.getWorkDate().compareTo(bgnDate) >= 0));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseScheduleLst(inList, tWhere);

		return (tList);
	}

	public List<CourseScheduleEntity> selectCourseScheduleByDate(List<CourseScheduleEntity> inList, String strDate) {

		List<CourseScheduleEntity> tList = new ArrayList<CourseScheduleEntity>();
		Predicate<CourseScheduleEntity> tWhere;

		tWhere = (eCourseScheduleEntity -> (eCourseScheduleEntity.getWorkDate().equals(strDate)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseScheduleLst(inList, tWhere);

		return (tList);
	}

	public List<CourseOrderVEntity> selectCourseOrderViewByOrderYyyyMMdd(List<CourseOrderVEntity> inList,
			String strDateYMD) {

		List<CourseOrderVEntity> tList = new ArrayList<CourseOrderVEntity>();
		Predicate<CourseOrderVEntity> tWhere;

		tWhere = (eCourseOrderVEntity -> eCourseOrderVEntity.getOrderDate().equals(strDateYMD));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseOrderVLst(inList, tWhere);

		return (tList);
	}

	public List<ScheduleOptionEntity> selectScheduleOptionByDate(List<ScheduleOptionEntity> inList,
			String courseIdentiNo, String bgnDate, String endDate) {
		List<ScheduleOptionEntity> tList = null;
		Predicate<ScheduleOptionEntity> tWhere;

		tWhere = (eScheduleOption -> (eScheduleOption.getCourseIdentiNo().equals(courseIdentiNo)
				&& !((eScheduleOption.getEndDate().compareTo(bgnDate) < 0)
						|| (eScheduleOption.getBgnDate().compareTo(endDate) > 0))));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekScheduleOptionLst(inList, tWhere);

		return (tList);
	}

	public List<CoursePictureEntity> selectCoursePictureByCourseIdentiNo(List<CoursePictureEntity> inList,
			String tCourseIdentiNo) {

		List<CoursePictureEntity> tList = new ArrayList<CoursePictureEntity>();
		Predicate<CoursePictureEntity> tWhere;

		tWhere = (eCoursePictureEntity -> (eCoursePictureEntity.getCourseIdentiNo() != null
				&& eCoursePictureEntity.getCourseIdentiNo().equals(tCourseIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCoursePictureLst(inList, tWhere);

		return (tList);
	}

	public List<CourseInExclusionEntity> selectCourseInExclusionByCondition(List<CourseInExclusionEntity> inList,
			String tInExType, String tCourseIdentiNo) {

		List<CourseInExclusionEntity> tList = new ArrayList<CourseInExclusionEntity>();
		Predicate<CourseInExclusionEntity> tWhere;

		tWhere = (eCourseInExclusionEntity -> (eCourseInExclusionEntity.getInExclusionType() != null
				&& eCourseInExclusionEntity.getInExclusionType().equals(tInExType)
				&& eCourseInExclusionEntity.getCourseIdentiNo() != null
				&& eCourseInExclusionEntity.getCourseIdentiNo().equals(tCourseIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseInExclusionLst(inList, tWhere);

		return (tList);
	}

	public List<LocationMstEntity> filterLocationMstByEmptyCity(List<LocationMstEntity> inList) {
		RumdaBase rumdaBase = new RumdaBase();

		Predicate<LocationMstEntity> tWhere = (eLocationMstEntity -> eLocationMstEntity.getCityName().length() > 0);
		List<LocationMstEntity> tList = rumdaBase.seekLocationMstLst(inList, tWhere);

		return tList;
	}

	public List<LocationMstEntity> filterLocationMstByType(List<LocationMstEntity> inList) {
		RumdaBase rumdaBase = new RumdaBase();

		Predicate<LocationMstEntity> tWhere = (eLocationMstEntity -> eLocationMstEntity.getType()
				.equals(KooConst.ST_CITY));
		List<LocationMstEntity> tList = rumdaBase.seekLocationMstLst(inList, tWhere);

		return tList;
	}

	public List<FavoriteEntity> selectFavoriteByTouristNoAndCourseNo(List<FavoriteEntity> inList,
			String tCourseIdentiNo) {

		List<FavoriteEntity> tList = new ArrayList<FavoriteEntity>();
		Predicate<FavoriteEntity> tWhere;
		
		tWhere = (eFavoriteEntity -> (eFavoriteEntity.getObjIdentiNo() != null
				&& eFavoriteEntity.getObjIdentiNo().equals(tCourseIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekFavoriteLst(inList, tWhere);

		return (tList);
	}
}