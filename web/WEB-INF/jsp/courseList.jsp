<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="header.jsp" />
<s:form cssClass="form-horizontal">
	<div class="container">

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 ">
				<span>
       <s:submit method="changeCity" value="更改城市" cssClass="btn btn-primary" />
		</span>
	  </div>
	</div>
			<fieldset>
				<legend> 検索内容</legend>
				<div class="form-group">
       <label>国</label>
       <s:textfield name="state" class="form-control" size="10" />
       <label>都市</label>
       <s:textfield name="city" class="form-control" size="10" />
       <label>商品一覧</label>
       <s:textfield name="course" class="form-control" size="10" />
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 ">
				<span>
       <s:submit method="back" value="戻る" cssClass="btn btn-primary" />
       <s:submit method="attrFilter" value="更多条件" cssClass="btn btn-primary" />
		</span>
	  </div>
	</div>
  </div>
</s:form>
<p class="err">
	<s:property value="errmsg" />
</p>
<jsp:include page="footer.jsp" />
