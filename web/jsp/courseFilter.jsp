<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" href="css/bootstrap-datepicker3.css" />
<link rel="stylesheet" href="css/bootstrap-dialog.min.css" />
<link rel="stylesheet" href="css/font-awesome/css/font-awesome.min.css">
<jsp:include page="header.jsp" />
<div class="container">
	<div class="row">
		<div class="col-md-2 col-md-offset-5" id="date-picker"></div>
		<input type="hidden" id="hidden_date">
		<div class="col-md-1 col-md-offset-9">
			<input type="button" value="OK" class="btn btn-primary">
		</div>
	</div>
</div>
<div>
	<s:hidden id="datesDisplay" name="datesDisplay" />
	<s:form cssClass="form-horizontal">
		<div class="container">

			<fieldset>
				<legend> 検索内容</legend>
				<div class="form-group">
					<label><s:text name="type.adventure" /></label>
					<s:checkbox id="adventure" name="adventure" class="form-control" size="10" onclick="selectOne()" />
					<label><s:text name="type.cultureArts" /></label>
					<s:checkbox id="cultureArts" name="cultureArts" class="form-control" size="10" onclick="selectOne()" />
					<label><s:text name="type.festivalEvents" /></label>
					<s:checkbox id="festivalEvents" name="festivalEvents" class="form-control" size="10" onclick="selectOne()" />
					<label><s:text name="type.foodDrink" /></label>
					<s:checkbox id="foodDrink" name="foodDrink" class="form-control" size="10" onclick="selectOne()" />
					<label><s:text name="type.historical" /></label>
					<s:checkbox id="historical" name="historical" class="form-control" size="10" onclick="selectOne()" />
				</div>
				<div class="form-group">
					<label><s:text name="type.leisureSports" /></label>
					<s:checkbox id="leisureSports" name="leisureSports" class="form-control" size="10" onclick="selectOne()" />
					<label><s:text name="type.natureRural" /></label>
					<s:checkbox id="natureRural" name="natureRural" class="form-control" size="10" onclick="selectOne()" />
					<label><s:text name="type.nightlifeParty" /></label>
					<s:checkbox id="nightlifeParty" name="nightlifeParty" class="form-control" size="10" onclick="selectOne()" />
					<label><s:text name="type.shoppingMarket" /></label>
					<s:checkbox id="shoppingMarket" name="shoppingMarket" class="form-control" size="10" onclick="selectOne()" />
					<label><s:text name="type.allType" /></label>
					<s:checkbox id="allType" name="allType" class="form-control" size="10" onclick="selectAll(this)" />
				</div>

				<div class="row">
					<div class="col-xs-8 col-sm-11">
						<div class="input-group">
							<s:textfield class="form-control date-picker" name="selectDay" type="text" data-date-format="dd-mm-yyyy" />
							<span class="input-group-addon">
								<i class="fa fa-calendar bigger-110"></i>
							</span>
						</div>
					</div>
				</div>

				<input type="hidden" id="hidden_date">
				<s:hidden id="datesDisplay" name="datesDisplay" />
				<div class="form-group">
					<label><s:text name="select.langCode1" /></label>
					<s:select name="selectLangId1" class="form-control" list="#session.langList" lisyKey="key" listValue="value" style="width: 100px;" />
					<label><s:text name="select.langCode2" /></label>
					<s:select name="selectLangId2" class="form-control" list="#session.langList" lisyKey="key" listValue="value" style="width: 100px;" />
					<label><s:text name="select.langCode3" /></label>
					<s:select name="selectLangId3" class="form-control" list="#session.langList" lisyKey="key" listValue="value" style="width: 100px;" />
				</div>
				<label>Within senven days</label>
					<s:checkbox id="withinDays" name="withinDays" class="form-control" size="10" />
				<label>优惠</label>
				    <s:checkbox id="discountFlg" name="discountFlg" class="form-control" size="10" />
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10 ">
						<span> <s:submit method="filterOk" value="%{getText('btn.confirm')}" cssClass="btn btn-primary" /> <s:submit method="back"
								value="%{getText('btn.back')}" cssClass="btn btn-primary" /> <s:submit method="cancel" value="%{getText('btn.cancel')}" cssClass="btn btn-primary" />
						</span>
					</div>
				</div>
		</div>
	</s:form>
	<p class="err">
		<s:property value="errmsg" />
	</p>
	<script type="text/javascript">
		function selectAll(allType) {

			if (allType.checked == true) {

				var chk1 = document.getElementById('adventure');
				chk1.checked = true;
				var chk2 = document.getElementById('cultureArts');
				chk2.checked = true;
				var chk3 = document.getElementById('festivalEvents');
				chk3.checked = true;
				var chk4 = document.getElementById('foodDrink');
				chk4.checked = true;
				var chk5 = document.getElementById('historical');
				chk5.checked = true;
				var chk6 = document.getElementById('leisureSports');
				chk6.checked = true;
				var chk7 = document.getElementById('natureRural');
				chk7.checked = true;
				var chk8 = document.getElementById('nightlifeParty');
				chk8.checked = true;
				var chk9 = document.getElementById('shoppingMarket');
				chk9.checked = true;
			} else {
				var chk1 = document.getElementById('adventure');
				chk1.checked = false;
				var chk2 = document.getElementById('cultureArts');
				chk2.checked = false;
				var chk3 = document.getElementById('festivalEvents');
				chk3.checked = false;
				var chk4 = document.getElementById('foodDrink');
				chk4.checked = false;
				var chk5 = document.getElementById('historical');
				chk5.checked = false;
				var chk6 = document.getElementById('leisureSports');
				chk6.checked = false;
				var chk7 = document.getElementById('natureRural');
				chk7.checked = false;
				var chk8 = document.getElementById('nightlifeParty');
				chk8.checked = false;
				var chk9 = document.getElementById('shoppingMarket');
				chk9.checked = false;
			}
		}
		function selectOne() {

			var chk1 = document.getElementById('adventure');
			var chk2 = document.getElementById('cultureArts');
			var chk3 = document.getElementById('festivalEvents');
			var chk4 = document.getElementById('foodDrink');
			var chk5 = document.getElementById('historical');
			var chk6 = document.getElementById('leisureSports');
			var chk7 = document.getElementById('natureRural');
			var chk8 = document.getElementById('nightlifeParty');
			var chk9 = document.getElementById('shoppingMarket');
			var chk10 = document.getElementById('allType');

			if (chk1.checked == true && chk2.checked == true && chk3.checked == true && chk4.checked == true && chk5.checked == true && chk6.checked == true && chk7.checked == true
					&& chk8.checked == true && chk9.checked == true) {
				chk10.checked = true;
			} else {
				chk10.checked = false;
			}

		}
	</script>
	<p class="err">
		<s:property value="errmsg" />
	</p>
	<jsp:include page="footer.jsp" />
	<script src="js/bootstrap-datepicker.js" type="text/javascript"></script>
	<script src="js/bootstrap-dialog.min.js" type="text/javascript"></script>
	<script src="js/courseFilter.js" type="text/javascript"></script>