package com.kootour.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.service4db.CommonService4DB;
import com.kootour.service4db.SequenceService4DB;
import com.kootour.service4db.impl.CommonService4DBImpl;
import com.kootour.service4db.impl.SequenceService4DBImpl;

public class SessionInfo {
	
	private String curLangId;
	private String curDate;
	private String curState;
	private String curCity;
	private String curTouristIdentiNo;
	private String curTouristName;
	private String curTouristPicture;
	
	public String getCurTouristPicture() {
		return curTouristPicture;
	}

	public void setCurTouristPicture(String curTouristPicture) {
		this.curTouristPicture = curTouristPicture;
	}

	private Map<String, Object> paraMap;
	private List<MenuInfo> curMenuList = new ArrayList<>();

	private String preActionId;

	
	public String getCurLangId() {
		return curLangId;
	}

	public void setCurLangId(String curLangId) {
		this.curLangId = curLangId;
	}

	public String getCurState() {
		return curState;
	}

	public void setCurState(String curState) {
		this.curState = curState;
	}

	public String getCurCity() {
		return curCity;
	}

	public void setCurCity(String curCity) {
		this.curCity = curCity;
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

	public Map<String, Object> getParaMap() {
		return paraMap;
	}

	public void setParaMap(Map<String, Object> paraMap) {
		this.paraMap = paraMap;
	}

	public String getPreActionId() {
		return preActionId;
	}

	public void setPreActionId(String preActionId) {
		this.preActionId = preActionId;
	}

	public String getCurTouristName() {
		return curTouristName;
	}

	public void setCurTouristName(String curTouristName) {
		this.curTouristName = curTouristName;
	}

	public List<MenuInfo> getCurMenuList() {
		return curMenuList;
	}

	public void setCurMenuList(List<MenuInfo> curMenuList) {
		this.curMenuList = curMenuList;
	}
}
