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
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.model.CourseCommentModel;
import com.kootour.service.CourseCommentService;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.SequenceService4DB;

@Configuration
@Service
public class CourseCommentServiceImpl implements CourseCommentService {
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired
	private CoursePictureService4DB coursePictureService4DB;
	@Autowired
	private CourseCommentService4DB courseCommentService4DB;
	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;
	private static Logger logger = Logger.getLogger(CourseCommentServiceImpl.class);

	@Override
	public CourseCommentEntity save(CourseCommentEntity courseCommentEntity, Map<String, Object> paraMap) {
		CourseCommentEntity rtnResult = new CourseCommentEntity();
		rtnResult=courseCommentEntity;
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		courseCommentEntity.setLangId(courseCommentEntity.getSessionInfo().getCurLangId());
		courseCommentEntity.setCourseIdentiNo(courseCommentEntity.getCourseIdentiNo());
		courseCommentEntity.setTouristIdentiNo(courseCommentEntity.getTouristIdentiNo());
		courseCommentEntity.setDelFlg(KooConst.ST_NOT_DEL_FLG);
		// Todo
		courseCommentEntity.setCommentType(1);
		courseCommentEntity.setCommentDate(courseCommentEntity.getCurDate());
		Double tScore = (courseCommentEntity.getAccuracy() + courseCommentEntity.getCommunication()
				+ courseCommentEntity.getKnowledge() + courseCommentEntity.getServices()
				+ courseCommentEntity.getValue()) / 5;
		courseCommentEntity.setScore(tScore);

		String strCourseCommentIdentiNo = "";

		String isEdit = KooConst.ST_FLG_NO;
		try {
			if (KooUtil.isNotNull(courseCommentEntity.getCourseCommentIdentiNo())) {
				courseCommentEntity.setCourseCommentIdentiNo(courseCommentEntity.getCourseCommentIdentiNo());
				isEdit=KooConst.ST_FLG_YES;
			} else {
				strCourseCommentIdentiNo = sequenceService4DB.createSequence(KooConst.ST_COURSECOMMENT);
				courseCommentEntity.setTouristIdentiNo(courseCommentEntity.getCurTouristIdentiNo());
				courseCommentEntity.setCourseCommentIdentiNo(strCourseCommentIdentiNo);
			}
			
			
		} catch (Exception e) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM015);
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_004);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_004);
			return (rtnResult);
		}

		try {
			if (isEdit.equals(KooConst.ST_FLG_YES)) { 
				courseCommentService4DB.updateByPK(courseCommentEntity);
			} else {
				courseCommentService4DB.insertOne(courseCommentEntity);
			}

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM011);
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_003);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} catch (Exception e) {
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM011 + "[" + courseCommentEntity.getLangId() + ","
					+ strCourseCommentIdentiNo + "]");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_005);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			logger.error(KooConst.INFO_MSG_005);
		}
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		rtnResult = courseCommentEntity;
		return (rtnResult);
	}

	@Override
	public CourseCommentEntity load(CourseCommentEntity courseCommentEntity, Map<String, Object> paraMap) {
		CourseCommentEntity rtnResult = new CourseCommentEntity();
		rtnResult = courseCommentEntity;
		return (rtnResult);
	}

	@Override
	public CourseCommentEntity edit(CourseCommentEntity courseCommentEntity, Map<String, Object> paraMap) {
		CourseCommentEntity rtnResult = new CourseCommentEntity();
		rtnResult=courseCommentEntity;
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		CourseCommentParamEntity courseCommentParamEntity = new CourseCommentParamEntity();

		courseCommentParamEntity.setLangId(courseCommentEntity.getLangId());

		courseCommentParamEntity.setCourseCommentIdentiNo(courseCommentEntity.getCourseCommentIdentiNo());
		List<CourseCommentEntity> courseCommentEntityList = courseCommentService4DB
				.selectByPK(courseCommentParamEntity);
		if (courseCommentEntityList != null && courseCommentEntityList.size() > 0) {
			rtnResult = courseCommentEntityList.get(0);
		}
		rtnResult.setSessionInfo(courseCommentEntity.getSessionInfo());

		// CourseParamEntity courseParamEntity = new CourseParamEntity();
		// courseParamEntity.setLangId(courseCommentEntity.getLangId());
		// courseParamEntity.setCourseIdentiNo(courseCommentEntity.getCourseIdentiNo());
		// List<CourseEntity> courseEntityList =
		// courseService4DB.selectByPK(courseParamEntity);
		//
		// if (courseEntityList.isEmpty()) {
		//
		// ErrorInfo tErrorInfo = new ErrorInfo();
		// tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[selectByPK]");
		// tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
		// tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
		// tErrorInfo.setDispOrder(1);
		// tList.add(tErrorInfo);
		// paraMap.put(KooConst.ST_ERRORINFO, tList);
		// logger.error(KooConst.INFO_MSG_001);
		// return rtnResult;
		// }
		// String strLocalhostIdentiNo =
		// courseCommentEntity.getCurTouristIdentiNo();
		// LocalhostParamEntity localhostParamEntity = new
		// LocalhostParamEntity();
		// localhostParamEntity.setLangId(courseCommentEntity.getLangId());
		// localhostParamEntity.setLocalhostIdentiNo(strLocalhostIdentiNo);
		// List<LocalhostEntity> localhostEntityList =
		// localhostService4DB.selectByPK(localhostParamEntity);
		//
		// if (localhostEntityList.isEmpty()) {
		//
		// ErrorInfo tErrorInfo = new ErrorInfo();
		// tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM002 + "[selectByPK]");
		// tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
		// tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
		// tErrorInfo.setDispOrder(1);
		// tList.add(tErrorInfo);
		// } else {
		//
		// LocalhostEntity localhostEntity = localhostEntityList.get(0);
		// rtnResult.setLocalhostFullNameDisp(localhostEntity.getFullName());
		// rtnResult.setLocalhostPictureDisp(KooConst.STR_UPLOAD_IMAGES_PATH +
		// localhostEntity.getPhoto());
		// }

		// List<String> coursePictureListDisp = new ArrayList<String>();
		// String strPhotoPath = "";
		// CoursePictureParamEntity coursePictureParamEntity = new
		// CoursePictureParamEntity();
		// coursePictureParamEntity.setLangId(courseCommentEntity.getLangId());
		// coursePictureParamEntity.setCourseIdentiNo(courseCommentEntity.getCourseIdentiNo());
		// List<CoursePictureEntity> coursePictureEntityList =
		// coursePictureService4DB.selectByCondition(coursePictureParamEntity);
		//
		// if (coursePictureEntityList.isEmpty()) {
		//
		// ErrorInfo tErrorInfo = new ErrorInfo();
		// tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM003 +
		// "[selectByCondition]");
		// tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
		// tErrorInfo.setErrMsg(KooConst.INFO_MSG_002);
		// tErrorInfo.setDispOrder(1);
		// tList.add(tErrorInfo);
		// } else {
		//
		// int iCount = coursePictureEntityList.size();
		// for (int j = 0; j < iCount; j++) {
		//
		// strPhotoPath = KooConst.STR_UPLOAD_IMAGES_PATH +
		// coursePictureEntityList.get(j).getFullPath();
		// coursePictureListDisp.add(strPhotoPath);
		// }
		//
		// rtnResult.setCoursePictureListDisp(coursePictureListDisp);
		// }
		// paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}

}
