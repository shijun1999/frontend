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
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.entity.StateCourseListEntity;
import com.kootour.model.CourseModel;
import com.kootour.model.LocationMstModel;
import com.kootour.model.StateCourseListModel;
import com.kootour.service.CommonService;
import com.kootour.service.StateCourseListService;
import com.kootour.service.impl.CommonServiceImpl;
import com.kootour.service.impl.StateCourseListServiceImpl;

@Results({ @Result(name = "gotocourse", value = "course!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotocitycourselist", value = "cityCourseList!load", type = ServletActionRedirectResult.class) })
public class StateCourseListAction extends StateCourseListModel {

	@Autowired(required = false)
	private StateCourseListService stateCourseListService = new StateCourseListServiceImpl();
	
	@Autowired(required = false)
	private CommonService commonService = new CommonServiceImpl();

	public String search() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		StateCourseListEntity inStateCourseListEntity = copyEntityAction2Entity((StateCourseListModel)this);
		StateCourseListEntity outStateCourseListEntity = new StateCourseListEntity();
//		outStateCourseListEntity = stateCourseListService.search(inStateCourseListEntity, paraMap);
		Map<String, Object> sessionMap =getSessionInfo().getParaMap();
		sessionMap.put(KooConst.MAP_SELECT_DATE, this.getSearchDate());
		sessionMap.put(KooConst.MAP_SELECT_CITY, this.getCity());
		getSessionInfo().setParaMap(sessionMap);
		rtnStr="gotocitycourselist";
		return rtnStr;
	}

	public String load() {

		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();

		setLangId(getSessionInfo().getCurLangId());
//		setState(getSessionInfo().getCurState());
//		setNearBy(getSessionInfo().getCurCity());
		Map<String, Object> sessionParaMap = getSessionInfo().getParaMap();

		StateCourseListEntity inStateCourseListEntity = copyEntityAction2Entity((StateCourseListModel)this);
		StateCourseListEntity outStateCourseListEntity = new StateCourseListEntity();
		outStateCourseListEntity = stateCourseListService.load(inStateCourseListEntity, paraMap);

		copyEntity2EntityAction(outStateCourseListEntity);

		return rtnStr;
	}

	public String courseDetail() {
		String shortName = getRequest().getParameter("shortName");
		getSession().put("shortName", shortName);
		// Map<String,Object> paraMap=new HashMap<String,Object>();
		// StateCourseListEntity inStateCourseListEntity =
		// copyEntityAction2Entity();
		// StateCourseListEntity outStateCourseListEntity = new
		// StateCourseListEntity() ;
		// outStateCourseListEntity =
		// stateCourseListService.detail(inStateCourseListEntity,paraMap);
		System.out.println("+++++4++++" + shortName);

		String rtnStr = "gotocourse";
		return rtnStr;
	}

	public String logout() {
		String rtnStr = "";
		

		rtnStr=load();
		this.setCurTouristIdentiNo(KooConst.ST_DUMMY_TOURIST_NO);
		Map<String, Object> session = this.getSession();

		this.setSessionInfo(commonService.initSessionInfo());
		session.put(KooConst.ST_SESSION_INFO, this.getSessionInfo());

		
		return rtnStr;
	}
	public String cityCourseList() {

		String cityName = getRequest().getParameter("cityName");
		getSession().put("cityName", cityName);
		System.out.println("+++++3++++" + cityName);

		String rtnStr = "gotocitycourselist";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		StateCourseListEntity inStateCourseListEntity = copyEntityAction2Entity((StateCourseListModel)this);
		StateCourseListEntity outStateCourseListEntity = new StateCourseListEntity();
		outStateCourseListEntity = stateCourseListService.cityCourseList(inStateCourseListEntity, paraMap);

		return rtnStr;
	}

	  public void  copyEntity2EntityAction(StateCourseListEntity tEntity) { 
			this.copyBaseEntity2Model(tEntity);
	       if (tEntity.getLangId()==null){
	       setLangId("");
	       }else{
	       setLangId(tEntity.getLangId());
	       }
	       if (tEntity.getCity()==null){
	       setCity("");
	       }else{
	       setCity(tEntity.getCity());
	       }
	       if (tEntity.getLangSelect()==null){
	       setLangSelect("");
	       }else{
	       setLangSelect(tEntity.getLangSelect());
	       }
	       if (tEntity.getState()==null){
	       setState("");
	       }else{
	       setState(tEntity.getState());
	       }
	       if (tEntity.getSearchDate()==null){
	       setSearchDate("");
	       }else{
	       setSearchDate(tEntity.getSearchDate());
	       }
	       		List<String> tmpStringActionList1 = new ArrayList<String>();
	       		for (String tmpVal : tEntity.getCityList()){
	       			tmpStringActionList1.add(tmpVal );
	       		}
	       		setCityList(tmpStringActionList1);
	       		List<CourseModel> tmpCourseActionList2 = new ArrayList<CourseModel>();
	       		for (CourseEntity  tmpVal : tEntity.getCourseList()){
	       			CourseAction tmpCourseList = new CourseAction();
	       			tmpCourseList.copyEntity2EntityAction(tmpVal);
	       			tmpCourseActionList2.add(tmpCourseList);
	       		}
	       		setCourseList(tmpCourseActionList2);
	       		List<LocationMstModel> tmpLocationMstActionList3 = new ArrayList<LocationMstModel>();
	       		for (LocationMstEntity  tmpVal : tEntity.getLocationMstList()){
	       			LocationMstAction tmpLocationMstList = new LocationMstAction();
	       			tmpLocationMstList.copyEntity2EntityAction(tmpVal);
	       			tmpLocationMstActionList3.add(tmpLocationMstList);
	       		}
	       		setLocationMstList(tmpLocationMstActionList3);
	       if (tEntity.getCreateTime()==null){
	       setCreateTime("");
	       }else{
	       setCreateTime(KooUtil.date2String(tEntity.getCreateTime()  , KooConst.ST_yyyyMMddHHmmss));
	       }
	       if (tEntity.getModifyTime()==null){
	       setModifyTime("");
	       }else{
	       setModifyTime(KooUtil.date2String(tEntity.getModifyTime()  , KooConst.ST_yyyyMMddHHmmss));
	       }

	}
	  public StateCourseListEntity copyEntityAction2Entity(StateCourseListModel tStateCourseListModel) {
	     StateCourseListEntity tEntity = new StateCourseListEntity();
	        //set common info 
			tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
			tEntity.setCurDate(this.getCurDate());
			tEntity.setSessionInfo(this.getSessionInfo());

	       tEntity.setLangId(tStateCourseListModel.getLangId());
	       tEntity.setCity(tStateCourseListModel.getCity());
	       tEntity.setLangSelect(tStateCourseListModel.getLangSelect());
	       tEntity.setState(tStateCourseListModel.getState());
	       tEntity.setSearchDate(tStateCourseListModel.getSearchDate());
	       		List<String> tmpStringEntityList1 = new ArrayList<String>();
	       		for (String  tmpVal : tStateCourseListModel.getCityList()){
	       			tmpStringEntityList1.add(tmpVal);
	       		}
	       		tEntity.setCityList(tmpStringEntityList1);
	       		List<CourseEntity> tmpCourseEntityList2 = new ArrayList<CourseEntity>();
	       		for (CourseModel  tmpVal : tStateCourseListModel.getCourseList()){
	       			CourseEntity tmpCourse = new CourseEntity();
	       			CourseAction tmpAction= (CourseAction)tmpVal;
	       			tmpCourse=tmpAction.copyEntityAction2Entity(tmpVal);
	       			tmpCourseEntityList2.add(tmpCourse);
	       		}
	       		tEntity.setCourseList(tmpCourseEntityList2);
	       		List<LocationMstEntity> tmpLocationMstEntityList3 = new ArrayList<LocationMstEntity>();
	       		for (LocationMstModel  tmpVal : tStateCourseListModel.getLocationMstList()){
	       			LocationMstEntity tmpLocationMst = new LocationMstEntity();
	       			LocationMstAction tmpAction= (LocationMstAction)tmpVal;
	       			tmpLocationMst=tmpAction.copyEntityAction2Entity(tmpVal);
	       			tmpLocationMstEntityList3.add(tmpLocationMst);
	       		}
	       		tEntity.setLocationMstList(tmpLocationMstEntityList3);
	       		if (KooUtil.isNotDate(tStateCourseListModel.getCreateTime())){
	       			tEntity.setCreateTime(null);
	       		}else{
	       tEntity.setCreateTime(KooUtil.string2Date(tStateCourseListModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
	       		}
	       		if (KooUtil.isNotDate(tStateCourseListModel.getModifyTime())){
	       			tEntity.setModifyTime(null);
	       		}else{
	       tEntity.setModifyTime(KooUtil.string2Date(tStateCourseListModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
	       		}
	    return tEntity;

	    }
}
