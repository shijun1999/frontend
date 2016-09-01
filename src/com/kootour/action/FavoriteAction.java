//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.model.FavoriteModel;
import com.kootour.service.FavoriteService;
import com.kootour.service.impl.FavoriteServiceImpl;

@Results({ @Result(name = "gotocourseList", value = "cityCourseList!load", type = ServletActionRedirectResult.class) })
public class FavoriteAction extends FavoriteModel {

	@Autowired(required = false)
	private FavoriteService favoriteService = new FavoriteServiceImpl();

	public String load() {
		String rtnStr = "gotocourseList";

		Map<String, Object> session = getSession();
		if (session == null) {

			List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
			ErrorInfo tErrorInfo = new ErrorInfo();
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setDispOrder(1);
			tErrorInfo.setErrMsg(KooConst.INFO_MSG_009);
			tList.add(tErrorInfo);

			this.setErrInfoList(tList);
			makeErrorList(this.getErrInfoList());
			return rtnStr;
		}
		String strCourseIdentiNo = getRequest().getParameter("courseIdentiNo").toString();
		String strLangId = getSessionInfo().getCurLangId();
		String strTouristIdentiNo = getSessionInfo().getCurTouristIdentiNo();

		setLangId(strLangId);
		setTouristIdentiNo(strTouristIdentiNo);
		setObjIdentiNo(strCourseIdentiNo);

		FavoriteEntity inCourseDetailEntity = copyEntityAction2Entity((FavoriteModel)this);
		Map<String, Object> paraMap = new HashMap<String, Object>();
		FavoriteEntity outFavoriteEntity = new FavoriteEntity();

		outFavoriteEntity = favoriteService.save(inCourseDetailEntity, paraMap);

		copyEntity2EntityAction(outFavoriteEntity);
		return rtnStr;
	}

	public void copyEntity2EntityAction(FavoriteEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getFavoriteIdentiNo() == null) {
			setFavoriteIdentiNo("");
		} else {
			setFavoriteIdentiNo(tEntity.getFavoriteIdentiNo());
		}
		if (tEntity.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(tEntity.getTouristIdentiNo());
		}
		if (tEntity.getObjType() == null) {
			setObjType("");
		} else {
			setObjType(tEntity.getObjType());
		}
		if (tEntity.getObjIdentiNo() == null) {
			setObjIdentiNo("");
		} else {
			setObjIdentiNo(tEntity.getObjIdentiNo());
		}
		if (tEntity.getDeleteStatus() == null) {
			setDeleteStatus("");
		} else {
			setDeleteStatus(tEntity.getDeleteStatus());
		}
		if (tEntity.getOpDate() == null) {
			setOpDate("");
		} else {
			setOpDate(tEntity.getOpDate());
		}
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

	public FavoriteEntity copyEntityAction2Entity(FavoriteModel tFavoriteModel) {
		FavoriteEntity tEntity = new FavoriteEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tFavoriteModel.getLangId());
		tEntity.setFavoriteIdentiNo(tFavoriteModel.getFavoriteIdentiNo());
		tEntity.setTouristIdentiNo(tFavoriteModel.getTouristIdentiNo());
		tEntity.setObjType(tFavoriteModel.getObjType());
		tEntity.setObjIdentiNo(tFavoriteModel.getObjIdentiNo());
		tEntity.setDeleteStatus(tFavoriteModel.getDeleteStatus());
		tEntity.setOpDate(tFavoriteModel.getOpDate());
		if (KooUtil.isNotDate(tFavoriteModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tFavoriteModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tFavoriteModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tFavoriteModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
