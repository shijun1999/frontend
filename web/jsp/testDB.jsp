<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- <jsp:include page="header.jsp" /> --%>
<s:include value="Message.jsp"></s:include>
<s:form cssClass="form-horizontal">
	<div class="container">

	  <div class="form-group">
		<div class="col-sm-offset-2 col-sm-10 ">
		 <span>
	 	    <s:submit method="testUser_order" value="DBテストuser_order" cssClass="btn btn-primary" />
            <s:submit method="back" value="next" cssClass="btn btn-primary" />
		 </span>
	    </div>
	 </div>
  </div>
</s:form>
<p class="err">
	<s:property value="errmsg" />
</p>
<jsp:include page="footer.jsp" />
