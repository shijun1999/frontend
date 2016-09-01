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

import com.kootour.mapper.paramentity.CourseParamEntity;
import com.kootour.model.CourseModel;
import com.kootour.model.CourseInExclusionModel;
import com.kootour.model.CoursePictureModel;
import com.kootour.model.ScheduleOptionModel;
import com.kootour.service.CourseService;
import com.kootour.service.impl.CourseServiceImpl;
import com.kootour.checker.SingleCourseChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;

public class CourseAction extends CourseModel {

	@Autowired(required = false)
	private CourseService courseService = new CourseServiceImpl();
	public void copyEntity2EntityAction(CourseEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);

		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(tEntity.getCourseIdentiNo());
		}
		if (tEntity.getCourseCode() == null) {
			setCourseCode("");
		} else {
			setCourseCode(tEntity.getCourseCode());
		}
		if (tEntity.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(tEntity.getLocalhostIdentiNo());
		}
		if (tEntity.getCourseType() == null) {
			setCourseType("");
		} else {
			setCourseType(tEntity.getCourseType());
		}
		if (tEntity.getFullName() == null) {
			setFullName("");
		} else {
			setFullName(tEntity.getFullName());
		}
		if (tEntity.getShortName() == null) {
			setShortName("");
		} else {
			setShortName(tEntity.getShortName());
		}
		if (tEntity.getIndexChar() == null) {
			setIndexChar("");
		} else {
			setIndexChar(tEntity.getIndexChar());
		}
		if (tEntity.getLocationKey() == null) {
			setLocationKey("");
		} else {
			setLocationKey(tEntity.getLocationKey());
		}
		if (tEntity.getSearchWord() == null) {
			setSearchWord("");
		} else {
			setSearchWord(tEntity.getSearchWord());
		}
		if (tEntity.getCourseContent() == null) {
			setCourseContent("");
		} else {
			setCourseContent(tEntity.getCourseContent());
		}
		if (tEntity.getAdditionalInfo() == null) {
			setAdditionalInfo("");
		} else {
			setAdditionalInfo(tEntity.getAdditionalInfo());
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
		if (tEntity.getTourLocation() == null) {
			setTourLocation("");
		} else {
			setTourLocation(tEntity.getTourLocation());
		}
		if (tEntity.getMeetupLocation() == null) {
			setMeetupLocation("");
		} else {
			setMeetupLocation(tEntity.getMeetupLocation());
		}
		if (tEntity.getMaxTouristNum() == null) {
			setMaxTouristNum("");
		} else {
			setMaxTouristNum(String.valueOf(tEntity.getMaxTouristNum()));
		}
		if (tEntity.getMinTouristNum() == null) {
			setMinTouristNum("");
		} else {
			setMinTouristNum(String.valueOf(tEntity.getMinTouristNum()));
		}
		if (tEntity.getMoneyUnit() == null) {
			setMoneyUnit("");
		} else {
			setMoneyUnit(tEntity.getMoneyUnit());
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
		if (tEntity.getUnitName() == null) {
			setUnitName("");
		} else {
			setUnitName(tEntity.getUnitName());
		}
		if (tEntity.getInfantFree() == null) {
			setInfantFree("");
		} else {
			setInfantFree(tEntity.getInfantFree());
		}
		if (tEntity.getOldPersonPrice() == null) {
			setOldPersonPrice("");
		} else {
			setOldPersonPrice(String.valueOf(tEntity.getOldPersonPrice()));
		}
		if (tEntity.getAdultPrice() == null) {
			setAdultPrice("");
		} else {
			setAdultPrice(String.valueOf(tEntity.getAdultPrice()));
		}
		if (tEntity.getChildPrice() == null) {
			setChildPrice("");
		} else {
			setChildPrice(String.valueOf(tEntity.getChildPrice()));
		}
		if (tEntity.getInfantPrice() == null) {
			setInfantPrice("");
		} else {
			setInfantPrice(String.valueOf(tEntity.getInfantPrice()));
		}
		if (tEntity.getWorkDay() == null) {
			setWorkDay("");
		} else {
			setWorkDay(tEntity.getWorkDay());
		}
		if (tEntity.getPersonOrGroup() == null) {
			setPersonOrGroup("");
		} else {
			setPersonOrGroup(tEntity.getPersonOrGroup());
		}
		if (tEntity.getMinHourAdvance() == null) {
			setMinHourAdvance("");
		} else {
			setMinHourAdvance(String.valueOf(tEntity.getMinHourAdvance()));
		}
		if (tEntity.getTimetable1() == null) {
			setTimetable1("");
		} else {
			setTimetable1(tEntity.getTimetable1());
		}
		if (tEntity.getTimetable2() == null) {
			setTimetable2("");
		} else {
			setTimetable2(tEntity.getTimetable2());
		}
		if (tEntity.getTimetable3() == null) {
			setTimetable3("");
		} else {
			setTimetable3(tEntity.getTimetable3());
		}
		if (tEntity.getTimetable4() == null) {
			setTimetable4("");
		} else {
			setTimetable4(tEntity.getTimetable4());
		}
		if (tEntity.getTimetable5() == null) {
			setTimetable5("");
		} else {
			setTimetable5(tEntity.getTimetable5());
		}
		if (tEntity.getTimeInDay() == null) {
			setTimeInDay("");
		} else {
			setTimeInDay(String.valueOf(tEntity.getTimeInDay()));
		}
		if (tEntity.getAdventure() == null) {
			setAdventure("");
		} else {
			setAdventure(tEntity.getAdventure());
		}
		if (tEntity.getCultureArts() == null) {
			setCultureArts("");
		} else {
			setCultureArts(tEntity.getCultureArts());
		}
		if (tEntity.getFestivalEvents() == null) {
			setFestivalEvents("");
		} else {
			setFestivalEvents(tEntity.getFestivalEvents());
		}
		if (tEntity.getFoodDrink() == null) {
			setFoodDrink("");
		} else {
			setFoodDrink(tEntity.getFoodDrink());
		}
		if (tEntity.getHistorical() == null) {
			setHistorical("");
		} else {
			setHistorical(tEntity.getHistorical());
		}
		if (tEntity.getLeisureSports() == null) {
			setLeisureSports("");
		} else {
			setLeisureSports(tEntity.getLeisureSports());
		}
		if (tEntity.getNatureRural() == null) {
			setNatureRural("");
		} else {
			setNatureRural(tEntity.getNatureRural());
		}
		if (tEntity.getNightlifeParty() == null) {
			setNightlifeParty("");
		} else {
			setNightlifeParty(tEntity.getNightlifeParty());
		}
		if (tEntity.getShoppingMarket() == null) {
			setShoppingMarket("");
		} else {
			setShoppingMarket(tEntity.getShoppingMarket());
		}
		if (tEntity.getOtherType1() == null) {
			setOtherType1("");
		} else {
			setOtherType1(tEntity.getOtherType1());
		}
		if (tEntity.getOtherType2() == null) {
			setOtherType2("");
		} else {
			setOtherType2(tEntity.getOtherType2());
		}
		if (tEntity.getOtherType3() == null) {
			setOtherType3("");
		} else {
			setOtherType3(tEntity.getOtherType3());
		}
		if (tEntity.getOkFlg() == null) {
			setOkFlg("");
		} else {
			setOkFlg(tEntity.getOkFlg());
		}
		if (tEntity.getUseLangId() == null) {
			setUseLangId("");
		} else {
			setUseLangId(tEntity.getUseLangId());
		}
		if (tEntity.getUseLangId1Disp() == null) {
			setUseLangId1Disp("");
		} else {
			setUseLangId1Disp(tEntity.getUseLangId1Disp());
		}
		if (tEntity.getUseLangId2Disp() == null) {
			setUseLangId2Disp("");
		} else {
			setUseLangId2Disp(tEntity.getUseLangId2Disp());
		}
		if (tEntity.getUseLangId3Disp() == null) {
			setUseLangId3Disp("");
		} else {
			setUseLangId3Disp(tEntity.getUseLangId3Disp());
		}
		if (tEntity.getFavoriteIdentiNo() == null) {
			setFavoriteIdentiNo("");
		} else {
			setFavoriteIdentiNo(tEntity.getFavoriteIdentiNo());
		}
		
		List<CoursePictureModel> tmpCoursePictureActionList1 = new ArrayList<CoursePictureModel>();
		for (CoursePictureEntity tmpVal : tEntity.getCoursePictureListDisp()) {
			CoursePictureAction tmpCoursePictureListDisp = new CoursePictureAction();
			tmpCoursePictureListDisp.copyEntity2EntityAction(tmpVal);
			tmpCoursePictureActionList1.add(tmpCoursePictureListDisp);
		}
		setCoursePictureListDisp(tmpCoursePictureActionList1);
		List<String> tmpStringActionList2 = new ArrayList<String>();
		for (String tmpVal : tEntity.getScoreIconListDisp()) {
			tmpStringActionList2.add(tmpVal);
		}
		setScoreIconListDisp(tmpStringActionList2);
		if (tEntity.getScoreDisp() == null) {
			setScoreDisp("");
		} else {
			setScoreDisp(String.valueOf(tEntity.getScoreDisp()));
		}
		if (tEntity.getReviewNumDisp() == null) {
			setReviewNumDisp("");
		} else {
			setReviewNumDisp(String.valueOf(tEntity.getReviewNumDisp()));
		}
		if (tEntity.getLocalhostPictureDisp() == null) {
			setLocalhostPictureDisp("");
		} else {
			setLocalhostPictureDisp(tEntity.getLocalhostPictureDisp());
		}
		
		if (tEntity.getLocalhostNameDisp() == null) {
			setLocalhostNameDisp("");
		} else {
			setLocalhostNameDisp(tEntity.getLocalhostNameDisp());
		}

		if (tEntity.getWorkDatesDisp() == null) {
			setWorkDatesDisp("");
		} else {
			setWorkDatesDisp(tEntity.getWorkDatesDisp());
		}
		List<CourseInExclusionModel> tmpCourseInExclusionActionList3 = new ArrayList<CourseInExclusionModel>();
		for (CourseInExclusionEntity tmpVal : tEntity.getInclusionListDisp()) {
			CourseInExclusionAction tmpInclusionListDisp = new CourseInExclusionAction();
			tmpInclusionListDisp.copyEntity2EntityAction(tmpVal);
			tmpCourseInExclusionActionList3.add(tmpInclusionListDisp);
		}
		setInclusionListDisp(tmpCourseInExclusionActionList3);
		List<CourseInExclusionModel> tmpCourseInExclusionActionList4 = new ArrayList<CourseInExclusionModel>();
		for (CourseInExclusionEntity tmpVal : tEntity.getExclusionListDisp()) {
			CourseInExclusionAction tmpExclusionListDisp = new CourseInExclusionAction();
			tmpExclusionListDisp.copyEntity2EntityAction(tmpVal);
			tmpCourseInExclusionActionList4.add(tmpExclusionListDisp);
		}
		setExclusionListDisp(tmpCourseInExclusionActionList4);
		List<ScheduleOptionModel> tmpScheduleOptionActionList5 = new ArrayList<ScheduleOptionModel>();
		for (ScheduleOptionEntity tmpVal : tEntity.getScheduleOptionList()) {
			ScheduleOptionAction tmpScheduleOptionList = new ScheduleOptionAction();
			tmpScheduleOptionList.copyEntity2EntityAction(tmpVal);
			tmpScheduleOptionActionList5.add(tmpScheduleOptionList);
		}
		setScheduleOptionList(tmpScheduleOptionActionList5);
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
	public CourseEntity copyEntityAction2Entity(CourseModel tCourseModel) {
		CourseEntity tEntity = new CourseEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tCourseModel.getLangId());
		tEntity.setCourseIdentiNo(tCourseModel.getCourseIdentiNo());
		tEntity.setCourseCode(tCourseModel.getCourseCode());
		tEntity.setLocalhostIdentiNo(tCourseModel.getLocalhostIdentiNo());
		tEntity.setCourseType(tCourseModel.getCourseType());
		tEntity.setFullName(tCourseModel.getFullName());
		tEntity.setShortName(tCourseModel.getShortName());
		tEntity.setIndexChar(tCourseModel.getIndexChar());
		tEntity.setLocationKey(tCourseModel.getLocationKey());
		tEntity.setSearchWord(tCourseModel.getSearchWord());
		tEntity.setCourseContent(tCourseModel.getCourseContent());
		tEntity.setAdditionalInfo(tCourseModel.getAdditionalInfo());
		if (KooUtil.isNotDouble(tCourseModel.getDuration())) {
			tEntity.setDuration(null);
		} else {
			tEntity.setDuration(Double.parseDouble(getDuration()));
		}
		tEntity.setDurationUnit(getDurationUnit());
		tEntity.setTourLocation(getTourLocation());
		tEntity.setMeetupLocation(getMeetupLocation());
		if (KooUtil.isNotInt(getMaxTouristNum())) {
			tEntity.setMaxTouristNum(null);
		} else {
			tEntity.setMaxTouristNum(Integer.parseInt(getMaxTouristNum()));
		}
		if (KooUtil.isNotInt(getMinTouristNum())) {
			tEntity.setMinTouristNum(null);
		} else {
			tEntity.setMinTouristNum(Integer.parseInt(getMinTouristNum()));
		}
		tEntity.setMoneyUnit(getMoneyUnit());
		if (KooUtil.isNotDouble(getPrice())) {
			tEntity.setPrice(null);
		} else {
			tEntity.setPrice(Double.parseDouble(getPrice()));
		}
		if (KooUtil.isNotDouble(getDiscountPrice())) {
			tEntity.setDiscountPrice(null);
		} else {
			tEntity.setDiscountPrice(Double.parseDouble(getDiscountPrice()));
		}
		tEntity.setUnitName(getUnitName());
		tEntity.setInfantFree(getInfantFree());
		if (KooUtil.isNotDouble(getOldPersonPrice())) {
			tEntity.setOldPersonPrice(null);
		} else {
			tEntity.setOldPersonPrice(Double.parseDouble(getOldPersonPrice()));
		}
		if (KooUtil.isNotDouble(getAdultPrice())) {
			tEntity.setAdultPrice(null);
		} else {
			tEntity.setAdultPrice(Double.parseDouble(getAdultPrice()));
		}
		if (KooUtil.isNotDouble(getChildPrice())) {
			tEntity.setChildPrice(null);
		} else {
			tEntity.setChildPrice(Double.parseDouble(getChildPrice()));
		}
		if (KooUtil.isNotDouble(getInfantPrice())) {
			tEntity.setInfantPrice(null);
		} else {
			tEntity.setInfantPrice(Double.parseDouble(getInfantPrice()));
		}
		tEntity.setWorkDay(getWorkDay());
		tEntity.setPersonOrGroup(getPersonOrGroup());
		if (KooUtil.isNotInt(getMinHourAdvance())) {
			tEntity.setMinHourAdvance(null);
		} else {
			tEntity.setMinHourAdvance(Integer.parseInt(getMinHourAdvance()));
		}
		tEntity.setTimetable1(getTimetable1());
		tEntity.setTimetable2(getTimetable2());
		tEntity.setTimetable3(getTimetable3());
		tEntity.setTimetable4(getTimetable4());
		tEntity.setTimetable5(getTimetable5());
		if (KooUtil.isNotInt(getTimeInDay())) {
			tEntity.setTimeInDay(null);
		} else {
			tEntity.setTimeInDay(Integer.parseInt(getTimeInDay()));
		}
		tEntity.setAdventure(getAdventure());
		tEntity.setCultureArts(getCultureArts());
		tEntity.setFestivalEvents(getFestivalEvents());
		tEntity.setFoodDrink(getFoodDrink());
		tEntity.setHistorical(getHistorical());
		tEntity.setLeisureSports(getLeisureSports());
		tEntity.setNatureRural(getNatureRural());
		tEntity.setNightlifeParty(getNightlifeParty());
		tEntity.setShoppingMarket(getShoppingMarket());
		tEntity.setOtherType1(getOtherType1());
		tEntity.setOtherType2(getOtherType2());
		tEntity.setOtherType3(getOtherType3());
		tEntity.setOkFlg(getOkFlg());
		tEntity.setUseLangId(getUseLangId());
		tEntity.setUseLangId1Disp(getUseLangId1Disp());
		tEntity.setUseLangId2Disp(getUseLangId2Disp());
		tEntity.setUseLangId3Disp(getUseLangId3Disp());
		tEntity.setFavoriteIdentiNo(getFavoriteIdentiNo());		
		List<CoursePictureEntity> tmpCoursePictureEntityList1 = new ArrayList<CoursePictureEntity>();
		for (CoursePictureModel tmpVal : getCoursePictureListDisp()) {
			CoursePictureEntity tmpCoursePicture = new CoursePictureEntity();
			CoursePictureAction tmpAction = (CoursePictureAction) tmpVal;
			tmpCoursePicture = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCoursePictureEntityList1.add(tmpCoursePicture);
		}
		tEntity.setCoursePictureListDisp(tmpCoursePictureEntityList1);
		List<String> tmpStringEntityList2 = new ArrayList<String>();
		for (String tmpVal : getScoreIconListDisp()) {
			tmpStringEntityList2.add(tmpVal);
		}
		tEntity.setScoreIconListDisp(tmpStringEntityList2);
		if (KooUtil.isNotDouble(getScoreDisp())) {
			tEntity.setScoreDisp(null);
		} else {
			tEntity.setScoreDisp(Double.parseDouble(getScoreDisp()));
		}
		if (KooUtil.isNotInt(getReviewNumDisp())) {
			tEntity.setReviewNumDisp(null);
		} else {
			tEntity.setReviewNumDisp(Integer.parseInt(getReviewNumDisp()));
		}
		tEntity.setLocalhostPictureDisp(getLocalhostPictureDisp());
		tEntity.setLocalhostNameDisp(getLocalhostNameDisp());
		tEntity.setWorkDatesDisp(getWorkDatesDisp());
		List<CourseInExclusionEntity> tmpCourseInExclusionEntityList3 = new ArrayList<CourseInExclusionEntity>();
		for (CourseInExclusionModel tmpVal : getInclusionListDisp()) {
			CourseInExclusionEntity tmpCourseInExclusion = new CourseInExclusionEntity();
			CourseInExclusionAction tmpAction = (CourseInExclusionAction) tmpVal;
			tmpCourseInExclusion = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseInExclusionEntityList3.add(tmpCourseInExclusion);
		}
		tEntity.setInclusionListDisp(tmpCourseInExclusionEntityList3);
		List<CourseInExclusionEntity> tmpCourseInExclusionEntityList4 = new ArrayList<CourseInExclusionEntity>();
		for (CourseInExclusionModel tmpVal : getExclusionListDisp()) {
			CourseInExclusionEntity tmpCourseInExclusion = new CourseInExclusionEntity();
			CourseInExclusionAction tmpAction = (CourseInExclusionAction) tmpVal;
			tmpCourseInExclusion = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseInExclusionEntityList4.add(tmpCourseInExclusion);
		}
		tEntity.setExclusionListDisp(tmpCourseInExclusionEntityList4);
		List<ScheduleOptionEntity> tmpScheduleOptionEntityList5 = new ArrayList<ScheduleOptionEntity>();
		for (ScheduleOptionModel tmpVal : getScheduleOptionList()) {
			ScheduleOptionEntity tmpScheduleOption = new ScheduleOptionEntity();
			ScheduleOptionAction tmpAction = (ScheduleOptionAction) tmpVal;
			tmpScheduleOption = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpScheduleOptionEntityList5.add(tmpScheduleOption);
		}
		tEntity.setScheduleOptionList(tmpScheduleOptionEntityList5);
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
