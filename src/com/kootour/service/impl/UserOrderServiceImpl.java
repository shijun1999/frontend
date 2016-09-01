package com.kootour.service.impl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.RumdaByConditionEx;
import com.kootour.common.ScheduleOrderInfo;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseOrderVEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.CourseOrderVParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CourseScheduleParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
import com.kootour.service.UserOrderService;
import com.kootour.service4db.CourseOrderVService4DB;
import com.kootour.service4db.CourseScheduleService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.ScheduleOptionService4DB;
import com.kootour.service4db.SequenceService4DB;
import com.kootour.service4db.UserOrderService4DB;
@Configuration
@Service
public class UserOrderServiceImpl implements UserOrderService {
	@Autowired
	private UserOrderService4DB userOrderService4DB;
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired
	private ScheduleOptionService4DB scheduleOptionService4DB;
	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;
	@Autowired
	private CourseScheduleService4DB courseScheduleService4DB;
	@Autowired
	private CourseOrderVService4DB courseOrderVService4DB;

	private static Logger logger = Logger.getLogger(UserOrderServiceImpl.class);

	@Override
	public UserOrderEntity save(UserOrderEntity userOrderEntity, Map<String, Object> paraMap) {
		UserOrderEntity rtnResult = new UserOrderEntity();
		rtnResult=userOrderEntity;
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		//TODO zhi 0506
		String strSysDate ="";
		CourseEntity courseEntity = (CourseEntity) paraMap.get(KooConst.MAP_COURSEENTITY);
//		if (userOrderEntity.getAdultPrice() == null) {
//			
//			ErrorInfo tErrorInfo = new ErrorInfo();
//			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM018);
//			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
//			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
//			tErrorInfo.setDispOrder(1);
//			tList.add(tErrorInfo);
//			paraMap.put(KooConst.ST_ERRORINFO, tList);
//			logger.error(KooConst.INFO_MSG_002);
//			return (rtnResult);
//		}

		int infantNum = 0;
		int childNum = 0;
		int oldPersonNum = 0;
		int adultNum = 0;
		int sumNum = 0;
//		if (userOrderEntity.getAdultNum() != null) {
//			adultNum = userOrderEntity.getAdultNum().intValue();
//		}
//
//		if (userOrderEntity.getChildNum() != null) {
//			childNum = userOrderEntity.getChildNum().intValue();
//		}
//		if (userOrderEntity.getInfantNum() != null) {
//			infantNum = userOrderEntity.getInfantNum().intValue();
//		}
//		if (userOrderEntity.getOldPersonNum() != null) {
//			oldPersonNum = userOrderEntity.getOldPersonNum().intValue();
//		}
		sumNum = oldPersonNum + childNum + infantNum + adultNum;	
		
		int maxTouristNum = courseEntity.getMaxTouristNum().intValue();
		
		if (sumNum > maxTouristNum) {
			
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(courseEntity.getMaxTouristNum().toString());
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.ERR_MSG_008);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_008);
			return (rtnResult);
		}
		

		rtnResult.setLangId(userOrderEntity.getLangId());
		rtnResult.setCourseIdentiNo(courseEntity.getCourseIdentiNo());
		rtnResult.setLocalhostIdentiNo(courseEntity.getLocalhostIdentiNo());
		rtnResult.setTouristIdentiNo(userOrderEntity.getTouristIdentiNo());
		rtnResult.setReservationDate(userOrderEntity.getReservationDate());
		rtnResult.setOrderDate(strSysDate);
		rtnResult.setStatus("1");
		rtnResult.setConsent("0");
		rtnResult.setCancelDate(null);
		rtnResult.setMoneyUnit(courseEntity.getMoneyUnit());
		rtnResult.setPersonOrGroup("1");
//		rtnResult.setOldPersonNum(userOrderEntity.getOldPersonNum());
//		rtnResult.setChildNum(userOrderEntity.getChildNum());
//		rtnResult.setAdultNum(userOrderEntity.getAdultNum());
//		rtnResult.setInfantNum(userOrderEntity.getInfantNum());
		rtnResult.setPersonOrGroup(courseEntity.getPersonOrGroup());
//		rtnResult.setPeriod4Day(courseEntity.getPeriod4Day());
//		rtnResult.setPeriod4Hour(courseEntity.getPeriod4Hour());
//		rtnResult.setPeriod4Minute(courseEntity.getPeriod4Minute());
//		rtnResult.setTimetableIdx(courseEntity.getTimetableIdx());
//		rtnResult.setTimetableName(courseEntity.getTimetableName());
		rtnResult.setTips(new Double(0));

		double totalMoney = new Double(0);
		Double dChildPrice = new Double(0);
		Double dOldPersonPrice = new Double(0);
		Double dInfantPrice = new Double(0);

		if (userOrderEntity.getPersonOrGroup().equals("p")) {
			
//			Double dAdultPrice = new Double(userOrderEntity.getAdultPrice());
//
//			if (KooUtil.isNotNull(userOrderEntity.getChildPrice())) {
//
//				dChildPrice = new Double(userOrderEntity.getChildPrice());
//			} else {
//				dChildPrice = new Double(userOrderEntity.getAdultPrice());
//			}
//			if (userOrderEntity.getInfantPrice() != null) {
//
//				dInfantPrice = userOrderEntity.getInfantPrice();
//			} else {
//				dInfantPrice = dChildPrice;
//			}
//			if (KooUtil.isNotNull(userOrderEntity.getOldPersonPrice())) {
//				dOldPersonPrice = new Double(userOrderEntity.getOldPersonPrice());
//			} else {
//				dOldPersonPrice = new Double(userOrderEntity.getAdultPrice());
//			}
			
			// total
//			totalMoney = adultNum * dAdultPrice.doubleValue() + 
//					oldPersonNum * dOldPersonPrice.doubleValue() +
//					childNum * dChildPrice.doubleValue() + infantNum * dInfantPrice;
//			
			rtnResult.setTotalMoney(totalMoney);
		} else {
			
//			rtnResult.setTotalMoney(new Double(userOrderEntity.getAdultPrice()));
		}

		String strOrderIdentiNo = "";
		try {
			
			strOrderIdentiNo = sequenceService4DB.createSequence(KooConst.ST_USERORDER);
			rtnResult.setOrderIdentiNo(strOrderIdentiNo);
		} catch (Exception e) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM013);
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_004);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_004);
			return (rtnResult);
		}

		try {

			userOrderService4DB.insertOne(rtnResult);
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM012);
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_003);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} catch (Exception e) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM012 + "[" + userOrderEntity.getLangId() + "," + strOrderIdentiNo + "]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_005);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_005);
			return (rtnResult);
		}

		try {
			
			CourseParamEntity courseParamEntity = new CourseParamEntity();

			courseParamEntity.setLangId(userOrderEntity.getLangId());
			courseParamEntity.setCourseIdentiNo(userOrderEntity.getCourseIdentiNo());
			courseParamEntity.setLocalhostIdentiNo(userOrderEntity.getLocalhostIdentiNo());

			List<CourseEntity> courseEntityList = courseService4DB.selectByPK(courseParamEntity);
			if (courseEntityList.isEmpty()) {
				
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[selectByPK]");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
				paraMap.put(KooConst.ST_ERRORINFO, tList);
				logger.error(KooConst.INFO_MSG_002);
				return (rtnResult);
			} 
			
			CourseEntity courseEntityByUpdate = courseEntityList.get(0);
			
			if (courseEntityByUpdate.getModifyTime() == courseEntity.getModifyTime()) {
				
				courseService4DB.updateByPK(courseEntityByUpdate);
			} else {
				
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001);
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_007);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
				paraMap.put(KooConst.ST_ERRORINFO, tList);
				logger.error(KooConst.INFO_MSG_007);
				return (rtnResult);
			}
			
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001);
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_006);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} catch (Exception e) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM012 + "[" + userOrderEntity.getLangId() + "," + strOrderIdentiNo + "]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			logger.error(KooConst.INFO_MSG_001);
		}
		
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}

	@Override
	public UserOrderEntity load(UserOrderEntity userOrderEntity, Map<String, Object> paraMap) {
		UserOrderEntity rtnResult = new UserOrderEntity();
		rtnResult=userOrderEntity;
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		CourseParamEntity courseParamEntity = new CourseParamEntity();

		courseParamEntity.setLangId(userOrderEntity.getLangId());
		courseParamEntity.setCourseIdentiNo(userOrderEntity.getCourseIdentiNo());
		courseParamEntity.setLocalhostIdentiNo(userOrderEntity.getLocalhostIdentiNo());

		List<CourseEntity> courseEntityList = courseService4DB.selectByPK(courseParamEntity);
		if (courseEntityList.isEmpty()) {
			
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[selectByPK]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_002);
			return (rtnResult);
		} else {
			
			CourseEntity courseEntity = courseEntityList.get(0);
			rtnResult.setMoneyUnit(courseEntity.getMoneyUnit());
			rtnResult.setCourseFullName(courseEntity.getFullName());
			rtnResult.setPersonOrGroup(courseEntity.getPersonOrGroup());
			
			//TODO:MinTouristNum
//			rtnResult.setMinTouristNum(courseEntity.getMinTouristNum());
//			rtnResult.setMaxTouristNum(courseEntity.getMaxTouristNum());
			paraMap.put(KooConst.MAP_COURSEENTITY, courseEntity);
		}

		LocalhostParamEntity localhostParamEntity = new LocalhostParamEntity();
		localhostParamEntity.setLangId(userOrderEntity.getLangId());
		localhostParamEntity.setLocalhostIdentiNo(userOrderEntity.getLocalhostIdentiNo());
		List<LocalhostEntity> localhostEntityList= localhostService4DB.selectByPK(localhostParamEntity);
		if (localhostEntityList.isEmpty()) {
			
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM002 + "[selectByPK]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {
			
			LocalhostEntity localhostEntity = localhostEntityList.get(0);
			// TODO:
//			rtnResult.setLocalhostFullName(localhostEntity.getFullName());
			paraMap.put(KooConst.MAP_LOCALHOSTENTITY, localhostEntity);
		}

		ScheduleOptionParamEntity scheduleOptionParamEntity = new  ScheduleOptionParamEntity(); 
		scheduleOptionParamEntity.setLangId(userOrderEntity.getLangId());
		scheduleOptionParamEntity.setCourseIdentiNo(userOrderEntity.getCourseIdentiNo());
		List<ScheduleOptionEntity> scheduleOptionEntityList= scheduleOptionService4DB.selectByCondition(scheduleOptionParamEntity);
		
		if (scheduleOptionEntityList.isEmpty()) {
			
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM019 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			return (rtnResult);
		} else {
			
			// TODO:sortBy
			ScheduleOptionEntity scheduleOptionEntity = scheduleOptionEntityList.get(0);
			
			double dPrice = scheduleOptionEntity.getPrice().doubleValue();
			rtnResult.setPrice(dPrice);
			rtnResult.setDiscountPrice(new Double(dPrice));
			if (KooUtil.isNotNull(scheduleOptionEntity.getDiscountFlg()) && scheduleOptionEntity.getDiscountFlg().equals("1")) {
				
				if (KooUtil.isNotNull(scheduleOptionEntityList.get(0).getDiscountPercent())) {

					dPrice = dPrice*(1-scheduleOptionEntityList.get(0).getDiscountPercent().doubleValue()/100);
				} else {
					
					dPrice = dPrice - scheduleOptionEntityList.get(0).getDiscountValue().doubleValue();
				}	
				rtnResult.setDiscountPrice(new Double(dPrice));
			}
			
//			paraMap.put(KooConst.MAP_LOCALHOSTENTITY, localhostEntity);
		}
		
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}

	
	@Override
	public List<ScheduleOrderInfo> calcOrderInfoForMonth(String langId, String localhostIdentiNo, String strYyyymm){
		List<ScheduleOrderInfo> rtnList = new ArrayList<>();
		
		CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();
		courseScheduleParamEntity.setLangId(langId);
		courseScheduleParamEntity.setLocalhostIdentiNo(localhostIdentiNo);
		List<CourseScheduleEntity> courseScheduleEntityList = courseScheduleService4DB
				.selectByCondition(courseScheduleParamEntity);
		
		if (courseScheduleEntityList != null && courseScheduleEntityList.size() > 0) {

			LocalDate dateBgn = LocalDate.parse(strYyyymm + "01", DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"
			LocalDate dateEnd = dateBgn.with(TemporalAdjusters.lastDayOfMonth());

			CourseOrderVParamEntity courseOrderVParamEntity =new CourseOrderVParamEntity();
			courseOrderVParamEntity.setLangId(langId);
			courseOrderVParamEntity.setLocalhostIdentiNo(localhostIdentiNo);
			courseOrderVParamEntity.setBgnOrderDate(dateBgn.format(DateTimeFormatter.BASIC_ISO_DATE));
			courseOrderVParamEntity.setEndOrderDate(dateEnd.format(DateTimeFormatter.BASIC_ISO_DATE));
			
			List<CourseOrderVEntity> courseOrderVEntityList =courseOrderVService4DB.selectByCondition(courseOrderVParamEntity);
			
			while (dateBgn.isBefore(dateEnd) || dateBgn.isEqual(dateEnd)) {
				ScheduleOrderInfo scheduleOrderInfo=new ScheduleOrderInfo();
				String strYyyymmdd = dateBgn.format(DateTimeFormatter.BASIC_ISO_DATE);
				scheduleOrderInfo.setProcessDate(strYyyymmdd);
				RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
				List<CourseScheduleEntity> courseScheduleEntityList4Date = rumdaEx
						.selectCourseScheduleByDate(courseScheduleEntityList, strYyyymmdd);
				scheduleOrderInfo.setCourseStatus(KooConst.ST_COURSE_STATUS_NOT_YET);// 未登録
				if (courseScheduleEntityList4Date != null && courseScheduleEntityList4Date.size() > 0) {
					List<String> tStatusList =  courseScheduleEntityList4Date.stream()
							.map(schedule -> schedule.getStatus())
							.collect(Collectors.toList());
					
					if (tStatusList.contains(KooConst.ST_INACTIVE)) {
						scheduleOrderInfo.setCourseStatus(KooConst.ST_COURSE_STATUS_INACTIVE);// 休止
					} else if (!tStatusList.contains(KooConst.ST_WORK) && !tStatusList.contains(KooConst.ST_NOT_WORK)) {
						scheduleOrderInfo.setCourseStatus(KooConst.ST_COURSE_STATUS_NOT_FREE);// 予約不可
					} else if (tStatusList.contains(KooConst.ST_WORK) && tStatusList.contains(KooConst.ST_ORDERED)) {
						scheduleOrderInfo.setCourseStatus(KooConst.ST_COURSE_STATUS_PART_FREE);// 部分予約、予約可
					} else if (tStatusList.contains(KooConst.ST_WORK) && !tStatusList.contains(KooConst.ST_ORDERED)) {
						scheduleOrderInfo.setCourseStatus(KooConst.ST_COURSE_STATUS_FREE); // 予約無し
					} else if (tStatusList.contains(KooConst.ST_NOT_WORK)) {
						scheduleOrderInfo.setCourseStatus(KooConst.ST_COURSE_STATUS_NOT_WORK); // 休み
					}

				}
				//指定日のCourseOrderViewを取得
				List<CourseOrderVEntity> userOrderEntityList4Day =rumdaEx.selectCourseOrderViewByOrderYyyyMMdd(courseOrderVEntityList, strYyyymmdd);
				scheduleOrderInfo.setCourseOrderVEntityList(userOrderEntityList4Day);
				rtnList.add(scheduleOrderInfo);
				dateBgn = dateBgn.plusDays(1);
			}

		}
		return (rtnList);		
	}

	
	@Override
	public void testCreateUserOrder(){
		
		CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();
		courseScheduleParamEntity.setBgnWorkDate("20160501");
		courseScheduleParamEntity.setEndWorkDate("20160531");
		courseScheduleParamEntity.setStatus(KooConst.ST_WORK);
		List<CourseScheduleEntity> courseScheduleList= courseScheduleService4DB.selectByCondition(courseScheduleParamEntity);
		Random random = new Random();
		int tTouristNo=0;
		int t50=0;
		
		if (courseScheduleList != null && courseScheduleList.size() > 0) {
			for (CourseScheduleEntity tmpVal : courseScheduleList) {
				tTouristNo=random.nextInt(9)+1;
				t50=random.nextInt(50)+1;
				if (t50<2){
					ScheduleOptionParamEntity scheduleOptionParamEntity = new ScheduleOptionParamEntity();
					scheduleOptionParamEntity.setLangId(tmpVal.getLangId());
					scheduleOptionParamEntity.setScheduleOptionIdentiNo(tmpVal.getScheduleOptionIdentiNo());
					List<ScheduleOptionEntity> scheduleOptionEntityList =scheduleOptionService4DB.selectByPK(scheduleOptionParamEntity);
					if (scheduleOptionEntityList != null && scheduleOptionEntityList.size() > 0) {
						ScheduleOptionEntity scheduleOptionEntity =scheduleOptionEntityList.get(0);
						CourseParamEntity courseParamEntity = new CourseParamEntity();
						courseParamEntity.setLangId(tmpVal.getLangId());
						courseParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
						List<CourseEntity> courseEntityList=courseService4DB.selectByPK(courseParamEntity);
						if (courseEntityList != null && courseEntityList.size() > 0) {
							CourseEntity courseEntity = courseEntityList.get(0);
							String strOrderIdentiNo = "";
							strOrderIdentiNo = sequenceService4DB.createSequence(KooConst.ST_USERORDER);
							
							UserOrderEntity userOrderEntity =new UserOrderEntity();
							userOrderEntity.setLangId(tmpVal.getLangId());
							userOrderEntity.setOrderIdentiNo(strOrderIdentiNo);
							userOrderEntity.setTouristIdentiNo("AI0000000"+String.format("%02d", tTouristNo));
							userOrderEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
							userOrderEntity.setLocalhostIdentiNo(tmpVal.getLocalhostIdentiNo());
							userOrderEntity.setReservationDate("20160501");
							userOrderEntity.setScheduleOptionIdentiNo( tmpVal.getScheduleOptionIdentiNo() );
							userOrderEntity.setBgnTime(scheduleOptionEntity.getStartHour());
							userOrderEntity.setStatus("1");
							userOrderEntity.setConsent( "1" );
							userOrderEntity.setCancelDate("");
							userOrderEntity.setOrderDate( tmpVal.getWorkDate() );
							userOrderEntity.setMoneyUnit( "$" );
							int tTourstNum = (courseEntity.getMinTouristNum()+courseEntity.getMaxTouristNum())/2;
							userOrderEntity.setTouristNum( tTourstNum);
							userOrderEntity.setInfantFree( courseEntity.getInfantFree());
							userOrderEntity.setPrice( 300.0 );
							userOrderEntity.setDiscountPrice( 250.0 );
							userOrderEntity.setPersonOrGroup( courseEntity.getPersonOrGroup());
							userOrderEntity.setDuration(courseEntity.getDuration());
							userOrderEntity.setDurationUnit( courseEntity.getDurationUnit() );
							userOrderEntity.setTotalMoney( 400.0 );
							userOrderEntity.setTips( 0.0 );
							userOrderEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG );
							userOrderService4DB.insertOne(userOrderEntity);
							CourseScheduleEntity courseScheduleEntity = tmpVal;
							courseScheduleEntity.setStatus(KooConst.ST_ORDERED);
							courseScheduleService4DB.updateByPK(courseScheduleEntity);
						}
					}

				}
			}
		}

		
	}

}
