package com.kootour.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.json.annotations.JSON;
import org.apache.struts2.util.ServletContextAware;

import com.kootour.common.BaseEntity;
import com.kootour.common.CommonMessage;
import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.MenuInfo;
import com.kootour.common.SessionInfo;
import com.kootour.exception.BusinessException;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@ParentPackage("default")
public class BaseAction extends ActionSupport
		implements Preparable, ServletRequestAware, ServletResponseAware, ServletContextAware, SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7720865502093820229L;

	private String langId;
	private String curTouristIdentiNo;
	private String curDate;
	private String curLangId;
	private String curTouristName;
	private String curTouristPicture;
	
	public String getCurTouristPicture() {
		return curTouristPicture;
	}

	public void setCurTouristPicture(String curTouristPicture) {
		this.curTouristPicture = curTouristPicture;
	}

	private List<CommonMessage> kootourMessagelList = new ArrayList<>();
	private List<CommonMessage> localhostMessagelList = new ArrayList<>();
	private List<MenuInfo> curMenuList = new ArrayList<>();

	private Map<String, Object> session;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private SessionInfo sessionInfo;

	private ServletContext context;


	public List<MenuInfo> getCurMenuList() {
		return curMenuList;
	}

	public void setCurMenuList(List<MenuInfo> curMenuList) {
		this.curMenuList = curMenuList;
	}

	private List<String> emptyList = new ArrayList<String>();

	@JSON(serialize = false)
	public List<String> getEmptyList() {
		return emptyList;
	}

	public void setEmptyList(List<String> emptyList) {
		this.emptyList = emptyList;
	}

	private List<ErrorInfo> errInfoList = new ArrayList<ErrorInfo>();

	@JSON(serialize = false)
	public List<ErrorInfo> getErrInfoList() {
		return errInfoList;
	}

	public void setErrInfoList(List<ErrorInfo> errInfoList) {
		this.errInfoList = errInfoList;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletContext(ServletContext context) {
		this.context = context;
	}

	@JSON(serialize = false)
	public Map<String, Object> getSession() {
		return session;
	}

	@JSON(serialize = false)
	public HttpServletRequest getRequest() {
		return request;
	}

	@JSON(serialize = false)
	public HttpServletResponse getResponse() {
		return response;
	}

	@JSON(serialize = false)
	public ServletContext getContext() {
		return context;
	}

	public String getLangId() {
		return langId;
	}

	public void setLangId(String langId) {
		this.langId = langId;
	}

	@Override
	public void prepare() throws Exception {
		// TODO zhi 0506
		// if (request.getParameter("request_locale") != null) {
		// getSession().put(KooConst.ST_LANGID,
		// request.getParameter("request_locale"));
		// } else {
		// setLangId((String) getSession().get(KooConst.ST_LANGID));
		// }
	}

	// ++++++++++++MessageArea
	private boolean existMessages;
	private boolean existErrorMessages;

	private List<String> lstMessage;
	private List<String> lstErrorMessage;

	@JSON(serialize = false)
	public List<String> getLstErrorMessage() {
		return lstErrorMessage;
	}

	public void setLstErrorMessage(List<String> lstErrorMessage) {
		this.lstErrorMessage = lstErrorMessage;
	}

	@JSON(serialize = false)
	public List<String> getLstMessage() {
		return lstMessage;
	}

	public void setLstMessage(List<String> lstMessage) {
		this.lstMessage = lstMessage;
	}

	@JSON(serialize = false)
	public boolean isExistMessages() {
		return existMessages;
	}

	@JSON(serialize = false)
	public boolean isExistErrorMessages() {
		return existErrorMessages;
	}

	public void addInfoMessages(String msgId, String... param) {
		if (lstMessage == null) {
			lstMessage = new ArrayList<String>();
		}
		lstMessage.add(createMessage(msgId, param));
		existMessages = true;
	}

	public void addErrorMessages(String msgId, String... param) {
		if (lstErrorMessage == null) {
			lstErrorMessage = new ArrayList<String>();
		}
		lstErrorMessage.add(createMessage(msgId, param));
		existErrorMessages = true;
	}

	public void addErrorMessages(BusinessException be) {
		addErrorMessages(be.getCode(), be.getParam());
	}

	private String createMessage(String msgId, String... param) {
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		buf.append(msgId);
		buf.append("]");
		buf.append(getText(msgId, param));
		return buf.toString();
	}

	public void makeErrorList(List<ErrorInfo> errInfoList) {
		for (ErrorInfo errorInfo : errInfoList) {
			if (errorInfo.getErrKbn() == KooConst.INT_ERROR_KBN) {
				addErrorMessages(errorInfo.getErrMsg(), errorInfo.getItemName());
			}
			if (errorInfo.getErrKbn() == KooConst.INT_INFO_KBN) {
				addInfoMessages(errorInfo.getErrMsg(), errorInfo.getItemName());
			}
		}
	}

	public void makeErrorOne(ErrorInfo errInfo) {
		if (errInfo.getErrKbn() == KooConst.INT_ERROR_KBN) {
			addErrorMessages(errInfo.getErrMsg(), errInfo.getItemName());
		}
		if (errInfo.getErrKbn() == KooConst.INT_INFO_KBN) {
			addInfoMessages(errInfo.getErrMsg(), errInfo.getItemName());
		}
	}

	public SessionInfo getSessionInfo() {
		return sessionInfo;
	}

	public void setSessionInfo(SessionInfo sessionInfo) {
		this.sessionInfo = sessionInfo;
	}

	public String getCurTouristIdentiNo() {
		return curTouristIdentiNo;
	}

	public void setCurTouristIdentiNo(String curTouristIdentiNo) {
		this.curTouristIdentiNo = curTouristIdentiNo;
	}

	public String getCurDate() {
		return curDate;
	}

	public void setCurDate(String curDate) {
		this.curDate = curDate;
	}

	public List<CommonMessage> getKootourMessagelList() {
		return kootourMessagelList;
	}

	public void setKootourMessagelList(List<CommonMessage> kootourMessagelList) {
		this.kootourMessagelList = kootourMessagelList;
	}

	public List<CommonMessage> getLocalhostMessagelList() {
		return localhostMessagelList;
	}

	public void setLocalhostMessagelList(List<CommonMessage> localhostMessagelList) {
		this.localhostMessagelList = localhostMessagelList;
	}

	public String getCurLangId() {
		return curLangId;
	}

	public void setCurLangId(String curLangId) {
		this.curLangId = curLangId;
	}

	public String getCurTouristName() {
		return curTouristName;
	}

	public void setCurTouristName(String curTouristName) {
		this.curTouristName = curTouristName;
	}

	public void copyBaseEntity2Model(BaseEntity tEntity) {
		if (tEntity.getCurTouristIdentiNo() == null) {
			setCurTouristIdentiNo("");
		} else {
			setCurTouristIdentiNo(tEntity.getCurTouristIdentiNo());
		}
		if (tEntity.getCurDate() == null) {
			setCurDate("");
		} else {
			setCurDate(tEntity.getCurDate());
		}

		if (tEntity.getCurLangId() == null) {
			setCurLangId("");
		} else {
			setCurLangId(tEntity.getCurLangId());
		}
		
//		if (tEntity.getCurTouristName() == null) {
//			setCurTouristName("");
//		} else {
//			setCurTouristName(tEntity.getCurTouristName());
//		}
		setSessionInfo(tEntity.getSessionInfo());

	}

	public BaseEntity copyBaseModel2Entity() {
		BaseEntity tEntity = new BaseEntity();

		tEntity.setCurTouristIdentiNo(getCurTouristIdentiNo());
		tEntity.setCurDate(getCurDate());

		return tEntity;
	}
}
