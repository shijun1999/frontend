package com.kootour.common;

import java.util.ArrayList;
import java.util.List;

import com.kootour.mapper.entity.MessageEntity;

public class BaseEntity {

	private String resultStr;
	private int resultStatus;
    private String curTouristIdentiNo;
    private String curDate;
	private String curLangId;
	private String curTouristName;

	private List<ErrorInfo> errList = new ArrayList<ErrorInfo>();
	private List<ErrorInfo> infoList = new ArrayList<ErrorInfo>();

	private SessionInfo sessionInfo;

	public String getResultStr() {
		return resultStr;
	}
	public void setResultStr(String resultStr) {
		this.resultStr = resultStr;
	}
	public int getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(int resultStatus) {
		this.resultStatus = resultStatus;
	}
	public List<ErrorInfo> getErrList() {
		return errList;
	}
	public void setErrList(List<ErrorInfo> errList) {
		this.errList = errList;
	}
	public List<ErrorInfo> getInfoList() {
		return infoList;
	}
	public void setInfoList(List<ErrorInfo> infoList) {
		this.infoList = infoList;
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

}
