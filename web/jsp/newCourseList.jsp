<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
</head>
<body>

	<s:form id="form1">
		<div class="container">
			<div>
				<!-- TODO -->
				<table>
					<s:iterator var="course" value="#request.courseList" status="statu">
						<tr>
							<td width="800px" height="30px"><s:property value="#course.fullName" /> <s:property value="#course.locationKey" /></td>
							<td rowspan="2"><img src="<s:property value="#course.localhostPictureDisp" />" width="80px" height="80px" /></td>
						</tr>
						<tr>
							<td width="380px"><span><s:property value="#course.courseContent" /></span><br> <span><s:property value="#course.additionalInfo" /></span><br>
								<span></span> <label>合格</label> <s:checkbox name="#course.courseIdentiNo" class="form-control" size="10" value="#course.okFlg" /></td>
						</tr>
						<!-- image -->
						<tr>
							<td><s:iterator var="coursePicture" value="#request.coursePictureListDisp" status="statu">
									<img src="<s:property value="#coursePicture" />" width="120px" height="60px" />
								</s:iterator></td>
							<td></td>
						</tr>
					</s:iterator>
					<s:hidden id="courseIdentiNo" name="courseIdentiNo" value="" />
					<s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />
					
					
					<s:checkboxlist name="courseList" list="#request.courseList"  listKey="courseIdentiNo" listValue="okFlg"/>
					
					
				</table>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10 ">
					<span> <s:submit method="cancel" value="キャンセル" cssClass="btn btn-primary" /> <s:submit method="save" value="登録" cssClass="btn btn-primary" />
					</span>
				</div>
			</div>
		</div>
	</s:form>
	<p class="err">
		<s:property value="errmsg" />
	</p>
	<script type="text/javascript">
		function courselist(courseIdentiNo, localhostIdentiNo) {
			//document.getElementById('courseIdentiNo').value = courseIdentiNo;
			//document.getElementById('localhostIdentiNo').value = localhostIdentiNo;
			//document.form1.action = "newCourseListEntity!save";
			//document.form1.submit();
		}
	</script>
	<jsp:include page="footer.jsp" />