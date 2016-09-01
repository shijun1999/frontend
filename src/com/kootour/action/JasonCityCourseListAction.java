//Auto Generated

package com.kootour.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CityCourseListEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseFilterEntity;
import com.kootour.mapper.entity.OrderConfirmEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.UserOrderParamEntity;
import com.kootour.model.CityCourseListModel;
import com.kootour.model.CourseModel;
import com.kootour.service.CityCourseListService;
import com.kootour.service.FavoriteService;
import com.kootour.service.OrderConfirmService;
import com.kootour.service.impl.CityCourseListServiceImpl;
import com.kootour.service.impl.FavoriteServiceImpl;

public class JasonCityCourseListAction extends CityCourseListModel {

	private Map<String, Object> returnJson;

	public Map<String, Object> getReturnJson() {
		return returnJson;
	}

	@Autowired(required = false)
	private CityCourseListService cityCourseListService = new CityCourseListServiceImpl();
	private FavoriteService favoriteService = new FavoriteServiceImpl();
	public String cityChange() {
		String rtnStr = "gotocitychange";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity();
		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
		outCityCourseListEntity = cityCourseListService.cityChange(inCityCourseListEntity, paraMap);

		return rtnStr;
	}

	@Action(value = "jasonCityCourseListLoad", results = {@Result(name = "load_success", type = "json",params={"ignoreHierarchy","false"})})
	public String load() {

		String rtnStr;
		//// Map<String, Object> session = getSession();
		//
		// String strSysDate = getRequest().getParameter(KooConst.ST_SYSDATE);
		// String langId = getRequest().getParameter(KooConst.ST_LANGID);
		// String state = getRequest().getParameter(KooConst.ST_STATE);
		// String city = getRequest().getParameter(KooConst.ST_CITY);
//		String strSysDate = getRequest().getParameter(KooConst.ST_SYSDATE);
		String langId = getLangId();
		String state = getState();
		String city = getCity();

		String reLoad = KooConst.STR_RELOAD_DIV_NO;


			rtnStr = "load_success";

			if (langId != null) {
				setLangId(langId);
			} else {
				setLangId(KooConst.STR_LANGUAGE_ENGLISH);
			}

			// TODO
			setState(state);
			setCity(city);

			Map<String, Object> paraMap = new HashMap<String, Object>();



			CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity();
			CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
			outCityCourseListEntity = cityCourseListService.load(inCityCourseListEntity, paraMap);

			if (outCityCourseListEntity.getCourseList().isEmpty()) {

				// TODO

			}
			copyEntity2EntityAction(outCityCourseListEntity);
			//
			// List languageList = (List) paraMap.get(KooConst.MAP_LANGUAGELIST);
			// getSession().put(KooConst.ST_LANGUAGELIST, languageList);
			
			returnJson = new HashMap<String, Object>();
			returnJson.put("flg", "success");

		return rtnStr;
	}

//	public String detail() {
//		String rtnStr = "gotocourse";
//		Map<String, Object> paraMap = new HashMap<String, Object>();
//
//		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity();
//		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
//		outCityCourseListEntity = cityCourseListService.detail(inCityCourseListEntity, paraMap);
//
//		return rtnStr;
//	}

//	public String myFavorite() {
//		String rtnStr = "gotomyfavorite";
//		Map<String, Object> paraMap = new HashMap<String, Object>();
//		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity();
//		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
//		outCityCourseListEntity = cityCourseListService.myFavorite(inCityCourseListEntity, paraMap);
//
//		return rtnStr;
//	}

	public String addMyFavorite() {
		String rtnStr = "success";
		String strCourseIdentiNo = getRequest().getParameter("courseIdentiNo").toString();

			Map<String, Object> paraMap = new HashMap<String, Object>();
			CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity();
//			paraMap.put(KooConst.ST_TOURISTID, getSession().get(KooConst.ST_TOURISTID).toString());
			paraMap.put("objIdentiNo", strCourseIdentiNo);
			CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
			outCityCourseListEntity = cityCourseListService.addMyFavorite(inCityCourseListEntity, paraMap);

			// FavoriteEntity favoriteEntity
		this.load();
		return rtnStr;
	}

	public String mailConfirm() {
		String rtnStr = "gotoemail";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity();
		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
		outCityCourseListEntity = cityCourseListService.mailConfirm(inCityCourseListEntity, paraMap);

		return rtnStr;
	}

	public String courseFilter() {
		String rtnStr = "gotocoursefilter";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CityCourseListEntity inCityCourseListEntity = copyEntityAction2Entity();
		CityCourseListEntity outCityCourseListEntity = new CityCourseListEntity();
		outCityCourseListEntity = cityCourseListService.courseFilter(inCityCourseListEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(CityCourseListEntity tEntity) {
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
	public CityCourseListEntity copyEntityAction2Entity() {
		CityCourseListEntity tEntity = new CityCourseListEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(getLangId());
		tEntity.setState(getState());
		tEntity.setCity(getCity());
		List<CourseEntity> tmpCourseEntityList = new ArrayList<CourseEntity>();
		for (CourseModel tmpVal : getCourseList()) {
			CourseEntity tmpCourseEntity = new CourseEntity();
			CourseAction tmpAction = (CourseAction) tmpVal;
			tmpCourseEntity = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseEntityList.add(tmpCourseEntity);
		}
		tEntity.setCourseList(tmpCourseEntityList);
		if (KooUtil.isNotDate(getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
