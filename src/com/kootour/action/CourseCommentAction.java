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

import com.kootour.checker.SingleCourseCommentChecker;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.model.CourseCommentModel;
import com.kootour.service.CourseCommentService;
import com.kootour.service.impl.CourseCommentServiceImpl;

@Results({ @Result(name = "gotonext", value = "accountSummary!load", type = ServletActionRedirectResult.class),
		@Result(name = "gotoback", value = "course!display", type = ServletActionRedirectResult.class) })
public class CourseCommentAction extends CourseCommentModel {

	@Autowired(required = false)
	private CourseCommentService courseCommentService = new CourseCommentServiceImpl();

	public String save() {
		String rtnStr = "gotonext";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		SingleCourseCommentChecker tSingleCheck = new SingleCourseCommentChecker();
		tList = tSingleCheck.nullCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		tList = tSingleCheck.valueCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		tList = tSingleCheck.sizeCheck(this);
		if (!tList.isEmpty()) {
			getErrInfoList().addAll(tList);
		}

		if (getErrInfoList().isEmpty()) {
			CourseCommentEntity inCourseCommentEntity = copyEntityAction2Entity((CourseCommentModel)this );
			CourseCommentEntity outCourseCommentEntity = new CourseCommentEntity();
			Map<String, Object> sessionParaMap = getSessionInfo().getParaMap();
			
			inCourseCommentEntity.setTouristIdentiNo(inCourseCommentEntity.getCurTouristIdentiNo());
			outCourseCommentEntity = courseCommentService.save(inCourseCommentEntity, paraMap);

		} else {
			makeErrorList(this.getErrInfoList());
			rtnStr = "error";
		}
		return rtnStr;
	}


	public String load() {
		String rtnStr = "success";
		setLangId(getSessionInfo().getCurLangId());

		Map<String, Object> paraMap = new HashMap<String, Object>();
		CourseCommentEntity inCourseCommentEntity = copyEntityAction2Entity((CourseCommentModel)this );

		CourseCommentEntity outCourseCommentEntity = new CourseCommentEntity();
		outCourseCommentEntity = courseCommentService.load(inCourseCommentEntity, paraMap);
		copyEntity2EntityAction(outCourseCommentEntity);
        this.setEditFlg(KooConst.ST_FLG_NO);
		
		return rtnStr;
	}

	public String edit() {
		String rtnStr = "success";
		setLangId(getSessionInfo().getCurLangId());
		Map<String, Object> paraMap = new HashMap<String, Object>();
		CourseCommentEntity inCourseCommentEntity = copyEntityAction2Entity((CourseCommentModel)this );
		inCourseCommentEntity.setLangId(getSessionInfo().getCurLangId());

		CourseCommentEntity outCourseCommentEntity = new CourseCommentEntity();
		outCourseCommentEntity = courseCommentService.edit(inCourseCommentEntity, paraMap);
		copyEntity2EntityAction(outCourseCommentEntity);
        this.setEditFlg(KooConst.ST_FLG_YES);

		return rtnStr;
	}

	public void copyEntity2EntityAction(CourseCommentEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);

		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getCourseCommentIdentiNo() == null) {
			setCourseCommentIdentiNo("");
		} else {
			setCourseCommentIdentiNo(tEntity.getCourseCommentIdentiNo());
		}
		if (tEntity.getCommentType() == null) {
			setCommentType("");
		} else {
			setCommentType(String.valueOf(tEntity.getCommentType()));
		}
		if (tEntity.getCourseIdentiNo() == null) {
			setCourseIdentiNo("");
		} else {
			setCourseIdentiNo(tEntity.getCourseIdentiNo());
		}
		if (tEntity.getTouristIdentiNo() == null) {
			setTouristIdentiNo("");
		} else {
			setTouristIdentiNo(tEntity.getTouristIdentiNo());
		}
		if (tEntity.getCommentDate() == null) {
			setCommentDate("");
		} else {
			setCommentDate(tEntity.getCommentDate());
		}
		if (tEntity.getScore() == null) {
			setScore("");
		} else {
			setScore(String.valueOf(tEntity.getScore()));
		}

		if (tEntity.getAccuracy() == null) {
			setAccuracy("");
		} else {
			setAccuracy(String.valueOf(tEntity.getAccuracy()));
		}
		if (tEntity.getCommunication() == null) {
			setCommunication("");
		} else {
			setCommunication(String.valueOf(tEntity.getCommunication()));
		}
		if (tEntity.getServices() == null) {
			setServices("");
		} else {
			setServices(String.valueOf(tEntity.getServices()));
		}
		if (tEntity.getKnowledge() == null) {
			setKnowledge("");
		} else {
			setKnowledge(String.valueOf(tEntity.getKnowledge()));
		}
		if (tEntity.getValue() == null) {
			setValue("");
		} else {
			setValue(String.valueOf(tEntity.getValue()));
		}
		if (tEntity.getComment() == null) {
			setComment("");
		} else {
			setComment(tEntity.getComment());
		}
		if (tEntity.getCourseFullNameDisp() == null) {
			setCourseFullNameDisp("");
		} else {
			setCourseFullNameDisp(tEntity.getCourseFullNameDisp());
		}
		if (tEntity.getLocalhostFullNameDisp() == null) {
			setLocalhostFullNameDisp("");
		} else {
			setLocalhostFullNameDisp(tEntity.getLocalhostFullNameDisp());
		}
		List<String> tmpStringActionList = new ArrayList<String>();
		for (String tmpVal : tEntity.getCoursePictureListDisp()) {
			tmpStringActionList.add(tmpVal);
		}
		setCoursePictureListDisp(tmpStringActionList);
		List<String> tmpStringActionList1 = new ArrayList<String>();
		for (String tmpVal : tEntity.getScoreIconListDisp()) {
			tmpStringActionList1.add(tmpVal);
		}
		setScoreIconListDisp(tmpStringActionList1);
		if (tEntity.getTouristFirstName() == null) {
			setTouristFirstName("");
		} else {
			setTouristFirstName(tEntity.getTouristFirstName());
		}
		if (tEntity.getTouristLastName() == null) {
			setTouristLastName("");
		} else {
			setTouristLastName(tEntity.getTouristLastName());
		}
		if (tEntity.getTouristPicture() == null) {
			setTouristPicture("");
		} else {
			setTouristPicture(tEntity.getTouristPicture());
		}
		if (tEntity.getLocalhostPictureDisp() == null) {
			setLocalhostPictureDisp("");
		} else {
			setLocalhostPictureDisp(tEntity.getLocalhostPictureDisp());
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

	public CourseCommentEntity copyEntityAction2Entity(CourseCommentModel tCourseCommentModel) {
		CourseCommentEntity tEntity = new CourseCommentEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tCourseCommentModel.getLangId());
		tEntity.setCourseCommentIdentiNo(tCourseCommentModel.getCourseCommentIdentiNo());
		if (KooUtil.isNotInt(tCourseCommentModel.getCommentType())) {
			tEntity.setCommentType(null);
		} else {
			tEntity.setCommentType(Integer.parseInt(tCourseCommentModel.getCommentType()));
		}
		tEntity.setCourseIdentiNo(tCourseCommentModel.getCourseIdentiNo());
		tEntity.setTouristIdentiNo(tCourseCommentModel.getTouristIdentiNo());
		tEntity.setCommentDate(tCourseCommentModel.getCommentDate());
		if (KooUtil.isNotDouble(tCourseCommentModel.getScore())) {
			tEntity.setScore(null);
		} else {
			tEntity.setScore(Double.parseDouble(tCourseCommentModel.getScore()));
		}
		if (KooUtil.isNotDouble(tCourseCommentModel.getAccuracy())) {
			tEntity.setAccuracy(null);
		} else {
			tEntity.setAccuracy(Double.parseDouble(tCourseCommentModel.getAccuracy()));
		}
		if (KooUtil.isNotDouble(tCourseCommentModel.getCommunication())) {
			tEntity.setCommunication(null);
		} else {
			tEntity.setCommunication(Double.parseDouble(tCourseCommentModel.getCommunication()));
		}
		if (KooUtil.isNotDouble(tCourseCommentModel.getServices())) {
			tEntity.setServices(null);
		} else {
			tEntity.setServices(Double.parseDouble(tCourseCommentModel.getServices()));
		}
		if (KooUtil.isNotDouble(tCourseCommentModel.getKnowledge())) {
			tEntity.setKnowledge(null);
		} else {
			tEntity.setKnowledge(Double.parseDouble(tCourseCommentModel.getKnowledge()));
		}
		if (KooUtil.isNotDouble(tCourseCommentModel.getValue())) {
			tEntity.setValue(null);
		} else {
			tEntity.setValue(Double.parseDouble(tCourseCommentModel.getValue()));
		}
		tEntity.setComment(tCourseCommentModel.getComment());
		tEntity.setCourseFullNameDisp(tCourseCommentModel.getCourseFullNameDisp());
		tEntity.setLocalhostFullNameDisp(tCourseCommentModel.getLocalhostFullNameDisp());
		List<String> tmpStringEntityList = new ArrayList<String>();
		for (String tmpVal : tCourseCommentModel.getCoursePictureListDisp()) {
			tmpStringEntityList.add(tmpVal);
		}
		tEntity.setCoursePictureListDisp(tmpStringEntityList);
		tEntity.setLocalhostPictureDisp(tCourseCommentModel.getLocalhostPictureDisp());
		tEntity.setTouristLastName(tCourseCommentModel.getTouristLastName());
		tEntity.setTouristFirstName(tCourseCommentModel.getTouristFirstName());
		tEntity.setTouristPicture(tCourseCommentModel.getTouristPicture());

		if (KooUtil.isNotDate(tCourseCommentModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tCourseCommentModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tCourseCommentModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tCourseCommentModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;
	}
}
