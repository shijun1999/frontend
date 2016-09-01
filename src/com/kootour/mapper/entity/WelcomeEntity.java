//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;

  public class WelcomeEntity  extends BaseEntity{ 
      private String langId;
      private String touristIdentiNo;
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
