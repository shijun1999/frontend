<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="header.jsp" />
<s:form cssClass="form-horizontal">
	<div class="container">

		<form class="form-inline">
			<fieldset>
				<legend> 検索条件</legend>
				<div class="form-group">
       <label>言語コード</label>
       <s:textfield name="langId" class="form-control" size="10" />
       <label>識別番号</label>
       <s:textfield name="identiNo" class="form-control" size="10" />
       <label>国（地区）名称</label>
       <s:textfield name="stateName" class="form-control" size="10" />
       <label>省名称</label>
       <s:textfield name="provinceName" class="form-control" size="10" />
       <label>都市名称</label>
       <s:textfield name="cityName" class="form-control" size="10" />
       <label>区分</label>
       <s:textfield name="type" class="form-control" size="10" />
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 ">
				<span>
       <s:submit method="search" value="検索" cssClass="btn btn-primary" />
       <s:submit method="clear" value="クリア" cssClass="btn btn-primary" />
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
       <label>通用名称</label>
       <s:textfield name="useName" class="form-control" size="10" />
       <label>種類１</label>
       <s:textfield name="adventure" class="form-control" size="10" />
       <label>種類２</label>
       <s:textfield name="cultureArts" class="form-control" size="10" />
       <label>種類３</label>
       <s:textfield name="festivalEvents" class="form-control" size="10" />
		</div>
				<div class="form-group">
       <label>種類４</label>
       <s:textfield name="foodDrink" class="form-control" size="10" />
       <label>種類５</label>
       <s:textfield name="historical" class="form-control" size="10" />
       <label>種類６</label>
       <s:textfield name="leisureSports" class="form-control" size="10" />
       <label>種類７</label>
       <s:textfield name="natureRural" class="form-control" size="10" />
       <label>種類８</label>
       <s:textfield name="nightlifeParty" class="form-control" size="10" />
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 ">
				<span>
       <s:submit method="save" value="登録" cssClass="btn btn-primary" />
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
