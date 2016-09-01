<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<s:if test="existMessages || existErrorMessages">				
	<br>
	<center>
		<div class="msgarea">
			<fieldset class="msgarea">
				<div class="msg">
					<s:if test="existMessages">
						<s:iterator value="lstMessage">
							<span class="info"><s:property/></span>
							<br>
						</s:iterator>
					</s:if>
					<s:if test="existErrorMessages">
						<s:iterator value="lstErrorMessage">
							<span class="err"><s:property /></span>
							<br>
						</s:iterator>
					</s:if>
				</div>
			</fieldset>
		</div>
	</center>
</s:if>