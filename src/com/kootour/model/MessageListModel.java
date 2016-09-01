//Auto Generated 

package com.kootour.model;

import java.util.List;

import com.kootour.action.BaseAction;

import java.util.ArrayList;

  public class MessageListModel extends BaseAction { 
     private String touristIdentiNo;
       private List<MessageModel> kooTourMessageList= new ArrayList<MessageModel>();
       private List<MessageModel> localhostMessageList= new ArrayList<MessageModel>();
     private String messageNumDisp;
     private String createTime;
     private String modifyTime;
 public String  getTouristIdentiNo(){
 return touristIdentiNo;
  }
 public void setTouristIdentiNo(  String  touristIdentiNo) {
 this.touristIdentiNo = touristIdentiNo;
  }
 	public List<MessageModel> getKooTourMessageList() {
 return kooTourMessageList;
 }
public void setKooTourMessageList(List<MessageModel> kooTourMessageList) {
this.kooTourMessageList = kooTourMessageList;
}
 	public List<MessageModel> getLocalhostMessageList() {
 return localhostMessageList;
 }
public void setLocalhostMessageList(List<MessageModel> localhostMessageList) {
this.localhostMessageList = localhostMessageList;
}
 public String  getMessageNumDisp(){
 return messageNumDisp;
  }
 public void setMessageNumDisp(  String  messageNumDisp) {
 this.messageNumDisp = messageNumDisp;
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
