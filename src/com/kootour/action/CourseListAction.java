//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.service.CourseListService;
import com.kootour.service.impl.CourseListServiceImpl;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseListEntity;
import com.kootour.model.CourseModel;
import com.kootour.model.CourseListModel;
import com.kootour.mapper.entity.CourseEntity;

@Results({ @Result(name = "gotoback", value = "course!display", type = ServletActionRedirectResult.class) })
public class CourseListAction extends CourseListModel {

	@Autowired(required = false)
	private CourseListService courseListService = new CourseListServiceImpl();

	public String back() {
		String rtnStr = "gotoback";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CourseListEntity inCourseListEntity = copyEntityAction2Entity((CourseListModel)this);
		CourseListEntity outCourseListEntity = new CourseListEntity();
		outCourseListEntity = courseListService.back(inCourseListEntity, paraMap);

		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CourseListEntity inCourseListEntity = copyEntityAction2Entity((CourseListModel)this);
		CourseListEntity outCourseListEntity = new CourseListEntity();
		outCourseListEntity = courseListService.load(inCourseListEntity, paraMap);

		return rtnStr;
	}

	public String changeCity() {
		String rtnStr = "change_city";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CourseListEntity inCourseListEntity = copyEntityAction2Entity((CourseListModel)this);
		CourseListEntity outCourseListEntity = new CourseListEntity();
		outCourseListEntity = courseListService.changeCity(inCourseListEntity, paraMap);

		return rtnStr;
	}

	public String attrFilter() {
		String rtnStr = "attr_filter";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CourseListEntity inCourseListEntity = copyEntityAction2Entity((CourseListModel)this);
		CourseListEntity outCourseListEntity = new CourseListEntity();
		outCourseListEntity = courseListService.attrFilter(inCourseListEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(CourseListEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getState() == null) {
			setState("");
		} else {
			setState(tEntity.getState());
		}
		if (tEntity.getCity() == null) {
			setCity("");
		} else {
			setCity(tEntity.getCity());
		}
		List<CourseModel> tmpCourseActionList = new ArrayList<CourseModel>();
		for (CourseEntity tmpVal : tEntity.getCourseList()) {
			CourseAction tmpCourseEntityAction = new CourseAction();
			tmpCourseEntityAction.copyEntity2EntityAction(tmpVal);
			tmpCourseActionList.add(tmpCourseEntityAction);
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

	public CourseListEntity copyEntityAction2Entity(CourseListModel tCourseListModel) {
		CourseListEntity tEntity = new CourseListEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tCourseListModel.getLangId());
		tEntity.setState(tCourseListModel.getState());
		tEntity.setCity(tCourseListModel.getCity());
		List<CourseEntity> tmpCourseEntityList = new ArrayList<CourseEntity>();
		for (CourseModel tmpVal : tCourseListModel.getCourseList()) {
			CourseEntity tmpCourseEntity = new CourseEntity();
			CourseAction tmpAction = (CourseAction) tmpVal;
			tmpCourseEntity = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseEntityList.add(tmpCourseEntity);
		}
		tEntity.setCourseList(tmpCourseEntityList);
		if (KooUtil.isNotDate(tCourseListModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tCourseListModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tCourseListModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tCourseListModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
