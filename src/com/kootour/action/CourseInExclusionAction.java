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

import com.kootour.mapper.paramentity.CourseInExclusionParamEntity;
import com.kootour.model.CourseInExclusionModel;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseInExclusionEntity;

@Results({})
public class CourseInExclusionAction extends CourseInExclusionModel {

	@Autowired(required = false)
	public void copyEntity2EntityAction(CourseInExclusionEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);

		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getCourseInExclusionIdentiNo() == null) {
			setCourseInExclusionIdentiNo("");
		} else {
			setCourseInExclusionIdentiNo(tEntity.getCourseInExclusionIdentiNo());
		}
		if (tEntity.getSequesNo() == null) {
			setSequesNo("");
		} else {
			setSequesNo(String.valueOf(tEntity.getSequesNo()));
		}
		if (tEntity.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(tEntity.getCourseIdentiNo());
		}
		if (tEntity.getInExclusionType() == null) {
			setInExclusionType("");
		} else {
			setInExclusionType(tEntity.getInExclusionType());
		}
		if (tEntity.getInExclusion() == null) {
			setInExclusion("");
		} else {
			setInExclusion(tEntity.getInExclusion());
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

	public CourseInExclusionEntity copyEntityAction2Entity(CourseInExclusionModel tCourseInExclusionModel) {
		CourseInExclusionEntity tEntity = new CourseInExclusionEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tCourseInExclusionModel.getLangId());
		tEntity.setCourseInExclusionIdentiNo(tCourseInExclusionModel.getCourseInExclusionIdentiNo());
		if (KooUtil.isNotInt(tCourseInExclusionModel.getSequesNo())) {
			tEntity.setSequesNo(null);
		} else {
			tEntity.setSequesNo(Integer.parseInt(tCourseInExclusionModel.getSequesNo()));
		}
		tEntity.setCourseIdentiNo(tCourseInExclusionModel.getCourseIdentiNo());
		tEntity.setInExclusionType(tCourseInExclusionModel.getInExclusionType());
		tEntity.setInExclusion(tCourseInExclusionModel.getInExclusion());
		if (KooUtil.isNotDate(tCourseInExclusionModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tCourseInExclusionModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tCourseInExclusionModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tCourseInExclusionModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
