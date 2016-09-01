package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseFilterEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;

public interface CourseService {

	List<CourseEntity> calcMinPrice(List<CourseEntity> courseEntityList ,String bgnDate,String endDate,String discontFlg);

	List<CourseEntity> mergeCourseByScheduleWorkDay(List<CourseEntity> courseEntityList ,String bgnDate,String endDate);
	
	List<CourseEntity> addPictureToCourse(List<CourseEntity> courseEntityList );

	List<CourseEntity> addCommentInfoToCourse(List<CourseEntity> courseEntityList );

	List<CourseEntity> addInExInfoToCourse(List<CourseEntity> courseEntityList );

	List<CourseEntity> addOtherInfoToCourse(List<CourseEntity> courseEntityList );

	List<CourseEntity> filterCourseByType(List<CourseEntity> courseEntityList,CourseFilterEntity ourseFilterEntity);

	List<CourseEntity> filterCourseByLang(List<CourseEntity> courseEntityList,CourseFilterEntity ourseFilterEntity);

	List<CourseEntity> filterCourseByCity(List<CourseEntity> courseEntityList,String city);
   
	List<CourseEntity> addFavoriteInfoToCourse(List<CourseEntity> courseEntityList,String tTouristNo);

	void testSort();


}
