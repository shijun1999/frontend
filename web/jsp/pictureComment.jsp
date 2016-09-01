<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="header.jsp" />
<s:form cssClass="form-horizontal">
	<div class="container">

			<fieldset>
				<legend> 検索内容</legend>
				<div class="form-group">
       <label>写真識別番号</label>
       <s:textfield name="pictureIdentiNo" class="form-control" size="10" />
       <label>説明</label>
       <s:textfield name="memo" class="form-control" size="10" />
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 ">
				<span>
       <s:submit method="clear" value="クリア" cssClass="btn btn-primary" />
       <s:submit method="save" value="登録" cssClass="btn btn-primary" />
       <s:submit method="back" value="戻る" cssClass="btn btn-primary" />
		</span>
	  </div>
	</div>
  </div>
</s:form>
<p class="err">
	<s:property value="errmsg" />
</p>
<jsp:include page="footer.jsp" />
