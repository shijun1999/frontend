package com.kootour.service.impl;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.RumdaByConditionEx;
import com.kootour.common.RumdaSort;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseDetailEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.ExtraOptionEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.CourseInExclusionParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.mapper.paramentity.CourseScheduleParamEntity;
import com.kootour.mapper.paramentity.ExtraOptionParamEntity;
import com.kootour.mapper.paramentity.FavoriteParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;
import com.kootour.model.CourseDetailModel;
import com.kootour.service.CourseDetailService;
import com.kootour.service.CourseScheduleService;
import com.kootour.service.UserOrderService;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseScheduleService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.ExtraOptionService4DB;
import com.kootour.service4db.FavoriteService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.ScheduleOptionService4DB;
import com.kootour.service4db.SequenceService4DB;
import com.kootour.service4db.TouristService4DB;
import com.kootour.service4db.UserOrderService4DB;

@Configuration
@Service
public class CourseDetailServiceImpl implements CourseDetailService {
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired
	private CourseCommentService4DB courseCommentService4DB;
	@Autowired
	private TouristService4DB touristService4DB;
	@Autowired
	private CoursePictureService4DB coursePictureService4DB;
	@Autowired
	private CourseScheduleService4DB courseScheduleService4DB;
	@Autowired
	private ScheduleOptionService4DB scheduleOptionService4DB;
	@Autowired
	private CourseInExclusionService4DB courseInExclusionService4DB;
	@Autowired
	private UserOrderService4DB userOrderService4DB;
	@Autowired(required = false)
	private UserOrderService userOrderService = new UserOrderServiceImpl();
	@Autowired(required = false)
	private ExtraOptionService4DB extraOptionService4DB;
	
	@Autowired(required = false)
	private CourseScheduleService courseScheduleService = new CourseScheduleServiceImpl();

	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;
	@Autowired
	private FavoriteService4DB favoriteService4DB;

	private static Logger logger = Logger.getLogger(CourseDetailServiceImpl.class);

	@Override
	public CourseDetailEntity save(CourseDetailEntity courseDetailEntity, Map<String, Object> paraMap) {
		CourseDetailEntity rtnResult = new CourseDetailEntity();
		rtnResult=courseDetailEntity;
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		// TODO zhi 0506
		String strSysDate = "";// paraMap.get(KooConst.ST_SYSDATE).toString();

		CourseParamEntity courseParamEntity = new CourseParamEntity();

		courseParamEntity.setLangId(courseDetailEntity.getLangId());
		courseParamEntity.setCourseIdentiNo(courseDetailEntity.getCourseIdentiNo());
		courseParamEntity.setLocalhostIdentiNo(courseDetailEntity.getLocalhostIdentiNo());

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

		CourseEntity courseEntity = courseEntityList.get(0);

		double totalMoney = 0.00;
		int touristNum = 0;
		if (KooUtil.isNotNull(courseDetailEntity.getTouristNum())
				&& KooUtil.isNotNull(courseDetailEntity.getBgnTime())) {

			touristNum = new Integer(courseDetailEntity.getTouristNum()).intValue();

			if (KooUtil.isNotNull(courseDetailEntity.getPrice())) {
				totalMoney = courseDetailEntity.getPrice() * touristNum;
			}

			if (courseEntity.getPersonOrGroup().equals(KooConst.STR_TYPE_DIV_PERSON)) {
				totalMoney = courseDetailEntity.getDiscountPrice() * touristNum;
			} else {
				totalMoney = courseDetailEntity.getDiscountPrice();
			}
		}

		UserOrderEntity userOrderEntity = new UserOrderEntity();
		userOrderEntity.setLangId(courseEntity.getLangId());
		userOrderEntity.setCourseIdentiNo(courseEntity.getCourseIdentiNo());
		userOrderEntity.setLocalhostIdentiNo(courseEntity.getLocalhostIdentiNo());
		// TODO:0503 zhi
		// userOrderEntity.setTouristIdentiNo(courseEntity.getTouristIdentiNo());
		userOrderEntity.setReservationDate(courseDetailEntity.getReservationDate());

		// TODO:
		// userOrderEntity.setTimeTableIdx(new Integer(1));

		userOrderEntity.setBgnTime(courseDetailEntity.getBgnTime());
		userOrderEntity.setStatus("0");
		userOrderEntity.setConsent("0");
		userOrderEntity.setCancelDate(null);
		userOrderEntity.setOrderDate(strSysDate);
		userOrderEntity.setMoneyUnit(courseEntity.getMoneyUnit());
		if (KooUtil.isNotNull(courseDetailEntity.getTouristNum())) {
			userOrderEntity.setTouristNum(new Integer(touristNum));
		} else {
			userOrderEntity.setTouristNum(null);
		}
		if (KooUtil.isNotNull(courseEntity.getInfantFree())) {
			userOrderEntity.setInfantFree(courseEntity.getInfantFree());
		} else {
			userOrderEntity.setInfantFree(null);
		}

		userOrderEntity.setPrice(courseDetailEntity.getPrice());
		userOrderEntity.setDiscountPrice(courseDetailEntity.getDiscountPrice());
		userOrderEntity.setPersonOrGroup(courseEntity.getPersonOrGroup());
		userOrderEntity.setUnitName(courseEntity.getUnitName());
		userOrderEntity.setDuration(new Double(courseEntity.getDuration()));
		userOrderEntity.setDurationUnit(courseEntity.getDurationUnit());
		userOrderEntity.setTotalMoney(totalMoney);
		userOrderEntity.setTips(new Double(0));

		String strOrderIdentiNo = "";
		try {

			strOrderIdentiNo = sequenceService4DB.createSequence(KooConst.ST_USERORDER);
			userOrderEntity.setOrderIdentiNo(strOrderIdentiNo);
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
			userOrderService4DB.insertOne(userOrderEntity);
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM012);
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_003);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} catch (Exception e) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(
					KooConst.INFO_MSG_PARAM012 + "[" + userOrderEntity.getLangId() + "," + strOrderIdentiNo + "]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_005);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_005);
			return (rtnResult);
		}

		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}

	@Override
	public CourseDetailEntity bookSummary(CourseDetailEntity courseDetailEntity, Map<String, Object> paraMap) {
		CourseDetailEntity rtnResult = new CourseDetailEntity();
		rtnResult = courseDetailEntity;
		CourseDetailModel preCourseDetailModel = (CourseDetailModel) paraMap.get(KooConst.ST_COURSE_DETAIL);
		rtnResult.setLocalhostFullNameDisp(preCourseDetailModel.getLocalhostFullNameDisp());
		rtnResult.setTourLocation(preCourseDetailModel.getTourLocation());
		rtnResult.setCoursePictureListDisp(preCourseDetailModel.getCoursePictureListDisp());
		rtnResult.setLangId(preCourseDetailModel.getLangId());
		return (rtnResult);
	}

	@Override
	public CourseDetailEntity changeDate(CourseDetailEntity courseDetailEntity, Map<String, Object> paraMap) {
		CourseDetailEntity rtnResult = new CourseDetailEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public CourseDetailEntity load(CourseDetailEntity courseDetailEntity, Map<String, Object> paraMap) {
		CourseDetailEntity rtnResult = new CourseDetailEntity();
		rtnResult=courseDetailEntity;
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		String strSysDate = courseDetailEntity.getSessionInfo().getCurDate();
		CourseParamEntity courseParamEntity = new CourseParamEntity();
		courseParamEntity.setLangId(courseDetailEntity.getLangId());
		courseParamEntity.setCourseIdentiNo(courseDetailEntity.getCourseIdentiNo());

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
			return rtnResult;
		}

		CourseEntity courseEntity = courseEntityList.get(0);
		CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();
		coursePictureParamEntity.setLangId(courseDetailEntity.getLangId());
		coursePictureParamEntity.setCourseIdentiNo(courseDetailEntity.getCourseIdentiNo());
		coursePictureParamEntity.setLocalhostIdentiNo(courseDetailEntity.getLocalhostIdentiNo());
		List<CoursePictureEntity> coursePictureEntityList = coursePictureService4DB
				.selectByCondition(coursePictureParamEntity);
		if (coursePictureEntityList.isEmpty()) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM003 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {

			for (int i = 0; i < coursePictureEntityList.size(); i++) {
				coursePictureEntityList.get(i)
						.setFullPath(KooConst.STR_UPLOAD_IMAGES_PATH + coursePictureEntityList.get(i).getFullPath());
			}
			courseEntity.setCoursePictureListDisp(coursePictureEntityList);
		}

		rtnResult = convertToCourseDetailEntity(courseEntity, rtnResult);
		CourseInExclusionParamEntity courseInExclusionParamEntity = new CourseInExclusionParamEntity();
		courseInExclusionParamEntity.setLangId(courseDetailEntity.getLangId());
		courseInExclusionParamEntity.setCourseIdentiNo(courseDetailEntity.getCourseIdentiNo());
		List<CourseInExclusionEntity> courseInExclusionEntityList = courseInExclusionService4DB
				.selectByCondition(courseInExclusionParamEntity);

		if (courseInExclusionEntityList.isEmpty()) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM017 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {

			List<CourseInExclusionEntity> exclusionListDisp = new ArrayList<CourseInExclusionEntity>();
			List<CourseInExclusionEntity> inclusionListDisp = new ArrayList<CourseInExclusionEntity>();
			CourseInExclusionEntity courseInExclusionEntity = new CourseInExclusionEntity();
			for (int i = 0; i < courseInExclusionEntityList.size(); i++) {
				courseInExclusionEntity = courseInExclusionEntityList.get(i);

				if (courseInExclusionEntity.getInExclusionType().equals(KooConst.ST_COURSE_INCLUSION)) {

					inclusionListDisp.add(courseInExclusionEntity);
				} else {
					exclusionListDisp.add(courseInExclusionEntity);
				}
			}

			rtnResult.setExclusionListDisp(exclusionListDisp);
			rtnResult.setInclusionListDisp(inclusionListDisp);
		}
		rtnResult.setTouristIdentiNo(courseDetailEntity.getTouristIdentiNo());
		rtnResult.setStateDisp(courseDetailEntity.getStateDisp());
		rtnResult.setCityDisp(courseDetailEntity.getCityDisp());
		rtnResult.setWorkDatesDisp(courseDetailEntity.getWorkDatesDisp());

		LocalhostParamEntity localhostParamEntity = new LocalhostParamEntity();
		localhostParamEntity.setLangId(courseEntity.getLangId());
		localhostParamEntity.setLocalhostIdentiNo(courseEntity.getLocalhostIdentiNo());
		List<LocalhostEntity> localhostEntityList = localhostService4DB.selectByPK(localhostParamEntity);

		if (localhostEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM002 + "[selectByPK]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {

			LocalhostEntity localhostEntity = localhostEntityList.get(0);
			paraMap.put(KooConst.MAP_LOCALHOSTENTITY, localhostEntity);
			rtnResult.setLocalhostPictureDisp(KooConst.STR_UPLOAD_IMAGES_PATH + localhostEntity.getPhoto());
			rtnResult.setLocalhostFullNameDisp(localhostEntity.getFullName());
			rtnResult.setLocalhostEmailDisp(localhostEntity.getEmail());
			rtnResult.setLocalhostMemoDisp(localhostEntity.getMemo());
		}

		CourseCommentParamEntity courseCommentParamEntity = new CourseCommentParamEntity();
		courseCommentParamEntity.setLangId(courseEntity.getLangId());
		courseCommentParamEntity.setCourseIdentiNo(courseEntity.getCourseIdentiNo());

		List<CourseCommentEntity> courseCommentEntityList = courseCommentService4DB
				.selectByCondition(courseCommentParamEntity);

		if (courseCommentEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM011 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {

			courseCommentEntityList = RumdaSort.courseCommentByCommentDate(courseCommentEntityList);

			double dTotalScore = 0.0;
			for (int i = 0; i < courseCommentEntityList.size(); i++) {

				TouristParamEntity touristParamEntity = new TouristParamEntity();
				touristParamEntity.setLangId(courseEntity.getLangId());
				touristParamEntity.setTouristIdentiNo(courseCommentEntityList.get(i).getTouristIdentiNo());
				touristParamEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
				List<TouristEntity> touristEntityList = touristService4DB.selectByPK(touristParamEntity);
				if (touristEntityList.isEmpty()) {
					ErrorInfo tErrorInfo = new ErrorInfo();
					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM007 + "[selectByPK]");
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
					tErrorInfo.setDispOrder(1);
					tList.add(tErrorInfo);
				} else {
					courseCommentEntityList.get(i).setTouristFirstName(touristEntityList.get(0).getFirstName());
					courseCommentEntityList.get(i).setTouristLastName(touristEntityList.get(0).getLastName());
					courseCommentEntityList.get(i)
							.setTouristPicture(KooConst.STR_UPLOAD_IMAGES_PATH + touristEntityList.get(0).getPicture());

					double dScore = courseCommentEntityList.get(i).getScore();
					dTotalScore = dTotalScore + dScore;
					List<String> iconList = KooUtil.getStarName(dScore);
					courseCommentEntityList.get(i).setScoreIconListDisp(iconList);
				}
			}
			rtnResult.setCourseCommentListDisp(courseCommentEntityList);

			double dScore = dTotalScore / courseCommentEntityList.size();
			List<String> iconList = KooUtil.getStarName(dScore);
			rtnResult.setScoreIconListDisp(iconList);
			rtnResult.setReviewNumDisp(courseCommentEntityList.size());
		}

		CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();
		courseScheduleParamEntity.setLangId(courseDetailEntity.getLangId());
		courseScheduleParamEntity.setCourseIdentiNo(courseDetailEntity.getCourseIdentiNo());
		courseScheduleParamEntity.setLocalhostIdentiNo(courseDetailEntity.getLocalhostIdentiNo());
		courseScheduleParamEntity.setStatus(KooConst.ST_FLG_YES);
		List<CourseScheduleEntity> courseScheduleEntityList = courseScheduleService4DB
				.selectByCondition(courseScheduleParamEntity);

		if (courseScheduleEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM005 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {
			RumdaByConditionEx rumdaByConditionEx = new RumdaByConditionEx();

			SimpleDateFormat f1 = new SimpleDateFormat(KooConst.ST_yyyyMMdd);
			Calendar calendarS = Calendar.getInstance();
			calendarS.setTime(f1.parse(strSysDate, new ParsePosition(0)));
			calendarS.set(Calendar.DAY_OF_MONTH, 1);
			String strDateStart = f1.format(calendarS.getTime());

			Calendar calendarE = Calendar.getInstance();
			calendarE.setTime(f1.parse(strSysDate, new ParsePosition(0)));
			calendarE.set(Calendar.DAY_OF_MONTH, calendarE.getActualMaximum(Calendar.DAY_OF_MONTH));
			String strDateEnd = f1.format(calendarE.getTime());

			courseScheduleEntityList = rumdaByConditionEx.selectCourseByBetweenAndCondition(courseScheduleEntityList,
					strDateStart, strDateEnd);
			rtnResult.setCourseScheduleListDisp(courseScheduleEntityList);
		}

		ScheduleOptionParamEntity scheduleOptionParamEntity = new ScheduleOptionParamEntity();
		scheduleOptionParamEntity.setLangId(courseDetailEntity.getLangId());
		scheduleOptionParamEntity.setCourseIdentiNo(courseDetailEntity.getCourseIdentiNo());
		List<ScheduleOptionEntity> scheduleOptionEntityList = scheduleOptionService4DB
				.selectByCondition(scheduleOptionParamEntity);

		if (scheduleOptionEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM019 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {

			double dPrice = 0.0;
			for (int j = 0; j < scheduleOptionEntityList.size(); j++) {

				ScheduleOptionEntity scheduleOptionEntity = scheduleOptionEntityList.get(j);
				dPrice = scheduleOptionEntity.getPrice().doubleValue();

				if (KooUtil.isNotNull(scheduleOptionEntityList.get(j).getDiscountFlg())
						&& scheduleOptionEntityList.get(j).getDiscountFlg().equals(KooConst.ST_FLG_YES)) {

					if (scheduleOptionEntity.getDiscountPercent() != null) {

						dPrice = dPrice * (1 - scheduleOptionEntity.getDiscountPercent().doubleValue() / 100);
					} else {

						dPrice = dPrice - scheduleOptionEntity.getDiscountValue().doubleValue();
					}
				}
				scheduleOptionEntityList.get(j).setDiscountPrice(dPrice);
			}
			if (scheduleOptionEntityList.size() > 1) {

				Collections.sort(scheduleOptionEntityList, new Comparator<ScheduleOptionEntity>() {
					@Override
					public int compare(ScheduleOptionEntity x, ScheduleOptionEntity y) {
						return x.getStartHour().compareTo(y.getStartHour());
					}
				});

				Collections.sort(scheduleOptionEntityList, (x, y) -> x.getStartHour().compareTo(x.getStartHour()));
			}
			rtnResult.setScheduleOptionListDisp(scheduleOptionEntityList);
		}

		ExtraOptionParamEntity extraOptionParamEntity = new ExtraOptionParamEntity();
		extraOptionParamEntity.setLangId(courseDetailEntity.getLangId());
		extraOptionParamEntity.setCourseIdentiNo(courseDetailEntity.getCourseIdentiNo());
		List<ExtraOptionEntity> extraOptionList = extraOptionService4DB.selectByCondition(extraOptionParamEntity);
		rtnResult.setExtraOptionListDisp(extraOptionList);

		FavoriteParamEntity favoriteParamEntity = new FavoriteParamEntity();
		favoriteParamEntity.setTouristIdentiNo(courseDetailEntity.getTouristIdentiNo());
		favoriteParamEntity.setObjIdentiNo(courseDetailEntity.getCourseIdentiNo());
		favoriteParamEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
		List<FavoriteEntity> favoriteEntityList = favoriteService4DB.selectByCondition(favoriteParamEntity);
		if (favoriteEntityList != null && favoriteEntityList.size()> 0) {
			rtnResult.setFavoriteIdentiNo(favoriteEntityList.get(0).getFavoriteIdentiNo());
		}else{
			rtnResult.setFavoriteIdentiNo("");
		}

		rtnResult.setTouristIdentiNo(courseDetailEntity.getTouristIdentiNo());
		List<String> notWorkDaysList=courseScheduleService.calcCourseStatus(rtnResult.getLangId(), rtnResult.getCourseIdentiNo(), "20160716");
		rtnResult.setNotWorkDays(notWorkDaysList);

		List<String> nimMaxTouristList=new ArrayList<>();
		for (int i=rtnResult.getMinTouristNum();i<=rtnResult.getMaxTouristNum();i++){
			nimMaxTouristList.add(""+i);
		}
		rtnResult.setTouristMinMaxList(nimMaxTouristList);
		String nextWorkDay=courseDetailEntity.getCurDate();
		String tmpDay=KooUtil.convertDate2Mm_dd_yyyy(nextWorkDay);
		int tLimit=0;
		while(notWorkDaysList.contains(tmpDay)&& tLimit<365){
			nextWorkDay=KooUtil.nextDay(nextWorkDay);
			tmpDay=KooUtil.convertDate2Mm_dd_yyyy(nextWorkDay);
			tLimit++;
		}
		if(tLimit>=365){
			nextWorkDay=courseDetailEntity.getCurDate();
		}
		String tTimeTableStr = courseScheduleService.calcTimeTable(courseDetailEntity.getLangId(), courseDetailEntity.getCourseIdentiNo(),
				nextWorkDay);
		String[] tStrArr =tTimeTableStr.split(",");
		List<String> tTimeTableList=new ArrayList<>();
		for(String t:tStrArr){
			tTimeTableList.add(t);
		}
		rtnResult.setTimeTable(tTimeTableList);
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}

	private CourseDetailEntity convertToCourseDetailEntity(CourseEntity courseEntity, CourseDetailEntity tEntity) {

		tEntity.setLangId(courseEntity.getLangId());
		tEntity.setCourseIdentiNo(courseEntity.getCourseIdentiNo());
		tEntity.setLocalhostIdentiNo(courseEntity.getLocalhostIdentiNo());
		tEntity.setCourseType(courseEntity.getCourseType());
		tEntity.setFullName(courseEntity.getFullName());
		tEntity.setShortName(courseEntity.getShortName());
		tEntity.setIndexChar(courseEntity.getIndexChar());
		tEntity.setDuration(courseEntity.getDuration().toString());
		tEntity.setDurationUnit(courseEntity.getDurationUnit());
		tEntity.setLocationKey(courseEntity.getLocationKey());
		tEntity.setSearchWord(courseEntity.getSearchWord());
		tEntity.setInclusionListDisp(courseEntity.getInclusionListDisp());
		tEntity.setExclusionListDisp(courseEntity.getExclusionListDisp());
		tEntity.setCourseContent(courseEntity.getCourseContent());
		tEntity.setAdditionalInfo(courseEntity.getAdditionalInfo());
		tEntity.setTourLocation(courseEntity.getTourLocation());
		tEntity.setMeetupLocation(courseEntity.getMeetupLocation());
		tEntity.setMoneyUnit(courseEntity.getMoneyUnit());
		tEntity.setWorkDay(courseEntity.getWorkDay());
		tEntity.setPersonOrGroup(courseEntity.getPersonOrGroup());
		if (courseEntity.getPersonOrGroup().equals(KooConst.STR_TYPE_DIV_PERSON)) {
			tEntity.setPersonOrGroupText(KooConst.STR_TYPE_PERSON);
		} else {
			tEntity.setPersonOrGroupText(KooConst.STR_TYPE_GROUP);
		}
		tEntity.setMaxTouristNum(courseEntity.getMaxTouristNum());
		tEntity.setMinTouristNum(courseEntity.getMinTouristNum());
		tEntity.setAdventure(courseEntity.getAdventure());
		tEntity.setCultureArts(courseEntity.getCultureArts());
		tEntity.setFestivalEvents(courseEntity.getFestivalEvents());
		tEntity.setFoodDrink(courseEntity.getFoodDrink());
		tEntity.setHistorical(courseEntity.getHistorical());
		tEntity.setLeisureSports(courseEntity.getLeisureSports());
		tEntity.setNatureRural(courseEntity.getNatureRural());
		tEntity.setNightlifeParty(courseEntity.getNightlifeParty());
		tEntity.setShoppingMarket(courseEntity.getShoppingMarket());
		tEntity.setOtherType1(courseEntity.getOtherType1());
		tEntity.setOtherType2(courseEntity.getOtherType2());
		tEntity.setOtherType3(courseEntity.getOtherType3());
		tEntity.setOkFlg(courseEntity.getOkFlg());
		tEntity.setUseLangId(courseEntity.getUseLangId());
		tEntity.setReviewNumDisp(courseEntity.getReviewNumDisp());
		tEntity.setCreateTime(courseEntity.getCreateTime());
		tEntity.setModifyTime(courseEntity.getModifyTime());
		tEntity.setCoursePictureListDisp(courseEntity.getCoursePictureListDisp());
		return tEntity;
	}
}
