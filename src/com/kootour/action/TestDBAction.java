//Auto Generated 

package com.kootour.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.ScheduleOrderInfo;
import com.kootour.exception.BusinessException;
import com.kootour.exception.SystemException;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.service.CommonService;
import com.kootour.service.CourseScheduleService;
import com.kootour.service.CourseService;
import com.kootour.service.TestDBService;
import com.kootour.service.UserOrderService;
import com.kootour.service.impl.CommonServiceImpl;
import com.kootour.service.impl.CourseScheduleServiceImpl;
import com.kootour.service.impl.CourseServiceImpl;
import com.kootour.service.impl.TestDBServiceImpl;
import com.kootour.service.impl.UserOrderServiceImpl;
import com.kootour.service4db.CourseService4DB;
import com.kootour.service4db.impl.CourseService4DBImpl;

@Results({@Result(name = "gotonext", value = "courseComment!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "stateCourseList!load", type = ServletActionRedirectResult.class)})
public class TestDBAction extends BaseAction {
	private static Logger logger = Logger.getLogger(TestDBAction.class);

	@Autowired(required = false)
	private TestDBService testDBService = new TestDBServiceImpl();
//	@Autowired(required = false)
//	private TestDBUserOrderService testDBUserOrderService = new TestDBUserOrderServiceImpl();

	@Autowired(required = false)
	private CourseScheduleService courseScheduleService = new CourseScheduleServiceImpl();

	@Autowired(required = false)
	private CourseService courseService = new CourseServiceImpl();
	
	@Autowired(required = false)
	private UserOrderService userOrderService = new UserOrderServiceImpl();

	@Autowired(required = false)
	private CourseService4DB courseService4DB = new CourseService4DBImpl();

	@Autowired(required = false)
	private CommonService commonService = new CommonServiceImpl();
	
	public String load() throws BusinessException, SystemException {
		
		
//		if (getSession().get(KooConst.ST_SESSION_INFO) == null) {
//			setSessionInfo(commonService.initSessionInfo());
//			getSession().put(KooConst.ST_SESSION_INFO, getSessionInfo());
//		}else{
//			setSessionInfo ((SessionInfo) getSession().get(KooConst.ST_SESSION_INFO));
//		}

		String rtnStr = "success";
//		String langId = "en";
//		getSession().put(KooConst.ST_LANGID, langId);
//		setLangId(langId);
//
//		langId=getSessionInfo().getCurLangId();
//		String state = "China";
//		getSession().put(KooConst.ST_STATE, state);
//
//		String city = "Beijing";

		String strSysDate = "20160506";
		this.setErrInfoList(testDBService.selectAll());

//		testDBService.insertAllCourseSchedule();
		int tInsertNum=0;
//		tInsertNum=courseScheduleService.insertOneYear("en", "AA000000001");
		Boolean testB=false;
//		userOrderService.testCreateUserOrder();
//		testB=courseScheduleService.checkDeleteOk("en", "C00000000001", "20160430");
		
//		tInsertNum=courseScheduleService.changeToInactive("en", "C00000000001", "20160420");

//		tInsertNum=courseScheduleService.changeToActive("en", "C00000000001", "20160420");
		
		List<String> tList=courseScheduleService.calcCourseStatus("en", "AA000000001", "20160716");
        String tt=courseScheduleService.calcTimeTable("en", "AA000000001", "20160716");
		courseService.testSort();
		
		List<List<ScheduleOptionEntity>> tListList =courseScheduleService.calcScheduleOption("en", "AA000000001", "201604");

		 List<ScheduleOrderInfo>  tList1= userOrderService.calcOrderInfoForMonth("en", "AE000000005", "201605");
//		List<CourseEntity> courseEntityList = courseService4DB.selectAll();
//		List<CourseEntity>  tList1= courseService.calcMinPrice(courseEntityList, "20160515",  "20160930");
//		List<CourseEntity>  tList2= courseService.mergeCourseByScheduleWorkDay(tList1, "20160522",  "20160522");
//		List<CourseEntity>  tList3= courseService.addPictureToCourse(tList2);
//		List<CourseEntity>  tList4= courseService.addCommentInfoToCourse(tList3);
//		List<CourseEntity>  tList5= courseService.addInExInfoToCourse(tList4);
//		List<CourseEntity>  tList6= courseService.addOtherInfoToCourse(tList5);
		
		makeErrorList(this.getErrInfoList());
		return rtnStr;
	}
	public static boolean IsLengthLessThan5(String str) {
		return str.length() < 5;
	}
	public String back() {
		String rtnStr = "gotoback";

		// String langId = "en";
		// getSession().put(KooConst.ST_LANGID, langId);
		// setLangId(langId);
		//
		// String state = "Canada";
		// getSession().put(KooConst.ST_STATE, state);
		//
		// String city = "Vancouver";
		// getSession().put(KooConst.ST_CITY, city);
		// getSession().put(KooConst.ST_RELOAD, KooConst.STR_RELOAD_DIV_NO);

		// Date d = new Date();
		// SimpleDateFormat df = new SimpleDateFormat(KooConst.ST_yyyyMMdd);
		// String strSystemDate = df.format(new Date(d.getTime()));

		// String strSysDate = "20160215";
		// getSession().put(KooConst.ST_SYSDATE, strSysDate);
		return rtnStr;
	}

	public String testUser_order() {
		String rtnStr = "";

//		List<ErrorInfo> list = testDBUserOrderService.testSelectByPK();
//		List<ErrorInfo> listAll = testDBUserOrderService.testSelectAll();
//		list.addAll(listAll);
//		makeErrorList(list);

		return rtnStr;
	}

	private void test() {

	}


}
