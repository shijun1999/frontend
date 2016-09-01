<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="header.jsp" />
<s:form cssClass="form-horizontal">
	<div class="container">

			<fieldset>
				<legend> 検索内容</legend>
				<div class="form-group">
       <label>言語コード</label>
       <s:textfield name="langId" class="form-control" size="10" />
       <label>導向番号</label>
       <s:textfield name="localhostIdentiNo" class="form-control" size="10" />
       <label>所属識別番号</label>
       <s:textfield name="vendorIdentiNo" class="form-control" size="10" />
       <label>正式名称</label>
       <s:textfield name="fullName" class="form-control" size="10" />
       <label>略名称</label>
       <s:textfield name="shortName" class="form-control" size="10" />
		</div>
				<div class="form-group">
       <label>LoginId</label>
       <s:textfield name="loginId" class="form-control" size="10" />
       <label>Password</label>
       <s:textfield name="password" class="form-control" size="10" />
       <label>PostCode</label>
       <s:textfield name="loginType" class="form-control" size="10" />
       <label>国名</label>
       <s:textfield name="state" class="form-control" size="10" />
       <label>所在地１</label>
       <s:textfield name="addr1" class="form-control" size="10" />
		</div>
				<div class="form-group">
       <label>所在地２</label>
       <s:textfield name="addr2" class="form-control" size="10" />
       <label>所在地３</label>
       <s:textfield name="addr3" class="form-control" size="10" />
       <label>電話国別番号</label>
       <s:textfield name="telCode" class="form-control" size="10" />
       <label>電話国別番号</label>
       <s:textfield name="telNo" class="form-control" size="10" />
       <label>Email</label>
       <s:textfield name="email" class="form-control" size="10" />
		</div>
				<div class="form-group">
       <label>写真</label>
       <s:textfield name="photo" class="form-control" size="10" />
       <label>備考</label>
       <s:textfield name="memo" class="form-control" size="10" />
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 ">
				<span>
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
