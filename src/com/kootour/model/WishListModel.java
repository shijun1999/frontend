//Auto Generated 

package com.kootour.model;

import java.util.List;

import com.kootour.action.BaseAction;

import java.util.ArrayList;

  public class WishListModel extends BaseAction { 
     private String touristIdentiNo;
       private List<WishDetailModel> wishDetailListDisp= new ArrayList<WishDetailModel>();
     private String createTime;
     private String modifyTime;
 public String  getTouristIdentiNo(){
 return touristIdentiNo;
  }
 public void setTouristIdentiNo(  String  touristIdentiNo) {
 this.touristIdentiNo = touristIdentiNo;
  }
 	public List<WishDetailModel> getWishDetailListDisp() {
 return wishDetailListDisp;
 }
public void setWishDetailListDisp(List<WishDetailModel> wishDetailListDisp) {
this.wishDetailListDisp = wishDetailListDisp;
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
