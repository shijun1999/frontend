//Auto Generated 

package com.kootour.mapper.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.kootour.common.BaseEntity;

  public class LanguageMstEntity  extends BaseEntity{ 
      private String langId;
      private String nameInEnglish;
      private String nameInLocal;
      private String delFlg;

 public String getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}
 public String getLangId(){
 return langId;
  }
 public void setLangId(  String langId) {
 this.langId = langId;
  }
 public String getNameInEnglish(){
 return nameInEnglish;
  }
 public void setNameInEnglish(  String nameInEnglish) {
 this.nameInEnglish = nameInEnglish;
  }
 public String getNameInLocal(){
 return nameInLocal;
  }
 public void setNameInLocal(  String nameInLocal) {
 this.nameInLocal = nameInLocal;
  }

}
