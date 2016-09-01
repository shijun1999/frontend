package com.kootour.service;

import java.util.List;

import com.kootour.common.MenuInfo;
import com.kootour.common.SessionInfo;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.UserOrderEntity;

public interface CommonService {

	SessionInfo initSessionInfo();

	MenuInfo makeMenuLevel_0();

	MenuInfo makeMenuLevel_1(String inCityName, String inCityId);

	MenuInfo makeMenuLevel_2(String inCourseName, String inCourseId);

	MenuInfo makeMenuLevel_3();

	MenuInfo makeMenuLevel_4();

	Double calcSubTotalMoney(UserOrderEntity tUserOrderEntity, ScheduleOptionEntity tScheduleOptionEntity);

	Double calcExtraMoney(UserOrderEntity tUserOrderEntity, ScheduleOptionEntity tScheduleOptionEntity);

	Double calcTotalMoney(Double tSubTotalMoney, Double tExtraTotalMoney, Double tTax);
}
