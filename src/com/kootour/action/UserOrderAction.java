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

import com.kootour.checker.SingleUserOrderChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseDetailEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.entity.UserOrderExtraOptionEntity;
import com.kootour.model.CourseModel;
import com.kootour.model.UserOrderExtraOptionModel;
import com.kootour.model.UserOrderModel;
import com.kootour.service.UserOrderService;
import com.kootour.service.impl.UserOrderServiceImpl;

@Results({ @Result(name = "gotonext", value = "cityCourseList!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "cityCourseList!load", type = ServletActionRedirectResult.class) })
public class UserOrderAction extends UserOrderModel {

	@Autowired(required = false)
	private UserOrderService userOrderService = new UserOrderServiceImpl();

//	public String cancel() {
//		String rtnStr = "input";
//		Map<String, Object> paraMap = new HashMap<String, Object>();
//		UserOrderEntity inUserOrderEntity = copyEntityAction2Entity();
//		UserOrderEntity outUserOrderEntity = new UserOrderEntity();
//		outUserOrderEntity = userOrderService.cancel(inUserOrderEntity, paraMap);
//
//		return rtnStr;
//	}

	public String save() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		Map<String, Object> session = getSession();

		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		if (session == null) {

			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_009);
			tList.add(tErrorInfo);

			this.setErrInfoList(tList);
			makeErrorList(this.getErrInfoList());
			return rtnStr;
		}

		SingleUserOrderChecker tSingleCheck = new SingleUserOrderChecker();
		tList = tSingleCheck.nullCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		tList = tSingleCheck.valueCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		tList = tSingleCheck.sizeCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		if (getErrInfoList().isEmpty()) {

			UserOrderEntity inUserOrderEntity = copyEntityAction2Entity((UserOrderModel)this);
			CourseEntity courseEntity = (CourseEntity) getSession().get(KooConst.ST_COURSEENTITY);
			paraMap.put(KooConst.MAP_COURSEENTITY, courseEntity);

			UserOrderEntity outUserOrderEntity = userOrderService.save(inUserOrderEntity, paraMap);

		} else {
			makeErrorList(this.getErrInfoList());
			rtnStr = "error";
		}
		return rtnStr;
	}

//	public String back() {
//		String rtnStr = "gotoback";
//		Map<String, Object> paraMap = new HashMap<String, Object>();
//		UserOrderEntity inUserOrderEntity = copyEntityAction2Entity();
//		UserOrderEntity outUserOrderEntity = new UserOrderEntity();
//		outUserOrderEntity = userOrderService.back(inUserOrderEntity, paraMap);
//
//		return rtnStr;
//	}

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
		UserOrderEntity inUserOrderEntity = new UserOrderEntity();
		CourseDetailEntity courseEntity = (CourseDetailEntity) getSession().get(KooConst.ST_COURSEDATAILENTITY);

		inUserOrderEntity.setCourseIdentiNo(courseEntity.getCourseIdentiNo());
		inUserOrderEntity.setLocalhostIdentiNo(courseEntity.getLocalhostIdentiNo());
		UserOrderEntity outUserOrderEntity = userOrderService.load(inUserOrderEntity, paraMap);
		copyEntity2EntityAction(outUserOrderEntity);
		getSession().put(KooConst.ST_COURSEENTITY, paraMap.get(KooConst.MAP_COURSEENTITY));

		return rtnStr;
	}

	public void copyEntity2EntityAction(UserOrderEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getCoursePicture() == null) {
			setCoursePicture("");
		} else {
			setCoursePicture(tEntity.getCoursePicture());
		}

		if (tEntity.getLocalhostPicture() == null) {
			setLocalhostPicture("");
		} else {
			setLocalhostPicture(tEntity.getLocalhostPicture());
		}

		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getOrderIdentiNo() == null) {
			setOrderIdentiNo("");
		} else {
			setOrderIdentiNo(tEntity.getOrderIdentiNo());
		}
		if (tEntity.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(tEntity.getCourseIdentiNo());
		}
		if (tEntity.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(tEntity.getLocalhostIdentiNo());
		}
		if (tEntity.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(tEntity.getTouristIdentiNo());
		}
		if (tEntity.getReservationDate() == null) {
			setReservationDate("");
		} else {
			setReservationDate(tEntity.getReservationDate());
		}
		if (tEntity.getScheduleOptionIdentiNo() == null) {
			setScheduleOptionIdentiNo("");
		} else {
			setScheduleOptionIdentiNo(String.valueOf(tEntity.getScheduleOptionIdentiNo()));
		}
		if (tEntity.getBgnTime() == null) {
			setBgnTime("");
		} else {
			setBgnTime(tEntity.getBgnTime());
		}
		if (tEntity.getStatus() == null) {
			setStatus("");
		} else {
			setStatus(tEntity.getStatus());
		}
		if (tEntity.getConsent() == null) {
			setConsent("");
		} else {
			setConsent(tEntity.getConsent());
		}
		if (tEntity.getCancelDate() == null) {
			setCancelDate("");
		} else {
			setCancelDate(tEntity.getCancelDate());
		}
		if (tEntity.getOrderDate() == null) {
			setOrderDate("");
		} else {
			setOrderDate(tEntity.getOrderDate());
		}
		if (tEntity.getMoneyUnit() == null) {
			setMoneyUnit("");
		} else {
			setMoneyUnit(tEntity.getMoneyUnit());
		}
		if (tEntity.getTouristNum() == null) {
			setTouristNum("");
		} else {
			setTouristNum(String.valueOf(tEntity.getTouristNum()));
		}
		if (tEntity.getInfantFree() == null) {
			setInfantFree("");
		} else {
			setInfantFree(tEntity.getInfantFree());
		}
		if (tEntity.getPrice() == null) {
			setPrice("");
		} else {
			setPrice(String.valueOf(tEntity.getPrice()));
		}
		if (tEntity.getDiscountPrice() == null) {
			setDiscountPrice("");
		} else {
			setDiscountPrice(String.valueOf(tEntity.getDiscountPrice()));
		}
		if (tEntity.getPersonOrGroup() == null) {
			setPersonOrGroup("");
		} else {
			setPersonOrGroup(tEntity.getPersonOrGroup());
		}
		if (tEntity.getUnitName() == null) {
			setUnitName("");
		} else {
			setUnitName(tEntity.getUnitName());
		}
		if (tEntity.getDuration() == null) {
			setDuration("");
		} else {
			setDuration(String.valueOf(tEntity.getDuration()));
		}
		if (tEntity.getDurationUnit() == null) {
			setDurationUnit("");
		} else {
			setDurationUnit(tEntity.getDurationUnit());
		}
		if (tEntity.getTotalMoney() == null) {
			setTotalMoney("");
		} else {
			setTotalMoney(String.valueOf(tEntity.getTotalMoney()));
		}
		if (tEntity.getTips() == null) {
			setTips("");
		} else {
			setTips(String.valueOf(tEntity.getTips()));
		}
		if (tEntity.getTouristFullName() == null) {
			setTouristFullName("");
		} else {
			setTouristFullName(tEntity.getTouristFullName());
		}
		
		if (tEntity.getLocalhostFullName() == null) {
			setLocalhostFullName("");
		} else {
			setLocalhostFullName(tEntity.getLocalhostFullName());
		}
		
		if (tEntity.getCourseFullName() == null) {
			setCourseFullName("");
		} else {
			setCourseFullName(tEntity.getCourseFullName());
		}
		if (tEntity.getScore() == null) {
			setScore("");
		} else {
			setScore(String.valueOf(tEntity.getScore()));
		}
		if (tEntity.getComment() == null) {
			setComment("");
		} else {
			setComment(tEntity.getComment());
		}

		if (tEntity.getLocation() == null) {
			setLocation("");
		} else {
			setLocation(tEntity.getLocation());
		}
		if (tEntity.getTaxVal() == null) {
			setTaxVal("");
		} else {
			setTaxVal(String.valueOf(tEntity.getTaxVal()));
		}

		if (tEntity.getDiscountMoney() == null) {
			setDiscountMoney("");
		} else {
			setDiscountMoney(String.valueOf(tEntity.getDiscountMoney()));
		}

		if (tEntity.getPaidMoney() == null) {
			setPaidMoney("");
		} else {
			setPaidMoney(String.valueOf(tEntity.getPaidMoney()));
		}
		if (tEntity.getCommentIdentiNo() == null) {
			setCommentIdentiNo("");
		} else {
			setCommentIdentiNo(tEntity.getCommentIdentiNo());
		}

		List<String> tmpStringActionList1 = new ArrayList<String>();
		for (String tmpVal : tEntity.getScoreIconListDisp()) {
			tmpStringActionList1.add(tmpVal);
		}
		setScoreIconListDisp(tmpStringActionList1);

		List<UserOrderExtraOptionModel> tmpUserOrderExtraOptionModelList3 = new ArrayList<>();
		for (UserOrderExtraOptionEntity tmpVal : tEntity.getUserOrderExtraOptionEntityList()) {
			UserOrderExtraOptionAction tmpUserOrderExtraOptionAction = new UserOrderExtraOptionAction();
			tmpUserOrderExtraOptionAction.copyEntity2EntityAction(tmpVal);
			tmpUserOrderExtraOptionModelList3.add(tmpUserOrderExtraOptionAction);
		}
		this.setUserOrderExtraOptionModelList(tmpUserOrderExtraOptionModelList3);

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

	public UserOrderEntity copyEntityAction2Entity(UserOrderModel tUserOrderModel) {
		UserOrderEntity tEntity = new UserOrderEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setCoursePicture(tUserOrderModel.getCoursePicture());
		tEntity.setLocalhostPicture(tUserOrderModel.getLocalhostPicture());

		tEntity.setLangId(tUserOrderModel.getLangId());
		tEntity.setOrderIdentiNo(getOrderIdentiNo());
		tEntity.setCourseIdentiNo(tUserOrderModel.getCourseIdentiNo());
		tEntity.setLocalhostIdentiNo(tUserOrderModel.getLocalhostIdentiNo());
		tEntity.setTouristIdentiNo(tUserOrderModel.getTouristIdentiNo());
		tEntity.setReservationDate(tUserOrderModel.getReservationDate());
		tEntity.setScheduleOptionIdentiNo(tUserOrderModel.getScheduleOptionIdentiNo());
		tEntity.setBgnTime(tUserOrderModel.getBgnTime());
		tEntity.setStatus(tUserOrderModel.getStatus());
		tEntity.setConsent(tUserOrderModel.getConsent());
		tEntity.setCancelDate(tUserOrderModel.getCancelDate());
		tEntity.setOrderDate(tUserOrderModel.getOrderDate());
		tEntity.setMoneyUnit(tUserOrderModel.getMoneyUnit());
		tEntity.setCommentIdentiNo(tUserOrderModel.getCommentIdentiNo());

		if (KooUtil.isNotInt(tUserOrderModel.getTouristNum())) {
			tEntity.setTouristNum(null);
		} else {
			tEntity.setTouristNum(Integer.parseInt(tUserOrderModel.getTouristNum()));
		}
		tEntity.setInfantFree(tUserOrderModel.getInfantFree());

		if (KooUtil.isNotDouble(tUserOrderModel.getPrice())) {
			tEntity.setPrice(null);
		} else {
			tEntity.setPrice(Double.parseDouble(tUserOrderModel.getPrice()));
		}
		if (KooUtil.isNotDouble(tUserOrderModel.getDiscountPrice())) {
			tEntity.setDiscountPrice(null);
		} else {
			tEntity.setDiscountPrice(Double.parseDouble(tUserOrderModel.getDiscountPrice()));
		}
		tEntity.setPersonOrGroup(tUserOrderModel.getPersonOrGroup());
		tEntity.setUnitName(tUserOrderModel.getUnitName());
		if (KooUtil.isNotDouble(tUserOrderModel.getDuration())) {
			tEntity.setDuration(null);
		} else {
			tEntity.setDuration(Double.parseDouble(tUserOrderModel.getDuration()));
		}
		tEntity.setDurationUnit(tUserOrderModel.getDurationUnit());
		if (KooUtil.isNotDouble(tUserOrderModel.getTotalMoney())) {
			tEntity.setTotalMoney(null);
		} else {
			tEntity.setTotalMoney(Double.parseDouble(tUserOrderModel.getTotalMoney()));
		}
		if (KooUtil.isNotDouble(tUserOrderModel.getTips())) {
			tEntity.setTips(null);
		} else {
			tEntity.setTips(Double.parseDouble(tUserOrderModel.getTips()));
		}
		tEntity.setTouristFullName(tUserOrderModel.getTouristFullName());
		tEntity.setLocalhostFullName(tUserOrderModel.getLocalhostFullName());
		tEntity.setCourseFullName(tUserOrderModel.getCourseFullName());
		if (KooUtil.isNotDouble(tUserOrderModel.getScore())) {
			tEntity.setScore(null);
		} else {
			tEntity.setScore(Double.parseDouble(tUserOrderModel.getScore()));
		}
		tEntity.setComment(tUserOrderModel.getComment());
		List<String> tmpStringEntityList1 = new ArrayList<String>();
		for (String tmpVal : tUserOrderModel.getScoreIconListDisp()) {
			tmpStringEntityList1.add(tmpVal);
		}
		tEntity.setScoreIconListDisp(tmpStringEntityList1);
		// List<PulldownValueBeanEntity> tmpPulldownValueBeanEntityList2 = new
		// ArrayList<PulldownValueBeanEntity>();
		// for (PulldownValueBeanEntityAction tmpVal : tUserOrderModel.getTimetableListDisp()){
		// PulldownValueBeanEntity tmpPulldownValueBean = new
		// PulldownValueBeanEntity();
		// PulldownValueBeanAction tmpAction= (PulldownValueBeanAction)tmpVal;
		// tmpPulldownValueBean=tmpAction.copyEntityAction2Entity();
		// tmpPulldownValueBeanEntityList2.add(tmpPulldownValueBean);
		// }
		// tEntity.setTimetableListDisp(tmpPulldownValueBeanEntityList2);

		List<UserOrderExtraOptionEntity> tmpUserOrderExtraOptionEntityList = new ArrayList<>();
		for (UserOrderExtraOptionModel tmpVal : tUserOrderModel.getUserOrderExtraOptionModelList()) {
			UserOrderExtraOptionEntity tmpUserOrderExtraOptionEntity = new UserOrderExtraOptionEntity();
			UserOrderExtraOptionAction tmpUserOrderExtraOptionAction = new UserOrderExtraOptionAction();
			tmpUserOrderExtraOptionAction = (UserOrderExtraOptionAction) tmpVal;
			tmpUserOrderExtraOptionEntity = tmpUserOrderExtraOptionAction.copyEntityAction2Entity(tmpVal);
			tmpUserOrderExtraOptionEntityList.add(tmpUserOrderExtraOptionEntity);
		}
		tEntity.setUserOrderExtraOptionEntityList(tmpUserOrderExtraOptionEntityList);

		tEntity.setLocation(tUserOrderModel.getLocation());

		if (KooUtil.isNotDouble(tUserOrderModel.getTaxVal())) {
			tEntity.setTaxVal(null);
		} else {
			tEntity.setTaxVal(Double.parseDouble(tUserOrderModel.getTaxVal()));
		}

		if (KooUtil.isNotDouble(tUserOrderModel.getDiscountMoney())) {
			tEntity.setDiscountMoney(null);
		} else {
			tEntity.setDiscountMoney(Double.parseDouble(tUserOrderModel.getDiscountMoney()));
		}

		if (KooUtil.isNotDouble(tUserOrderModel.getPaidMoney())) {
			tEntity.setPaidMoney(null);
		} else {
			tEntity.setPaidMoney(Double.parseDouble(tUserOrderModel.getPaidMoney()));
		}

		if (KooUtil.isNotDate(tUserOrderModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tUserOrderModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tUserOrderModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tUserOrderModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
