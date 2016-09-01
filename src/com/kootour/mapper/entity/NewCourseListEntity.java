//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.CourseEntity;

  public class NewCourseListEntity  extends BaseEntity{ 
      private String langId;
       private List<CourseEntity> courseList = new ArrayList<CourseEntity>();
      private Date createTime;
      private Date modifyTime;
 public String getLangId(){
 return langId;
  }
 public void setLangId(  String langId) {
 this.langId = langId;
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
