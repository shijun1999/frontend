<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="header.jsp" />
<s:form cssClass="form-horizontal">
	<div class="container">

			<fieldset>
				<legend> 検索内容</legend>
				<div class="form-group">
       <label>正式名称</label>
       <s:textfield name="fullName" class="form-control" size="10" />
       <label>分類</label>
       <s:textfield name="type" class="form-control" size="10" />
       <label>保存場所</label>
       <s:textfield name="fullPath" class="form-control" size="10" />
       <label>簡易説明</label>
       <s:textfield name="memo" class="form-control" size="10" />
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 ">
				<span>
       <s:submit method="cancel" value="キャンセル" cssClass="btn btn-primary" />
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
