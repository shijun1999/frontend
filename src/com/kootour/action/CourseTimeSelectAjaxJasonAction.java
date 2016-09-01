//Auto Generated

package com.kootour.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.google.gson.Gson;
import com.kootour.common.KooConst;
import com.kootour.mapper.entity.CourseDateSelectAjaxEntity;
import com.kootour.mapper.entity.CourseTimeSelectAjaxEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.service.CourseScheduleService;

@ParentPackage("json-default")
@Results({ @Result(name = "json", type = "json", params = { "root", "jsonStr" }) })
public class CourseTimeSelectAjaxJasonAction extends BaseAction {

	@Resource
	CourseScheduleService courseScheduleService;

	private String jsonStr;
	private String jsonFromWeb;

	public String getJsonStr() {
		return jsonStr;
	}

	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
	}

	public String getJsonFromWeb() {
		return jsonFromWeb;
	}

	public void setJsonFromWeb(String jsonFromWeb) {
		this.jsonFromWeb = jsonFromWeb;
	}

	@Action(value = "courseTimeSelect")
	public String courseTimeSelect() {
		String rtnStr = "json";
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		Gson gson = new Gson();

		try {
			CourseTimeSelectAjaxEntity inModel = gson.fromJson(jsonFromWeb, CourseTimeSelectAjaxEntity.class);
			SimpleDateFormat sdf1 = new SimpleDateFormat(KooConst.ST_yyyyMMdd);
			SimpleDateFormat sdf2 = new SimpleDateFormat(KooConst.ST_MM_dd_yyyy);
			Date date;
			String strYyyymmdd = "";
			date = sdf2.parse(inModel.getCourseDate());
			strYyyymmdd = sdf1.format(date);
			String tTiemTable = courseScheduleService.calcTimeTable(inModel.getLangId(), inModel.getCourseIdentiNo(),
					strYyyymmdd);
			CourseDateSelectAjaxEntity outModel = new CourseDateSelectAjaxEntity();
			outModel.setResult(tTiemTable);
			jsonStr = gson.toJson(outModel);
			jsonMap.put("data", jsonStr);
		} catch (Exception e) {
			jsonMap.put("result", "error");
			jsonStr = gson.toJson(jsonMap);
			e.printStackTrace();
		}
		return rtnStr;
	}
}
