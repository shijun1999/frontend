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

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.LocalhostDetailEntity;
import com.kootour.model.CourseCommentModel;
import com.kootour.model.CourseModel;
import com.kootour.model.LocalhostDetailModel;
import com.kootour.model.LocalhostModel;
import com.kootour.service.LocalhostDetailService;
import com.kootour.service.impl.LocalhostDetailServiceImpl;

@Results({ @Result(name = "cancel", value = "login!loginInit", type = ServletActionRedirectResult.class) })
public class LocalhostDetailAction extends LocalhostDetailModel {

	@Autowired(required = false)
	private LocalhostDetailService localhosDetailService = new LocalhostDetailServiceImpl();

	public String load() {
		String rtnStr = "success";
		Map<String, Object> paraMap = new HashMap<String, Object>();
		LocalhostDetailEntity inLocalhosDetailEntity = copyEntityAction2Entity((LocalhostDetailModel) this);
		LocalhostDetailEntity outLocalhosDetailEntity = new LocalhostDetailEntity();
		// Todo
		inLocalhosDetailEntity.setLangId("en");
		inLocalhosDetailEntity.setLocalhostIdentiNo(inLocalhosDetailEntity.getLocalhostIdentiNo());
		outLocalhosDetailEntity = localhosDetailService.load(inLocalhosDetailEntity, paraMap);
		copyEntity2EntityAction(outLocalhosDetailEntity);
		formatEntityAction();
		return rtnStr;
	}

	public void copyEntity2EntityAction(LocalhostDetailEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(tEntity.getLocalhostIdentiNo());
		}

		LocalhostAction tmpLocalhost = new LocalhostAction();
		tmpLocalhost.copyEntity2EntityAction(tEntity.getLocalhost());
		this.setLocalhost((LocalhostModel) tmpLocalhost);

		List<CourseCommentModel> tmpCourseCommentModelList2 = new ArrayList<>();
		
		for (CourseCommentEntity tmpVal : tEntity.getCourseCommentList()) {
			CourseCommentAction tmpCourseCommentList = new CourseCommentAction();
			tmpCourseCommentList.copyEntity2EntityAction(tmpVal);
			tmpCourseCommentModelList2.add(tmpCourseCommentList);
		}
		setCourseCommentList(tmpCourseCommentModelList2);
		
		List<CourseModel> tmpCourseActionList3 = new ArrayList<>();
		for (CourseEntity tmpVal : tEntity.getCourseList()) {
			CourseAction tmpCourseList = new CourseAction();
			tmpCourseList.copyEntity2EntityAction(tmpVal);
			tmpCourseActionList3.add(tmpCourseList);
		}
		setCourseList(tmpCourseActionList3);

		if (tEntity.getCourseCommentNum() == null) {
			setCourseCommentNum("");
		} else {
			setCourseCommentNum(String.valueOf(tEntity.getCourseCommentNum()));
		}

		List<String> tmpStringActionList2 = new ArrayList<String>();
		for (String tmpVal : tEntity.getScoreIconListDisp()) {
			tmpStringActionList2.add(tmpVal);
		}
		setScoreIconListDisp(tmpStringActionList2);
		

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

	public LocalhostDetailEntity copyEntityAction2Entity(LocalhostDetailModel tLocalhostDetailModel) {
		LocalhostDetailEntity tEntity = new LocalhostDetailEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tLocalhostDetailModel.getLangId());
		tEntity.setLocalhostIdentiNo(tLocalhostDetailModel.getLocalhostIdentiNo());
		LocalhostAction tmpLocalhostAction = new LocalhostAction();
		tEntity.setLocalhost(tmpLocalhostAction.copyEntityAction2Entity(tLocalhostDetailModel.getLocalhost()));
		List<CourseCommentEntity> tmpCourseCommentEntityList2 = new ArrayList<CourseCommentEntity>();
		
		for (CourseCommentModel tmpVal : tLocalhostDetailModel.getCourseCommentList()) {
			CourseCommentEntity tmpCourse = new CourseCommentEntity();
			CourseCommentAction tmpAction = new CourseCommentAction();
			tmpCourse = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseCommentEntityList2.add(tmpCourse);
		}
		tEntity.setCourseCommentList(tmpCourseCommentEntityList2);
		
//		List<CourseAction> tmpCourseActionList3 = new ArrayList<>();

		List<CourseEntity> tmpCourseEntityList3 = new ArrayList<CourseEntity>();
		for (CourseModel tmpVal : tLocalhostDetailModel.getCourseList()) {
			CourseEntity tmpCourse = new CourseEntity();
			CourseAction tmpAction = (CourseAction) tmpVal;
			tmpCourse = tmpAction.copyEntityAction2Entity(tmpVal);
			tmpCourseEntityList3.add(tmpCourse);
		}
		tEntity.setCourseList(tmpCourseEntityList3);

		if (KooUtil.isNotInt(tLocalhostDetailModel.getCourseCommentNum())) {
			tEntity.setCourseCommentNum(null);
		} else {
			tEntity.setCourseCommentNum(Integer.parseInt(tLocalhostDetailModel.getCourseCommentNum()));
		}
		List<String> tmpStringEntityList2 = new ArrayList<String>();
		for (String tmpVal : tLocalhostDetailModel.getScoreIconListDisp()) {
			tmpStringEntityList2.add(tmpVal);
		}

		if (KooUtil.isNotDate(tLocalhostDetailModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(
					KooUtil.string2Date(tLocalhostDetailModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tLocalhostDetailModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(
					KooUtil.string2Date(tLocalhostDetailModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
	public void formatEntityAction() {

		List<CourseModel> courseList = new ArrayList<CourseModel>();
		for (CourseModel tmpVal : this.getCourseList()) {
			if (tmpVal.getDiscountPrice().equals("") || tmpVal.getDiscountPrice().equals(tmpVal.getPrice())) {
				tmpVal.setDiscountPrice(KooUtil.formatMoney(tmpVal.getMoneyUnit(), tmpVal.getPrice()));
				tmpVal.setPrice("");
			} else {
				tmpVal.setPrice(KooUtil.formatMoney(tmpVal.getMoneyUnit(), tmpVal.getPrice()));
				tmpVal.setDiscountPrice(KooUtil.formatMoney(tmpVal.getMoneyUnit(), tmpVal.getDiscountPrice()));
			}

			tmpVal.setPersonOrGroup(KooUtil.formatPersonOrGroup(tmpVal.getPersonOrGroup()));

			tmpVal.setDuration(KooUtil.formatDuration(tmpVal.getDuration()));
			tmpVal.setDurationUnit(KooUtil.formatDurationUnit(tmpVal.getDurationUnit()));
			tmpVal.setLocalhostNameDisp("By " + tmpVal.getLocalhostNameDisp());

			courseList.add(tmpVal);
		}
		this.setCourseList(courseList);

		 List<CourseCommentModel> courseCommentList = new ArrayList<CourseCommentModel>();
			for (CourseCommentModel tmpVal : this.getCourseCommentList()) {
				tmpVal.setCommentDate(KooUtil.formatDate(tmpVal.getCommentDate()));
				
			}

			LocalhostModel localhost = new LocalhostModel();
			localhost=this.getLocalhost();
			localhost.setUseLangId(KooUtil.formatLang(localhost.getUseLangId()));
			this.setLocalhost(localhost);
	}
}
