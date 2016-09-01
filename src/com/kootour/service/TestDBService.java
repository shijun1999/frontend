package com.kootour.service;

import java.util.List;

import com.kootour.common.ErrorInfo;
public interface TestDBService {
	List<ErrorInfo> selectAll();
	void insertAllCourseSchedule();
//	void testUser_order();
}
