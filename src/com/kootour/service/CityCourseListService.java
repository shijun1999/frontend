package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CityCourseListEntity;
public interface CityCourseListService {
	CityCourseListEntity cityChange(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap);
	CityCourseListEntity load(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap);
//	CityCourseListEntity detail(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap);
//	CityCourseListEntity myFavorite(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap);
	CityCourseListEntity addMyFavorite(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap);
	CityCourseListEntity mailConfirm(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap);
	CityCourseListEntity courseFilter(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap);
//	CityCourseListEntity loadTest(CityCourseListEntity cityCourseListEntity, Map<String, Object> paraMap);

}
