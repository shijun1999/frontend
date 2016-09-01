package com.kootour.service.impl;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.RumdaByConditionEx;
import com.kootour.common.RumdaSort;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseFilterEntity;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.mapper.paramentity.CourseScheduleParamEntity;
import com.kootour.mapper.paramentity.FavoriteParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.service.CourseService;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseScheduleService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.FavoriteService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.ScheduleOptionService4DB;
import com.kootour.service4db.UserOrderService4DB;

@Configuration
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired
	private CourseCommentService4DB courseCommentService4DB;
	@Autowired
	private UserOrderService4DB userOrderService4DB;
	@Autowired
	private ScheduleOptionService4DB scheduleOptionService4DB;
	@Autowired
	private CourseScheduleService4DB courseScheduleService4DB;
	@Autowired
	private CoursePictureService4DB coursePictureService4DB;
	@Autowired
	private CourseInExclusionService4DB courseInExclusionService4DB;
	@Autowired
	private FavoriteService4DB favoriteService4DB;


	@Override
	public List<CourseEntity> calcMinPrice(List<CourseEntity> courseEntityList, String bgnDate, String endDate,
			String discontFlg) {

		List<CourseEntity> retList = new ArrayList<>();
		if (courseEntityList != null && courseEntityList.size() > 0) {
			List<ScheduleOptionEntity> scheduleOptionEntityList = scheduleOptionService4DB.selectAll();
			RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
			for (CourseEntity tmpVal : courseEntityList) {
				if (scheduleOptionEntityList != null && scheduleOptionEntityList.size() > 0) {
					List<ScheduleOptionEntity> tmpScheduleOptionEntityList = rumdaEx.selectScheduleOptionByDate(
							scheduleOptionEntityList, tmpVal.getCourseIdentiNo(), bgnDate, endDate);
					if (tmpScheduleOptionEntityList != null && tmpScheduleOptionEntityList.size() > 0) {
						List<ScheduleOptionEntity> tScheduleOptionEntityList = new ArrayList<>();
						for (ScheduleOptionEntity tmpScheduleOption : tmpScheduleOptionEntityList) {
							if (tmpScheduleOption.getPromotionFLg().equals(KooConst.ST_FLG_YES)) {
								if (!((tmpScheduleOption.getPromotionEndDate().compareTo(bgnDate) < 0)
										|| (tmpScheduleOption.getPromotionBgnDate().compareTo(endDate) > 0))) {
									if (tmpScheduleOption.getDiscountFlg().equals(KooConst.ST_DISCOUNT_PERCENT)) {
										tmpScheduleOption.setDiscountPrice(
												tmpScheduleOption.getPrice() - tmpScheduleOption.getPrice()
														* tmpScheduleOption.getDiscountPercent());
									} else {
										tmpScheduleOption.setDiscountPrice(
												tmpScheduleOption.getPrice() - tmpScheduleOption.getDiscountValue());
									}

									tScheduleOptionEntityList.add(tmpScheduleOption);
								} else {
									if (discontFlg.equals(KooConst.STR_TYPE_CHECK_FALSE)) {
										tmpScheduleOption.setDiscountPrice(tmpScheduleOption.getPrice());
										tScheduleOptionEntityList.add(tmpScheduleOption);
									}
								}
							} else {
								if (discontFlg.equals(KooConst.STR_TYPE_CHECK_FALSE)) {
									tmpScheduleOption.setDiscountPrice(tmpScheduleOption.getPrice());
									tScheduleOptionEntityList.add(tmpScheduleOption);
								}
							}
						}
						if (tScheduleOptionEntityList.size() > 0) {
							Double minDiscountPrice = KooConst.NUM_MAX;
							Double maxPrice = 0.0;
							ScheduleOptionEntity minScheduleOption = new ScheduleOptionEntity();
							for (ScheduleOptionEntity tmpScheduleOption : tScheduleOptionEntityList) {
								if (tmpScheduleOption.getDiscountPrice() < minDiscountPrice) {
									minDiscountPrice = tmpScheduleOption.getDiscountPrice();
									maxPrice = tmpScheduleOption.getPrice();
									minScheduleOption = tmpScheduleOption;
								} else if (tmpScheduleOption.getDiscountPrice() == minDiscountPrice) {
									if (tmpScheduleOption.getPrice() > maxPrice) {
										minDiscountPrice = tmpScheduleOption.getDiscountPrice();
										minScheduleOption = tmpScheduleOption;
										maxPrice = tmpScheduleOption.getPrice();
									}
								}
							}
							tmpVal.setDiscountPrice(minScheduleOption.getDiscountPrice());
							tmpVal.setPrice(minScheduleOption.getPrice());
							retList.add(tmpVal);
						}
					}
				}

			}

		}
		return (retList);
	}

	@Override
	public List<CourseEntity> mergeCourseByScheduleWorkDay(List<CourseEntity> courseEntityList, String bgnDate,
			String endDate) {
		List<CourseEntity> retList = new ArrayList<>();
		if (courseEntityList != null && courseEntityList.size() > 0) {
			CourseScheduleParamEntity courseScheduleParamEntity = new CourseScheduleParamEntity();
			courseScheduleParamEntity.setLangId(courseEntityList.get(0).getLangId());
			courseScheduleParamEntity.setBgnWorkDate(bgnDate);
			courseScheduleParamEntity.setEndWorkDate(endDate);
			courseScheduleParamEntity.setStatus(KooConst.ST_WORK);
			List<CourseScheduleEntity> courseScheduleEntityList = courseScheduleService4DB
					.selectByCondition(courseScheduleParamEntity);
			if (courseScheduleEntityList != null && courseScheduleEntityList.size() > 0) {
				List<String> courseIDList = courseScheduleEntityList.stream()
						.map(schedule -> schedule.getCourseIdentiNo()).distinct().collect(Collectors.toList());
				for (CourseEntity tmpVal : courseEntityList) {
					if (courseIDList.contains(tmpVal.getCourseIdentiNo())) {
						retList.add(tmpVal);
					}
				}

			}

		}

		return (retList);
	}

	@Override
	public List<CourseEntity> addPictureToCourse(List<CourseEntity> courseEntityList) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<CourseEntity> retList = new ArrayList<>();
		if (courseEntityList != null && courseEntityList.size() > 0) {
			CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();
			coursePictureParamEntity.setLangId(courseEntityList.get(0).getLangId());
			List<CoursePictureEntity> coursePictureEntityList = coursePictureService4DB
					.selectByCondition(coursePictureParamEntity);
			if (coursePictureEntityList != null && coursePictureEntityList.size() > 0) {
				RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
				for (CourseEntity tmpVal : courseEntityList) {
					List<CoursePictureEntity> tCoursePictureEntityList = rumdaEx
							.selectCoursePictureByCourseIdentiNo(coursePictureEntityList, tmpVal.getCourseIdentiNo());
					if (tCoursePictureEntityList != null && tCoursePictureEntityList.size() > 0) {
						List<CoursePictureEntity> wCoursePictureEntityList = new ArrayList<>();
						for (CoursePictureEntity tCoursePicture : tCoursePictureEntityList) {

							tCoursePicture.setFullPath(KooConst.STR_UPLOAD_IMAGES_PATH + tCoursePicture.getFullPath());
							wCoursePictureEntityList.add(tCoursePicture);
						}
						tmpVal.setCoursePictureListDisp(wCoursePictureEntityList);
					}
					retList.add(tmpVal);
				}

			}else{
				retList=courseEntityList;
			}
		}
		return (retList);
	}

	@Override
	public List<CourseEntity> addCommentInfoToCourse(List<CourseEntity> courseEntityList) {
		List<CourseEntity> retList = new ArrayList<>();
		if (courseEntityList != null && courseEntityList.size() > 0) {
			List<CourseCommentEntity> courseCommentEntityList = courseCommentService4DB.selectAll();
			if (courseCommentEntityList != null && courseCommentEntityList.size() > 0) {
				RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
				for (CourseEntity tmpVal : courseEntityList) {
					List<CourseCommentEntity> tCourseCommentEntityList = rumdaEx
							.selectCourseCommentByCourseIdentiNo(courseCommentEntityList, tmpVal.getCourseIdentiNo());
					if (tCourseCommentEntityList != null && tCourseCommentEntityList.size() > 0) {
						tmpVal.setReviewNumDisp(tCourseCommentEntityList.size());
						OptionalDouble scoreAve = tCourseCommentEntityList.stream().map(e -> e.getScore())
								.mapToDouble(a -> a).average();
						Double scoreAveVal = scoreAve.getAsDouble();
						List<String> starList = KooUtil.getStarName(scoreAveVal);
						tmpVal.setScoreIconListDisp(starList);
						tmpVal.setScoreDisp(scoreAveVal);

					}
					retList.add(tmpVal);
				}

			}else{
				retList=courseEntityList;
			}

		}

		return (retList);
	}

	public List<CourseEntity> addInExInfoToCourse(List<CourseEntity> courseEntityList) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<CourseEntity> retList = new ArrayList<>();
		if (courseEntityList != null && courseEntityList.size() > 0) {
			List<CourseInExclusionEntity> courseInExclusionEntityList = courseInExclusionService4DB.selectAll();
			if (courseInExclusionEntityList != null && courseInExclusionEntityList.size() > 0) {
				RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
				for (CourseEntity tmpVal : courseEntityList) {
					List<CourseInExclusionEntity> inCourseInExclusionEntityList = rumdaEx
							.selectCourseInExclusionByCondition(courseInExclusionEntityList,
									KooConst.ST_COURSE_INCLUSION, tmpVal.getCourseIdentiNo());
					tmpVal.setInclusionListDisp(inCourseInExclusionEntityList);
					List<CourseInExclusionEntity> exCourseInExclusionEntityList = rumdaEx
							.selectCourseInExclusionByCondition(courseInExclusionEntityList,
									KooConst.ST_COURSE_EXCLUSION, tmpVal.getCourseIdentiNo());
					tmpVal.setExclusionListDisp(exCourseInExclusionEntityList);
					retList.add(tmpVal);
				}
			}
		}else{
			retList=courseEntityList;
		}
		return (retList);
	}

	public List<CourseEntity> addOtherInfoToCourse(List<CourseEntity> courseEntityList) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<CourseEntity> retList = new ArrayList<>();
		if (courseEntityList != null && courseEntityList.size() > 0) {
			List<LocalhostEntity> localhostEntityList = localhostService4DB.selectAll();
			if (localhostEntityList != null && localhostEntityList.size() > 0) {
				RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
				for (CourseEntity tmpVal : courseEntityList) {
					List<LocalhostEntity> tLocalhostEntityList = rumdaEx
							.selectLocalhostBylocalhostIdentiNo(localhostEntityList, tmpVal.getLocalhostIdentiNo());
					if (tLocalhostEntityList != null && tLocalhostEntityList.size() > 0) {
						tmpVal.setLocalhostPictureDisp(
								KooConst.STR_UPLOAD_IMAGES_PATH + tLocalhostEntityList.get(0).getPhoto());

						tmpVal.setLocalhostNameDisp(tLocalhostEntityList.get(0).getLastName() + " "
								+ tLocalhostEntityList.get(0).getFirstName());
					}

					retList.add(tmpVal);
				}

			}

		}
		return (retList);

	}

	public List<CourseEntity> addFavoriteInfoToCourse(List<CourseEntity> courseEntityList,String tTouristNo) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<CourseEntity> retList = new ArrayList<>();
		if (courseEntityList != null && courseEntityList.size() > 0) {
			
			FavoriteParamEntity favoriteParamEntity = new FavoriteParamEntity();
			favoriteParamEntity.setTouristIdentiNo(tTouristNo);
			favoriteParamEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
			List<FavoriteEntity>favoriteEntityList = favoriteService4DB.selectByCondition(favoriteParamEntity);
			
			if (favoriteEntityList != null && favoriteEntityList.size() > 0) {
				RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
				for (CourseEntity tmpVal : courseEntityList) {
					List<FavoriteEntity> tFavoriteEntityList = rumdaEx
							.selectFavoriteByTouristNoAndCourseNo(favoriteEntityList, tmpVal.getCourseIdentiNo());
					if (tFavoriteEntityList != null && tFavoriteEntityList.size() > 0) {
						tmpVal.setFavoriteIdentiNo(tFavoriteEntityList.get(0).getFavoriteIdentiNo());
					}else{
						tmpVal.setFavoriteIdentiNo("");
					}

					retList.add(tmpVal);
				}

			}else{
				retList=courseEntityList;
			}

		}
		return (retList);

	}

	@Override
	public void testSort() {

		List<CourseEntity> courseEntityList = courseService4DB.selectAll();
		List<CourseEntity> courseEntityListWithScore = new ArrayList<CourseEntity>();
		double i = 1;
		if (courseEntityList != null && courseEntityList.size() > 0) {
			courseEntityListWithScore = calcCourseDispOrder(courseEntityList);
			// for (CourseEntity tmpVal : courseEntityList) {
			// tmpVal.setScoreDisp(i);
			// courseEntityListWithScore.add(tmpVal);
			// i = i + 1.0;
			// }

		}
		List<CourseEntity> courseEntityListSort = new ArrayList<CourseEntity>();

		courseEntityListSort = RumdaSort.courseEntitySortByScore(courseEntityListWithScore);

		i = i + 1.0;
	}

	public List<CourseEntity> filterCourseByType(List<CourseEntity> courseEntityList,
			CourseFilterEntity courseFilterEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<CourseEntity> retList = new ArrayList<>();
		if (courseEntityList != null && courseEntityList.size() > 0) {

			CourseParamEntity courseParamEntity = new CourseParamEntity();
			RumdaByConditionEx rumdaByConditionEx = new RumdaByConditionEx();
			if ((KooUtil.isNotNull(courseFilterEntity.getAdventure())
					&& courseFilterEntity.getAdventure().equals(KooConst.ST_FLG_YES))
					|| (KooUtil.isNotNull(courseFilterEntity.getCultureArts())
							&& courseFilterEntity.getCultureArts().equals(KooConst.ST_FLG_YES))
					|| (KooUtil.isNotNull(courseFilterEntity.getFestivalEvents())
							&& courseFilterEntity.getFestivalEvents().equals(KooConst.ST_FLG_YES))
					|| (KooUtil.isNotNull(courseFilterEntity.getFoodDrink())
							&& courseFilterEntity.getFoodDrink().equals(KooConst.ST_FLG_YES))
					|| (KooUtil.isNotNull(courseFilterEntity.getHistorical())
							&& courseFilterEntity.getHistorical().equals(KooConst.ST_FLG_YES))
					|| (KooUtil.isNotNull(courseFilterEntity.getLeisureSports())
							&& courseFilterEntity.getLeisureSports().equals(KooConst.ST_FLG_YES))
					|| (KooUtil.isNotNull(courseFilterEntity.getNatureRural())
							&& courseFilterEntity.getNatureRural().equals(KooConst.ST_FLG_YES))
					|| (KooUtil.isNotNull(courseFilterEntity.getNightlifeParty())
							&& courseFilterEntity.getNightlifeParty().equals(KooConst.ST_FLG_YES))
					|| (KooUtil.isNotNull(courseFilterEntity.getShoppingMarket())
							&& courseFilterEntity.getShoppingMarket().equals(KooConst.ST_FLG_YES))) {

				courseParamEntity.setAdventure(courseFilterEntity.getAdventure());
				courseParamEntity.setCultureArts(courseFilterEntity.getCultureArts());
				courseParamEntity.setFestivalEvents(courseFilterEntity.getFestivalEvents());
				courseParamEntity.setFoodDrink(courseFilterEntity.getFoodDrink());
				courseParamEntity.setHistorical(courseFilterEntity.getHistorical());
				courseParamEntity.setLeisureSports(courseFilterEntity.getLeisureSports());
				courseParamEntity.setNatureRural(courseFilterEntity.getNatureRural());
				courseParamEntity.setNightlifeParty(courseFilterEntity.getNightlifeParty());
				courseParamEntity.setShoppingMarket(courseFilterEntity.getShoppingMarket());
				courseEntityList = rumdaByConditionEx.selectCourseByType(courseEntityList, courseParamEntity);

				if (courseEntityList.isEmpty()) {

					ErrorInfo tErrorInfo = new ErrorInfo();
					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[selectCourseByORCondition]");
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
					tErrorInfo.setDispOrder(1);
					tList.add(tErrorInfo);
				}
			}

			retList = courseEntityList;
		}
		return (retList);

	}

	public List<CourseEntity> filterCourseByLang(List<CourseEntity> courseEntityList,
			CourseFilterEntity courseFilterEntity) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<CourseEntity> retList = new ArrayList<>();
		if (courseEntityList != null && courseEntityList.size() > 0) {

			CourseParamEntity courseParamEntity = new CourseParamEntity();
			RumdaByConditionEx rumdaByConditionEx = new RumdaByConditionEx();
			if (KooUtil.isNotNull(courseFilterEntity.getSelectLangId1())
					|| KooUtil.isNotNull(courseFilterEntity.getSelectLangId2())
					|| KooUtil.isNotNull(courseFilterEntity.getSelectLangId3())) {

				courseParamEntity.setUseLangId1Disp(courseFilterEntity.getSelectLangId1());
				courseParamEntity.setUseLangId2Disp(courseFilterEntity.getSelectLangId1());
				courseParamEntity.setUseLangId3Disp(courseFilterEntity.getSelectLangId1());
				courseEntityList = rumdaByConditionEx.selectCourseByInCondition(courseEntityList, courseParamEntity);

				if (courseEntityList.isEmpty()) {

					ErrorInfo tErrorInfo = new ErrorInfo();
					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[selectCourseByInCondition]");
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
					tErrorInfo.setDispOrder(1);
					tList.add(tErrorInfo);
				}

			}

			retList = courseEntityList;
		}
		return (retList);

	}

	private List<CourseEntity> calcCourseDispOrder(List<CourseEntity> inCourseEntityList) {
		List<CourseEntity> retVal = new ArrayList<CourseEntity>();
		List<CourseEntity> courseEntityListWithOrderVal = new ArrayList<CourseEntity>();
		if (inCourseEntityList != null && inCourseEntityList.size() > 0) {
			LocalDate dateNow = LocalDate.now();
			LocalDate dateCrt = null;
			for (CourseEntity tmpVal : inCourseEntityList) {
				int tmpOrderVal = 0;
				Instant instant = tmpVal.getCreateTime().toInstant();
				dateCrt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();

				Period period = Period.between(dateCrt, dateNow);
				int tDayNum = period.getDays();
				// 新着物に追加点
				if (tDayNum <= 7) {
					tmpOrderVal = tmpOrderVal + 100;
				} else {
					if (tDayNum <= 30) {
						tmpOrderVal = tmpOrderVal + 50;
					} else {
						if (tDayNum <= 90) {
							tmpOrderVal = tmpOrderVal + 10;
						}
					}
				}
				CourseCommentParamEntity courseCommentParamEntity = new CourseCommentParamEntity();
				courseCommentParamEntity.setLangId(tmpVal.getLangId());
				courseCommentParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
				List<CourseCommentEntity> CourseCommentEntityList = courseCommentService4DB
						.selectByCondition(courseCommentParamEntity);
				if (CourseCommentEntityList != null && CourseCommentEntityList.size() > 0) {
					int CourseCommentNum = CourseCommentEntityList.size();
					// Comment数に追加点
					if (CourseCommentNum > 100) {
						tmpOrderVal = tmpOrderVal + 100;
					} else {
						if (tDayNum > 30) {
							tmpOrderVal = tmpOrderVal + 50;
						} else {
							if (tDayNum > 10) {
								tmpOrderVal = tmpOrderVal + 10;
							}
						}
					}

					double scoreVal = 0;

					List<Double> tScoreList = CourseCommentEntityList.stream().map(schedule -> schedule.getScore())
							.collect(Collectors.toList());
					scoreVal = tScoreList.stream().collect(Collectors.averagingDouble(score -> score));
					// scoreValに追加点
					tmpOrderVal = tmpOrderVal + (int) scoreVal * 10;

				}

				tmpVal.setTimeInDay(tmpOrderVal);
				courseEntityListWithOrderVal.add(tmpVal);
			}

			retVal = courseEntityListWithOrderVal;
			// retVal =
			// RumdaSort.courseEntitySortByScore(courseEntityListWithOrderVal);

		}
		return (retVal);
	}

	public List<CourseEntity> filterCourseByCity(List<CourseEntity> courseEntityList, String city) {
		List<CourseEntity> retList = new ArrayList<>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (courseEntityList != null && courseEntityList.size() > 0) {

			RumdaByConditionEx rumdaByConditionEx = new RumdaByConditionEx();
			if (KooUtil.isNotNull(city)) {
				courseEntityList = rumdaByConditionEx.selectCourseByCity(courseEntityList, city);
				if (courseEntityList.isEmpty()) {

					ErrorInfo tErrorInfo = new ErrorInfo();
					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[selectCourseByInCondition]");
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
					tErrorInfo.setDispOrder(1);
					tList.add(tErrorInfo);
				}

			}

			retList = courseEntityList;
		}

		RumdaByConditionEx rumdaByConditionEx = new RumdaByConditionEx();
		if (KooUtil.isNotNull(city)) {

		}

		return (retList);

	}

}
