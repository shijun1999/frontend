<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="header.jsp" />
<s:form cssClass="form-horizontal">
	<div class="container">

       <s:submit method="cancel" value="キャンセル" cssClass="btn btn-primary" />
       <s:submit method="orderConfirm" value="予約確認" cssClass="btn btn-primary" />
       <s:submit method="reservConfirm" value="予定確認" cssClass="btn btn-primary" />
       <s:submit method="back" value="戻る" cssClass="btn btn-primary" />
       <s:submit method="reviewConfirm" value="レビュー確認" cssClass="btn btn-primary" />
       <s:submit method="couseRegi" value="案件登録" cssClass="btn btn-primary" />
		</span>
	  </div>
	</div>
  </div>
</s:form>
<p class="err">
	<s:property value="errmsg" />
</p>
<jsp:include page="footer.jsp" />
