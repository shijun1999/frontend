package com.kootour.interceptor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.action.BaseAction;
import com.kootour.common.CommonMessage;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.common.SessionInfo;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.MessageEntity;
import com.kootour.mapper.paramentity.LocalhostParamEntity;
import com.kootour.mapper.paramentity.MessageParamEntity;
import com.kootour.service.CommonService;
import com.kootour.service.impl.CommonServiceImpl;
import com.kootour.service4db.LocalhostService4DB;
import com.kootour.service4db.MessageService4DB;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class KooInterceptor implements Interceptor {
	@Autowired(required = false)
	private CommonService commonService = new CommonServiceImpl();
	@Autowired
	private MessageService4DB messageService4DB;
	@Autowired
	private LocalhostService4DB localhostService4DB;

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext().getSession();

		BaseAction tBaseAction = (BaseAction) invocation.getProxy().getAction();
		if (session.isEmpty()) {
			// Todo
			// Display Error

		}

		List languageList = new ArrayList<>();
		if (session.get(KooConst.ST_SESSION_INFO) == null) {
			tBaseAction.setSessionInfo(commonService.initSessionInfo());
			session.put(KooConst.ST_SESSION_INFO, tBaseAction.getSessionInfo());
			languageList = (List) tBaseAction.getSessionInfo().getParaMap().get(KooConst.ST_LANG_LIST);
			session.put(KooConst.ST_LANG_LIST, languageList);
		} else {
			tBaseAction.setSessionInfo((SessionInfo) session.get(KooConst.ST_SESSION_INFO));
			// languageList = (List)
			// t.getSessionInfo().getParaMap().get(KooConst.ST_LANG_LIST);
			// session.put(KooConst.ST_LANG_LIST, languageList);
		}
		tBaseAction.setCurTouristIdentiNo(tBaseAction.getSessionInfo().getCurTouristIdentiNo());
		tBaseAction.setCurDate(tBaseAction.getSessionInfo().getCurDate());
		tBaseAction.setCurTouristName(tBaseAction.getSessionInfo().getCurTouristName());
		tBaseAction.setCurTouristPicture(tBaseAction.getSessionInfo().getCurTouristPicture());
		tBaseAction.setCurLangId(tBaseAction.getSessionInfo().getCurLangId());
		tBaseAction.setCurMenuList(tBaseAction.getSessionInfo().getCurMenuList());

		List<CommonMessage> kootourMessagelList = new ArrayList<>();
		List<CommonMessage> localhostMessagelList = new ArrayList<>();

		if (!tBaseAction.getCurTouristIdentiNo().equals(KooConst.ST_DUMMY_TOURIST_NO)) {
			MessageParamEntity messageParamEntity = new MessageParamEntity();
			messageParamEntity.setLangId(tBaseAction.getSessionInfo().getCurLangId());
			messageParamEntity.setTouristIdentiNo(tBaseAction.getCurTouristIdentiNo());
			messageParamEntity.setReadFlg(KooConst.ST_FLG_NO);
			List<MessageEntity> messageEntityList = messageService4DB.selectByCondition(messageParamEntity);

			List<String> localhostNolList = new ArrayList<>();

			for (MessageEntity tMessage : messageEntityList) {
				switch (tMessage.getMessageType()) {
				case KooConst.ST_KOOTOUR_MSG:
					CommonMessage tKootourMessage = new CommonMessage();
					tKootourMessage.setLangId(tMessage.getLangId());
					tKootourMessage.setMessageIdentiNo(tMessage.getMessageIdentiNo());
					tKootourMessage.setMessageText(tMessage.getMessageText());
					tKootourMessage
							.setMessageTime(KooUtil.date2String(tMessage.getMessageTime(), KooConst.ST_yyyy_MM_dd));
					kootourMessagelList.add(tKootourMessage);
					break;
				case KooConst.ST_LOCALHOST_MSG:
					CommonMessage tLocalhostMessage = new CommonMessage();
					if (!localhostNolList.contains(tMessage.getLocalhostIdentiNo())) {
						tLocalhostMessage.setLangId(tMessage.getLangId());
						tLocalhostMessage.setMessageIdentiNo(tMessage.getMessageIdentiNo());
						tLocalhostMessage.setMessageText(tMessage.getMessageText());
						tLocalhostMessage.setLocalhostIdentiNo(tMessage.getLocalhostIdentiNo());
						tLocalhostMessage
								.setMessageTime(KooUtil.date2String(tMessage.getMessageTime(), KooConst.ST_yyyy_MM_dd));

						LocalhostParamEntity localhostParamEntity = new LocalhostParamEntity();
						localhostParamEntity.setLangId(tLocalhostMessage.getLangId());
						localhostParamEntity.setLocalhostIdentiNo(tLocalhostMessage.getLocalhostIdentiNo());

						List<LocalhostEntity> localhostEntityList = localhostService4DB
								.selectByCondition(localhostParamEntity);
						if (localhostEntityList != null && localhostEntityList.size() > 0) {
							tLocalhostMessage.setLocalhostNameDisp(localhostEntityList.get(0).getLastName());
							tLocalhostMessage.setLocalhostPictureDisp(
									KooConst.STR_UPLOAD_IMAGES_PATH + localhostEntityList.get(0).getPhoto());
						}
						localhostMessagelList.add(tLocalhostMessage);
						localhostNolList.add(tMessage.getLocalhostIdentiNo());
					}
					break;
				}
			}

		}
		tBaseAction.setKootourMessagelList(kootourMessagelList);
		tBaseAction.setLocalhostMessagelList(localhostMessagelList);

		if ("loginIndex".equals(invocation.getProxy().getActionName())) {
			// session.clear();
			// return ("success");
		}

		final String res = invocation.invoke();

		// TODO post
		return res;
	}

}
