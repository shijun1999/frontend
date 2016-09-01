//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.config.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.WishDetailEntity;
import com.kootour.mapper.entity.WishListEntity;
import com.kootour.model.WishDetailModel;
import com.kootour.model.WishListModel;
import com.kootour.service.WishListService;
import com.kootour.service.impl.WishListServiceImpl;

@Results({})
public class WishListAction extends WishListModel {

	@Autowired(required = false)
	private WishListService wishListService = new WishListServiceImpl();

	public void copyEntity2EntityAction(WishListEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(tEntity.getTouristIdentiNo());
		}
		List<WishDetailModel> tmpWishDetailActionList1 = new ArrayList<WishDetailModel>();
		for (WishDetailEntity tmpVal : tEntity.getWishDetailListDisp()) {
			WishDetailAction tmpWishDetailListDisp = new WishDetailAction();
			tmpWishDetailListDisp.copyEntity2EntityAction(tmpVal);
			tmpWishDetailActionList1.add(tmpWishDetailListDisp);
		}
		setWishDetailListDisp(tmpWishDetailActionList1);
		if (tEntity.getCreateTime() == null) {
			setCreateTime("");
		} else {
			setCreateTime(KooUtil.date2String(tEntity.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (tEntity.getModifyTime() == null) {
			setModifyTime("");
		} else {
			setModifyTime(KooUtil.date2String(tEntity.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}

	}

	public WishListEntity copyEntityAction2Entity(WishListModel tWishListModel) {
		WishListEntity tEntity = new WishListEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tWishListModel.getLangId());
		tEntity.setTouristIdentiNo(tWishListModel.getTouristIdentiNo());
		List<WishDetailEntity> tmpWishDetailEntityList1 = new ArrayList<WishDetailEntity>();
		for (WishDetailModel tmpVal : tWishListModel.getWishDetailListDisp()) {
			WishDetailEntity tmpWishDetail = new WishDetailEntity();
			WishDetailAction tmpAction = (WishDetailAction) tmpVal;
			tmpWishDetail = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpWishDetailEntityList1.add(tmpWishDetail);
		}
		tEntity.setWishDetailListDisp(tmpWishDetailEntityList1);
		if (KooUtil.isNotDate(tWishListModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tWishListModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tWishListModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tWishListModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
