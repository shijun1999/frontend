//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;
import com.kootour.mapper.entity.MessageEntity;

  public class MessageListEntity  extends BaseEntity{ 
      private String langId;
      private String touristIdentiNo;
       private List<MessageEntity> kooTourMessageList = new ArrayList<MessageEntity>();
       private List<MessageEntity> localhostMessageList = new ArrayList<MessageEntity>();
      private Integer messageNumDisp;
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
 	public List<MessageEntity> getKooTourMessageList() {
 return kooTourMessageList;
 }
public void setKooTourMessageList(List<MessageEntity> kooTourMessageList) {
this.kooTourMessageList = kooTourMessageList;
}
 	public List<MessageEntity> getLocalhostMessageList() {
 return localhostMessageList;
 }
public void setLocalhostMessageList(List<MessageEntity> localhostMessageList) {
this.localhostMessageList = localhostMessageList;
}
 public Integer getMessageNumDisp(){
 return messageNumDisp;
  }
 public void setMessageNumDisp(  Integer messageNumDisp) {
 this.messageNumDisp = messageNumDisp;
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
