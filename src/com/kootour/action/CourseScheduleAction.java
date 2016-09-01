//Auto Generated 

package com.kootour.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.model.CourseScheduleModel;
import com.kootour.service.CourseScheduleService;
import com.kootour.service.impl.CourseScheduleServiceImpl;

public class CourseScheduleAction extends CourseScheduleModel {

	@Autowired(required = false)
	private CourseScheduleService courseScheduleService = new CourseScheduleServiceImpl();

	public void copyEntity2EntityAction(CourseScheduleEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getCourseScheduleIdentiNo() == null) {
			setCourseScheduleIdentiNo("");
		} else {
			setCourseScheduleIdentiNo(tEntity.getCourseScheduleIdentiNo());
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
		if (tEntity.getWorkDate() == null) {
			setWorkDate("");
		} else {
			setWorkDate(tEntity.getWorkDate());
		}
		if (tEntity.getScheduleOptionIdentiNo() == null) {
			setScheduleOptionIdentiNo("");
		} else {
			setScheduleOptionIdentiNo(tEntity.getScheduleOptionIdentiNo());
		}
		if (tEntity.getStatus() == null) {
			setStatus("");
		} else {
			setStatus(tEntity.getStatus());
		}
		if (tEntity.getMemo() == null) {
			setMemo("");
		} else {
			setMemo(tEntity.getMemo());
		}
		if (tEntity.getDelFlg() == null) {
			setDelFlg("");
		} else {
			setDelFlg(tEntity.getDelFlg());
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

	public CourseScheduleEntity copyEntityAction2Entity(CourseScheduleModel tCourseScheduleModel) {
		CourseScheduleEntity tEntity = new CourseScheduleEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tCourseScheduleModel.getLangId());
		tEntity.setCourseScheduleIdentiNo(tCourseScheduleModel.getCourseScheduleIdentiNo());
		tEntity.setCourseIdentiNo(tCourseScheduleModel.getCourseIdentiNo());
		tEntity.setLocalhostIdentiNo(tCourseScheduleModel.getLocalhostIdentiNo());
		tEntity.setWorkDate(tCourseScheduleModel.getWorkDate());
		tEntity.setScheduleOptionIdentiNo(tCourseScheduleModel.getScheduleOptionIdentiNo());
		tEntity.setStatus(tCourseScheduleModel.getStatus());
		tEntity.setMemo(tCourseScheduleModel.getMemo());
		tEntity.setDelFlg(tCourseScheduleModel.getDelFlg());
		if (KooUtil.isNotDate(tCourseScheduleModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tCourseScheduleModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tCourseScheduleModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tCourseScheduleModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
