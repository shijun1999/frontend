//Auto Generated

package com.kootour.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.google.gson.Gson;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.CourseDetailEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.WishMessageAjaxEntity;
import com.kootour.service.FavoriteService;

@ParentPackage("json-default")
@Results({ @Result(name = "json", type = "json", params = { "root", "jsonStr" }) })
public class WishAjaxJasonAction extends BaseAction {

	@Resource
	FavoriteService favoriteService;

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

	@Action(value = "wishStatusSave")
	public String wishStatusSave() {
		String rtnStr = "json";
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		Gson gson = new Gson();

		/*
		 * Map<String, Object> session = getSession(); if (session == null ||
		 * getSession().get(KooConst.LT_SESSION_KEY_LOCALHOSTENTITY) == null ||
		 * session.get(KooConst.LT_SESSION_KEY_LANGID) == null) {
		 * jsonMap.put("result", "error"); jsonStr = gson.toJson(jsonMap);
		 * return rtnStr; }
		 * 
		 * SendMessageService sendMessageService = new SendMessageServiceImpl();
		 * SendMessageEntity inSendMessageEntity = copyEntityAction2Entity();
		 * SendMessageEntity outSendMessageEntity = new SendMessageEntity();
		 * outSendMessageEntity = sendMessageService.load(inSendMessageEntity,
		 * paraMap); copyEntity2EntityAction(outSendMessageEntity);
		 */

		try {
			WishMessageAjaxEntity inModel = gson.fromJson(jsonFromWeb, WishMessageAjaxEntity.class);

			FavoriteEntity inFavoriteEntity = new FavoriteEntity();
			inFavoriteEntity.setLangId(inModel.getLangId());
			inFavoriteEntity.setTouristIdentiNo(inModel.getTouristIdentiNo());
			inFavoriteEntity.setObjIdentiNo(inModel.getCourseIdentiNo());
			inFavoriteEntity.setFavoriteIdentiNo(inModel.getFavoriteIdentiNo());
			Map<String, Object> paraMap = new HashMap<String, Object>();

			FavoriteEntity outFavoriteEntity = new FavoriteEntity();
			outFavoriteEntity = favoriteService.save(inFavoriteEntity, paraMap);

			/*
			 * inModel.setLangId((String)
			 * session.get(KooConst.LT_SESSION_KEY_LANGID));
			 * inModel.setLocalhostEntity((LocalhostEntity)
			 * getSession().get(KooConst.LT_SESSION_KEY_LOCALHOSTENTITY)); if
			 * (getSession().get(KooConst.
			 * LT_SESSION_KEY_UPLOADED_IMAGE_NAME_LIST) != null) {
			 * inModel.setUploadedFileName((List<String>)
			 * getSession().get(KooConst.LT_SESSION_KEY_UPLOADED_IMAGE_NAME_LIST
			 * )); } Map<String, Object> paraMap = new HashMap<String, Object>
			 * (); paraMap.put(KooConst.LT_IN_PARAM_MODEL_KEY, inModel);
			 * 
			 * boolean success = courseService.save(paraMap);
			 */
			WishMessageAjaxEntity outModel = new WishMessageAjaxEntity();
			/*
			 * if ("save".equals(inModel.getCourseIdentiNo())) {
			 * outModel.setResult("save success"); } else if
			 * ("cancel".equals(inModel.getCourseIdentiNo())) {
			 * outModel.setResult("cancel success"); }
			 */
			if (outFavoriteEntity.getFavoriteIdentiNo()==null) {
				outModel.setResult("");
			} else {
				outModel.setResult(outFavoriteEntity.getFavoriteIdentiNo());

			}
			jsonStr = gson.toJson(outModel);
			jsonMap.put("data", jsonStr);
			/*
			 * if (courseTransferEntity == null) { jsonMap.put("result",
			 * "error"); jsonStr = gson.toJson(jsonMap); return rtnStr; } else {
			 * jsonMap.put("result", "success"); jsonMap.put("data",
			 * courseTransferEntity); }
			 */
		} catch (Exception e) {
			jsonMap.put("result", "error");
			jsonStr = gson.toJson(jsonMap);
			e.printStackTrace();
		}
		return rtnStr;
	}
}
