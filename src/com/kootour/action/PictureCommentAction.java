//Auto Generated 

package com.kootour.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletRedirectResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.mapper.paramentity.PictureCommentParamEntity;
import com.kootour.model.PictureCommentModel;
import com.kootour.service.PictureCommentService;
import com.kootour.service.impl.PictureCommentServiceImpl;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.PictureCommentEntity;

@Results({@Result(name = "gotonext", value = "attractionComment!init", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "course!display", type = ServletActionRedirectResult.class)})
public class PictureCommentAction extends PictureCommentModel {

	@Autowired(required = false)
	private PictureCommentService pictureCommentService = new PictureCommentServiceImpl();
	public String clear() {
		String rtnStr = "input";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		PictureCommentEntity inPictureCommentEntity = copyEntityAction2Entity();
		PictureCommentEntity outPictureCommentEntity = new PictureCommentEntity();
		outPictureCommentEntity = pictureCommentService.clear(inPictureCommentEntity, paraMap);

		return rtnStr;
	}

	public String save() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		PictureCommentEntity inPictureCommentEntity = copyEntityAction2Entity();
		PictureCommentEntity outPictureCommentEntity = new PictureCommentEntity();
		outPictureCommentEntity = pictureCommentService.save(inPictureCommentEntity, paraMap);

		return rtnStr;
	}

	public String back() {
		String rtnStr = "gotoback";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		PictureCommentEntity inPictureCommentEntity = copyEntityAction2Entity();
		PictureCommentEntity outPictureCommentEntity = new PictureCommentEntity();
		outPictureCommentEntity = pictureCommentService.back(inPictureCommentEntity, paraMap);

		return rtnStr;
	}

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		PictureCommentEntity inPictureCommentEntity = copyEntityAction2Entity();
		PictureCommentEntity outPictureCommentEntity = new PictureCommentEntity();
		outPictureCommentEntity = pictureCommentService.load(inPictureCommentEntity, paraMap);

		return rtnStr;
	}

	public void copyEntity2EntityAction(PictureCommentEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getPictureIdentiNo() == null) {
			setPictureIdentiNo("");
		} else {
			setPictureIdentiNo(tEntity.getPictureIdentiNo());
		}
		if (tEntity.getMemo() == null) {
			setMemo("");
		} else {
			setMemo(tEntity.getMemo());
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
	public PictureCommentEntity copyEntityAction2Entity() {
		PictureCommentEntity tEntity = new PictureCommentEntity();
        //set common info 
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(getLangId());
		tEntity.setPictureIdentiNo(getPictureIdentiNo());
		tEntity.setMemo(getMemo());
		if (KooUtil.isNotDate(getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
