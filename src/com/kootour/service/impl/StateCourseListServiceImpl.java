package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.RumdaByConditionEx;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.entity.StateCourseListEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.LocationMstParamEntity;
import com.kootour.service.StateCourseListService;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.LocationMstService4DB;
import com.kootour.service4db.PictureService4DB;
@Configuration
@Service
public class StateCourseListServiceImpl implements StateCourseListService {
	@Autowired
	private LocationMstService4DB locationMstService4DB;
	@Autowired
	private PictureService4DB pictureService4DB;
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired
	private CoursePictureService4DB coursePictureService4DB;
	private static Logger logger = Logger.getLogger(StateCourseListServiceImpl.class);
	@Override
	public StateCourseListEntity search(StateCourseListEntity stateCourseListEntity, Map<String, Object> paraMap) {
		
		StateCourseListEntity rtnResult = new StateCourseListEntity();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		CourseParamEntity courseParamEntity = new CourseParamEntity();
		courseParamEntity.setLangId(stateCourseListEntity.getLangId());
		courseParamEntity.setSearchWord(stateCourseListEntity.getState());

		LocationMstParamEntity locationMstParamEntity = new LocationMstParamEntity();
		locationMstParamEntity.setLangId(stateCourseListEntity.getLangId());
		locationMstParamEntity.setStateName(stateCourseListEntity.getState());
		List<LocationMstEntity> locationMstEntityList = locationMstService4DB.selectByCondition(locationMstParamEntity);
		if (locationMstEntityList.isEmpty()) {
			
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM009 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {
			RumdaByConditionEx tRumda = new RumdaByConditionEx();
			locationMstEntityList = tRumda.filterLocationMstByEmptyCity(locationMstEntityList);
			
			if (locationMstEntityList.isEmpty()) {
				
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM009 + "[filterLocationMstByEmptyCity]");
				tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
			} else {
				
				String imagePath = "";

				for (int i = 0; i < locationMstEntityList.size(); i++) {

					imagePath = KooConst.STR_UPLOAD_IMAGES_PATH + locationMstEntityList.get(i).getUseName();
					locationMstEntityList.get(i).setUseName(imagePath);

				}
			}
		}

		rtnResult.setLocationMstList(locationMstEntityList);
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}
	@Override
	public StateCourseListEntity load(StateCourseListEntity stateCourseListEntity, Map<String, Object> paraMap) {
		StateCourseListEntity rtnResult = new StateCourseListEntity();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<String> coursePictureListDisp = new ArrayList<String>();
		rtnResult.setLangId(stateCourseListEntity.getLangId());
		rtnResult.setState(stateCourseListEntity.getState());
		rtnResult.setCity(stateCourseListEntity.getCity());
		rtnResult.setCurTouristIdentiNo(stateCourseListEntity.getCurTouristIdentiNo());
		LocationMstParamEntity locationMstParamEntity = new LocationMstParamEntity();
		locationMstParamEntity.setLangId(stateCourseListEntity.getLangId());
		locationMstParamEntity.setStateName(stateCourseListEntity.getState());
		List<LocationMstEntity> locationMstEntityList = locationMstService4DB.selectByCondition(locationMstParamEntity);
		if (locationMstEntityList.isEmpty()) {
			
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM009 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {
			RumdaByConditionEx tRumda = new RumdaByConditionEx();
			locationMstEntityList = tRumda.filterLocationMstByType(locationMstEntityList);
			
			if (locationMstEntityList.isEmpty()) {
				
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM009 + "[filterLocationMstByEmptyCity]");
				tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
				paraMap.put(KooConst.ST_ERRORINFO, tList);
				logger.error(KooConst.INFO_MSG_001);
				return (rtnResult);
			}
		}

		String imagePath = "";
		LocationMstEntity locationMstEntity = new LocationMstEntity();
		List<LocationMstEntity> tmpLocationMstList = new ArrayList<LocationMstEntity>();
		List<String> tmpCityList = new ArrayList<String>();
//		PictureParamEntity pictureParamEntity = new PictureParamEntity();
		for (int i = 0; i < locationMstEntityList.size(); i++) {
			locationMstEntity = locationMstEntityList.get(i);
			tmpCityList.add(locationMstEntity.getCityName());
			if (i < 5) {
//				pictureParamEntity.setOwnerIdentiNo(locationMstEntityList.get(i).getIdentiNo());
//				List<PictureEntity> pictureEntityList = pictureService4DB.selectByCondition(pictureParamEntity);
//				
//				if (pictureEntityList.isEmpty()) {
//					
//					ErrorInfo tErrorInfo = new ErrorInfo();
//					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM010 + "[selectByPK]");
//					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
//					tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
//					tErrorInfo.setDispOrder(1);
//					tList.add(tErrorInfo);
//				} else {
//					
//					imagePath = KooConst.STR_IMAGES_PATH + pictureEntityList.get(0).getFullPath();
//				}
				imagePath = KooConst.STR_IMAGES_PATH + locationMstEntity.getPhoto();
				locationMstEntity.setPhoto(imagePath);
				tmpLocationMstList.add(locationMstEntity);
			} else {
				break;
			}
		}
		rtnResult.setCityList(tmpCityList);
		rtnResult.setLocationMstList(tmpLocationMstList);

//		// search COURSE by NearBy
//		CourseParamEntity courseParamEntity = new CourseParamEntity();
//		courseParamEntity.setLangId(stateCourseListEntity.getLangId());
//		courseParamEntity.setLocationKey(KooConst.ST_PERCENTAGE + stateCourseListEntity.getNearBy() + KooConst.ST_PERCENTAGE);
//		List<CourseEntity> courseList = courseService4DB.selectByCondition(courseParamEntity);
//
//		if (courseList.isEmpty()) {
//			
//			ErrorInfo tErrorInfo = new ErrorInfo();
//			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[selectByCondition]");
//			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
//			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
//			tErrorInfo.setDispOrder(1);
//			tList.add(tErrorInfo);
//			paraMap.put(KooConst.ST_ERRORINFO, tList);
//			logger.error(KooConst.INFO_MSG_001);
//			return (rtnResult);
//		}
//		CourseEntity courseEntity = new CourseEntity();
//		List<CourseEntity> tmpCourseList = new ArrayList<CourseEntity>();
//		LocalhostParamEntity localhostParamEntity = new LocalhostParamEntity();
//		CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();
//		String strPhotoPath = "";
//		for (int i = 0; i < courseList.size(); i++) {
//
//			if (i < 3) {
//				courseEntity = courseList.get(i);
//				localhostParamEntity.setLangId(stateCourseListEntity.getLangId());
//				localhostParamEntity.setLocalhostIdentiNo(courseEntity.getLocalhostIdentiNo());
//				List<LocalhostEntity> localhostEntityList = localhostService4DB.selectByPK(localhostParamEntity);
//				
//				if (localhostEntityList.isEmpty()) {
//					
//					ErrorInfo tErrorInfo = new ErrorInfo();
//					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM002 + "[selectByPK]");
//					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
//					tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
//					tErrorInfo.setDispOrder(1);
//					tList.add(tErrorInfo);
//				} else {
//					
//					courseEntity.setLocalhostPictureDisp(KooConst.STR_UPLOAD_IMAGES_PATH + localhostEntityList.get(0).getPhoto());
//				}
//				
//				coursePictureParamEntity.setLangId(stateCourseListEntity.getLangId());
//				coursePictureParamEntity.setCourseIdentiNo(courseEntity.getCourseIdentiNo());
//				coursePictureParamEntity.setLocalhostIdentiNo(courseEntity.getLocalhostIdentiNo());
//				List<CoursePictureEntity> coursePictureEntityList = coursePictureService4DB.selectByCondition(coursePictureParamEntity);
//				if (coursePictureEntityList.isEmpty()) {
//					
//					ErrorInfo tErrorInfo = new ErrorInfo();
//					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM003 + "[selectByCondition]");
//					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
//					tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
//					tErrorInfo.setDispOrder(1);
//					tList.add(tErrorInfo);
//				} else {
//				
//					int iCount = coursePictureEntityList.size();
//
//					for (int j = 0; j < iCount; j++) {
//
//						strPhotoPath = KooConst.STR_UPLOAD_IMAGES_PATH + coursePictureEntityList.get(j).getFullPath();
////						coursePictureListDisp.add(strPhotoPath);
//						coursePictureEntityList.get(j).setFullPath(strPhotoPath);
//					}
//					
//					tmpCourseList.get(i).setCoursePictureListDisp(coursePictureEntityList);
//				}
//				
//				tmpCourseList.add(courseEntity);
//			} else {
//				break;
//			}
//		}
//		rtnResult.setCourseList(tmpCourseList);
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}
	@Override
	public StateCourseListEntity courseDetail(StateCourseListEntity stateCourseListEntity, Map<String, Object> paraMap) {
		StateCourseListEntity rtnResult = new StateCourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public StateCourseListEntity cityCourseList(StateCourseListEntity stateCourseListEntity, Map<String, Object> paraMap) {
		StateCourseListEntity rtnResult = new StateCourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}

}
