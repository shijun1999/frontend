<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="head.jsp" />
<jsp:include page="header.jsp" />
<s:form id="form1" cssClass="form-horizontal">
	<div class="container">
		<div class="form-group">
			<label>我的注文</label>
			<table>
				<s:iterator var="userOrder" value="#request.userOrderList" status="statu">
					<tr>
						<td width="800px" height="30px"><s:property value="#userOrder.courseFullName" /></td>

						<td>旅行日</td>
						<td><s:property value="#userOrder.reservationDate" /></td>
					</tr>
					<tr>
						<td width="380px"><span><s:property value="#userOrder.score" /></span><br> <span><s:property value="#userOrder.comment" /></span></td>
						<td><s:if test="#userOrder.comment==''">
								<div class="link" onclick="courseComment('<s:property value="#userOrder.courseIdentiNo" />','<s:property value="#userOrder.localhostIdentiNo" />');">
									評価</div>
							</s:if> <s:else>
								<div class="link" onclick="lookComment('<s:property value="#userOrder.comment" />');">評価を見る</div>
							</s:else></td>
					</tr>
				</s:iterator>
			</table>
		</div>
		<s:hidden id="courseIdentiNo" name="courseIdentiNo" value="" />
		<s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />
		<s:hidden id="comment" name="comment" value="" />
		<div class="form-group">
			<label>我的积分 </label>
			<s:property value="kootourPoint" />
			<label>我的心仪单</label>
			<table>
				<s:iterator var="course" value="#request.courseList" status="statu">
					<tr>
						<td width="800px" height="30px">
							<div class="link" onclick="courselist('<s:property value="#course.courseIdentiNo" />','<s:property value="#course.localhostIdentiNo" />');">
								<s:property value="#course.fullName" />
							</div> <s:property value="#course.workDatesDisp" />
						</td>
						<td rowspan="2"><img src="<s:property value="#course.localhostPictureDisp" />" width="80px" height="80px" /></td>
					</tr>
					<tr>
						<td width="380px"><span><s:property value="#course.courseContent" /></span><br> <span><s:property value="#course.additionalInfo" /></span></td>
					</tr>
					<!-- image -->
					<tr>
						<td><s:iterator var="coursePicture" value="#request.coursePictureListDisp" status="statu">
								<img src="<s:property value="#coursePicture.fullPath" />" width="120px" height="60px" />
							</s:iterator></td>
						<td></td>
					</tr>
				</s:iterator>
				<s:hidden id="courseIdentiNo" name="courseIdentiNo" value="" />
				<s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />
				<s:hidden id="comment" name="comment" value="" />
			</table>
		</div>
		<s:submit method="cancel" value="Exit" cssClass="btn btn-primary" />

	</div>
</s:form>
<p class="err">
	<s:property value="errmsg" />
</p>
<script type="text/javascript">
	function courseComment(courseIdentiNo, localhostIdentiNo) {
		document.getElementById('courseIdentiNo').value = courseIdentiNo;
		document.getElementById('localhostIdentiNo').value = localhostIdentiNo;
		document.form1.action = "courseComment!load";
		document.form1.submit();
	}
	function lookComment(comment) {
		document.getElementById('comment').value = comment;
		document.form1.action = "courseComment!load";
		document.form1.submit();
	}
</script>
<jsp:include page="footer.jsp" />
