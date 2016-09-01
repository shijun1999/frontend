package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.RumdaBase;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.LanguageMatrixEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.NewCourseListEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.mapper.paramentity.LanguageMatrixParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.service.NewCourseListService;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.LanguageMatrixService4DB;
import com.kootour.service4db.LocalhostService4DB;
@Configuration
@Service
public class NewCourseListServiceImpl implements NewCourseListService {
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired
	private CoursePictureService4DB coursePictureService4DB;
	@Autowired
	private LanguageMatrixService4DB languageMatrixService4DB;
	private static Logger logger = Logger.getLogger(NewCourseListServiceImpl.class);
	@Override
	public NewCourseListEntity cancel(NewCourseListEntity newCourseListEntity, Map<String, Object> paraMap) {
		NewCourseListEntity rtnResult = new NewCourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	
	@Override
	public NewCourseListEntity save(NewCourseListEntity newCourseListEntity, Map<String, Object> paraMap) {
		NewCourseListEntity rtnResult = new NewCourseListEntity();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<CourseEntity> stempCourseEntityList = new ArrayList<CourseEntity>();
		List<CourseEntity> courseEntityList = newCourseListEntity.getCourseList();
		CourseEntity courseEntity = new CourseEntity();
		CourseParamEntity courseParamEntity = new CourseParamEntity();
		for (int i = 0; i < courseEntityList.size(); i++) {

			courseEntity = courseEntityList.get(i);
			if (courseEntity.getOkFlg().equals(KooConst.STR_TYPE_CHECK_TRUE)) {

				courseParamEntity.setLangId(courseEntity.getLangId());
				courseParamEntity.setCourseIdentiNo(courseEntity.getCourseIdentiNo());
				stempCourseEntityList = courseService4DB.selectByPK(courseParamEntity);

				if (stempCourseEntityList.isEmpty()) {

					ErrorInfo tErrorInfo = new ErrorInfo();
					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[selectByPK]");
					tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
					tErrorInfo.setErrMsg(KooConst.INFO_MSG_008);
					tErrorInfo.setDispOrder(1);
					tList.add(tErrorInfo);
					paraMap.put(KooConst.ST_ERRORINFO, tList);
					logger.error(KooConst.INFO_MSG_008);
					return rtnResult;
				}

				courseEntity = stempCourseEntityList.get(0);
				try {

					courseEntity.setOkFlg(KooConst.ST_FLG_YES);
					courseService4DB.updateByPK(courseEntity);
					ErrorInfo tErrorInfo = new ErrorInfo();
					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001);
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg(KooConst.INFO_MSG_006);
					tErrorInfo.setDispOrder(1);
					tList.add(tErrorInfo);
				} catch (Exception e) {

					ErrorInfo tErrorInfo = new ErrorInfo();
					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[" + courseEntity.getLangId() + "," + courseEntity.getCourseIdentiNo() + "]");
					tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
					tErrorInfo.setErrMsg(KooConst.INFO_MSG_007);
					tErrorInfo.setDispOrder(1);
					tList.add(tErrorInfo);
					logger.error(KooConst.INFO_MSG_007);
				}
			}
		}
		rtnResult = newCourseListEntity;
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}
	@Override
	public NewCourseListEntity courseDetail(NewCourseListEntity newCourseListEntity, Map<String, Object> paraMap) {
		NewCourseListEntity rtnResult = new NewCourseListEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public NewCourseListEntity load(NewCourseListEntity newCourseListEntity, Map<String, Object> paraMap) {
		NewCourseListEntity rtnResult = new NewCourseListEntity();
		rtnResult=newCourseListEntity;
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<String> coursePictureListDisp = new ArrayList<String>();
		rtnResult.setLangId(newCourseListEntity.getLangId());
		List<CourseEntity> courseList = courseService4DB.selectAll();
		
		if (courseList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001);
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_001);
			return rtnResult;		
		}
		CourseEntity courseEntity = new CourseEntity();
		LocalhostParamEntity localhostParamEntity = new LocalhostParamEntity();
		CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();

		courseList = selectCourseByOKFlg(courseList, newCourseListEntity.getLangId());
		
		if (courseList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001);
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_001);
			return rtnResult;		
		}
		String strPhotoPath = "";

		for (int i = 0; i < courseList.size(); i++) {

			courseEntity = courseList.get(i);
			localhostParamEntity.setLangId(newCourseListEntity.getLangId());
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
				
				courseList.get(i).setLocalhostPictureDisp(KooConst.STR_UPLOAD_IMAGES_PATH + localhostEntityList.get(0).getPhoto());
			}
			
			coursePictureParamEntity.setLangId(newCourseListEntity.getLangId());
			coursePictureParamEntity.setCourseIdentiNo(courseEntity.getCourseIdentiNo());
			coursePictureParamEntity.setLocalhostIdentiNo(courseEntity.getLocalhostIdentiNo());
			List<CoursePictureEntity> coursePictureEntityList = coursePictureService4DB.selectByCondition(coursePictureParamEntity);

			if (coursePictureEntityList.isEmpty()) {
				
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM003 + "[selectByCondition]");
				tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
			} else {
				
				int iCount = coursePictureEntityList.size();
				for (int j = 0; j < iCount; j++) {

					strPhotoPath = KooConst.STR_UPLOAD_IMAGES_PATH + coursePictureEntityList.get(j).getFullPath();
					coursePictureListDisp.add(strPhotoPath);
					
					coursePictureEntityList.get(j).setFullPath(strPhotoPath);
				}
				
				courseList.get(i).setCoursePictureListDisp(coursePictureEntityList);
			}
		}

		rtnResult.setCourseList(courseList);

		LanguageMatrixParamEntity languageMatrixParamEntity = new LanguageMatrixParamEntity();
		// TODO LangIdを確認
		languageMatrixParamEntity.setLangId(newCourseListEntity.getLangId());
		List<LanguageMatrixEntity> languageList = languageMatrixService4DB.selectByCondition(languageMatrixParamEntity);
		
		if (languageList.isEmpty()) {
			
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM006 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_001);
			return (rtnResult);
		} else {
			
			paraMap.put(KooConst.MAP_LANGUAGELIST, languageList);
		}
		
		return (rtnResult);
	}

	private List<CourseEntity> selectCourseByOKFlg(List<CourseEntity> inList, String tLangId) {

		List<CourseEntity> tList = new ArrayList<CourseEntity>();
		Predicate<CourseEntity> tWhere;

		tWhere = (eCourseEntity ->
		// Add Where condition at here
		(eCourseEntity.getLangId() != null && eCourseEntity.getLangId().equals(tLangId)) && (eCourseEntity.getOkFlg() != null && eCourseEntity.getOkFlg().equals("0")));

		RumdaBase tRumdaBase = new RumdaBase();
		tList = tRumdaBase.seekCourseLst(inList, tWhere);

		return (tList);
	}
}
