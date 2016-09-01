package com.kootour.service;

import java.util.List;

import com.kootour.common.ErrorInfo;

public interface TestDBUserOrderService {

	List<ErrorInfo> testSelectByPK();
	List<ErrorInfo> testSelectAll();
	List<ErrorInfo> testInsertOne();
}
