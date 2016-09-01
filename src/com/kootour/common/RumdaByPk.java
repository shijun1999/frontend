//Auto Generated 
package com.kootour.common;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.entity.PictureEntity;
import com.kootour.mapper.entity.PictureCommentEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.entity.UserOrderEntity;

public class RumdaByPk {
	public CourseEntity selectCourseByPk(List<CourseEntity> inList, String tLangId, String tCourseIdentiNo) {
		CourseEntity tCourseEntity = null;

		List<CourseEntity> tList = null;
		Predicate<CourseEntity> tWhere;

		tWhere = (eCourseEntity ->
		// Add Where condition at here
		(eCourseEntity.getLangId().equals(tLangId) && eCourseEntity.getCourseIdentiNo().equals(tCourseIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseLst(inList, tWhere);

		if (tList.size() > 0) {
			tCourseEntity = tList.get(0);
		} else {
			tCourseEntity = null;
		}
		return (tCourseEntity);
	}

	public CourseCommentEntity selectCourseCommentByPk(List<CourseCommentEntity> inList, String tLangId, String tCourseCommentIdentiNo) {
		CourseCommentEntity tCourseCommentEntity = null;

		List<CourseCommentEntity> tList = null;
		Predicate<CourseCommentEntity> tWhere;

		tWhere = (eCourseCommentEntity ->
		// Add Where condition at here
		(eCourseCommentEntity.getLangId().equals(tLangId) && eCourseCommentEntity.getCourseCommentIdentiNo().equals(tCourseCommentIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseCommentLst(inList, tWhere);

		if (tList.size() > 0) {
			tCourseCommentEntity = tList.get(0);
		} else {
			tCourseCommentEntity = null;
		}
		return (tCourseCommentEntity);
	}

	public CoursePictureEntity selectCoursePictureByPk(List<CoursePictureEntity> inList, String tLangId, String tCoursePictureIdentiNo) {
		CoursePictureEntity tCoursePictureEntity = null;

		List<CoursePictureEntity> tList = null;
		Predicate<CoursePictureEntity> tWhere;

		tWhere = (eCoursePictureEntity ->
		// Add Where condition at here
		(eCoursePictureEntity.getLangId().equals(tLangId) && eCoursePictureEntity.getCoursePictureIdentiNo().equals(tCoursePictureIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCoursePictureLst(inList, tWhere);

		if (tList.size() > 0) {
			tCoursePictureEntity = tList.get(0);
		} else {
			tCoursePictureEntity = null;
		}
		return (tCoursePictureEntity);
	}

	public CourseScheduleEntity selectCourseScheduleByPk(List<CourseScheduleEntity> inList, String tLangId, String tCourseScheduleIdentiNo) {
		CourseScheduleEntity tCourseScheduleEntity = null;

		List<CourseScheduleEntity> tList = null;
		Predicate<CourseScheduleEntity> tWhere;

		tWhere = (eCourseScheduleEntity ->
		// Add Where condition at here
		(eCourseScheduleEntity.getLangId().equals(tLangId) && eCourseScheduleEntity.getCourseScheduleIdentiNo().equals(tCourseScheduleIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseScheduleLst(inList, tWhere);

		if (tList.size() > 0) {
			tCourseScheduleEntity = tList.get(0);
		} else {
			tCourseScheduleEntity = null;
		}
		return (tCourseScheduleEntity);
	}

	public LocalhostEntity selectLocalhostByPk(List<LocalhostEntity> inList, String tLangId, String tLocalhostIdentiNo) {
		LocalhostEntity tLocalhostEntity = null;

		List<LocalhostEntity> tList = null;
		Predicate<LocalhostEntity> tWhere;

		tWhere = (eLocalhostEntity ->
		// Add Where condition at here
		(eLocalhostEntity.getLangId().equals(tLangId) && eLocalhostEntity.getLocalhostIdentiNo().equals(tLocalhostIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekLocalhostLst(inList, tWhere);

		if (tList.size() > 0) {
			tLocalhostEntity = tList.get(0);
		} else {
			tLocalhostEntity = null;
		}
		return (tLocalhostEntity);
	}

	public LocationMstEntity selectLocationMstByPk(List<LocationMstEntity> inList, String tLangId, String tIdentiNo) {
		LocationMstEntity tLocationMstEntity = null;

		List<LocationMstEntity> tList = null;
		Predicate<LocationMstEntity> tWhere;

		tWhere = (eLocationMstEntity ->
		// Add Where condition at here
		(eLocationMstEntity.getLangId().equals(tLangId) && eLocationMstEntity.getIdentiNo().equals(tIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekLocationMstLst(inList, tWhere);

		if (tList.size() > 0) {
			tLocationMstEntity = tList.get(0);
		} else {
			tLocationMstEntity = null;
		}
		return (tLocationMstEntity);
	}

	public PictureEntity selectPictureByPk(List<PictureEntity> inList, String tIdentiNo) {
		PictureEntity tPictureEntity = null;

		List<PictureEntity> tList = null;
		Predicate<PictureEntity> tWhere;

		tWhere = (ePictureEntity ->
		// Add Where condition at here
		(ePictureEntity.getIdentiNo().equals(tIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekPictureLst(inList, tWhere);

		if (tList.size() > 0) {
			tPictureEntity = tList.get(0);
		} else {
			tPictureEntity = null;
		}
		return (tPictureEntity);
	}

	public PictureCommentEntity selectPictureCommentByPk(List<PictureCommentEntity> inList, String tLangId, String tPictureIdentiNo) {
		PictureCommentEntity tPictureCommentEntity = null;

		List<PictureCommentEntity> tList = null;
		Predicate<PictureCommentEntity> tWhere;

		tWhere = (ePictureCommentEntity ->
		// Add Where condition at here
		(ePictureCommentEntity.getLangId().equals(tLangId) && ePictureCommentEntity.getPictureIdentiNo().equals(tPictureIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekPictureCommentLst(inList, tWhere);

		if (tList.size() > 0) {
			tPictureCommentEntity = tList.get(0);
		} else {
			tPictureCommentEntity = null;
		}
		return (tPictureCommentEntity);
	}

	public TouristEntity selectTouristByPk(List<TouristEntity> inList, String tLangId, String tTouristIdentiNo) {
		TouristEntity tTouristEntity = null;

		List<TouristEntity> tList = null;
		Predicate<TouristEntity> tWhere;

		tWhere = (eTouristEntity ->
		// Add Where condition at here
		(eTouristEntity.getLangId().equals(tLangId) && eTouristEntity.getTouristIdentiNo().equals(tTouristIdentiNo)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekTouristLst(inList, tWhere);

		if (tList.size() > 0) {
			tTouristEntity = tList.get(0);
		} else {
			tTouristEntity = null;
		}
		return (tTouristEntity);
	}

	public UserOrderEntity selectUserOrderByPk(List<UserOrderEntity> inList, String tLangId, String tOrderIdentiNo, String tCourseIdentiNo, String tLocalhostIdentiNo, String tTouristIdentiNo,
			Integer tReservationDate) {
		UserOrderEntity tUserOrderEntity = null;

		List<UserOrderEntity> tList = null;
		Predicate<UserOrderEntity> tWhere;

		tWhere = (eUserOrderEntity ->
		// Add Where condition at here
		(eUserOrderEntity.getLangId().equals(tLangId) && eUserOrderEntity.getOrderIdentiNo().equals(tOrderIdentiNo) && eUserOrderEntity.getCourseIdentiNo().equals(tCourseIdentiNo)
				&& eUserOrderEntity.getLocalhostIdentiNo().equals(tLocalhostIdentiNo) && eUserOrderEntity.getTouristIdentiNo().equals(tTouristIdentiNo)
				&& eUserOrderEntity.getReservationDate().equals(tReservationDate)));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekUserOrderLst(inList, tWhere);

		if (tList.size() > 0) {
			tUserOrderEntity = tList.get(0);
		} else {
			tUserOrderEntity = null;
		}
		return (tUserOrderEntity);
	}

}
