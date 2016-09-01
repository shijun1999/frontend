//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.LocationMstEntity;

  public class StateCourseListEntity  extends BaseEntity{ 
      private String langId;
      private String city;
      private String langSelect;
      private String state;
      private String searchDate;
       private List<String> cityList = new ArrayList<String>();
       private List<CourseEntity> courseList = new ArrayList<CourseEntity>();
       private List<LocationMstEntity> locationMstList = new ArrayList<LocationMstEntity>();
      private Date createTime;
      private Date modifyTime;
 public String getLangId(){
 return langId;
  }
 public void setLangId(  String langId) {
 this.langId = langId;
  }
 public String getCity(){
 return city;
  }
 public void setCity(  String city) {
 this.city = city;
  }
 public String getLangSelect(){
 return langSelect;
  }
 public void setLangSelect(  String langSelect) {
 this.langSelect = langSelect;
  }
 public String getState(){
 return state;
  }
 public void setState(  String state) {
 this.state = state;
  }
 public String getSearchDate(){
 return searchDate;
  }
 public void setSearchDate(  String searchDate) {
 this.searchDate = searchDate;
  }
 	public List<String> getCityList() {
 return cityList;
 }
public void setCityList(List<String> cityList) {
this.cityList = cityList;
}
 	public List<CourseEntity> getCourseList() {
 return courseList;
 }
public void setCourseList(List<CourseEntity> courseList) {
this.courseList = courseList;
}
 	public List<LocationMstEntity> getLocationMstList() {
 return locationMstList;
 }
public void setLocationMstList(List<LocationMstEntity> locationMstList) {
this.locationMstList = locationMstList;
}
 public Date getCreateTime(){
 return createTime;
  }
 public void setCreateTime(  Date createTime) {
 this.createTime = createTime;
  }
 public Date getModifyTime(){
 return modifyTime;
  }
 public void setModifyTime(  Date modifyTime) {
 this.modifyTime = modifyTime;
  }

}
