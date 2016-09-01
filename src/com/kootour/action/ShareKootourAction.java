//Auto Generated 

package com.kootour.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.config.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.ShareKootourEntity;
import com.kootour.model.ShareKootourModel;
import com.kootour.service.ShareKootourService;
import com.kootour.service.impl.ShareKootourServiceImpl;

@Results({ 
 })
  public class ShareKootourAction extends ShareKootourModel {

	@Autowired(required = false)
	private ShareKootourService shareKootourService = new ShareKootourServiceImpl();
  		public String load() { 
  			String rtnStr = "success"; 
  			Map<String,Object> paraMap=new HashMap<String,Object>(); 
  			ShareKootourEntity inShareKootourEntity = copyEntityAction2Entity(); 
  			ShareKootourEntity outShareKootourEntity = new ShareKootourEntity() ; 
  			outShareKootourEntity = shareKootourService.load(inShareKootourEntity,paraMap); 
  			 
  			return rtnStr; 
  		} 

  public void  copyEntity2EntityAction(ShareKootourEntity tEntity) { 
       if (tEntity.getLangId()==null){
       setLangId("");
       }else{
       setLangId(tEntity.getLangId());
       }
       if (tEntity.getKootourIndex()==null){
       setKootourIndex("");
       }else{
       setKootourIndex(tEntity.getKootourIndex());
       }
       if (tEntity.getCreateTime()==null){
       setCreateTime("");
       }else{
       setCreateTime(KooUtil.date2String(tEntity.getCreateTime()  , KooConst.ST_yyyyMMddHHmmss));
       }
       if (tEntity.getModifyTime()==null){
       setModifyTime("");
       }else{
       setModifyTime(KooUtil.date2String(tEntity.getModifyTime()  , KooConst.ST_yyyyMMddHHmmss));
       }

}
  public ShareKootourEntity copyEntityAction2Entity() {
     ShareKootourEntity tEntity = new ShareKootourEntity();
       tEntity.setLangId(getLangId());
       tEntity.setKootourIndex(getKootourIndex());
       		if (KooUtil.isNotDate(getCreateTime())){
       			tEntity.setCreateTime(null);
       		}else{
       tEntity.setCreateTime(KooUtil.string2Date(getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
       		}
       		if (KooUtil.isNotDate(getModifyTime())){
       			tEntity.setModifyTime(null);
       		}else{
       tEntity.setModifyTime(KooUtil.string2Date(getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
       		}
    return tEntity;

    }
}
