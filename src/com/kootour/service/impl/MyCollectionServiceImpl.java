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
import com.kootour.common.RumdaByCondition;
import com.kootour.common.RumdaByConditionEx;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.MyCollectionEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
import com.kootour.mapper.paramentity.FavoriteParamEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.UserOrderParamEntity;
import com.kootour.service.MyCollectionService;
import com.kootour.service4db.CourseCommentService4DB;
import com.kootour.service4db.CoursePictureService4DB;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.FavoriteService4DB;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.UserOrderService4DB;
@Configuration
@Service
public class MyCollectionServiceImpl implements MyCollectionService {
	@Autowired
	private UserOrderService4DB UserOrderService4DB;
	@Autowired
	private CourseService4DB courseService4DB;
	@Autowired
	private CourseCommentService4DB courseCommentService4DB;
	@Autowired
	private FavoriteService4DB favoriteService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;
	@Autowired
	private CoursePictureService4DB coursePictureService4DB;
	private static Logger logger = Logger.getLogger(MyCollectionServiceImpl.class);
	@Override
	public MyCollectionEntity cancel(MyCollectionEntity myCollectionEntity, Map<String, Object> paraMap) {
		MyCollectionEntity rtnResult = new MyCollectionEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public MyCollectionEntity comment(MyCollectionEntity myCollectionEntity, Map<String, Object> paraMap) {
		MyCollectionEntity rtnResult = new MyCollectionEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public MyCollectionEntity load(MyCollectionEntity myCollectionEntity, Map<String, Object> paraMap) {
		MyCollectionEntity rtnResult = new MyCollectionEntity();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		List<CourseEntity> courseEntityList = new ArrayList<CourseEntity>();
		List<String> coursePictureListDisp = new ArrayList<String>();
		CourseEntity courseEntity = new CourseEntity();
		UserOrderParamEntity userOrderParamEntity = new UserOrderParamEntity();
		userOrderParamEntity.setLangId(myCollectionEntity.getLangId());
		userOrderParamEntity.setTouristIdentiNo(myCollectionEntity.getTouristIdentiNo());

		List<UserOrderEntity> userOrderEntityList = UserOrderService4DB.selectByCondition(userOrderParamEntity);
		if (userOrderEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM012 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {

			// TODO ReservationDateの降順 先頭の5件
			CourseCommentParamEntity courseCommentParamEntity = new CourseCommentParamEntity();
			courseCommentParamEntity.setLangId(myCollectionEntity.getLangId());
			courseCommentParamEntity.setTouristIdentiNo(myCollectionEntity.getTouristIdentiNo());

			List<CourseCommentEntity> courseCommentEntityList = courseCommentService4DB.selectByCondition(courseCommentParamEntity);
			if (courseCommentEntityList.isEmpty()) {

				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM011 + "[selectByCondition]");
				tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
			} else {

				CourseCommentEntity eCourseComment = new CourseCommentEntity();
				for (int i = 0; i < userOrderEntityList.size(); i++) {
					eCourseComment = getCourseCommentEntity(courseCommentEntityList, userOrderEntityList.get(i).getCourseIdentiNo());
					if (eCourseComment.getScore() == null) {

						userOrderEntityList.get(i).setComment("");
					} else {
						userOrderEntityList.get(i).setScore(eCourseComment.getScore());
						userOrderEntityList.get(i).setComment(eCourseComment.getComment());
						userOrderEntityList.get(i).setCommentIdentiNo(eCourseComment.getCourseCommentIdentiNo());
					}

					CourseParamEntity courseParamEntity = new CourseParamEntity();
					courseParamEntity.setLangId(userOrderEntityList.get(i).getLangId());
					courseParamEntity.setCourseIdentiNo(userOrderEntityList.get(i).getCourseIdentiNo());
					courseEntityList = courseService4DB.selectByPK(courseParamEntity);
					courseEntity = courseEntityList.get(0);

					userOrderEntityList.get(i).setCourseFullName(courseEntity.getFullName());
				}
			}
			rtnResult.setUserOrderList(userOrderEntityList);
		}

		List<CourseEntity> newCourseList = new ArrayList<CourseEntity>();
		LocalhostParamEntity localhostParamEntity = new LocalhostParamEntity();
		CoursePictureParamEntity coursePictureParamEntity = new CoursePictureParamEntity();
		String strPhotoPath = "";
		courseEntityList = courseService4DB.selectAll();

		if (courseEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM001 + "[selectAll]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
			paraMap.put(KooConst.ST_ERRORINFO, tList);
			logger.error(KooConst.INFO_MSG_001);
			return (rtnResult);
		}

		// TODO
		// Favorite#OpDateの降順
		// 先頭の5件
		FavoriteParamEntity favoriteParamEntity = new FavoriteParamEntity();
		favoriteParamEntity.setLangId(myCollectionEntity.getLangId());
		favoriteParamEntity.setTouristIdentiNo(myCollectionEntity.getTouristIdentiNo());
		favoriteParamEntity.setDeleteStatus("0");
		favoriteParamEntity.setObjType("1");
		List<FavoriteEntity> favoriteEntityList = favoriteService4DB.selectByCondition(favoriteParamEntity);
		if (favoriteEntityList.isEmpty()) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM014 + "[selectByCondition]");
			tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_001);
			tErrorInfo.setDispOrder(1);
			tList.add(tErrorInfo);
		} else {

			rtnResult.setFavoriteList(favoriteEntityList);
			String strObjIdentiNo = "";
			for (int i = 0; i < favoriteEntityList.size(); i++) {

				strObjIdentiNo = favoriteEntityList.get(i).getObjIdentiNo();
				RumdaByConditionEx rumdaByConditionEx = new RumdaByConditionEx();
				courseEntity = rumdaByConditionEx.selectCourseByLang(courseEntityList, myCollectionEntity.getLangId(), strObjIdentiNo).get(0);
				newCourseList.add(courseEntity);
			}

			for (int i = 0; i < newCourseList.size(); i++) {

				courseEntity = newCourseList.get(i);
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

					newCourseList.get(i).setLocalhostPictureDisp(KooConst.STR_UPLOAD_IMAGES_PATH + localhostEntityList.get(0).getPhoto());
				}

				coursePictureParamEntity.setLangId(courseEntity.getLangId());
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
					newCourseList.get(i).setCoursePictureListDisp(coursePictureEntityList);
				}
			}
		}

		rtnResult.setCourseList(newCourseList);

		// TODO
		rtnResult.setKootourPoint(new Integer(500));
		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);

	}
	@Override
	public MyCollectionEntity commentDisp(MyCollectionEntity myCollectionEntity, Map<String, Object> paraMap) {
		MyCollectionEntity rtnResult = new MyCollectionEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	private CourseCommentEntity getCourseCommentEntity(List<CourseCommentEntity> courseCommentEntityList, String strCourseID) {

		CourseCommentEntity eCourseComment = new CourseCommentEntity();
		RumdaByConditionEx rumdaByConditionEx = new RumdaByConditionEx();
		List<CourseCommentEntity> commentList = 
				rumdaByConditionEx.selectCourseCommentByCourseIdentiNo(courseCommentEntityList, strCourseID);

		if (!commentList.isEmpty()) {

			eCourseComment = (CourseCommentEntity) commentList.get(0);
		}
		return eCourseComment;
	}
}
