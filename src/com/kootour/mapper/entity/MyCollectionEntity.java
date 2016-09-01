//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;

  public class MyCollectionEntity  extends BaseEntity{ 
      private String langId;
      private String touristIdentiNo;
       private List<FavoriteEntity> favoriteList = new ArrayList<FavoriteEntity>();
       private List<UserOrderEntity> userOrderList = new ArrayList<UserOrderEntity>();
       private List<CourseCommentEntity> courseCommentList = new ArrayList<CourseCommentEntity>();
      private Integer kootourPoint;
       private List<CourseEntity> courseList = new ArrayList<CourseEntity>();
      private Date createTime;
      private Date modifyTime;
 public String getLangId(){
 return langId;
  }
 public void setLangId(  String langId) {
 this.langId = langId;
  }
 public String getTouristIdentiNo(){
 return touristIdentiNo;
  }
 public void setTouristIdentiNo(  String touristIdentiNo) {
 this.touristIdentiNo = touristIdentiNo;
  }
 	public List<FavoriteEntity> getFavoriteList() {
 return favoriteList;
 }
public void setFavoriteList(List<FavoriteEntity> favoriteList) {
this.favoriteList = favoriteList;
}
 	public List<UserOrderEntity> getUserOrderList() {
 return userOrderList;
 }
public void setUserOrderList(List<UserOrderEntity> userOrderList) {
this.userOrderList = userOrderList;
}
 	public List<CourseCommentEntity> getCourseCommentList() {
 return courseCommentList;
 }
public void setCourseCommentList(List<CourseCommentEntity> courseCommentList) {
this.courseCommentList = courseCommentList;
}
 public Integer getKootourPoint(){
 return kootourPoint;
  }
 public void setKootourPoint(  Integer kootourPoint) {
 this.kootourPoint = kootourPoint;
  }
 	public List<CourseEntity> getCourseList() {
 return courseList;
 }
public void setCourseList(List<CourseEntity> courseList) {
this.courseList = courseList;
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
