//Auto Generated

package com.kootour.action;

import java.text.DateFormat;
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
import com.kootour.mapper.entity.SendMessageAjaxEntity;
import com.kootour.mapper.entity.SendMessageEntity;
import com.kootour.model.SendMessageModel;
import com.kootour.service.CourseService;
import com.kootour.service.SendMessageService;
import com.kootour.service.impl.SendMessageServiceImpl;

@ParentPackage("json-default")
@Results({
    @Result(name = "json", type="json", params={"root", "jsonStr"})
})
public class SendMessageAjaxJasonAction extends SendMessageModel {

	@Resource
	SendMessageService sendMessageService;

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

	@Action(value="createCourseMessage")
    public String createCourseMessage() {
		String rtnStr = "json";
		Map<String, Object> jsonMap = new HashMap<String, Object> ();
		Gson gson = new Gson();
		Map<String, Object> paraMap = new HashMap<String, Object>();


//		Map<String, Object> session = getSession();
//		if (session == null || getSession().get(KooConst.LT_SESSION_KEY_LOCALHOSTENTITY) == null || session.get(KooConst.LT_SESSION_KEY_LANGID) == null) {
//			jsonMap.put("result", "error");
//			jsonStr = gson.toJson(jsonMap);
//			return rtnStr;
//		}
		
//		SendMessageService sendMessageService = new SendMessageServiceImpl();
//		SendMessageEntity inSendMessageEntity = copyEntityAction2Entity();
//		SendMessageEntity outSendMessageEntity = new SendMessageEntity();
//		outSendMessageEntity = sendMessageService.load(inSendMessageEntity, paraMap);
//		copyEntity2EntityAction(outSendMessageEntity);
		

		try {
			SendMessageAjaxEntity inModel = gson.fromJson(jsonFromWeb, SendMessageAjaxEntity.class);
			/*inModel.setLangId((String) session.get(KooConst.LT_SESSION_KEY_LANGID));
			inModel.setLocalhostEntity((LocalhostEntity) getSession().get(KooConst.LT_SESSION_KEY_LOCALHOSTENTITY));
			if (getSession().get(KooConst.LT_SESSION_KEY_UPLOADED_IMAGE_NAME_LIST) != null) {
				inModel.setUploadedFileName((List<String>) getSession().get(KooConst.LT_SESSION_KEY_UPLOADED_IMAGE_NAME_LIST));
			}
			Map<String, Object> paraMap = new HashMap<String, Object> ();
			paraMap.put(KooConst.LT_IN_PARAM_MODEL_KEY, inModel);

			boolean success = courseService.save(paraMap);
			 */
			SendMessageAjaxEntity outModel = new SendMessageAjaxEntity();
			outModel.setMessageText(inModel.getMessageText());
			Date date=new Date();
			DateFormat format=new SimpleDateFormat("yyyyMMdd");
			String time=format.format(date);
			outModel.setMessageTime(time);
			outModel.setMessageType("R");
			jsonMap.put("result", "success");
			jsonStr = gson.toJson(outModel);
			jsonMap.put("data", jsonStr);
			/*if (courseTransferEntity == null) {
				jsonMap.put("result", "error");
				jsonStr = gson.toJson(jsonMap);
				return rtnStr;
			} else {
				jsonMap.put("result", "success");
				jsonMap.put("data", courseTransferEntity);
			}*/
			
			SendMessageEntity inSendMessageEntity = new SendMessageEntity();
			inSendMessageEntity.setLangId(inModel.getLangId());
			inSendMessageEntity.setTouristIdentiNo(inModel.getTouristIdentiNo());
			inSendMessageEntity.setMessageText(inModel.getMessageText());
			inSendMessageEntity.setLocalhostIdentiNo(inModel.getLocalhostIdentiNo());
			
			SendMessageEntity outSendMessageEntity = new SendMessageEntity();
			outSendMessageEntity = sendMessageService.send(inSendMessageEntity, paraMap);
			//Todo
			jsonMap.put("result", "success");

		} catch (Exception e) {
			jsonMap.put("result", "error");
			jsonStr = gson.toJson(jsonMap);
		}
		return rtnStr;
    }
}
