package com.kootour.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.RumdaByConditionEx;
import com.kootour.common.RumdaSort;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CourseScheduleParamEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
import com.kootour.service.CourseScheduleService;
import com.kootour.service4db.CourseScheduleService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.ScheduleOptionService4DB;
import com.kootour.service4db.SequenceService4DB;

@Configuration
@Service
public class CourseScheduleServiceImpl implements CourseScheduleService {
	@Autowired
	private CourseScheduleService4DB courseScheduleService4DB;
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private ScheduleOptionService4DB scheduleOptionService4DB;
	@Autowired
	private SequenceService4DB sequenceService4DB;

	@Override
	public CourseScheduleEntity cancel(CourseScheduleEntity courseScheduleEntity, Map<String, Object> paraMap) {
		CourseScheduleEntity rtnResult = new CourseScheduleEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public CourseScheduleEntity save(CourseScheduleEntity courseScheduleEntity, Map<String, Object> paraMap) {
		CourseScheduleEntity rtnResult = new CourseScheduleEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public CourseScheduleEntity back(CourseScheduleEntity courseScheduleEntity, Map<String, Object> paraMap) {
		CourseScheduleEntity rtnResult = new CourseScheduleEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public CourseScheduleEntity load(CourseScheduleEntity courseScheduleEntity, Map<String, Object> paraMap) {
		CourseScheduleEntity rtnResult = new CourseScheduleEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public int insertOneYear(String langId, String courseIdentiNo) {
		int retVal = 0;
		String tWorkDay = "";
		String tBgnDate = "";
		String tEndDate = "";
		String localhostIdentiNo = "";
		CourseParamEntity courseParamEntity = new CourseParamEntity();
		courseParamEntity.setLangId(langId);
		courseParamEntity.setCourseIdentiNo(courseIdentiNo);
		List<CourseEntity> courseEntityList = courseService4DB.selectByPK(courseParamEntity);

		if (courseEntityList != null && courseEntityList.size() > 0) {
			// tWorkDay=courseEntityList.get(0).getWorkDay();
			localhostIdentiNo = courseEntityList.get(0).getLocalhostIdentiNo();
			tWorkDay = courseEntityList.get(0).getWorkDay();
		}
		ScheduleOptionParamEntity scheduleOptionParamEntity = new ScheduleOptionParamEntity();
		scheduleOptionParamEntity.setLangId(langId);
		scheduleOptionParamEntity.setCourseIdentiNo(courseIdentiNo);
		List<ScheduleOptionEntity> scheduleOptionEntityList = scheduleOptionService4DB
				.selectByCondition(scheduleOptionParamEntity);

		if (scheduleOptionEntityList != null && scheduleOptionEntityList.size() > 0) {
			for (ScheduleOptionEntity tmpVal : scheduleOptionEntityList) {
				tBgnDate = tmpVal.getBgnDate();
				tEndDate = tmpVal.getEndDate();
				LocalDate dateBgn = LocalDate.parse(tBgnDate, DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"
				LocalDate dateEnd = LocalDate.parse(tEndDate, DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"

				tWorkDay = tmpVal.getWorkDay();

				CourseScheduleEntity courseScheduleEntity = new CourseScheduleEntity();
				courseScheduleEntity.setLangId(langId);
				courseScheduleEntity.setCourseIdentiNo(courseIdentiNo);
				courseScheduleEntity.setLocalhostIdentiNo(localhostIdentiNo);
				courseScheduleEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
				courseScheduleEntity.setLangId(langId);
				courseScheduleEntity.setScheduleOptionIdentiNo(tmpVal.getScheduleOptionIdentiNo());

				String status = KooConst.ST_NOT_WORK;
				String weekDay = "0";
				while (dateBgn.isBefore(dateEnd) || dateBgn.isEqual(dateEnd)) {
					courseScheduleEntity
							.setCourseScheduleIdentiNo(sequenceService4DB.createSequence(KooConst.ST_COURSESCHEDULE));
					courseScheduleEntity.setWorkDate(dateBgn.format(DateTimeFormatter.BASIC_ISO_DATE));
					// TODO
					DayOfWeek dw = dateBgn.getDayOfWeek();
					weekDay = String.valueOf(dw.ordinal());
					if (tWorkDay.contains(weekDay)) {
						status = KooConst.ST_WORK;
					} else {
						status = KooConst.ST_NOT_WORK;
					}
					courseScheduleEntity.setStatus(status);
					courseScheduleService4DB.insertOne(courseScheduleEntity);
					dateBgn = dateBgn.plusDays(1);
				}
			}
		}

		return (retVal);
	}

	public Boolean checkDeleteOk(String langId, String courseIdentiNo, String strYyyymmdd) {
		Boolean rtnVal = true;
		CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();

		courseScheduleParamEntity.setLangId(langId);
		courseScheduleParamEntity.setCourseIdentiNo(courseIdentiNo);
		List<CourseScheduleEntity> courseScheduleEntityList = courseScheduleService4DB
				.selectByCondition(courseScheduleParamEntity);
		if (courseScheduleEntityList != null && courseScheduleEntityList.size() > 0) {

			RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
			List<CourseScheduleEntity> courseScheduleEntityList1 = rumdaEx
					.selectCourseScheduleByStatusBgnDate(courseScheduleEntityList, KooConst.ST_ORDERED, strYyyymmdd);
			if (courseScheduleEntityList1.size() > 0) {
				rtnVal = false;
			}
		}

		return (rtnVal);
	}

	public int changeToInactive(String langId, String courseIdentiNo, String strYyyymmdd) {
		int retVal = 0;
		String maxDate = "";
		CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();

		courseScheduleParamEntity.setLangId(langId);
		courseScheduleParamEntity.setCourseIdentiNo(courseIdentiNo);
		List<CourseScheduleEntity> courseScheduleEntityList = courseScheduleService4DB
				.selectByCondition(courseScheduleParamEntity);
		if (courseScheduleEntityList != null && courseScheduleEntityList.size() > 0) {

			RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
			List<CourseScheduleEntity> courseScheduleEntityListOrdered = rumdaEx
					.selectCourseScheduleByStatusBgnDate(courseScheduleEntityList, KooConst.ST_ORDERED, strYyyymmdd);

			Optional<String> maxOrderDate = courseScheduleEntityListOrdered.stream()
					.map(schedule -> schedule.getWorkDate()).max(String.CASE_INSENSITIVE_ORDER);

			if (maxOrderDate.isPresent()) {
				maxDate = maxOrderDate.get();
				List<CourseScheduleEntity> courseScheduleEntityListWork = rumdaEx.selectCourseScheduleByStatusBgnDate(
						courseScheduleEntityList, KooConst.ST_WORK, KooUtil.nextDay(maxDate));
				if (courseScheduleEntityListWork != null && courseScheduleEntityListWork.size() > 0) {
					for (CourseScheduleEntity tmpVal : courseScheduleEntityListWork) {
						tmpVal.setStatus(KooConst.ST_INACTIVE);
						courseScheduleService4DB.updateByPK(tmpVal);
					}
				}

			}
		}

		return (retVal);
	}

	public int changeToActive(String langId, String courseIdentiNo, String strYyyymmdd) {
		int retVal = 0;
		CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();

		courseScheduleParamEntity.setLangId(langId);
		courseScheduleParamEntity.setCourseIdentiNo(courseIdentiNo);
		List<CourseScheduleEntity> courseScheduleEntityList = courseScheduleService4DB
				.selectByCondition(courseScheduleParamEntity);
		if (courseScheduleEntityList != null && courseScheduleEntityList.size() > 0) {

			RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
			List<CourseScheduleEntity> courseScheduleEntityListInactive = rumdaEx
					.selectCourseScheduleByStatusBgnDate(courseScheduleEntityList, KooConst.ST_INACTIVE, strYyyymmdd);
			if (courseScheduleEntityListInactive != null && courseScheduleEntityListInactive.size() > 0) {
				for (CourseScheduleEntity tmpVal : courseScheduleEntityListInactive) {
					tmpVal.setStatus(KooConst.ST_WORK);
					courseScheduleService4DB.updateByPK(tmpVal);
				}
			}
		}

		return (retVal);
	}

	// 1ヶ月分のCourseの毎日の利用状況を作成
	public List<String> calcCourseStatus(String langId, String courseIdentiNo, String strYyyymmdd) {

		List<String> rtnList = new ArrayList<String>();

		CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();
		courseScheduleParamEntity.setLangId(langId);
		courseScheduleParamEntity.setCourseIdentiNo(courseIdentiNo);
		List<CourseScheduleEntity> courseScheduleEntityList = courseScheduleService4DB
				.selectByCondition(courseScheduleParamEntity);

		if (courseScheduleEntityList != null && courseScheduleEntityList.size() > 0) {

			LocalDate dateBgn = LocalDate.parse(strYyyymmdd, DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"
			// Todo
			LocalDate dateEnd = dateBgn.plusYears(1);

			while (dateBgn.isBefore(dateEnd) || dateBgn.isEqual(dateEnd)) {

				String tYyyymmdd = dateBgn.format(DateTimeFormatter.BASIC_ISO_DATE);
				RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
				List<CourseScheduleEntity> courseScheduleEntityList4Date = rumdaEx
						.selectCourseScheduleByDate(courseScheduleEntityList, tYyyymmdd);
				String tStatus = KooConst.ST_COURSE_STATUS_NOT_YET;// 未登録
				if (courseScheduleEntityList4Date != null && courseScheduleEntityList4Date.size() > 0) {
					List<String> tStatusList = courseScheduleEntityList4Date.stream()
							.map(schedule -> schedule.getStatus()).collect(Collectors.toList());

					if (tStatusList.contains(KooConst.ST_INACTIVE)) {
						tStatus = KooConst.ST_COURSE_STATUS_INACTIVE;// 休止
					} else if (!tStatusList.contains(KooConst.ST_WORK) && !tStatusList.contains(KooConst.ST_NOT_WORK)) {
						tStatus = KooConst.ST_COURSE_STATUS_NOT_FREE;// 予約不可
					} else if (tStatusList.contains(KooConst.ST_WORK) && tStatusList.contains(KooConst.ST_ORDERED)) {
						tStatus = KooConst.ST_COURSE_STATUS_PART_FREE;// 部分予約、予約可
					} else if (tStatusList.contains(KooConst.ST_WORK) && !tStatusList.contains(KooConst.ST_ORDERED)) {
						tStatus = KooConst.ST_COURSE_STATUS_FREE; // 予約無し
					} else if (tStatusList.contains(KooConst.ST_NOT_WORK)) {
						tStatus = KooConst.ST_COURSE_STATUS_NOT_WORK; // 休み
					}

				}
				if (!(tStatus.equals(KooConst.ST_COURSE_STATUS_FREE)
						|| tStatus.equals(KooConst.ST_COURSE_STATUS_PART_FREE))) {

					rtnList.add(KooUtil.convertDate2Mm_dd_yyyy(tYyyymmdd));
					
//					SimpleDateFormat sdf1 = new SimpleDateFormat(KooConst.ST_yyyyMMdd);
//					SimpleDateFormat sdf2 = new SimpleDateFormat(KooConst.ST_MM_dd_yyyy);
//					Date date;
//					try {
//						date = sdf1.parse(tYyyymmdd);
//						String str = sdf2.format(date);
//						rtnList.add(str);
//					} catch (ParseException e) {
//						e.printStackTrace();
//					}
				}
				dateBgn = dateBgn.plusDays(1);
			}

		}
		return (rtnList);
	}

	// 1ヶ月分のScheduleOptionの毎日の利用可能なScheduleOptionリストを作成
	public List<List<ScheduleOptionEntity>> calcScheduleOption(String langId, String courseIdentiNo, String strYyyymm) {

		List<List<ScheduleOptionEntity>> rtnList = new ArrayList<List<ScheduleOptionEntity>>();

		CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();
		courseScheduleParamEntity.setLangId(langId);
		courseScheduleParamEntity.setCourseIdentiNo(courseIdentiNo);
		List<CourseScheduleEntity> courseScheduleEntityList = courseScheduleService4DB
				.selectByCondition(courseScheduleParamEntity);
		List<ScheduleOptionEntity> dbScheduleOptionEntityList = new ArrayList<ScheduleOptionEntity>();
		ScheduleOptionParamEntity scheduleOptionParamEntity = new ScheduleOptionParamEntity();
		scheduleOptionParamEntity.setLangId(langId);
		scheduleOptionParamEntity.setCourseIdentiNo(courseIdentiNo);
		dbScheduleOptionEntityList = scheduleOptionService4DB.selectByCondition(scheduleOptionParamEntity);
		if (courseScheduleEntityList != null && courseScheduleEntityList.size() > 0) {

			LocalDate dateBgn = LocalDate.parse(strYyyymm + "01", DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"
			LocalDate dateEnd = dateBgn.with(TemporalAdjusters.lastDayOfMonth());
			while (dateBgn.isBefore(dateEnd) || dateBgn.isEqual(dateEnd)) {
				List<ScheduleOptionEntity> tScheduleOptionEntityList = new ArrayList<ScheduleOptionEntity>();
				String strYyyymmdd = dateBgn.format(DateTimeFormatter.BASIC_ISO_DATE);
				RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
				List<CourseScheduleEntity> courseScheduleEntityList4Date = rumdaEx
						.selectCourseScheduleByDate(courseScheduleEntityList, strYyyymmdd);
				if (courseScheduleEntityList4Date != null && courseScheduleEntityList4Date.size() > 0) {
					List<String> tScheduleOptionIdentiNoList = courseScheduleEntityList4Date.stream()
							.filter(x -> x.getStatus().equals(KooConst.ST_WORK))
							.map(scheduleOption -> scheduleOption.getScheduleOptionIdentiNo())
							.collect(Collectors.toList());
					if (tScheduleOptionIdentiNoList != null && tScheduleOptionIdentiNoList.size() > 0) {
						for (String tmpVal : tScheduleOptionIdentiNoList) {
							if (dbScheduleOptionEntityList != null && dbScheduleOptionEntityList.size() > 0) {
								List<ScheduleOptionEntity> tList = dbScheduleOptionEntityList.stream()
										.filter(y -> y.getScheduleOptionIdentiNo().equals(tmpVal))
										.collect(Collectors.toList());
								tScheduleOptionEntityList.addAll(tList);
							}
						}
					}
				}
				tScheduleOptionEntityList = RumdaSort.scheduleOptionEntitySortByStartTime(tScheduleOptionEntityList);
				rtnList.add(tScheduleOptionEntityList);
				dateBgn = dateBgn.plusDays(1);
			}

		}
		return (rtnList);
	}

	// 1ヶ月分のScheduleOptionの毎日の利用可能なScheduleOptionリストを作成
	public String calcTimeTable(String langId, String courseIdentiNo, String strYyyymmdd) {
		String rtnList = "";

		CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();
		courseScheduleParamEntity.setLangId(langId);
		courseScheduleParamEntity.setCourseIdentiNo(courseIdentiNo);
		courseScheduleParamEntity.setWorkDate(strYyyymmdd);
		courseScheduleParamEntity.setStatus(KooConst.ST_WORK);

		List<CourseScheduleEntity> courseScheduleEntityList = courseScheduleService4DB
				.selectByCondition(courseScheduleParamEntity);
		List<ScheduleOptionEntity> dbScheduleOptionEntityList = new ArrayList<ScheduleOptionEntity>();
		ScheduleOptionParamEntity scheduleOptionParamEntity = new ScheduleOptionParamEntity();
		scheduleOptionParamEntity.setLangId(langId);
		scheduleOptionParamEntity.setCourseIdentiNo(courseIdentiNo);
		dbScheduleOptionEntityList = scheduleOptionService4DB.selectByCondition(scheduleOptionParamEntity);
		if (courseScheduleEntityList != null && courseScheduleEntityList.size() > 0) {
			List<ScheduleOptionEntity> tScheduleOptionEntityList = new ArrayList<ScheduleOptionEntity>();
			RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
			List<CourseScheduleEntity> courseScheduleEntityList4Date = rumdaEx
					.selectCourseScheduleByDate(courseScheduleEntityList, strYyyymmdd);
			if (courseScheduleEntityList4Date != null && courseScheduleEntityList4Date.size() > 0) {
				List<String> tScheduleOptionIdentiNoList = courseScheduleEntityList4Date.stream()
						.filter(x -> x.getStatus().equals(KooConst.ST_WORK))
						.map(scheduleOption -> scheduleOption.getScheduleOptionIdentiNo()).collect(Collectors.toList());
				if (tScheduleOptionIdentiNoList != null && tScheduleOptionIdentiNoList.size() > 0) {
					for (String tmpVal : tScheduleOptionIdentiNoList) {
						if (dbScheduleOptionEntityList != null && dbScheduleOptionEntityList.size() > 0) {
							List<ScheduleOptionEntity> tList = dbScheduleOptionEntityList.stream()
									.filter(y -> y.getScheduleOptionIdentiNo().equals(tmpVal))
									.collect(Collectors.toList());
							tScheduleOptionEntityList.addAll(tList);
						}
					}
				}
			}
			tScheduleOptionEntityList = RumdaSort.scheduleOptionEntitySortByStartTime(tScheduleOptionEntityList);
			// Calculate time table (10:30--12:00 -> 10:30;11:00;11:30;12:00
			for (ScheduleOptionEntity t : tScheduleOptionEntityList) {
				String tStart = t.getStartHour();
				String tEndTime = t.getLatestStartHour();
				Integer sHour = Integer.parseInt(tStart.substring(0, 2)) * 10;
				Integer sMinute = Integer.parseInt(tStart.substring(3, 5));
				sMinute = sMinute / 30 * 5;
				sHour = sHour + sMinute;

				Integer eHour = Integer.parseInt(tEndTime.substring(0, 2)) * 10;
				Integer eMinute = Integer.parseInt(tEndTime.substring(3, 5));
				eMinute = eMinute / 30 * 5;
				eHour = eHour + eMinute;
				for (int i = sHour; i <= eHour; i = i + 5) {
					String strHour = "" + i / 10;
					String strMinus = "" + (i % 10) / 5 * 30;
					if ("0".equals(strMinus))
						strMinus = "00";
					rtnList = rtnList + strHour + ":" + strMinus + ",";
				}
			}
			if (rtnList.length() > 1) {
				rtnList = rtnList.substring(0, rtnList.length() - 1);
			}
		}
		return (rtnList);
	}

}
