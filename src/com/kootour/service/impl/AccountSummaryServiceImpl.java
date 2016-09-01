package com.kootour.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.RumdaByConditionEx;
import com.kootour.mapper.entity.AccountSummaryEntity;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseFavoriteVEntity;
import com.kootour.mapper.entity.CourseLocalhostVEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.ExtraOptionEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.entity.UserOrderExtraOptionEntity;
import com.kootour.mapper.entity.WishDetailEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.CourseFavoriteVParamEntity;
import com.kootour.mapper.paramentity.CourseLocalhostVParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.mapper.paramentity.ExtraOptionParamEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;
import com.kootour.mapper.paramentity.UserOrderExtraOptionParamEntity;
import com.kootour.mapper.paramentity.UserOrderParamEntity;
import com.kootour.service.AccountSummaryService;
import com.kootour.service.CommonService;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.CourseFavoriteVService4DB;
import com.kootour.service4db.CourseLocalhostVService4DB;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.ExtraOptionService4DB;
import com.kootour.service4db.ScheduleOptionService4DB;
import com.kootour.service4db.TouristService4DB;
import com.kootour.service4db.UserOrderExtraOptionService4DB;
import com.kootour.service4db.UserOrderService4DB;

@Configuration
@Service
public class AccountSummaryServiceImpl implements AccountSummaryService {
	@Autowired
	private CourseFavoriteVService4DB courseFavoriteVService4DB;
	@Autowired
	private CoursePictureService4DB coursePictureService4DB;
	@Autowired
	private ScheduleOptionService4DB scheduleOptionService4DB;
	@Autowired
	private UserOrderService4DB userOrderService4DB;
	@Autowired
	private CourseLocalhostVService4DB courseLocalhostVService4DB;
	@Autowired
	private CourseCommentService4DB courseCommentService4DB;

	@Autowired
	private TouristService4DB touristService4DB ;

	@Autowired
	private UserOrderExtraOptionService4DB userOrderExtraOptionService4DB;

	@Autowired
	private ExtraOptionService4DB extraOptionService4DB;

	@Autowired
	private CourseService4DB courseService4DB;

	@Autowired(required = false)
	private CommonService commonService = new CommonServiceImpl();

	@Override
	public AccountSummaryEntity load(AccountSummaryEntity accountSummaryEntity, Map<String, Object> paraMap) {

		AccountSummaryEntity rtnResult = new AccountSummaryEntity();
		rtnResult=accountSummaryEntity;
		List<CourseFavoriteVEntity> courseFavoriteVEntityList = new ArrayList<CourseFavoriteVEntity>();
		CourseFavoriteVParamEntity courseFavoriteVParamEntity = new CourseFavoriteVParamEntity();
		courseFavoriteVParamEntity.setLangId(accountSummaryEntity.getLangId());
		courseFavoriteVParamEntity.setTouristIdentiNo(accountSummaryEntity.getTouristIdentiNo());
		courseFavoriteVParamEntity.setDelFlg("0");
		courseFavoriteVEntityList = courseFavoriteVService4DB.selectByCondition(courseFavoriteVParamEntity);
		List<WishDetailEntity> wishDetailEntityList = new ArrayList<WishDetailEntity>();

		if (courseFavoriteVEntityList != null) {

			String bgnDate = (String) paraMap.get(KooConst.ST_SYSDATE);

			LocalDate date1 = LocalDate.parse(bgnDate, DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"
			// TODO
			date1 = date1.plusMonths(12);
			String endDate = date1.format(DateTimeFormatter.BASIC_ISO_DATE);

			wishDetailEntityList = calcMinPrice(courseFavoriteVEntityList, bgnDate, endDate);
			wishDetailEntityList = addCommentInfoToWishDetail(wishDetailEntityList);
			rtnResult.setWishDetailListDisp(wishDetailEntityList);

			List<UserOrderEntity> userOrderList = new ArrayList<UserOrderEntity>();
			UserOrderParamEntity userOrderParamEntity = new UserOrderParamEntity();
			userOrderParamEntity.setTouristIdentiNo(accountSummaryEntity.getTouristIdentiNo());
			userOrderList = userOrderService4DB.selectByCondition(userOrderParamEntity);
			List<UserOrderEntity> tUserOrderList = new ArrayList<UserOrderEntity>();
			for (UserOrderEntity tmpVal : userOrderList) {
				CourseLocalhostVParamEntity courseLocalhostVParamEntity = new CourseLocalhostVParamEntity();
				courseLocalhostVParamEntity.setLangId(tmpVal.getLangId());
				courseLocalhostVParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
				List<CourseLocalhostVEntity> courseLocalhostVEntityList = courseLocalhostVService4DB
						.selectByCondition(courseLocalhostVParamEntity);
				if (courseLocalhostVEntityList != null) {
					CourseLocalhostVEntity tmpCourseLocalhostVEntity = courseLocalhostVEntityList.get(0);
					tmpVal.setCourseFullName(tmpCourseLocalhostVEntity.getFullName());
					tmpVal.setTouristFullName(
							tmpCourseLocalhostVEntity.getFirstName() + " " + tmpCourseLocalhostVEntity.getLastName());
					tmpVal.setLocalhostPicture(KooConst.STR_UPLOAD_IMAGES_PATH + tmpCourseLocalhostVEntity.getPhoto());
				}
				CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();
				coursePictureParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
				List<CoursePictureEntity> tCoursePictureEntityList = coursePictureService4DB
						.selectByCondition(coursePictureParamEntity);
				if (tCoursePictureEntityList != null) {
					tmpVal.setCoursePicture(
							KooConst.STR_UPLOAD_IMAGES_PATH + tCoursePictureEntityList.get(0).getFullPath());
				}

				UserOrderExtraOptionParamEntity userOrderExtraOptionParamEntity = new UserOrderExtraOptionParamEntity();
				userOrderExtraOptionParamEntity.setLangId(tmpVal.getLangId());
				userOrderExtraOptionParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
				List<UserOrderExtraOptionEntity> userOrderExtraOptionList = userOrderExtraOptionService4DB
						.selectByCondition(userOrderExtraOptionParamEntity);
				List<UserOrderExtraOptionEntity> tUserOrderExtraOptionList = new ArrayList<>();
				if (userOrderExtraOptionList != null) {

					for (UserOrderExtraOptionEntity tmpVal2 : userOrderExtraOptionList) {
						ExtraOptionParamEntity extraOptionParamEntity = new ExtraOptionParamEntity();
						extraOptionParamEntity.setLangId(tmpVal2.getLangId());
						extraOptionParamEntity.setCourseIdentiNo(tmpVal2.getCourseIdentiNo());
						List<ExtraOptionEntity> extraOptionList = extraOptionService4DB
								.selectByCondition(extraOptionParamEntity);
						if (extraOptionList != null) {
							tmpVal2.setExtraPrice(extraOptionList.get(0).getExtraPrice());
							tmpVal2.setExtraOptionName(extraOptionList.get(0).getExtraOptionName());
							tmpVal2.setExtraTime(extraOptionList.get(0).getExtraTime());
							tmpVal2.setExtraUnit(extraOptionList.get(0).getExtraUnit());
							tUserOrderExtraOptionList.add(tmpVal2);
						}
					}
					tmpVal.setUserOrderExtraOptionEntityList(tUserOrderExtraOptionList);
				}
				CourseParamEntity courseParamEntity = new CourseParamEntity();
				courseParamEntity.setLangId(tmpVal.getLangId());
				courseParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
				
				List<CourseEntity> courseEntityList=courseService4DB.selectByPK(courseParamEntity);
				if (courseEntityList!=null && courseEntityList.size()>0){
					tmpVal.setLocation(courseEntityList.get(0).getTourLocation());
					
				}
				double taxVal=0.1;
				tmpVal.setTaxVal(taxVal);
				
				
				ScheduleOptionEntity tScheduleOptionEntity=new ScheduleOptionEntity();
				ScheduleOptionParamEntity scheduleOptionParamEntity = new ScheduleOptionParamEntity(); 
				scheduleOptionParamEntity.setLangId(tmpVal.getLangId());
				scheduleOptionParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
				List<ScheduleOptionEntity> ScheduleOptionEntityList = scheduleOptionService4DB
						.selectByCondition(scheduleOptionParamEntity);
		        if (ScheduleOptionEntityList!=null && ScheduleOptionEntityList.size()>0){
		        	tScheduleOptionEntity=ScheduleOptionEntityList.get(0);
		        	Double tSubTotal = commonService.calcSubTotalMoney(tmpVal, tScheduleOptionEntity);
		        	Double tExtraTotal= commonService.calcExtraMoney(tmpVal, tScheduleOptionEntity);
		        	Double tTotal=tSubTotal+tExtraTotal;
					tmpVal.setTotalMoney(tTotal);
					tmpVal.setPaidMoney(tTotal+tTotal*taxVal);
		        }

				double discountMoney=0;
				tmpVal.setDiscountMoney(discountMoney);
				
				CourseCommentParamEntity courseCommentParamEntity = new CourseCommentParamEntity();
				courseCommentParamEntity.setLangId(tmpVal.getLangId());
				courseCommentParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
				courseCommentParamEntity.setTouristIdentiNo(accountSummaryEntity.getCurTouristIdentiNo());
				
				List<CourseCommentEntity> courseCommentEntityList=courseCommentService4DB.selectByCondition(courseCommentParamEntity);
				if (courseCommentEntityList != null && courseCommentEntityList.size()>0) {
					tmpVal.setCommentIdentiNo(courseCommentEntityList.get(0).getCourseCommentIdentiNo());
				}else{
					tmpVal.setCommentIdentiNo("");					
				}
				tmpVal.setUserOrderExtraOptionEntityList(tUserOrderExtraOptionList);
				tUserOrderList.add(tmpVal);
			}
			rtnResult.setUserOrderList(tUserOrderList);
			TouristParamEntity touristParamEntity= new TouristParamEntity();
			touristParamEntity.setLangId(accountSummaryEntity.getLangId());
			touristParamEntity.setTouristIdentiNo(accountSummaryEntity.getTouristIdentiNo());
			touristParamEntity.setDelFlg("0");
			List<TouristEntity> touristEntityList =touristService4DB.selectByCondition(touristParamEntity);
			String touristName="";
			String touristIcon="";
			if (touristEntityList != null && touristEntityList.size()>0) {
				touristName=touristEntityList.get(0).getFirstName()+" " +touristEntityList.get(0).getLastName();
				touristIcon=KooConst.STR_UPLOAD_IMAGES_PATH + touristEntityList.get(0).getPicture();
			}
			rtnResult.setTouristName(touristName);
			rtnResult.setTouristIcon(touristIcon);
			int kootourPoint=150;
			rtnResult.setKootourPoint(kootourPoint);
			rtnResult.setEmailOkFlag("1");
			rtnResult.setPhoneOkFlg("0");
			
		}
		return (rtnResult);
	}

	public AccountSummaryEntity loadTest(AccountSummaryEntity accountSummaryEntity, Map<String, Object> paraMap) {
		AccountSummaryEntity rtnResult = new AccountSummaryEntity();
		List<CourseFavoriteVEntity> courseFavoriteVEntityList = new ArrayList<CourseFavoriteVEntity>();
		CourseFavoriteVParamEntity courseFavoriteVParamEntity = new CourseFavoriteVParamEntity();
		courseFavoriteVParamEntity.setLangId(accountSummaryEntity.getLangId());
		courseFavoriteVParamEntity.setTouristIdentiNo(accountSummaryEntity.getTouristIdentiNo());
		courseFavoriteVParamEntity.setDelFlg("0");
		courseFavoriteVEntityList = courseFavoriteVService4DB.selectByCondition(courseFavoriteVParamEntity);
		List<WishDetailEntity> wishDetailEntityList = new ArrayList<WishDetailEntity>();
		if (courseFavoriteVEntityList != null) {
			for (int i = 0; i < courseFavoriteVEntityList.size(); i++) {
				CourseFavoriteVEntity courseFavoriteVEntityItem = courseFavoriteVEntityList.get(i);
				WishDetailEntity wishDetailEntity = new WishDetailEntity();
				wishDetailEntity.setCourseName(courseFavoriteVEntityItem.getFullName());
				ScheduleOptionParamEntity scheduleOptionParamEntity = new ScheduleOptionParamEntity();
				scheduleOptionParamEntity.setCourseIdentiNo(courseFavoriteVEntityItem.getCourseIdentiNo());

				List<ScheduleOptionEntity> scheduleOptionEntityList = scheduleOptionService4DB
						.selectByCondition(scheduleOptionParamEntity);

				ScheduleOptionEntity ScheduleOptionEntity = KooUtil.calcDiscount(scheduleOptionEntityList);
				wishDetailEntity.setCourseIdentiNo(courseFavoriteVEntityItem.getCourseIdentiNo());
				wishDetailEntity.setLocalhostIdentiNo(courseFavoriteVEntityItem.getLocalhostIdentiNo());
				wishDetailEntity.setUnitName("$");
				wishDetailEntity.setDiscountPrice(ScheduleOptionEntity.getDiscountPrice());
				wishDetailEntity.setPrice(ScheduleOptionEntity.getPrice());

				wishDetailEntity.setInfantFree(courseFavoriteVEntityItem.getInfantFree());
				wishDetailEntity.setLangId(courseFavoriteVEntityItem.getLangId());
				wishDetailEntity.setLocalhostNameDisp(
						courseFavoriteVEntityItem.getFirstName() + " " + courseFavoriteVEntityItem.getLastName());
				wishDetailEntity.setPersonOrGroupText(courseFavoriteVEntityItem.getPersonOrGroup());
				wishDetailEntity.setLocalhostPictureDisp(
						KooConst.STR_UPLOAD_IMAGES_PATH + courseFavoriteVEntityItem.getPhoto());
				CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();
				coursePictureParamEntity.setLangId(courseFavoriteVEntityItem.getLangId());
				coursePictureParamEntity.setCourseIdentiNo(courseFavoriteVEntityItem.getCourseIdentiNo());
				List<CoursePictureEntity> coursePictureEntityList = coursePictureService4DB
						.selectByCondition(coursePictureParamEntity);
				if (coursePictureEntityList != null && coursePictureEntityList.size() > 0) {
					CoursePictureEntity coursePictureEntity = coursePictureEntityList.get(0);
					List<String> coursePictureListDisp = new ArrayList<String>();
					coursePictureListDisp.add(KooConst.STR_UPLOAD_IMAGES_PATH + coursePictureEntity.getFullPath());
					wishDetailEntity.setCoursePictureListDisp(coursePictureListDisp);
				}
				wishDetailEntityList.add(wishDetailEntity);
			}
			rtnResult.setWishDetailListDisp(wishDetailEntityList);

			List<UserOrderEntity> userOrderList = new ArrayList<UserOrderEntity>();
			UserOrderParamEntity userOrderParamEntity = new UserOrderParamEntity();
			userOrderParamEntity.setTouristIdentiNo(accountSummaryEntity.getTouristIdentiNo());
			userOrderList = userOrderService4DB.selectByCondition(userOrderParamEntity);
			List<UserOrderEntity> tUserOrderList = new ArrayList<UserOrderEntity>();
			for (UserOrderEntity tmpVal : userOrderList) {
				CourseLocalhostVParamEntity courseLocalhostVParamEntity = new CourseLocalhostVParamEntity();
				courseLocalhostVParamEntity.setLangId(tmpVal.getLangId());
				courseLocalhostVParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
				List<CourseLocalhostVEntity> courseLocalhostVEntityList = courseLocalhostVService4DB
						.selectByCondition(courseLocalhostVParamEntity);
				if (courseLocalhostVEntityList != null) {
					CourseLocalhostVEntity tmpCourseLocalhostVEntity = courseLocalhostVEntityList.get(0);
					tmpVal.setCourseFullName(tmpCourseLocalhostVEntity.getFullName());
					tmpVal.setTouristFullName(
							tmpCourseLocalhostVEntity.getFirstName() + " " + tmpCourseLocalhostVEntity.getLastName());
					tmpVal.setLocalhostPicture(KooConst.STR_UPLOAD_IMAGES_PATH + tmpCourseLocalhostVEntity.getPhoto());
				}
				CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();
				coursePictureParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
				List<CoursePictureEntity> tCoursePictureEntityList = coursePictureService4DB
						.selectByCondition(coursePictureParamEntity);
				if (tCoursePictureEntityList != null) {
					tmpVal.setCoursePicture(
							KooConst.STR_UPLOAD_IMAGES_PATH + tCoursePictureEntityList.get(0).getFullPath());
				}
				tmpVal.setUnitName("$");
				String location ="Vancouver";
				tmpVal.setLocation(location);
				double taxVal=0.1;
				tmpVal.setTaxVal(taxVal);
				double discountMoney=55;
				tmpVal.setDiscountMoney(discountMoney);
				double totalMoney=350;
				tmpVal.setTotalMoney(totalMoney);
				tUserOrderList.add(tmpVal);
			}
			rtnResult.setUserOrderList(tUserOrderList);
		}
		return (rtnResult);
	}


	@Override
	public List<WishDetailEntity> calcMinPrice(List<CourseFavoriteVEntity> courseFavoriteVEntityList, String bgnDate,
			String endDate) {
		List<WishDetailEntity> retList = new ArrayList<>();
		if (courseFavoriteVEntityList != null && courseFavoriteVEntityList.size() > 0) {
			List<ScheduleOptionEntity> scheduleOptionEntityList = scheduleOptionService4DB.selectAll();
			RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
			for (CourseFavoriteVEntity tmpVal : courseFavoriteVEntityList) {
				if (scheduleOptionEntityList != null && scheduleOptionEntityList.size() > 0) {
					WishDetailEntity wishDetailEntity = new WishDetailEntity();
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
								}else{
										tmpScheduleOption.setDiscountPrice(tmpScheduleOption.getPrice());
										tScheduleOptionEntityList.add(tmpScheduleOption);									
								}
							}else{
								tmpScheduleOption.setDiscountPrice(tmpScheduleOption.getPrice());
								tScheduleOptionEntityList.add(tmpScheduleOption);																	
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

							wishDetailEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
							wishDetailEntity.setLocalhostIdentiNo(tmpVal.getLocalhostIdentiNo());
							wishDetailEntity.setUnitName("$");
							wishDetailEntity.setDiscountPrice(tmpVal.getDiscountPrice());
							wishDetailEntity.setPrice(tmpVal.getPrice());
							wishDetailEntity.setCourseName(tmpVal.getFullName());
							wishDetailEntity.setInfantFree(tmpVal.getInfantFree());
							wishDetailEntity.setLangId(tmpVal.getLangId());
							wishDetailEntity.setLocalhostNameDisp(tmpVal.getFirstName() + " " + tmpVal.getLastName());
							wishDetailEntity.setPersonOrGroupText(tmpVal.getPersonOrGroup());
							wishDetailEntity
									.setLocalhostPictureDisp(KooConst.STR_UPLOAD_IMAGES_PATH + tmpVal.getPhoto());
							CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();
							coursePictureParamEntity.setLangId(tmpVal.getLangId());
							coursePictureParamEntity.setCourseIdentiNo(tmpVal.getCourseIdentiNo());
							List<CoursePictureEntity> coursePictureEntityList = coursePictureService4DB
									.selectByCondition(coursePictureParamEntity);
							if (coursePictureEntityList != null && coursePictureEntityList.size() > 0) {
								CoursePictureEntity coursePictureEntity = coursePictureEntityList.get(0);
								List<String> coursePictureListDisp = new ArrayList<String>();
								coursePictureListDisp
										.add(KooConst.STR_UPLOAD_IMAGES_PATH + coursePictureEntity.getFullPath());
								wishDetailEntity.setCoursePictureListDisp(coursePictureListDisp);
							}
							retList.add(wishDetailEntity);
						}
					}
				}

			}

		}
		return (retList);
	}

	@Override
	public List<WishDetailEntity> addCommentInfoToWishDetail(List<WishDetailEntity> wishDetailEntityList) {
		List<WishDetailEntity> retList = new ArrayList<>();
		if (wishDetailEntityList != null && wishDetailEntityList.size() > 0) {
			List<CourseCommentEntity> courseCommentEntityList = courseCommentService4DB.selectAll();
			if (courseCommentEntityList != null && courseCommentEntityList.size() > 0) {
				RumdaByConditionEx rumdaEx = new RumdaByConditionEx();
				for (WishDetailEntity tmpVal : wishDetailEntityList) {
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

			}

		}

		return (retList);
	}

}
