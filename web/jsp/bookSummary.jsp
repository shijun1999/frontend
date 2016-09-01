<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>Booking page | Kootour</title>
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
						<s:if test="#status.index == 2">
	                    	<li><a href="<s:property value="#menuInfo.menuClassName" />!<s:property value="#menuInfo.menuMethodName" />?courseIdentiNo=<s:property value="#request.userOrder.courseIdentiNo" />&localhostIdentiNo=<s:property value="#request.userOrder.localhostIdentiNo" />"><s:property value="#menuInfo.menuDispName" /></a></li>
						</s:if>
						<s:else>
							<li><a href="<s:property value="#menuInfo.menuClassName" />!<s:property value="#menuInfo.menuMethodName" />"><s:property value="#menuInfo.menuDispName" /></a></li>
						</s:else>
					</s:else>
            	</s:iterator>
            </ol>
        </div>
   </nav>
   
    <div class="container">
        <div class="row">
            <div class="left-column col-lg-8 col-md-8 col-sm-12 col-xs-12">
                <section class="section section-small col-xs-12">
                    <span class="title">Booking Summary</span>
                    
                    <div class="text-center nopadding col-lg-3 col-md-3 col-sm-12 col-xs-12">
                        <img class="tour-thumbnail" width="100%" src="<s:property value="#request.userOrder.coursePicture" />">
                    </div>

                    <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                        <span class="subtitle nomargin"><s:property value="#request.userOrder.courseFullName" /></span>
                        <p>By <s:property value="#request.userOrder.localhostFullName" /></p>

                        <div class="nopadding col-lg-6 col-md-6 col-sm-12 col-xs-12">
                            <table class="table-booking-summary">
                                <tr>
                                    <td class="blue">Date</td>
                                    <td><s:property value="#request.userOrder.orderDate" /></td>
                                </tr>
                                <tr>
                                    <td class="blue">Time</td>
                                    <td><s:property value="#request.userOrder.bgnTime" /></td>
                                </tr>
                                <tr>
                                    <td class="blue">Location</td>
                                    <td><s:property value="#request.userOrder.location" /></td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </section>

                <section class="widget nopadding section section-small col-xs-12">
                    <form id="bookingForm" action="bookSummary!book" class="form-horizontal">
                        <div class="widget-row col-xs-12">
                            <div class="col-xs-6 nopadding">
                                <span class="subtitle">Travellers:</span>
                            </div>
                            <div class="col-xs-6 nopadding text-right">
                                 <span><b><s:property value="#request.userOrder.touristNum" /> travelers</b></span>
                            </div>
                        </div>

                        <div class="widget-row col-xs-12">
                            <div class="option-label">
                                <span class="subtitle">Your Customized Options:</span>
                            </div>
                        </div>

						<s:iterator var="userOrderOption" value="#request.extraOptionList" status="status">
	                        <div class="widget-row customized-option customized-option-readonly">
	                            <div class="option-label">
	                                <label for="chb<s:property value="#status.index+1" />"><s:property value="#userOrderOption.extraOptionName" /></label>
	                            </div>
	                            <div class="option-price">
	                                <span><s:property value="#userOrderOption.extraPrice" /></span>
	                                <span class="hours"><i><s:property value="#userOrderOption.extraTime" /><s:property value="#userOrderOption.extraUnit" /></i></span>
	                            </div>
	                        </div>
                        </s:iterator>

                        <div class="widget-row col-xs-12">
                            <div class="col-xs-6 nopadding">
                                <span class="subtitle">Sub-total:</span>
                            </div>
                            <div class="col-xs-6 nopadding text-right">
                                 <span><b><s:property value="#request.userOrder.totalMoney" /></b></span>
                            </div>
                        </div>

                        <div class="widget-row col-xs-12">
                            <div class="col-xs-6 nopadding">
                                <span>Taxes:</span>
                            </div>
                            <div class="col-xs-6 nopadding text-right">
                                 <span><s:property value="#request.userOrder.taxVal" /></span>
                            </div>
                        </div>

                        <div id="widget-row-discount-form" class="widget-row col-xs-12">
                            <div class="col-lg-8 col-md-7 col-sm-7 col-xs-12 nopadding">
                                <span>Discount:</span>
                            </div>
                            <div class="col-lg-4 col-md-5 col-sm-5 col-xs-12 nopadding">
                                <div class="coupon-form">
                                    <input id="discountValue" name="booking[coupon][code]" class="form-control input-xs" type="text" placeholder="Promo code" />
                                        <button id="discountButton" type="button" class="btn btn-xs btn-kootour">apply</button>
                                </div>
                            </div>
                        </div>

                        <div class="widget-row col-xs-12">
                            <div class="col-xs-6 nopadding">
                                <span class="subtitle">Total:</span>
                            </div>
                            <div class="col-xs-6 nopadding text-right" id="totalAmt">
                                 <span><b><s:property value="#request.userOrder.paidMoney" /></b></span>
                            </div>
                        </div>

                        <div class="text-center col-xs-12">
                            <button class="btn btn-lg btn-kootour-bold fullwidth" type="submit">Pay Now</button>
                        </div>
                    </form>
                </section>
            </div>
            <input type="hidden" id="touristIdentiNo" name="touristIdentiNo" value="<s:property value="#request.touristIdentiNo"/>">
			<input type="hidden" id="courseIdentiNo" name="courseIdentiNo" value="<s:property value="#request.courseIdentiNo"/>">
			<input type="hidden" id="langId" name="langId" value="<s:property value="#request.langId"/>">
			<input type="hidden" id="favoriteIdentiNo" name="favoriteIdentiNo" value="<s:property value="#request.favoriteIdentiNo"/>">
			<input type="hidden" id="curTouristIdentiNo" name="curTouristIdentiNo" value="<s:property value="#request.curTouristIdentiNo"/>">
            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <section class="section section-small col-xs-12">
                    <div>
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

                    <div>
                        <p class="nomargin">
                            <img src="/images/icons/share_48X48.png" class="medium-icon" />
                            <a href="shareKootour!load">Share this and get free credit</a>
                        </p>    
                    </div>
                </section>

                <section class="section section-small col-xs-12">
                    <span class="title">Frequently Asked Questions</span>
                    
                    <div class="faq borderbottom">
                        <p>
                            <a class="nocolor" id="question_1" href="#">
                                <img src="/images/icons/arrow_head_right_192X192.png" class="small-icon" />How long are my items in my cart saved for me?
                            </a>
                        </p>

                        <p id="answer_1" style="display:none">Lorem ipsum dolor sit amet, consectetur adipiscing elit. In posuere dui sed felis luctus lobortis. Phasellus vel cursus eros. Aenean eleifend sapien finibus</p>
                    </div>

                    <div class="faq borderbottom">
                        <p>
                            <a class="nocolor" id="question_2" href="#">
                                <img src="/images/icons/arrow_head_right_192X192.png" class="small-icon" />How long are my items in my cart saved for me?
                            </a>
                        </p>

                        <p id="answer_2" style="display:none">Lorem ipsum dolor sit amet, consectetur adipiscing elit. In posuere dui sed felis luctus lobortis. Phasellus vel cursus eros. Aenean eleifend sapien finibus</p>
                    </div>

                    <div class="faq">
                        <p>
                            <a class="nocolor" id="question_3" href="#">
                                <img src="/images/icons/arrow_head_right_192X192.png" class="small-icon" />How long are my items in my cart saved for me?
                            </a>
                        </p>

                        <p id="answer_3" style="display:none">Lorem ipsum dolor sit amet, consectetur adipiscing elit. In posuere dui sed felis luctus lobortis. Phasellus vel cursus eros. Aenean eleifend sapien finibus</p>
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

    <script src="/assets/js/jquery-1.12.3.min.js"></script>
    <script src="/assets/js/moment.js"></script>
    <script src="/assets/js/bootstrap.min.js"></script>
    <script src="/assets/js/bootstrap-datetimepicker.min.js"></script>
    <script src="/assets/js/lib/wishlist.js"></script>
    <script src="/assets/js/lib/cart.js"></script>
     <script src="assets/js/booking.js"></script>
    <script src="/assets/js/main.js"></script>
</body>
</html>
