package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.exception.BusinessException;
import com.kootour.exception.SystemException;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseDiscountEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.entity.CourseLocalhostVEntity;
import com.kootour.mapper.entity.CourseOrderVEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.ExtraOptionEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.KootourMstEntity;
import com.kootour.mapper.entity.KootourPromoEntity;
import com.kootour.mapper.entity.LanguageMatrixEntity;
import com.kootour.mapper.entity.LanguageMstEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.entity.MessageEntity;
import com.kootour.mapper.entity.PictureCommentEntity;
import com.kootour.mapper.entity.PictureEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.entity.UserOrderExtraOptionEntity;
import com.kootour.mapper.paramentity.CourseLocalhostVParamEntity;
import com.kootour.mapper.paramentity.CourseOrderVParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.ExtraOptionParamEntity;
import com.kootour.mapper.paramentity.UserOrderExtraOptionParamEntity;
import com.kootour.service.CourseScheduleService;
import com.kootour.service.TestDBService;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.CourseDiscountService4DB;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.CourseLocalhostVService4DB;
import com.kootour.service4db.CourseOrderVService4DB;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseScheduleService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.ExtraOptionService4DB;
import com.kootour.service4db.FavoriteService4DB;
import com.kootour.service4db.KootourMstService4DB;
import com.kootour.service4db.KootourPromoService4DB;
import com.kootour.service4db.LanguageMatrixService4DB;
import com.kootour.service4db.LanguageMstService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.LocationMstService4DB;
import com.kootour.service4db.MessageService4DB;
import com.kootour.service4db.PictureCommentService4DB;
import com.kootour.service4db.PictureService4DB;
import com.kootour.service4db.ScheduleOptionService4DB;
import com.kootour.service4db.TouristService4DB;
import com.kootour.service4db.UserOrderExtraOptionService4DB;
import com.kootour.service4db.UserOrderService4DB;

@Configuration
@Service
public class TestDBServiceImpl implements TestDBService {
	@Autowired
	private PictureService4DB pictureService4DB;
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private ScheduleOptionService4DB scheduleOptionService4DB;
	@Autowired
	private CourseCommentService4DB courseCommentService4DB;
	@Autowired
	private CourseScheduleService4DB courseScheduleService4DB;
	@Autowired
	private UserOrderService4DB userOrderService4DB;
	@Autowired
	private LocationMstService4DB locationMstService4DB;
	@Autowired
	private TouristService4DB touristService4DB;
	@Autowired
	private PictureCommentService4DB pictureCommentService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired
	private CoursePictureService4DB coursePictureService4DB;
	@Autowired
	private LanguageMstService4DB languageMstService4DB;
	@Autowired
	private LanguageMatrixService4DB languageMatrixService4DB;
	@Autowired
	private MessageService4DB messageService4DB;
	@Autowired
	private CourseLocalhostVService4DB courseLocalhostVService4DB;
	@Autowired
	private CourseDiscountService4DB courseDiscountService4DB;
	@Autowired
	private CourseInExclusionService4DB courseInExclusionService4DB;
	@Autowired
	private KootourPromoService4DB kootourPromoService4DB;
	@Autowired
	private FavoriteService4DB favoriteService4DB;
	@Autowired
	private KootourMstService4DB kootourMstService4DB;
	@Autowired
	private CourseOrderVService4DB courseOrderVService4DB;
	@Autowired
	private ExtraOptionService4DB extraOptionService4DB;
	@Autowired
	private UserOrderExtraOptionService4DB UserOrderExtraOptionService4DB;

	@Autowired(required = false)
	private CourseScheduleService courseScheduleService = new CourseScheduleServiceImpl();

	@Override
	public List<ErrorInfo> selectAll() throws BusinessException, SystemException {

		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();

		String tblStatus = "";
		int intFlg = 0;
		ErrorInfo tErrorInfo = new ErrorInfo();
        Integer tRecNum =0;
		tblStatus ="TEST00001";
		try {
			List<PictureEntity> lstPictureEntity = new ArrayList<PictureEntity>();
			lstPictureEntity = pictureService4DB.selectAll();
			tRecNum=lstPictureEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("picture OK");
		} catch (BusinessException e) {
			tblStatus = "picture BusinessException";
			System.out.println("picture BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "picture SystemException";
			System.out.println("picture SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "picture Exception";
			System.out.println("picture Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("picture"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<ScheduleOptionEntity> lstScheduleOptionEntity = new ArrayList<ScheduleOptionEntity>();
			lstScheduleOptionEntity = scheduleOptionService4DB.selectAll();
			tRecNum=lstScheduleOptionEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("scheduleOption OK");

		} catch (BusinessException e) {
			tblStatus = "scheduleOption BusinessException";
			System.out.println("scheduleOption BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "scheduleOption SystemException";
			System.out.println("scheduleOption SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "scheduleOption Exception";
			System.out.println("scheduleOption Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("scheduleOption"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);
		
		tblStatus ="TEST00001";
		try {
			List<CourseEntity> lstCourseEntity = new ArrayList<CourseEntity>();
			CourseParamEntity courseParamEntity = new CourseParamEntity();
			int tmpCount = courseService4DB.selectCountByCondition(courseParamEntity);
			
			lstCourseEntity = courseService4DB.selectAll();
			tRecNum=lstCourseEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("course OK");

		} catch (BusinessException e) {
			tblStatus = "course BusinessException";
			System.out.println("course BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "course SystemException";
			System.out.println("course SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "course Exception";
			System.out.println("course Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("course"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<CourseCommentEntity> lstCourseCommentEntity = new ArrayList<CourseCommentEntity>();
			lstCourseCommentEntity = courseCommentService4DB.selectAll();
			tRecNum=lstCourseCommentEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("courseComment OK");

		} catch (BusinessException e) {
			tblStatus = "courseComment BusinessException";
			System.out.println("courseComment BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "courseComment SystemException";
			System.out.println("courseComment SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "courseComment Exception";
			System.out.println("courseComment Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("courseComment"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<CourseScheduleEntity> lstCourseScheduleEntity = new ArrayList<CourseScheduleEntity>();
			lstCourseScheduleEntity = courseScheduleService4DB.selectAll();
			tRecNum=lstCourseScheduleEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("courseSchedule OK");

		} catch (BusinessException e) {
			tblStatus = "courseSchedule BusinessException";
			System.out.println("courseSchedule BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "courseSchedule SystemException";
			System.out.println("courseSchedule SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "courseSchedule Exception";
			System.out.println("courseSchedule Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("courseSchedule"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<LocalhostEntity> lstLocalhostEntity = new ArrayList<LocalhostEntity>();
			lstLocalhostEntity = localhostService4DB.selectAll();
			tRecNum=lstLocalhostEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("localhost OK");

		} catch (BusinessException e) {
			tblStatus = "localhost BusinessException";
			System.out.println("localhost BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "localhost SystemException";
			System.out.println("localhost SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "localhost Exception";
			System.out.println("localhost Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("localhost"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<PictureCommentEntity> lstPictureCommentEntity = new ArrayList<PictureCommentEntity>();
			lstPictureCommentEntity = pictureCommentService4DB.selectAll();
			tRecNum=lstPictureCommentEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("pictureComment OK");

		} catch (BusinessException e) {
			tblStatus = "pictureComment BusinessException";
			System.out.println("pictureComment BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "pictureComment SystemException";
			System.out.println("pictureComment SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "pictureComment Exception";
			System.out.println("pictureComment Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("pictureComment"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<TouristEntity> lstTouristEntity = new ArrayList<TouristEntity>();
			lstTouristEntity = touristService4DB.selectAll();
			tRecNum=lstTouristEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("tourist OK");

		} catch (BusinessException e) {
			tblStatus = "tourist BusinessException";
			System.out.println("tourist BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "tourist SystemException";
			System.out.println("tourist SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "tourist Exception";
			System.out.println("tourist Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("tourist"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<CoursePictureEntity> lstCoursePictureEntity = new ArrayList<CoursePictureEntity>();
			lstCoursePictureEntity = coursePictureService4DB.selectAll();
			tRecNum=lstCoursePictureEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("coursePicture OK");

		} catch (BusinessException e) {
			tblStatus = "coursePicture BusinessException";
			System.out.println("coursePicture BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "coursePicture SystemException";
			System.out.println("coursePicture SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "coursePicture Exception";
			System.out.println("coursePicture Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("coursePicture"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<LocationMstEntity> lstLocationMstEntity = new ArrayList<LocationMstEntity>();
			lstLocationMstEntity = locationMstService4DB.selectAll();
			tRecNum=lstLocationMstEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("locationMst OK");

		} catch (BusinessException e) {
			tblStatus = "locationMst BusinessException";
			System.out.println("locationMst BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "locationMst SystemException";
			System.out.println("locationMst SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "locationMst Exception";
			System.out.println("locationMst Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("locationMst"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<UserOrderEntity> lstUserOrderEntity = new ArrayList<UserOrderEntity>();
			lstUserOrderEntity = userOrderService4DB.selectAll();
			tRecNum=lstUserOrderEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("userOrder OK");

		} catch (BusinessException e) {
			tblStatus = "userOrder BusinessException";
			System.out.println("userOrder BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "userOrder SystemException";
			System.out.println("userOrder SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "userOrder Exception";
			System.out.println("userOrder Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("userOrder"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<LanguageMstEntity> lstLanguageMstEntity = new ArrayList<LanguageMstEntity>();
			lstLanguageMstEntity = languageMstService4DB.selectAll();
			tRecNum=lstLanguageMstEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("LanguageMst OK");

		} catch (BusinessException e) {
			tblStatus = "LanguageMst BusinessException";
			System.out.println("LanguageMst BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "LanguageMst SystemException";
			System.out.println("LanguageMst SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "LanguageMst Exception";
			System.out.println("LanguageMst Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("LanguageMst"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<LanguageMatrixEntity> lstLanguageMatrixEntity = new ArrayList<LanguageMatrixEntity>();
			lstLanguageMatrixEntity = languageMatrixService4DB.selectAll();
			tRecNum=lstLanguageMatrixEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("LanguageMatrix OK");

		} catch (BusinessException e) {
			tblStatus = "LanguageMatrix BusinessException";
			System.out.println("LanguageMatrix BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "LanguageMatrix SystemException";
			System.out.println("LanguageMatrix SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "LanguageMatrix Exception";
			System.out.println("LanguageMatrix Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("LanguageMatrix"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);
		
		tblStatus ="TEST00001";
		try {
			List<MessageEntity> lstmessageEntity = new ArrayList<MessageEntity>();
			lstmessageEntity = messageService4DB.selectAll();
			tRecNum=lstmessageEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("message OK");

		} catch (BusinessException e) {
			tblStatus = "message BusinessException";
			System.out.println("message BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "message SystemException";
			System.out.println("message SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "message Exception";
			System.out.println("message Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("message"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);
		
		tblStatus ="TEST00001";
		try {
			List<CourseLocalhostVEntity> lstcourseLocalhostVEntity = new ArrayList<CourseLocalhostVEntity>();
			CourseLocalhostVParamEntity courseLocalhostVParamEntity = new CourseLocalhostVParamEntity();
			lstcourseLocalhostVEntity = courseLocalhostVService4DB.selectByCondition(courseLocalhostVParamEntity);
			tRecNum=lstcourseLocalhostVEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("courseLocalhostV OK");

		} catch (BusinessException e) {
			tblStatus = "courseLocalhostV BusinessException";
			System.out.println("courseLocalhostV BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "courseLocalhostV SystemException";
			System.out.println("courseLocalhostV SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "courseLocalhostV Exception";
			System.out.println("courseLocalhostV Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("courseLocalhostV"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);
	
		tblStatus ="TEST00001";
		try {
			List<CourseInExclusionEntity> lstcourseInExclusionEntity = new ArrayList<CourseInExclusionEntity>();
			lstcourseInExclusionEntity = courseInExclusionService4DB.selectAll();
			tRecNum=lstcourseInExclusionEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("courseInExclusion OK");

		} catch (BusinessException e) {
			tblStatus = "courseInExclusion BusinessException";
			System.out.println("courseInExclusion BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "courseInExclusion SystemException";
			System.out.println("courseInExclusion SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "courseInExclusion Exception";
			System.out.println("courseInExclusion Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("courseInExclusion"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);		

		
		tblStatus ="TEST00001";
		try {
			List<CourseDiscountEntity> lstcourseDiscountEntity = new ArrayList<CourseDiscountEntity>();
			lstcourseDiscountEntity = courseDiscountService4DB.selectAll();
			tRecNum=lstcourseDiscountEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("courseDiscount OK");

		} catch (BusinessException e) {
			tblStatus = "courseDiscount BusinessException";
			System.out.println("courseDiscount BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "courseDiscount SystemException";
			System.out.println("courseDiscount SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "courseDiscount Exception";
			System.out.println("courseDiscount Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("courseDiscount"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);		

		
		tblStatus ="TEST00001";
		try {
			List<KootourPromoEntity> lstkootourPromoEntity = new ArrayList<KootourPromoEntity>();
			lstkootourPromoEntity = kootourPromoService4DB.selectAll();
			tRecNum=lstkootourPromoEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("kootourPromo OK");

		} catch (BusinessException e) {
			tblStatus = "kootourPromo BusinessException";
			System.out.println("kootourPromo BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "kootourPromo SystemException";
			System.out.println("kootourPromo SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "kootourPromo Exception";
			System.out.println("kootourPromo Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("kootourPromo"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);		

		
		tblStatus ="TEST00001";
		try {
			List<FavoriteEntity> lstfavoriteEntity = new ArrayList<FavoriteEntity>();
			lstfavoriteEntity = favoriteService4DB.selectAll();
			tRecNum=lstfavoriteEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("favorite OK");

		} catch (BusinessException e) {
			tblStatus = "favorite BusinessException";
			System.out.println("favorite BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "favorite SystemException";
			System.out.println("favorite SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "favorite Exception";
			System.out.println("favorite Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("favorite"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);		

		tblStatus ="TEST00001";
		try {
			List<KootourMstEntity> lstkootourMstEntity = new ArrayList<KootourMstEntity>();
			lstkootourMstEntity = kootourMstService4DB.selectAll();
			tRecNum=lstkootourMstEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("kootourMst OK");

		} catch (BusinessException e) {
			tblStatus = "kootourMst BusinessException";
			System.out.println("kootourMst BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "kootourMst SystemException";
			System.out.println("kootourMst SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "kootourMst Exception";
			System.out.println("kootourMst Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("kootourMst"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);		
		
		tblStatus ="TEST00001";
		try {
			List<CourseOrderVEntity> lstcourseOrderVEntity = new ArrayList<CourseOrderVEntity>();
			CourseOrderVParamEntity courseOrderVParamEntity = new CourseOrderVParamEntity();
			lstcourseOrderVEntity = courseOrderVService4DB.selectByCondition(courseOrderVParamEntity);
			tRecNum=lstcourseOrderVEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("courseOrderV OK");

		} catch (BusinessException e) {
			tblStatus = "courseOrderV BusinessException";
			System.out.println("courseOrderV BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "courseOrderV SystemException";
			System.out.println("courseOrderV SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "courseOrderV Exception";
			System.out.println("courseOrderV Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("courseOrderV"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);
		
		tblStatus ="TEST00001";
		try {
			List<ExtraOptionEntity> lstExtraOptionEntity = new ArrayList<ExtraOptionEntity>();
			ExtraOptionParamEntity extraOptionParamEntity = new ExtraOptionParamEntity();
			lstExtraOptionEntity = extraOptionService4DB.selectByCondition(extraOptionParamEntity);
			tRecNum=lstExtraOptionEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("ExtraOption OK");

		} catch (BusinessException e) {
			tblStatus = "ExtraOption BusinessException";
			System.out.println("ExtraOption BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "ExtraOption SystemException";
			System.out.println("ExtraOption SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "ExtraOption Exception";
			System.out.println("ExtraOption Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("ExtraOption"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);

		tblStatus ="TEST00001";
		try {
			List<UserOrderExtraOptionEntity> lstUserOrderExtraOptionEntity = new ArrayList<UserOrderExtraOptionEntity>();
			UserOrderExtraOptionParamEntity UserOrderExtraOptionParamEntity = new UserOrderExtraOptionParamEntity();
			lstUserOrderExtraOptionEntity = UserOrderExtraOptionService4DB.selectByCondition(UserOrderExtraOptionParamEntity);
			tRecNum=lstUserOrderExtraOptionEntity.size();
			intFlg = KooConst.INT_INFO_KBN;
			System.out.println("UserOrderExtraOption OK");

		} catch (BusinessException e) {
			tblStatus = "UserOrderExtraOption BusinessException";
			System.out.println("UserOrderExtraOption BusinessException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (SystemException e) {
			tblStatus = "UserOrderExtraOption SystemException";
			System.out.println("UserOrderExtraOption SystemException");
			intFlg = KooConst.INT_ERROR_KBN;
		} catch (Exception e) {
			tblStatus = "UserOrderExtraOption Exception";
			System.out.println("UserOrderExtraOption Exception");
			intFlg = KooConst.INT_ERROR_KBN;
		}
		tErrorInfo = new ErrorInfo();
		tErrorInfo.setItemName("UserOrderExtraOption"+"["+tRecNum.toString()+"]");
		tErrorInfo.setErrKbn(intFlg);
		tErrorInfo.setDispOrder(1);
		tErrorInfo.setErrMsg(tblStatus);
		tList.add(tErrorInfo);
		
//		++++++++++++++++++++
		return tList;

	}

	@Override
	public void insertAllCourseSchedule(){
		List<CourseEntity> courseEntityList = new ArrayList<CourseEntity>();
		courseEntityList=courseService4DB.selectAll();
		if (courseEntityList != null && courseEntityList.size() > 0) {
			int i=0;
			for (CourseEntity tmpVal : courseEntityList) {
				int tInsertNum=0;
				if (i <9){
				tInsertNum=courseScheduleService.insertOneYear(tmpVal.getLangId(), tmpVal.getCourseIdentiNo());
				i++;
				}
				
			}
		}
		
	}
	
	
}
