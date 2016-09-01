package com.kootour.mapper.entity;

  public class SendMessageAjaxEntity{ 
	  
	  private String result;
      private String messageType;
      private String messageText;
      private String messageTime;
      private String touristIdentiNo;
      private String localhostIdentiNo;
      private String langId;
      
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	public String getMessageTime() {
		return messageTime;
	}
	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getTouristIdentiNo() {
		return touristIdentiNo;
	}
	public void setTouristIdentiNo(String touristIdentiNo) {
		this.touristIdentiNo = touristIdentiNo;
	}
	public String getLocalhostIdentiNo() {
		return localhostIdentiNo;
	}
	public void setLocalhostIdentiNo(String localhostIdentiNo) {
		this.localhostIdentiNo = localhostIdentiNo;
	}
	public String getLangId() {
		return langId;
	}
	public void setLangId(String langId) {
		this.langId = langId;
	}

}
