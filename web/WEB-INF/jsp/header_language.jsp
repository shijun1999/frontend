<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="headerDiv">
	<div id="languageDiv">
		<s:select list="#session.languageList" listKey="langId" listValue="nameInLocal" name="#session.langId" id="languageSelect" />
	</div>
</div>
<script type="text/javascript">
$("#languageSelect").change(function () {
	document.form1.action = "cityCourseList!load?request_locale=" + $(this).val();
	document.form1.submit();
});
</script>