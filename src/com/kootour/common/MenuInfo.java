package com.kootour.common;

import java.util.Map;

public class MenuInfo {

	private String menuLevel;
	private String menuClassName;
	private String menuMethodName;
	private String menuDispName;
	private Map<String, Object> menuParaMap;

	public String getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getMenuClassName() {
		return menuClassName;
	}

	public void setMenuClassName(String menuClassName) {
		this.menuClassName = menuClassName;
	}

	public String getMenuMethodName() {
		return menuMethodName;
	}

	public void setMenuMethodName(String menuMethodName) {
		this.menuMethodName = menuMethodName;
	}

	public String getMenuDispName() {
		return menuDispName;
	}

	public void setMenuDispName(String menuDispName) {
		this.menuDispName = menuDispName;
	}

	public Map<String, Object> getMenuParaMap() {
		return menuParaMap;
	}

	public void setMenuParaMap(Map<String, Object> menuParaMap) {
		this.menuParaMap = menuParaMap;
	}
}
