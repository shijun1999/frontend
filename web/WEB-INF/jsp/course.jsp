<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="header.jsp" />
<s:form cssClass="form-horizontal">
	<div class="container">

		<form class="form-inline">
			<fieldset>
				<legend> 検索条件</legend>
				<div class="form-group">
       <label>正式名称</label>
       <s:textfield name="fullName" class="form-control" size="10" />
       <label>地域キー文字</label>
       <s:textfield name="locationKey" class="form-control" size="10" />
       <label>分類キー文字</label>
       <s:textfield name="searchWord" class="form-control" size="10" />
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 ">
				<span>
       <s:submit method="pictureUpload" value="写真アップロード" cssClass="btn btn-primary" />
       <s:submit method="motionUpload" value="動画アップロード" cssClass="btn btn-primary" />
		</span>
	  </div>
	</div>
	</fieldset>
	</form>
			<fieldset>
				<legend> 検索内容</legend>
				<div class="form-group">
       <label>略名称</label>
       <s:textfield name="shortName" class="form-control" size="10" />
       <label>商品内容１</label>
       <s:property value="courseContent1" />
       <label>商品内容２</label>
       <s:property value="courseContent2" />
       <label>商品内容３</label>
       <s:property value="courseContent3" />
       <label>遊客数</label>
       <s:textfield name="touristNum" class="form-control" size="10" />
		</div>
		<s:property value="fullName" /><br>
		<s:property value="useLangId" /><br>

				<div class="form-group">
       <label>幣種</label>
       <s:textfield name="moneyUnit" class="form-control" size="10" />
       <label>老人単価</label>
       <s:property value="oldPersonPrice" />
       <label>大人単価</label>
       <s:property value="adultPrice" />
       <label>子供単価</label>
       <s:property value="childPrice" />
       <label>営業日</label>
       <s:textfield name="workDay" class="form-control" size="10" />
		</div>
				<div class="form-group">
       <label>一括単価</label>
       <s:textfield name="totalPrice" class="form-control" size="10" />
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 ">
				<span>
       <s:submit method="order" value="注文" cssClass="btn btn-primary" />
       <s:submit method="dateChange" value="旅行日変更" cssClass="btn btn-primary" />
       <s:submit method="cancel" value="キャンセル" cssClass="btn btn-primary" />
       <s:submit method="clear" value="クリア" cssClass="btn btn-primary" />
       <s:submit method="save" value="注文" cssClass="btn btn-primary" />
       <s:submit method="back" value="戻る" cssClass="btn btn-primary" />
       
       
		</span>
	  </div>
	</div>
	</fieldset>
  </div>
</s:form>
<p class="err">
	<s:property value="errmsg" />
</p>
<jsp:include page="footer.jsp" />
