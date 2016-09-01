//Auto Generated 

package com.kootour.model;

import java.util.List;

import com.kootour.action.BaseAction;

import java.util.ArrayList;

  public class MyCollectionModel extends BaseAction { 
     private String touristIdentiNo;
       private List<FavoriteModel> favoriteList= new ArrayList<FavoriteModel>();
       private List<UserOrderModel> userOrderList= new ArrayList<UserOrderModel>();
       private List<CourseCommentModel> courseCommentList= new ArrayList<CourseCommentModel>();
     private String kootourPoint;
       private List<CourseModel> courseList= new ArrayList<CourseModel>();
     private String createTime;
     private String modifyTime;
 public String  getTouristIdentiNo(){
 return touristIdentiNo;
  }
 public void setTouristIdentiNo(  String  touristIdentiNo) {
 this.touristIdentiNo = touristIdentiNo;
  }
 	public List<FavoriteModel> getFavoriteList() {
 return favoriteList;
 }
public void setFavoriteList(List<FavoriteModel> favoriteList) {
this.favoriteList = favoriteList;
}
 	public List<UserOrderModel> getUserOrderList() {
 return userOrderList;
 }
public void setUserOrderList(List<UserOrderModel> userOrderList) {
this.userOrderList = userOrderList;
}
 	public List<CourseCommentModel> getCourseCommentList() {
 return courseCommentList;
 }
public void setCourseCommentList(List<CourseCommentModel> courseCommentList) {
this.courseCommentList = courseCommentList;
}
 public String  getKootourPoint(){
 return kootourPoint;
  }
 public void setKootourPoint(  String  kootourPoint) {
 this.kootourPoint = kootourPoint;
  }
 	public List<CourseModel> getCourseList() {
 return courseList;
 }
public void setCourseList(List<CourseModel> courseList) {
this.courseList = courseList;
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
