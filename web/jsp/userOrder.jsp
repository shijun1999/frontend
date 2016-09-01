<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="header.jsp" />
<script type="text/javascript">
	function sumNum() {
		var sumValue;

		var adultNum = document.getElementById('adultNum');
		var adultPrice = document.getElementById('adultPrice');
		if (adultNum == " ") {
			document.getElementById('adultNum').value = 0;
			adultNum = 0;
		}
		var adultPriceTotal = adultNum.value * adultPrice.value;

		var oldPersonNum = document.getElementById('oldPersonNum');
		var oldPersonPrice = document.getElementById('oldPersonPrice');
		if (oldPersonNum == " ") {
			document.getElementById('oldPersonNum').value = 0;
			oldPersonNum = 0;
		}
		var oldPriceTotal = oldPersonNum.value * oldPersonPrice.value;

		var childNum = document.getElementById('childNum');
		var childPrice = document.getElementById('childPrice');
		if (childNum == " ") {
			document.getElementById('childNum').value = 0;
			childNum = 0;
		}
		var childPriceTotal = childNum.value * childPrice.value;

		document.getElementById("totalMoney").value = adultPriceTotal + oldPriceTotal + childPriceTotal;
	}
</script>
<s:include value="Message.jsp"></s:include>
<s:form cssClass="form-horizontal">
	<div class="container">

		<fieldset>
			<legend> 検索内容</legend>
			<div class="form-group">
				<label>導向名</label>
				<s:property value="touristFullName" />
				<label>商品名</label>
				<s:property value="courseFullName" />
			</div>
			<label>予約日</label>
			<s:textfield name="reservationDate" class="txtDate" size="10" />
			<br> <label>大人数</label>
			<s:textfield id="adultNum" name="adultNum" class="form-control" size="10" onkeyup="sumNum()" maxLength="2" />
			<s:textfield id="adultPrice" name="adultPrice" readonly="true" />
			<s:property value="moneyUnit" />
			<br> <label>老人数</label>
			<s:textfield id="oldPersonNum" name="oldPersonNum" class="form-control" size="10" onkeyup="sumNum()" maxLength="2" />
			<s:textfield id="oldPersonPrice" name="oldPersonPrice" readonly="true" />
			<s:if test="#oldPersonPrice==''"></s:if>
			<s:else><s:property value="moneyUnit" /></s:else>
			<br> <label>子供数</label>
			<s:textfield id="childNum" name="childNum" class="form-control" size="10" onkeyup="sumNum()" maxLength="2" />
			<s:textfield id="childPrice" name="childPrice" readonly="true" />
			<s:if test="#childPrice==''"></s:if>
			<s:else><s:property value="moneyUnit" /></s:else>
			<br> <label>赤ちゃん単価</label>
			<s:textfield id="infantNum" name="infantNum" class="form-control" size="10" onkeyup="sumNum()" maxLength="2" />
			<s:textfield id="infantPrice" name="infantPrice" readonly="true" />
			<s:if test="#childPrice==''"></s:if>
			<s:else><s:property value="moneyUnit" /></s:else>
			<br> <label>合計</label>
			<s:textfield id="totalMoney" name="totalMoney" readonly="true" />
			<s:property value="moneyUnit" />
			<br>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10 ">
					<span> <s:submit method="save" value="登録" cssClass="btn btn-primary" /> <s:submit method="cancel" value="キャンセル" cssClass="btn btn-primary" /> <s:submit
							method="back" value="戻る" cssClass="btn btn-primary" />
					</span>
				</div>
			</div>
	</div>
</s:form>
<p class="err">
	<s:property value="errmsg" />
</p>
<jsp:include page="footer.jsp" />
