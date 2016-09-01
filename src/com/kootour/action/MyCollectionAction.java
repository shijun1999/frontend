//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.MyCollectionEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.model.CourseCommentModel;
import com.kootour.model.CourseModel;
import com.kootour.model.FavoriteModel;
import com.kootour.model.MyCollectionModel;
import com.kootour.model.UserOrderModel;
import com.kootour.service.MyCollectionService;
import com.kootour.service.impl.MyCollectionServiceImpl;

@Results({ @Result(name = "gotonext", value = "courseComment!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "cityCourseList!load", type = ServletActionRedirectResult.class) })
public class MyCollectionAction extends MyCollectionModel {

	@Autowired(required = false)
	private MyCollectionService myCollectionService = new MyCollectionServiceImpl();

	public String load() {

		String rtnStr = "success";
		Map<String, Object> session = getSession();
		if (session == null) {

			List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_009);
			tList.add(tErrorInfo);

			this.setErrInfoList(tList);
			makeErrorList(this.getErrInfoList());
			return rtnStr;
		}
		MyCollectionEntity inMyCollectionEntity = copyEntityAction2Entity((MyCollectionModel)this);
		Map<String, Object> paraMap = new HashMap<String, Object>();
		MyCollectionEntity outMyCollectionEntity = new MyCollectionEntity();

		outMyCollectionEntity = myCollectionService.load(inMyCollectionEntity, paraMap);

		copyEntity2EntityAction(outMyCollectionEntity);
		return rtnStr;
	}

	public String comment() {

		String rtnStr = "gotonext";

		return rtnStr;
	}

	public String cancel() {
		String rtnStr = "input";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		MyCollectionEntity inMyCollectionEntity = copyEntityAction2Entity((MyCollectionModel)this);
		MyCollectionEntity outMyCollectionEntity = new MyCollectionEntity();
		// outUserOrderEntity = myCollectionService.cancel(inMyCollectionEntity,
		// paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(MyCollectionEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);

		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(tEntity.getTouristIdentiNo());
		}
		List<FavoriteModel> tmpFavoriteActionList = new ArrayList<FavoriteModel>();
		for (FavoriteEntity tmpVal : tEntity.getFavoriteList()) {
			FavoriteAction tmpFavoriteList = new FavoriteAction();
			tmpFavoriteList.copyEntity2EntityAction(tmpVal);
			tmpFavoriteActionList.add(tmpFavoriteList);
		}
		setFavoriteList(tmpFavoriteActionList);
		List<UserOrderModel> tmpUserOrderActionList = new ArrayList<UserOrderModel>();
		for (UserOrderEntity tmpVal : tEntity.getUserOrderList()) {
			UserOrderAction tmpUserOrderList = new UserOrderAction();
			tmpUserOrderList.copyEntity2EntityAction(tmpVal);
			tmpUserOrderActionList.add(tmpUserOrderList);
		}
		setUserOrderList(tmpUserOrderActionList);
		List<CourseCommentModel> tmpCourseCommentActionList = new ArrayList<CourseCommentModel>();
		for (CourseCommentEntity tmpVal : tEntity.getCourseCommentList()) {
			CourseCommentAction tmpCourseCommentList = new CourseCommentAction();
			tmpCourseCommentList.copyEntity2EntityAction(tmpVal);
			tmpCourseCommentActionList.add(tmpCourseCommentList);
		}
		setCourseCommentList(tmpCourseCommentActionList);
		if (tEntity.getKootourPoint() == null) {
			setKootourPoint("");
		} else {
			setKootourPoint(String.valueOf(tEntity.getKootourPoint()));
		}
		List<CourseModel> tmpCourseActionList = new ArrayList<CourseModel>();
		for (CourseEntity tmpVal : tEntity.getCourseList()) {
			CourseAction tmpCourseList = new CourseAction();
			tmpCourseList.copyEntity2EntityAction(tmpVal);
			tmpCourseActionList.add(tmpCourseList);
		}
		setCourseList(tmpCourseActionList);
		if (tEntity.getCreateTime() == null) {
			setCreateTime("");
		} else {
			setCreateTime(KooUtil.date2String(tEntity.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (tEntity.getModifyTime() == null) {
			setModifyTime("");
		} else {
			setModifyTime(KooUtil.date2String(tEntity.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}

	}

	public MyCollectionEntity copyEntityAction2Entity(MyCollectionModel tMyCollectionModel) {
		MyCollectionEntity tEntity = new MyCollectionEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tMyCollectionModel.getLangId());
		tEntity.setTouristIdentiNo(tMyCollectionModel.getTouristIdentiNo());
		List<FavoriteEntity> tmpFavoriteEntityList = new ArrayList<FavoriteEntity>();
		for (FavoriteModel tmpVal : tMyCollectionModel.getFavoriteList()) {
			FavoriteEntity tmpFavorite = new FavoriteEntity();
			FavoriteAction tmpAction = (FavoriteAction) tmpVal;
			tmpFavorite = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpFavoriteEntityList.add(tmpFavorite);
		}
		tEntity.setFavoriteList(tmpFavoriteEntityList);
		List<UserOrderEntity> tmpUserOrderEntityList = new ArrayList<UserOrderEntity>();
		for (UserOrderModel tmpVal : tMyCollectionModel.getUserOrderList()) {
			UserOrderEntity tmpUserOrder = new UserOrderEntity();
			UserOrderAction tmpAction = (UserOrderAction) tmpVal;
			tmpUserOrder = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpUserOrderEntityList.add(tmpUserOrder);
		}
		tEntity.setUserOrderList(tmpUserOrderEntityList);
		List<CourseCommentEntity> tmpCourseCommentEntityList = new ArrayList<CourseCommentEntity>();
		for (CourseCommentModel tmpVal : tMyCollectionModel.getCourseCommentList()) {
			CourseCommentEntity tmpCourseComment = new CourseCommentEntity();
			CourseCommentAction tmpAction = (CourseCommentAction) tmpVal;
			tmpCourseComment = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseCommentEntityList.add(tmpCourseComment);
		}
		tEntity.setCourseCommentList(tmpCourseCommentEntityList);
		if (KooUtil.isNotInt(tMyCollectionModel.getKootourPoint())) {
			tEntity.setKootourPoint(null);
		} else {
			tEntity.setKootourPoint(Integer.parseInt(tMyCollectionModel.getKootourPoint()));
		}
		List<CourseEntity> tmpCourseEntityList = new ArrayList<CourseEntity>();
		for (CourseModel tmpVal : tMyCollectionModel.getCourseList()) {
			CourseEntity tmpCourse = new CourseEntity();
			CourseAction tmpAction = (CourseAction) tmpVal;
			tmpCourse = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseEntityList.add(tmpCourse);
		}
		tEntity.setCourseList(tmpCourseEntityList);
		if (KooUtil.isNotDate(tMyCollectionModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tMyCollectionModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tMyCollectionModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tMyCollectionModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
