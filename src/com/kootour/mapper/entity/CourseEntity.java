//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;

public class CourseEntity extends BaseEntity {
	private String langId;
	private String courseIdentiNo;
	private String courseCode;
	private String localhostIdentiNo;
	private String courseType;
	private String fullName;
	private String shortName;
	private String indexChar;
	private String locationKey;
	private String searchWord;
	private String courseContent;
	private String additionalInfo;
	private Double duration;
	private String durationUnit;
	private String tourLocation;
	private String meetupLocation;
	private Integer maxTouristNum;
	private Integer minTouristNum;
	private String moneyUnit;
	private Double price;
	private Double discountPrice;
	private String unitName;
	private String infantFree;
	private Double oldPersonPrice;
	private Double adultPrice;
	private Double childPrice;
	private Double infantPrice;
	private String workDay;
	private String personOrGroup;
	private Integer minHourAdvance;
	private String timetable1;
	private String timetable2;
	private String timetable3;
	private String timetable4;
	private String timetable5;
	private Integer timeInDay;
	private String adventure;
	private String cultureArts;
	private String festivalEvents;
	private String foodDrink;
	private String historical;
	private String leisureSports;
	private String natureRural;
	private String nightlifeParty;
	private String shoppingMarket;
	private String otherType1;
	private String otherType2;
	private String otherType3;
	private String okFlg;
	private String useLangId;
	private String useLangId1Disp;
	private String useLangId2Disp;
	private String useLangId3Disp;
	private List<CoursePictureEntity> coursePictureListDisp = new ArrayList<CoursePictureEntity>();
	private List<String> scoreIconListDisp = new ArrayList<String>();
	private Double scoreDisp;
	private Integer reviewNumDisp;
	private String localhostPictureDisp;
	private String localhostNameDisp;
	private String workDatesDisp;
	private List<CourseInExclusionEntity> inclusionListDisp = new ArrayList<CourseInExclusionEntity>();
	private List<CourseInExclusionEntity> exclusionListDisp = new ArrayList<CourseInExclusionEntity>();
	private List<ScheduleOptionEntity> scheduleOptionList = new ArrayList<ScheduleOptionEntity>();
	private String favoriteIdentiNo;
	private Date createTime;
	private Date modifyTime;
	private String delFlg;

	public String getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	public String getLangId() {
		return langId;
	}

	public void setLangId(String langId) {
		this.langId = langId;
	}

	public String getCourseIdentiNo() {
		return courseIdentiNo;
	}

	public void setCourseIdentiNo(String courseIdentiNo) {
		this.courseIdentiNo = courseIdentiNo;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getLocalhostIdentiNo() {
		return localhostIdentiNo;
	}

	public void setLocalhostIdentiNo(String localhostIdentiNo) {
		this.localhostIdentiNo = localhostIdentiNo;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getIndexChar() {
		return indexChar;
	}

	public void setIndexChar(String indexChar) {
		this.indexChar = indexChar;
	}

	public String getLocationKey() {
		return locationKey;
	}

	public void setLocationKey(String locationKey) {
		this.locationKey = locationKey;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}

	public String getTourLocation() {
		return tourLocation;
	}

	public void setTourLocation(String tourLocation) {
		this.tourLocation = tourLocation;
	}

	public String getMeetupLocation() {
		return meetupLocation;
	}

	public void setMeetupLocation(String meetupLocation) {
		this.meetupLocation = meetupLocation;
	}

	public Integer getMaxTouristNum() {
		return maxTouristNum;
	}

	public void setMaxTouristNum(Integer maxTouristNum) {
		this.maxTouristNum = maxTouristNum;
	}

	public Integer getMinTouristNum() {
		return minTouristNum;
	}

	public void setMinTouristNum(Integer minTouristNum) {
		this.minTouristNum = minTouristNum;
	}

	public String getMoneyUnit() {
		return moneyUnit;
	}

	public void setMoneyUnit(String moneyUnit) {
		this.moneyUnit = moneyUnit;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getInfantFree() {
		return infantFree;
	}

	public void setInfantFree(String infantFree) {
		this.infantFree = infantFree;
	}

	public Double getOldPersonPrice() {
		return oldPersonPrice;
	}

	public void setOldPersonPrice(Double oldPersonPrice) {
		this.oldPersonPrice = oldPersonPrice;
	}

	public Double getAdultPrice() {
		return adultPrice;
	}

	public void setAdultPrice(Double adultPrice) {
		this.adultPrice = adultPrice;
	}

	public Double getChildPrice() {
		return childPrice;
	}

	public void setChildPrice(Double childPrice) {
		this.childPrice = childPrice;
	}

	public Double getInfantPrice() {
		return infantPrice;
	}

	public void setInfantPrice(Double infantPrice) {
		this.infantPrice = infantPrice;
	}

	public String getWorkDay() {
		return workDay;
	}

	public void setWorkDay(String workDay) {
		this.workDay = workDay;
	}

	public String getPersonOrGroup() {
		return personOrGroup;
	}

	public void setPersonOrGroup(String personOrGroup) {
		this.personOrGroup = personOrGroup;
	}

	public Integer getMinHourAdvance() {
		return minHourAdvance;
	}

	public void setMinHourAdvance(Integer minHourAdvance) {
		this.minHourAdvance = minHourAdvance;
	}

	public String getTimetable1() {
		return timetable1;
	}

	public void setTimetable1(String timetable1) {
		this.timetable1 = timetable1;
	}

	public String getTimetable2() {
		return timetable2;
	}

	public void setTimetable2(String timetable2) {
		this.timetable2 = timetable2;
	}

	public String getTimetable3() {
		return timetable3;
	}

	public void setTimetable3(String timetable3) {
		this.timetable3 = timetable3;
	}

	public String getTimetable4() {
		return timetable4;
	}

	public void setTimetable4(String timetable4) {
		this.timetable4 = timetable4;
	}

	public String getTimetable5() {
		return timetable5;
	}

	public void setTimetable5(String timetable5) {
		this.timetable5 = timetable5;
	}

	public Integer getTimeInDay() {
		return timeInDay;
	}

	public void setTimeInDay(Integer timeInDay) {
		this.timeInDay = timeInDay;
	}

	public String getAdventure() {
		return adventure;
	}

	public void setAdventure(String adventure) {
		this.adventure = adventure;
	}

	public String getCultureArts() {
		return cultureArts;
	}

	public void setCultureArts(String cultureArts) {
		this.cultureArts = cultureArts;
	}

	public String getFestivalEvents() {
		return festivalEvents;
	}

	public void setFestivalEvents(String festivalEvents) {
		this.festivalEvents = festivalEvents;
	}

	public String getFoodDrink() {
		return foodDrink;
	}

	public void setFoodDrink(String foodDrink) {
		this.foodDrink = foodDrink;
	}

	public String getHistorical() {
		return historical;
	}

	public void setHistorical(String historical) {
		this.historical = historical;
	}

	public String getLeisureSports() {
		return leisureSports;
	}

	public void setLeisureSports(String leisureSports) {
		this.leisureSports = leisureSports;
	}

	public String getNatureRural() {
		return natureRural;
	}

	public void setNatureRural(String natureRural) {
		this.natureRural = natureRural;
	}

	public String getNightlifeParty() {
		return nightlifeParty;
	}

	public void setNightlifeParty(String nightlifeParty) {
		this.nightlifeParty = nightlifeParty;
	}

	public String getShoppingMarket() {
		return shoppingMarket;
	}

	public void setShoppingMarket(String shoppingMarket) {
		this.shoppingMarket = shoppingMarket;
	}

	public String getOtherType1() {
		return otherType1;
	}

	public void setOtherType1(String otherType1) {
		this.otherType1 = otherType1;
	}

	public String getOtherType2() {
		return otherType2;
	}

	public void setOtherType2(String otherType2) {
		this.otherType2 = otherType2;
	}

	public String getOtherType3() {
		return otherType3;
	}

	public void setOtherType3(String otherType3) {
		this.otherType3 = otherType3;
	}

	public String getOkFlg() {
		return okFlg;
	}

	public void setOkFlg(String okFlg) {
		this.okFlg = okFlg;
	}

	public String getUseLangId() {
		return useLangId;
	}

	public void setUseLangId(String useLangId) {
		this.useLangId = useLangId;
	}

	public String getUseLangId1Disp() {
		return useLangId1Disp;
	}

	public void setUseLangId1Disp(String useLangId1Disp) {
		this.useLangId1Disp = useLangId1Disp;
	}

	public String getUseLangId2Disp() {
		return useLangId2Disp;
	}

	public void setUseLangId2Disp(String useLangId2Disp) {
		this.useLangId2Disp = useLangId2Disp;
	}

	public String getUseLangId3Disp() {
		return useLangId3Disp;
	}

	public void setUseLangId3Disp(String useLangId3Disp) {
		this.useLangId3Disp = useLangId3Disp;
	}

	public List<CoursePictureEntity> getCoursePictureListDisp() {
		return coursePictureListDisp;
	}

	public void setCoursePictureListDisp(List<CoursePictureEntity> coursePictureListDisp) {
		this.coursePictureListDisp = coursePictureListDisp;
	}

	public List<String> getScoreIconListDisp() {
		return scoreIconListDisp;
	}

	public void setScoreIconListDisp(List<String> scoreIconListDisp) {
		this.scoreIconListDisp = scoreIconListDisp;
	}

	public Double getScoreDisp() {
		return scoreDisp;
	}

	public void setScoreDisp(Double scoreDisp) {
		this.scoreDisp = scoreDisp;
	}

	public Integer getReviewNumDisp() {
		return reviewNumDisp;
	}

	public void setReviewNumDisp(Integer reviewNumDisp) {
		this.reviewNumDisp = reviewNumDisp;
	}

	public String getLocalhostPictureDisp() {
		return localhostPictureDisp;
	}

	public void setLocalhostPictureDisp(String localhostPictureDisp) {
		this.localhostPictureDisp = localhostPictureDisp;
	}

	public String getWorkDatesDisp() {
		return workDatesDisp;
	}

	public void setWorkDatesDisp(String workDatesDisp) {
		this.workDatesDisp = workDatesDisp;
	}

	public List<CourseInExclusionEntity> getInclusionListDisp() {
		return inclusionListDisp;
	}

	public void setInclusionListDisp(List<CourseInExclusionEntity> inclusionListDisp) {
		this.inclusionListDisp = inclusionListDisp;
	}

	public List<CourseInExclusionEntity> getExclusionListDisp() {
		return exclusionListDisp;
	}

	public void setExclusionListDisp(List<CourseInExclusionEntity> exclusionListDisp) {
		this.exclusionListDisp = exclusionListDisp;
	}

	public List<ScheduleOptionEntity> getScheduleOptionList() {
		return scheduleOptionList;
	}

	public void setScheduleOptionList(List<ScheduleOptionEntity> scheduleOptionList) {
		this.scheduleOptionList = scheduleOptionList;
	}

	public String getFavoriteIdentiNo() {
		return favoriteIdentiNo;
	}

	public void setFavoriteIdentiNo(String favoriteIdentiNo) {
		this.favoriteIdentiNo = favoriteIdentiNo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getLocalhostNameDisp() {
		return localhostNameDisp;
	}

	public void setLocalhostNameDisp(String localhostNameDisp) {
		this.localhostNameDisp = localhostNameDisp;
	}

}
