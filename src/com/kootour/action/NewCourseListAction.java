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

import com.kootour.service.NewCourseListService;
import com.kootour.service.impl.NewCourseListServiceImpl;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.NewCourseListEntity;
import com.kootour.model.CourseModel;
import com.kootour.model.NewCourseListModel;
import com.kootour.mapper.entity.CityCourseListEntity;
import com.kootour.mapper.entity.CourseEntity;

@Results({@Result(name = "gotocitychange", value = "newCourseList!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotonext", value = "cityCourseList!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotocoursedetail", value = "courseDetail!load", type = ServletActionRedirectResult.class)})
public class NewCourseListAction extends NewCourseListModel {

	@Autowired(required = false)
	private NewCourseListService newCourseListService = new NewCourseListServiceImpl();

	public String cityChange() {
		String rtnStr = "gotocitychange";
		// Map<String, Object> paraMap = new HashMap<String, Object>();
		// CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity();
		// CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
		// outCityCourseListEntity = cityCourseListService.cityChange(inCityCourseListEntity, paraMap);

		return rtnStr;
	}
	public String cancel() {
		String rtnStr = "input";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		NewCourseListEntity inNewCourseListEntity = copyEntityAction2Entity((NewCourseListModel)this);
		NewCourseListEntity outNewCourseListEntity = new NewCourseListEntity();
		outNewCourseListEntity = newCourseListService.cancel(inNewCourseListEntity, paraMap);

		return rtnStr;
	}

	public String save() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		
		List<CourseModel>  list = this.getCourseList();
		
		NewCourseListEntity inNewCourseListEntity = copyEntityAction2Entity((NewCourseListModel)this);
		NewCourseListEntity outNewCourseListEntity = new NewCourseListEntity();
		outNewCourseListEntity = newCourseListService.save(inNewCourseListEntity, paraMap);

		return rtnStr;
	}

	public String courseDetail() {
		String rtnStr = "gotocoursedetail";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		NewCourseListEntity inNewCourseListEntity = copyEntityAction2Entity((NewCourseListModel)this);
		NewCourseListEntity outNewCourseListEntity = new NewCourseListEntity();
		outNewCourseListEntity = newCourseListService.courseDetail(inNewCourseListEntity, paraMap);

		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
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
		setLangId(getSessionInfo().getCurLangId());
		NewCourseListEntity inNewCourseListEntity = copyEntityAction2Entity((NewCourseListModel)this);

		NewCourseListEntity outNewCourseListEntity = new NewCourseListEntity();
		outNewCourseListEntity = newCourseListService.load(inNewCourseListEntity, paraMap);
		copyEntity2EntityAction(outNewCourseListEntity);

		List languageList = (List) paraMap.get(KooConst.MAP_LANGUAGELIST);
		getSession().put(KooConst.ST_LANGUAGELIST, languageList);

		return rtnStr;
	}

	public void copyEntity2EntityAction(NewCourseListEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
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
	public NewCourseListEntity copyEntityAction2Entity(NewCourseListModel tNewCourseListModel) {
		NewCourseListEntity tEntity = new NewCourseListEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tNewCourseListModel.getLangId());
		List<CourseEntity> tmpCourseEntityList = new ArrayList<CourseEntity>();
		for (CourseModel tmpVal : tNewCourseListModel.getCourseList()) {
			CourseEntity tmpCourse = new CourseEntity();
			CourseAction tmpAction = (CourseAction) tmpVal;
			tmpCourse = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseEntityList.add(tmpCourse);
		}
		tEntity.setCourseList(tmpCourseEntityList);
		if (KooUtil.isNotDate(tNewCourseListModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tNewCourseListModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tNewCourseListModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tNewCourseListModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
