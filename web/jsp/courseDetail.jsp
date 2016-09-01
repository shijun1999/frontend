<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>Vancouver Bike Tour | Kootour</title>
    <link rel="icon" href="/images/favicon.ico" type="image/x-icon"/>

    <!-- Bootstrap -->
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="/assets/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <link href="/assets/css/kootour.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<s:form id="form1" onSubmit="return false;" method="post">
    <!-- Begin navbar -->
    <nav class="navbar navbar-kootour">
    	<jsp:include page="header.jsp" />
    </nav>

    <nav class="navbar-breadcrumb">
        <div class="container">
            <ol class="breadcrumb">
                <s:iterator var="menuInfo" value="#request.curMenuList" status="status">
            		<s:if test="#status.last">
                    	<li class="active"><s:property value="#menuInfo.menuDispName" /></li>
					</s:if>
					<s:else>
						<li><a href="<s:property value="#menuInfo.menuClassName" />!<s:property value="#menuInfo.menuMethodName" />"><s:property value="#menuInfo.menuDispName" /></a></li>
					</s:else>
            	</s:iterator>
            </ol>
        </div>
   </nav>

    <div class="container">
        <div class="row">
            <div class="left-column col-lg-8 col-md-8 col-sm-12 col-xs-12">

                <section class="carousel-kootour carousel-kootour-section nopadding col-xs-12">
                    <!-- carousel -->
                    <div id="carousel-kootour" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                            <!-- <li data-target="#carousel-kootour" data-slide-to="0" class="active"></li>
                            <li data-target="#carousel-kootour" data-slide-to="1"></li>
                            <li data-target="#carousel-kootour" data-slide-to="2"></li> -->
                            <s:iterator var="coursePicture" value="#request.coursePictureListDisp" status="status">
                            	<s:if test="#status.first">
                            		<li data-target="#carousel-kootour" data-slide-to="<s:property value="#status.index" />" class="active"></li>
								</s:if>
								<s:else>
									<li data-target="#carousel-kootour" data-slide-to="<s:property value="#status.index" />"></li>
								</s:else>
                            </s:iterator>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                            <s:iterator var="coursePicture" value="#request.coursePictureListDisp" status="status">
                            	<s:if test="#status.first">
									<div class="item active">
								</s:if>
								<s:else>
									<div class="item">
								</s:else>
	                                <img src="<s:property value="#coursePicture.fullPath" />" alt="<s:property value="#coursePicture.fullName" />">
	                            </div>
                            </s:iterator>
                        </div>

                        <!-- Controls -->
                        <a class="left carousel-control" href="#carousel-kootour" role="button" data-slide="prev">
                            <span class="icon icon-prev" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#carousel-kootour" role="button" data-slide="next">
                            <span class="icon icon-next" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>

                    <s:if test='#request.favoriteIdentiNo!=""'>
                    	<div id="div_saveorcancel" class="add-favorited" onclick="saveOrCancelWish('<s:property value="#request.courseIdentiNo" />');event.cancelBubble=true;"></div>
                    </s:if>
                    <s:else>
                    	<div id="div_saveorcancel" class="add-favorite" onclick="saveOrCancelWish('<s:property value="#request.courseIdentiNo" />');event.cancelBubble=true;"></div>
                    </s:else>
                </section>

                <section class="tour-detail section noborder nomargin col-xs-12">
                    <div class="tour-descriptions">
                        <table class="tour-description">
                            <tr>
                                <td>
                                    <img class="icon" src="/images/icons/icon_time_bgwhite_300X300.png" alt="time">
                                </td>

                                <td>
                                    <s:property value="#request.duration" /> <s:property value="#request.durationUnit" />
                                </td>
                            </tr>
                        </table>
                        <table class="tour-description">
                            <tr>
                                <td>
                                    <img class="icon" src="/images/icons/icon_luggage_bgwhite_300X300.png" alt="luggage">
                                </td>

                                <td>
                                    <s:property value="#request.minTouristNum" />-<s:property value="#request.maxTouristNum" /> travellers
                                </td>
                            </tr>
                        </table>
                        <table class="tour-description">
                            <tr>
                                <td>
                                    <img class="icon" src="/images/icons/icon_location_bgwhite_300X300.png" alt="location">
                                </td>

                                <td>
                                    <s:property value="#request.tourLocation" />
                                </td>
                            </tr>
                        </table>
                        <table class="tour-description">
                            <tr>
                                <td>
                                    <img class="icon" src="/images/icons/icon_language_bgwhite_300X300.png" alt="language">
                                </td>

                                <td>
									<!-- English &<br/> Chinese -->
                                    <s:property value="#request.useLangId"/>
                                </td>
                            </tr>
                        </table>
                    </div>

                    <h2 class="blue"><s:property value="#request.fullName"/>&nbsp;<small>($<s:property value="#request.scheduleOptionListDisp[0].retailPrice"/> per person/group)</small></h2>

                    <div class="vote-wrapper">
                        <ul class="vote">
                            <s:iterator var="scoreIconItem" value="#request.scoreIconListDisp" status="status">
                            	<li><img src="<s:property value="scoreIconItem" />"></li>
                            </s:iterator>
                        </ul>
                         <span class="vote-label"><s:property value="#request.reviewNumDisp"/> reviews</span>
                    </div>
                </section>

                <section class="section col-xs-12">
                    <span class="title">Tour Summary</span>
                    <div id="readmore1">
                            <p><s:property value="#request.courseContent" escape="false" /></p>

                            <span class="subtitle">Tour itinerary</span>

                            <p><s:property value="#request.additionalInfo" escape="false" /></p>
                    </div>



                    <a href="#" class="action">read more</a>
                </section>

                <section class="section col-xs-12">
                    <span class="title">Important Information</span>

                    <div id="readmore2">
                        <table class="table-information col-lg-6 col-md-12 col-sm-12 col-xs-12">
                            <tr>
                                <td class="subtitle">Tour Location</td>
                                <td><s:property value="#request.tourLocation" /></td>
                            </tr>
                            <tr>
                                <td class="subtitle">Duration</td>
                                <td><s:property value="#request.duration" />
                                <s:property value="#request.durationUnit" /></td>
                            </tr>
                            <tr>
                                <td class="subtitle">Meetup Location</td>
                                <td><s:property value="#request.meetupLocation" /></td>
                            </tr>
                        </table>

                        <div class="clearfix"></div>

                        <p class="subtitle">Inclusions</p>
                        <ul>
                            <s:iterator var="inclusionItem" value="#request.inclusionListDisp" status="status">
                            	<li><s:property value="#inclusionItem.inExclusion" /></li>
                            </s:iterator>
                        </ul>

                        <p class="subtitle">Exclusions</p>
                        <ul>
                            <s:iterator var="exclusionItem" value="#request.exclusionListDisp" status="status">
                            	<li><s:property value="#exclusionItem.inExclusion" /></li>
                            </s:iterator>
                        </ul>
                    </div>

                    <a href="#" class="action">read more</a>
                </section>
            </div>

            <div class="right-column col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <section class="widget nopadding section section-small">
                    <form action="booking.html" class="form-horizontal">
                        <div class="widget-row col-xs-12">
                            <div class="col-xs-6 col-sm-8 nopadding">
                                <span class="subtitle">Calendar:</span>
                            </div>
                            <div class="col-xs-6 col-sm-4 nopadding">
                                <input type="text" name="reservationDate" class="form-control" id='widget-calendar' placeholder="pick a date">
                            </div>
                        </div>

                        <div class="widget-row col-xs-12">
                            <div class="col-xs-6 col-sm-8 nopadding">
                                <span class="subtitle">Time:</span>
                            </div>
                            <div class="col-xs-6 col-sm-4 nopadding">
                                <div class="form-group">
                                    <select id="selectTime" onchange="timeChange();" name="bgnTime" class="form-control" type="text">
                                    	<option value=""></option>
                                        <s:iterator var="timeTableGroup" value="#request.timeTable" status="status">
	                                        <option value="<s:property value="#timeTableGroup" />"><s:property value="#timeTableGroup" /></option>
                                    	</s:iterator>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="widget-row col-xs-12">
                            <div class="col-xs-6 col-sm-8 nopadding">
                                <span class="subtitle">Travellers:</span>
                            </div>
                            <div class="col-xs-6 col-sm-4 nopadding">
                                <div class="form-group">
                                    <select id="selectCount" class="form-control" onchange="countChange();" name="touristNum" type="text">
                                    	<option value=""></option>
                                        <s:iterator var="touristMinMaxGroup" value="#request.touristMinMaxList" status="status">
                                        	<s:if test='#request.touristNum==#touristMinMaxGroup'>
									        	<option value="<s:property value="#touristMinMaxGroup" />" selected><s:property value="#touristMinMaxGroup" /></option>
									        </s:if>
									        <s:else>
									        	<option value="<s:property value="#touristMinMaxGroup" />"><s:property value="#touristMinMaxGroup" /></option>
									        </s:else>
                                    	</s:iterator>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="widget-row col-xs-12">
                            <div class="option-label">
                                <span class="subtitle">Customized Options:</span>
                            </div>
                        </div>
						<s:iterator var="extraOption" value="#request.extraOptionListDisp" status="status">
	                        <div class="widget-row customized-option">
	                            <div class="option-checkbox">
	                                <input type="checkbox" id="chb<s:property value="#status.index+1" />" onchange="checkChange('chb<s:property value="#status.index+1" />','<s:property value="#extraOption.extraPrice" />');" name="checkbox" class="checkbox" />
	                                <label for="chb<s:property value="#status.index+1" />"></label>
	                                <input type="hidden" id="extraOptionIdentiNo<s:property value="#status.index" />" value="<s:property value="#extraOption.extraOptionIdentiNo"/>">
	                            </div>
	                            <div class="option-label">
	                                <label for="chb<s:property value="#status.index+1" />"><s:property value="#extraOption.extraOptionName" /></label>
	                            </div>
	                            <div class="option-price">
	                                <span><s:property value="#extraOption.extraPrice" /></span>
	                                <input type="hidden" id="extraPrice<s:property value="#status.index" />" name="extraPrice" value="<s:property value="#extraOption.extraPrice" />">
	                                <span class="hours"><i><s:property value="#extraOption.extraTime" /> <s:property value="#extraOption.extraUnit" /></i></span>
	                            </div>
	                        </div>
                        </s:iterator>


                        <div class="col-xs-12 text-center">
                        	<s:if test='#request.curTouristIdentiNo=="AI999999999"'>
					        	<button id="bookBtn" class="btn btn-lg btn-kootour-bold fullwidth" onclick="toBookSummary();"></button>
					        </s:if>
					        <s:else>
					        	<button id="bookBtn" class="btn btn-lg btn-kootour-bold fullwidth" disabled="disabled" onclick="toBookSummary();">Book Now</button>
					        </s:else>
                        </div>

                        <div class="clearfix"></div>
                    </form>
                </section>
                <input type="hidden" id="extraOptionIDs" name="extraOptionIDs" value="">
                <input type="hidden" id="touristIdentiNo" name="touristIdentiNo" value="<s:property value="#request.touristIdentiNo"/>">
				<input type="hidden" id="courseIdentiNo" name="courseIdentiNo" value="<s:property value="#request.courseIdentiNo"/>">
				<input type="hidden" id="langId" name="langId" value="<s:property value="#request.langId"/>">
				<input type="hidden" id="favoriteIdentiNo" name="favoriteIdentiNo" value="<s:property value="#request.favoriteIdentiNo"/>">
				<input type="hidden" id="curTouristIdentiNo" name="curTouristIdentiNo" value="<s:property value="#request.curTouristIdentiNo"/>">
				<input type="hidden" id="personOrGroup" name="personOrGroup" value="<s:property value="#request.personOrGroup"/>">
				<input type="hidden" id="largeDiscountFlg" name="largeDiscountFlg" value="<s:property value="#request.scheduleOptionListDisp.get(0).largeDiscountFlg"/>">
				<input type="hidden" id="largeDiscountType" name="largeDiscountType" value="<s:property value="#request.scheduleOptionListDisp.get(0).largeDiscountType"/>">
				<input type="hidden" id="largeDiscountPercent" name="largeDiscountPercent" value="<s:property value="#request.scheduleOptionListDisp.get(0).largeDiscountPercent"/>">
				<input type="hidden" id="largeDiscountValue" name="largeDiscountValue" value="<s:property value="#request.scheduleOptionListDisp.get(0).largeDiscountValue"/>">
				<input type="hidden" id="largeGroupLimit" name="largeGroupLimit" value="<s:property value="#request.scheduleOptionListDisp.get(0).largeGroupLimit"/>">
				<input type="hidden" id="price" name="price" value="<s:property value="#request.scheduleOptionListDisp.get(0).price"/>">
				<input type="hidden" id="curPrice" name="curPrice" value="">

				<s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />
                <section class="section section-small nopadding">
                    <div class="col-xs-12">
                        <p>
                        	<s:if test='#request.favoriteIdentiNo!=""'>
                            	<img id="wishImg" src="/images/icons/heart_active.png" class="medium-icon" />
                            	<a id="linkText" class="wishlink" data-saved="true" href="#">Remove to the Wish List</a>
                            </s:if>
                            <s:else>
                            	<img id="wishImg" src="/images/icons/heart_intactive.png" class="medium-icon" />
                            	<a id="linkText" class="wishlink" data-saved="false" href="#">Save to the Wish List</a>
                            </s:else>
                        </p>
                    </div>

                    <div class="col-xs-12">
                        <p class="nomargin">
                            <img src="/images/icons/share_48X48.png" class="medium-icon" />
                            <a href="shareKootour!load">Share this and get free credit</a>
                        </p>
                    </div>

                    <div class="col-xs-12 nopadding divider"></div>

                    <div class="col-xs-12">
                        <p>Need help to customize these tour?</p>
                        <s:if test='#request.curTouristIdentiNo=="AI999999999"'>
				        	<a href="touristLogin!load" class="btn btn-kootour fullwidth">Contact <s:property value="#request.localhostFullNameDisp" /></a>
				        </s:if>
				        <s:else>
				        	<a href="sendMessage!load?localhostIdentiNo=<s:property value="#request.localhostIdentiNo" />" class="btn btn-kootour fullwidth">Contact <s:property value="#request.localhostFullNameDisp" /></a>
				        </s:else>

                    </div>

                    <div class="clearfix "></div>
                </section>
            </div>

            <div class="left-column col-lg-8 col-md-8 col-sm-12 col-xs-12">
                <section class="section col-xs-12">
                    <span class="title">About the Guide</span>

                    <div class="col-xs-12 guide nopadding">
                        <div class="illustration">
                            <div class="user-thumbnail img-circle" style="background-image:url('<s:property value="#request.localhostPictureDisp" />')"></div>
                        </div>
                        <div class="details">
                            <p>
                                <span class="subtitle"><s:property value="#request.localhostFullNameDisp" /></span>
                            </p>
                            <p><i>Member since August 2015</i></p>
                            <p><s:property value="#request.localhostMemoDisp" /></p>
                        </div>
                    </div>

                    <p class="nomargin text-right">
                        <a href="#" onclick="toLocalHostDetail('<s:property value="#request.localhostIdentiNo" />');" class="action">Learn more</a>
                    </p>
                </section>

                <section class="section col-xs-12 nopadding reviews">
                    <span class="title">Recommended Reviews</span>
					<s:iterator var="courseComment" value="#request.courseCommentListDisp" status="statu">
	                    <div class="col-xs-12 review">
	                        <div class="illustration">
	                            <div style="background-image:url('<s:property value="#courseComment.touristPicture" />')" class="user-small-thumbnail img-circle"></div>
	                        </div>

	                        <div class="details">
	                            <p class="subtitle nomargin"><s:property value="#courseComment.touristFirstName" />
	                            		<s:property value="#courseComment.touristLastName" /></p>

	                            <div class="vote-wrapper">
	                                <ul class="vote">
	                                    <s:iterator var="scoreIconItem" value="#courseComment.scoreIconListDisp" status="status">
				                            <li><img src="<s:property value="scoreIconItem" />"></li>
				                        </s:iterator>
	                                </ul>
	                                 <span class="vote-label">December 2015</span>
	                            </div>

	                            <p><i><s:property value="#courseComment.comment" /></i></p>
	                        </div>
	                    </div>
					</s:iterator>

                    <div class="text-center col-xs-12">
                        <button class="btn btn-lg btn-kootour" type="submit">See More (122)</button>
                    </div>
                </section>
            </div>
        </div>
    </div>

    <footer>
        <div class="container">
            <div class="row">
                <div class="footer-block footer-band-wrapper col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <img src="/images/icons/logo_footer.png" />
                    <span class="footer-band">Kootour</span>

                    <form>
                        <select class="form-control black">
                            <option value="en">English</option>
                            <option value="ch">Chinese</option>
                        </select>
                    </form>
                </div>

                <div class="footer-block col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <p><b>Address</b></p>
                    <p>101 - 887 Great Nothern Way</p>
                    <p>Vancouver BC, V5T 4T5</p>
                    <p>Canada</p>
                </div>

                <div class="footer-block col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <p><a href="#">About Us</a></p>
                    <p><a href="#">Help</a></p>
                    <p><a href="contact.html">Contact Us</a></p>
                    <p><a href="#">Terms & Conditions</a></p>
                </div>


                <div class="footer-block col-lg-3 col-md-3 col-sm-4 col-xs-12">

                    <p><b><a href="#">Career Opportunities</a></b></p>

                    <p>Connect With Us</p>

                    <div class="social-links">
                        <a href="#"><img src="/images/icons/icon_facebook.png" /></a>
                        <a href="#"><img src="/images/icons/icon_twitter.png" /></a>
                        <a href="#"><img src="/images/icons/icon_instagram.png" /></a>
                        <a href="#"><img src="/images/icons/icon_linkedin.png" /></a>
                    </div>
                </div>
            </div>
        </div>

        <div class="container copyright text-center">
            <div class="row">
                <div class="col-xs-12">
                &copy; 2016 Kootour Softwares & technologies Inc. All right reserved.
                </div>
            </div>
        </div>
    </footer>
	<s:iterator var="notWorkDayGroup" value="#request.notWorkDays" status="status2">
    	<input type="hidden" id="notWorkDay<s:property value="#status2.index" />" name="notWorkDays" value="<s:property value="#notWorkDayGroup" />"/>
    </s:iterator>
    <script src="/assets/js/jquery-1.12.3.min.js"></script>
    <script src="/assets/js/moment.js"></script>
    <script src="/assets/js/bootstrap.min.js"></script>
    <script src="/assets/js/bootstrap-datetimepicker.min.js"></script>
    <script src="/assets/js/read-more.js"></script>
    <script src="/assets/js/lib/wishlist.js"></script>
    <script src="/assets/js/main.js"></script>
    <script src="/assets/js/tour-page.js"></script>
    <script type="text/javascript">
/* 	    var toursummary = $("#readmore1 > p")[0];
		var toursummaryreadmore = new ReadMore($("#readmore1"), $(toursummary).height()).init();

	    var information = $("#readmore2 > table")[0];
	    var informationreadmore = new ReadMore($("#readmore2"), $(information).height()).init();
	    var testaa="<s:property value='#request.coursePictureListDisp'/>";
	    var disableDate = new Array();
	    disableDate.push(moment("06/27/2016"));
	    disableDate.push(moment("06/28/2016"));
	    disableDate.push(moment("06/30/2016"));
		var widgetcalendar = $('#widget-calendar').datetimepicker({
	        minDate: new Date(),
	        defaultDate: new Date(),
	        format: "MM/DD/YYYY",
	        disabledDates: disableDate
	        //disabledDates: [moment("06/27/2016"), moment("06/02/2016"), moment("06/03/2016")]
	    }).on('dp.change', function(e) {
	        $('#widget-calendar').data("DateTimePicker").hide();
	    }); */
	    function toLocalHostDetail(localhostIdentiNo) {
			document.getElementById('localhostIdentiNo').value = localhostIdentiNo;
			document.form1.action = "localhostDetail!load";
			document.form1.submit();
		}
	    function toBookSummary() {
	    	var curTouristIdentiNo = document.getElementById("curTouristIdentiNo").value;
		    if(curTouristIdentiNo=="AI999999999"){
				document.form1.action = "touristLogin!load";
		    }else{
		    	var checkboxs = document.getElementsByName("checkbox");
		    	var extraOptionIdentiNos = "";
		    	for (var i=0; i< checkboxs.length; i++)
		    	{
		    		if(checkboxs[i].checked){
		    			var extraOptionIdentiNo = document.getElementById("extraOptionIdentiNo"+i).value;
		    			extraOptionIdentiNos = extraOptionIdentiNos + extraOptionIdentiNo + ",";
		    		}
		    	}
		    	document.getElementById("extraOptionIDs").value = extraOptionIdentiNos;
				document.form1.action = "courseDetail!bookSummary";
		    }
			document.form1.submit();
		}
	    function saveOrCancelWish(courseIdentiNo){
			var obj = new Object();
		    obj.courseIdentiNo = courseIdentiNo;
		    obj.touristIdentiNo = document.getElementById("touristIdentiNo").value;
		    obj.langId = document.getElementById("langId").value;
		    obj.favoriteIdentiNo = document.getElementById("favoriteIdentiNo").value;
		    var curTouristIdentiNo = document.getElementById("curTouristIdentiNo").value;
		    if(curTouristIdentiNo=="AI999999999"){
				document.form1.action = "touristLogin!load";
				document.form1.submit();
		    }else{
		    	$.ajax({
					url: 'WishAjaxJason/wishStatusSave',
					type: 'post',
					dataType: 'json',
					data: {"jsonFromWeb": JSON.stringify(obj)},
					success: function(json) {
						var obj = JSON.parse(json);
						var result = obj.result;
						if(result == ""){
							var div = document.getElementById("div_saveorcancel");
							div.className = 'add-favorite';
							document.getElementById("wishImg").src = "images/icons/heart_intactive.png";
							document.getElementById("linkText").innerHTML = "Save to the Wish List";
							$('#linkText').data('saved', false);
						}else{
							var div = document.getElementById("div_saveorcancel");
							div.className = 'add-favorited';
							document.getElementById("wishImg").src = "images/icons/heart_active.png";
							document.getElementById("linkText").innerHTML = "Remove to the Wish List";
							$('#linkText').data('saved', true);
						}
						document.getElementById("favoriteIdentiNo").value = result;
					},
					error: function(res) {
						alert("error")
					}
				});
		    }
		}

	    function timeChange(){
	    	var selectTime = document.getElementById("selectTime").value;
	    	if(selectTime==""){
	    		document.getElementById("bookBtn").disabled=true;
	    	}else{
	    		var selectCount = document.getElementById("selectCount").value;
	    		if(selectCount==""){
		    		document.getElementById("bookBtn").disabled=true;
		    	}else{
		    		document.getElementById("bookBtn").disabled=false;
		    	}
	    	}
	    }

		function countChange(){
			var selectCount = document.getElementById("selectCount").value;
			var price = document.getElementById("price").value;
	    	if(selectCount==""){
	    		document.getElementById("bookBtn").disabled=true;
	    		price = 0;
	    	}else{
	    		var selectTime = document.getElementById("selectTime").value;
		    	if(selectTime==""){
		    		document.getElementById("bookBtn").disabled=true;
		    	}else{
		    		document.getElementById("bookBtn").disabled=false;
		    	}
	    		var personOrGroup = document.getElementById("personOrGroup").value;
	    		var largeDiscountFlg = document.getElementById("largeDiscountFlg").value;
	    		var largeGroupLimit = document.getElementById("largeGroupLimit").value;
	    		var largeDiscountType = document.getElementById("largeDiscountType").value;
	    		var largeDiscountPercent = document.getElementById("largeDiscountPercent").value;
	    		var largeDiscountValue = document.getElementById("largeDiscountValue").value;
	    		if(personOrGroup=="P"){
	    			if(largeDiscountFlg=="1"){
	    				if(selectCount>=largeGroupLimit){
	    					if(largeDiscountType=="1"){
	    						price = parseFloat(price) - parseFloat(price*largeDiscountPercent);
	    					}else if(largeDiscountType=="2"){
	    						price = parseFloat(price) - parseFloat(largeDiscountValue);
	    					}
	    				}
	    			}
	    		}else{
	    			if(selectCount>0){
		    			selectCount = 1;
	    			}
	    		}
	    	}
	    	if(selectCount==0){
	    		document.getElementById("curPrice").value = price;
	    	}else{
	    		price = price*selectCount;
	    	}
	    	var checkBox = document.getElementsByName("checkbox");
	    	for(var i=0;i<checkBox.length;i++){
    			if(checkBox[i].checked){
    				var checkedVal = document.getElementById("extraPrice"+(i)).value;
    				checkedVal = checkedVal.substring(1,checkedVal.length);
    				if(selectCount==0){
    					price = parseFloat(price) + parseFloat(checkedVal);
    		    	}else{
    		    		price = parseFloat(price) + parseFloat(checkedVal)*selectCount;
    		    	}
    			}
    		}
    		document.getElementById("curPrice").value = price;
    		var bookText = "Book Now ";
			if(price>0 && selectCount!=""){
				bookText = bookText + "$" + price;
			}
			document.getElementById("bookBtn").innerHTML=bookText;
	    }

		function checkChange(checkId, checkedPrice){
			var check = document.getElementById(checkId);
			var curPrice = document.getElementById("curPrice").value;
			var selectCount = document.getElementById("selectCount").value;
			checkedPrice = checkedPrice.substring(1,checkedPrice.length);
			var personOrGroup = document.getElementById("personOrGroup").value;
			if(personOrGroup!="P"){
    			if(selectCount>0){
	    			selectCount = 1;
    			}
    		}
			if(check.checked){
				if(curPrice==""){
					if(selectCount==""){
						curPrice = parseInt(checkedPrice);
					}else{
						curPrice = parseInt(checkedPrice)*selectCount;
					}
				}else{
					if(selectCount==""){
						curPrice = parseInt(curPrice) + parseInt(checkedPrice);
					}else{
						curPrice = parseInt(curPrice) + parseInt(checkedPrice)*selectCount;
					}
				}
			}else{
				if(selectCount==""){
					curPrice = parseInt(curPrice) - parseInt(checkedPrice);
				}else{
					curPrice = parseInt(curPrice) - parseInt(checkedPrice)*selectCount;
				}
			}
			document.getElementById("curPrice").value = curPrice;
			var bookText = "Book Now ";
			if(curPrice>0){
				bookText = bookText + "$" + curPrice;
			}
			if(selectCount!=""){
				document.getElementById("bookBtn").innerHTML=bookText;
			}
		}

		/* $("document").ready(function(){
		     $("#chb1").click(function(){
		         if($("#chb1").attr("checked")==true){
		             alert('1231');//do some thing
		         }else{
		             alert('abc');//do some thing
		         }
		     })
		 }) */
		 countChange();
    </script>
    </s:form>
</body>
</html>

