package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.LocalhostDetailEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.TouristParamEntity;
import com.kootour.service.CourseService;
import com.kootour.service.LocalhostDetailService;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.TouristService4DB;

@Configuration
@Service
public class LocalhostDetailServiceImpl implements LocalhostDetailService {

	@Autowired(required = false)
	private LocalhostService4DB localhostService4DB;

	@Autowired(required = false)
	private CourseCommentService4DB courseCommentService4DB;

	@Autowired(required = false)
	private CourseService4DB courseService4DB;

	@Autowired
	private CoursePictureService4DB coursePictureService4DB;

	@Autowired
	private TouristService4DB touristService4DB;

	@Autowired(required = false)
	private CourseService courseService = new CourseServiceImpl();

	@Override
	public LocalhostDetailEntity load(LocalhostDetailEntity localhosDetailEntity, Map<String, Object> paraMap) {
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();

		LocalhostDetailEntity rtnResult = new LocalhostDetailEntity();
		rtnResult = localhosDetailEntity;
		LocalhostParamEntity localhostParamEntity = new LocalhostParamEntity();
		localhostParamEntity.setLangId(localhosDetailEntity.getLangId());
		localhostParamEntity.setLocalhostIdentiNo(localhosDetailEntity.getLocalhostIdentiNo());
		List<LocalhostEntity> localhostEntityList = localhostService4DB.selectByPK(localhostParamEntity);
		if (localhostEntityList != null && localhostEntityList.size() > 0) {
			LocalhostEntity tLocalhostEntity = localhostEntityList.get(0);
			tLocalhostEntity.setPhoto(KooConst.STR_UPLOAD_IMAGES_PATH + tLocalhostEntity.getPhoto());
			tLocalhostEntity.setEmailOkFlag(KooConst.ST_FLG_YES);
			tLocalhostEntity.setPhoneOkFlg(KooConst.ST_FLG_NO);
			rtnResult.setLocalhost(tLocalhostEntity);
		}
		CourseCommentParamEntity courseCommentParamEntity = new CourseCommentParamEntity();
		courseCommentParamEntity.setLangId(localhosDetailEntity.getLangId());
		courseCommentParamEntity.setLocalhostIdentiNo(localhosDetailEntity.getLocalhostIdentiNo());
		courseCommentParamEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
		List<CourseCommentEntity> courseCommentEntityList = courseCommentService4DB
				.selectByCondition(courseCommentParamEntity);

		List<CourseCommentEntity> tmpCourseCommentEntityList = new ArrayList<>();
		double dTotalScore = 0.0;

		if (courseCommentEntityList != null && courseCommentEntityList.size() > 0) {
			for (CourseCommentEntity tCourseCommentEntity : courseCommentEntityList) {
				double dScore = 0.0;

				TouristParamEntity touristParamEntity = new TouristParamEntity();
				touristParamEntity.setLangId(tCourseCommentEntity.getLangId());
				touristParamEntity.setTouristIdentiNo(tCourseCommentEntity.getTouristIdentiNo());
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
					tCourseCommentEntity.setTouristFirstName(touristEntityList.get(0).getFirstName());
					tCourseCommentEntity.setTouristLastName(touristEntityList.get(0).getLastName());
					tCourseCommentEntity
							.setTouristPicture(KooConst.STR_UPLOAD_IMAGES_PATH + touristEntityList.get(0).getPicture());

					dScore = tCourseCommentEntity.getScore();
					List<String> iconList = KooUtil.getStarName(dScore);
					tCourseCommentEntity.setScoreIconListDisp(iconList);
				}

				tmpCourseCommentEntityList.add(tCourseCommentEntity);
				dTotalScore = dTotalScore + dScore;

			}
			rtnResult.setCourseCommentList(tmpCourseCommentEntityList);

			dTotalScore = dTotalScore / courseCommentEntityList.size();

		} else {
			rtnResult.setCourseCommentList(new ArrayList<CourseCommentEntity>());
			dTotalScore = 4.5;
		}

		List<String> iconList = KooUtil.getStarName(dTotalScore);

		rtnResult.setScoreIconListDisp(iconList);
		CourseParamEntity CourseParamEntity = new CourseParamEntity();
		CourseParamEntity.setLangId(localhosDetailEntity.getLangId());
		CourseParamEntity.setLocalhostIdentiNo(localhosDetailEntity.getLocalhostIdentiNo());
		CourseParamEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
		List<CourseEntity> courseEntityList = courseService4DB.selectByCondition(CourseParamEntity);
		
		List<CourseEntity> tList1 = courseEntityList;
		String bgnDate = "20160701";
		String endDate = "20161001";

		tList1 = courseService.calcMinPrice(tList1, bgnDate, endDate, KooConst.ST_FLG_YES);
		tList1 = courseService.mergeCourseByScheduleWorkDay(tList1, bgnDate, endDate);
		tList1 = courseService.addPictureToCourse(tList1);
		tList1 = courseService.addCommentInfoToCourse(tList1);
		tList1 = courseService.addInExInfoToCourse(tList1);
		tList1 = courseService.addOtherInfoToCourse(tList1);
		rtnResult.setCourseList(tList1);
//		double dCourseTotalScore = 0.0;
//
//		if (courseEntityList != null && courseEntityList.size() > 0) {
//			for (CourseEntity tCourseEntity : courseEntityList) {
//
//				CourseCommentParamEntity courseCommentParamEntity1 = new CourseCommentParamEntity();
//				courseCommentParamEntity1.setLangId(localhosDetailEntity.getLangId());
//				courseCommentParamEntity1.setLocalhostIdentiNo(localhosDetailEntity.getLocalhostIdentiNo());
//				courseCommentParamEntity1.setCourseIdentiNo(tCourseEntity.getCourseIdentiNo());
//				courseCommentParamEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
//				List<CourseCommentEntity> courseCommentEntityList4One = courseCommentService4DB
//						.selectByCondition(courseCommentParamEntity1);
//				if (courseCommentEntityList4One != null && courseCommentEntityList4One.size() > 0) {
//					for (CourseCommentEntity tCourseCommentEntity : courseCommentEntityList4One) {
//						dCourseTotalScore = dCourseTotalScore + tCourseCommentEntity.getScore();
//					}
//					dCourseTotalScore = dCourseTotalScore / courseCommentEntityList4One.size();
//				}
//
//				tCourseEntity.setScoreIconListDisp(KooUtil.getStarName(dCourseTotalScore));
//				tCourseEntity.setReviewNumDisp(courseCommentEntityList4One.size());
//				tCourseEntity.setPrice(200.0);
//				tCourseEntity.setDiscountPrice(150.0);
//				CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();
//				coursePictureParamEntity.setLangId(tCourseEntity.getLangId());
//				coursePictureParamEntity.setCourseIdentiNo(tCourseEntity.getCourseIdentiNo());
//				coursePictureParamEntity.setLocalhostIdentiNo(tCourseEntity.getLocalhostIdentiNo());
//				List<CoursePictureEntity> coursePictureEntityList = coursePictureService4DB
//						.selectByCondition(coursePictureParamEntity);
//				if (coursePictureEntityList.isEmpty()) {
//					ErrorInfo tErrorInfo = new ErrorInfo();
//					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM003 + "[selectByCondition]");
//					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
//					tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
//					tErrorInfo.setDispOrder(1);
//					tList.add(tErrorInfo);
//				} else {
//
//					for (int i = 0; i < coursePictureEntityList.size(); i++) {
//						coursePictureEntityList.get(i).setFullPath(
//								KooConst.STR_UPLOAD_IMAGES_PATH + coursePictureEntityList.get(i).getFullPath());
//					}
//					tCourseEntity.setCoursePictureListDisp(coursePictureEntityList);
//				}
//
//			}
//			rtnResult.setCourseList(courseEntityList);
//		} else {
//			rtnResult.setCourseList(new ArrayList<CourseEntity>());
//		}

		return (rtnResult);
	}

}
