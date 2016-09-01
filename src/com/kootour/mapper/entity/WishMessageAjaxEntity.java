package com.kootour.mapper.entity;

  public class WishMessageAjaxEntity{ 
	  
	 private String result; 
	 private String touristIdentiNo;
	 private String courseIdentiNo;
	 private String langId;
	 private String favoriteIdentiNo;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getCourseIdentiNo() {
		return courseIdentiNo;
	}

	public void setCourseIdentiNo(String courseIdentiNo) {
		this.courseIdentiNo = courseIdentiNo;
	}

	public String getTouristIdentiNo() {
		return touristIdentiNo;
	}

	public void setTouristIdentiNo(String touristIdentiNo) {
		this.touristIdentiNo = touristIdentiNo;
	}

	public String getLangId() {
		return langId;
	}

	public void setLangId(String langId) {
		this.langId = langId;
	}

	public String getFavoriteIdentiNo() {
		return favoriteIdentiNo;
	}

	public void setFavoriteIdentiNo(String favoriteIdentiNo) {
		this.favoriteIdentiNo = favoriteIdentiNo;
	}
     
}
