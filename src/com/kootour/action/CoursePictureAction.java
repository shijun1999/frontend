//Auto Generated 

package com.kootour.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.model.CoursePictureModel;

public class CoursePictureAction extends CoursePictureModel {

	@Autowired(required = false)

	public void copyEntity2EntityAction(CoursePictureEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getCoursePictureIdentiNo() == null) {
			setCoursePictureIdentiNo("");
		} else {
			setCoursePictureIdentiNo(tEntity.getCoursePictureIdentiNo());
		}
		if (tEntity.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(tEntity.getCourseIdentiNo());
		}
		if (tEntity.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(tEntity.getLocalhostIdentiNo());
		}
		if (tEntity.getFullName() == null) {
			setFullName("");
		} else {
			setFullName(tEntity.getFullName());
		}
		if (tEntity.getType() == null) {
			setType("");
		} else {
			setType(tEntity.getType());
		}
		if (tEntity.getFullPath() == null) {
			setFullPath("");
		} else {
			setFullPath(tEntity.getFullPath());
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

	public CoursePictureEntity copyEntityAction2Entity(CoursePictureModel tCoursePictureModel) {
		CoursePictureEntity tEntity = new CoursePictureEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tCoursePictureModel.getLangId());
		tEntity.setCoursePictureIdentiNo(tCoursePictureModel.getCoursePictureIdentiNo());
		tEntity.setCourseIdentiNo(tCoursePictureModel.getCourseIdentiNo());
		tEntity.setLocalhostIdentiNo(tCoursePictureModel.getLocalhostIdentiNo());
		tEntity.setFullName(tCoursePictureModel.getFullName());
		tEntity.setType(tCoursePictureModel.getType());
		tEntity.setFullPath(tCoursePictureModel.getFullPath());
		tEntity.setMemo(tCoursePictureModel.getMemo());
		if (KooUtil.isNotDate(tCoursePictureModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tCoursePictureModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tCoursePictureModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tCoursePictureModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
