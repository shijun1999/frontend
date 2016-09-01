//Auto Generated 

package com.kootour.model;

import java.util.List;

import com.kootour.action.BaseAction;

import java.util.ArrayList;

public class StateCourseListModel extends BaseAction {
    private String city;
    private String langSelect;
    private String state;
    private String searchDate;
      private List<String> cityList= new ArrayList<String>();
      private List<CourseModel> courseList= new ArrayList<CourseModel>();
      private List<LocationMstModel> locationMstList= new ArrayList<LocationMstModel>();
    private String createTime;
    private String modifyTime;
public String  getCity(){
return city;
 }
public void setCity(  String  city) {
this.city = city;
 }
public String  getLangSelect(){
return langSelect;
 }
public void setLangSelect(  String  langSelect) {
this.langSelect = langSelect;
 }
public String  getState(){
return state;
 }
public void setState(  String  state) {
this.state = state;
 }
public String  getSearchDate(){
return searchDate;
 }
public void setSearchDate(  String  searchDate) {
this.searchDate = searchDate;
 }
	public List<String> getCityList() {
return cityList;
}
public void setCityList(List<String> cityList) {
this.cityList = cityList;
}
	public List<CourseModel> getCourseList() {
return courseList;
}
public void setCourseList(List<CourseModel> courseList) {
this.courseList = courseList;
}
	public List<LocationMstModel> getLocationMstList() {
return locationMstList;
}
public void setLocationMstList(List<LocationMstModel> locationMstList) {
this.locationMstList = locationMstList;
}
public String  getCreateTime(){
return createTime;
 }
public void setCreateTime(  String  createTime) {
this.createTime = createTime;
 }
public String  getModifyTime(){
return modifyTime;
 }
public void setModifyTime(  String  modifyTime) {
this.modifyTime = modifyTime;
 }
}
