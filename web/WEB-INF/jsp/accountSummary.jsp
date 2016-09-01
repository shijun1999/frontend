<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>My profile | Kootour</title>
    <link rel="icon" href="images/favicon.ico" type="image/x-icon"/>

    <!-- Bootstrap -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="assets/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <link href="assets/css/kootour.css" rel="stylesheet">

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
    
    <div class="container">
        <div class="row">

            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <section class="section section-small col-xs-12">
                    <div class="nopadding col-lg-offset-0 col-lg-9 col-md-offset-0 col-md-12 col-sm-offset-3 col-sm-6 col-md-offset-12 col-xs-12">
                        
                        <table class="table-guide-desc">
                            <tr>
                                <td></td>
                                <td>
                                    <div class="user-thumbnail img-circle" style="background-image:url('<s:property value="#request.touristIcon"/>')"></div>
                                    <p class="subtitle"><s:property value="#request.touristName"/></p>
                                    
                                    <p>
                                        <a href="tourist!load">Edit my profile</a>
                                    </p>
                                </td>
                            </tr>
                            <tr>
                        </table>

                        <table class="table-guide-desc">
                            <tr>
                                <td><img class="icon" src="images/icons/ID.png" /></td>
                                <td><span class="subtitle">Verified ID</span></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <p>Email Address <s:if test='#request.localhost.emailOkFlag=="1"'><img class="medium-icon pull-right" src="images/icons/check.png"></s:if></p>
                                    <p>Phone Number <s:if test='#request.localhost.phoneOkFlg=="1"'><img class="medium-icon pull-right" src="images/icons/check.png"></s:if></p>
                                </td>
                            </tr>
                        </table>

                        <table class="table-guide-desc">
                            <tr>
                                <td><img class="icon" src="images/icons/icon_credits.png" /></td>
                                <td><span class="subtitle">Credits</span></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><h2><s:property value="#request.kootourPoint"/></h2></td>
                            </tr>
                        </table>
                    </div>
                </section>
            </div>

            <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
                <section class="section col-xs-12">
                    <span class="title">My Wish List (<s:property value="#request.wishDetailListDisp.size()"/>)</span>

                    <div class="wishlist-wrapper">
                    	<s:iterator var="wishDetailGroup" value="#request.wishDetailListDisp" status="status">
	                        <div class="tours">
	                            <a href="courseDetail!load?courseIdentiNo=<s:property value="#wishDetailGroup.courseIdentiNo" />&localhostIdentiNo=<s:property value="#wishDetailGroup.localhostIdentiNo" />">
	                                <div class="tours-content">
	                                    <div class="tours-illustration" 
	                                    	style="background-image: url('<s:property value="#wishDetailGroup.coursePictureListDisp.get(0)" />')">
	                                        <div class="tours-price-wrapper">
                                            	<div><h2 class="tours-price"><s:property value="#wishDetailGroup.discountPrice" /></h2></div> 
                                            	<div><span class="tours-price-discount"><s:property value="#wishDetailGroup.price" /></span><s:property value="#wishDetailGroup.personOrGroupText" /></div>
	                                        </div>
	                                    </div>
	
	                                    <p class="subtitle nomargin"><s:property value="#wishDetailGroup.courseName" /></p>
	                                    <div class="vote-wrapper">
	                                        <ul class="vote">
	                                            <s:iterator var="scoreIconItem" value="#wishDetailGroup.scoreIconListDisp" status="status">
					                            	<li><img src="<s:property value="scoreIconItem" />"></li>
					                            </s:iterator>
	                                        </ul>
	                                         <span class="vote-label"><s:property value="#wishDetailGroup.reviewNumDisp"/> reviews</span>
	                                    </div>
	                                </div>
	                            </a>
	                        </div>
						</s:iterator>
                    </div>
                    <s:hidden id="courseIdentiNo" name="courseIdentiNo" value="" />
                    <s:hidden id="commentIdentiNo" name="courseCommentIdentiNo" value="" />
					<s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />
                </section>

                <section class="section nopadding col-xs-12">
                    <span class="title">Purchased History</span>
					<s:iterator var="userOrderListGroup" value="#request.userOrderList" status="status">
                    <!-- First purchase -->
                    <section class="section purchase-payment col-xs-12">
                        <div class="text-center nopadding col-lg-3 col-md-3 col-sm-12 col-xs-12">
                            <img class="tour-thumbnail" width="100%" src="<s:property value="#userOrderListGroup.coursePicture" />">
                        </div>
                        <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                            <span class="subtitle nomargin"><s:property value="#userOrderListGroup.courseFullName" /></span>
                            <p><s:property value="#userOrderListGroup.touristFullName" /></p>

                            <div class="nopadding col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                <table class="table-booking-summary">
                                    <tr>
                                        <td class="blue">Date</td>
                                        <td><s:property value="#userOrderListGroup.orderDate" /></td>
                                    </tr>
                                    <tr>
                                        <td class="blue">Time</td>
                                        <td><s:property value="#userOrderListGroup.bgnTime" /></td>
                                    </tr>
                                    <tr>
                                        <td class="blue">Location</td>
                                        <td><s:property value="#userOrderListGroup.location" /></td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-xs-12  text-right">
                            <div class="action col-xs-12 col-sm-6  text-left">
                                <a onclick="toCourseComment('<s:property value="#userOrderListGroup.courseIdentiNo" />','<s:property value="#userOrderListGroup.commentIdentiNo" />');" href="#">
                                    <img class="small-icon" src="images/icons/arrow_head_right_192X192.png" /> 
                                    <s:if test='#userOrderListGroup.commentIdentiNo==""'>
                                    	Add a review
                                    </s:if>
                                    <s:else>
                                    	Edit my review
                                    </s:else>
                                </a>
                            </div>
                            <div class="action col-xs-12 col-sm-6  text-right">
                                <a href="#" data-purchase-payment-id="<s:property value="#status.index+1" />" class="purchase-payment-link" >
                                    <img class="small-icon" src="images/icons/arrow_head_right_192X192.png" /> Payment details
                                </a>
                            </div>
                        </div>
                    </section>

                    <section id="purchase_<s:property value="#status.index+1" />" style="display:none" class="purchase-payment-details widget nopadding col-xs-12">
                        <form action="booking.html" class="form-horizontal">
                            <div class="widget-row col-xs-12">
                                <div class="col-xs-6 nopadding">
                                    <span class="subtitle">Travellers:</span>
                                </div>
                                <div class="col-xs-6 nopadding text-right">
                                     <span><b><s:property value="#userOrderListGroup.touristNum" /> travelers</b></span>
                                </div>
                            </div>

                            <div class="widget-row col-xs-12">
                                <div class="option-label">
                                    <span class="subtitle">Your Customized Options:</span>
                                </div>
                            </div>
							<s:iterator var="userOrderListItemDetail" value="#userOrderListGroup.userOrderExtraOptionModelList" status="status3">
	                            <div class="widget-row customized-option customized-option-readonly">
	                                <div class="option-label">
	                                    <label for="chb<s:property value="#status3.index+1" />"><s:property value="#userOrderListItemDetail.extraOptionName" /></label>
	                                </div>
	                                <div class="option-price">
	                                    <span><s:property value="#userOrderListItemDetail.extraPrice" /></span>
	                                    <span class="hours"><i><s:property value="#userOrderListItemDetail.extraTime" /> <s:property value="#userOrderListItemDetail.extraUnit" /></i></span>
	                                </div>
	                            </div>
							</s:iterator>
                            <div class="widget-row col-xs-12">
                                <div class="col-xs-6 nopadding">
                                    <span class="subtitle">Sub-total:</span>
                                </div>
                                <div class="col-xs-6 nopadding text-right">
                                     <span><b><s:property value="#userOrderListGroup.totalMoney" /></b></span>
                                </div>
                            </div>

                            <div class="widget-row col-xs-12">
                                <div class="col-xs-6 nopadding">
                                    <span>Taxes:</span>
                                </div>
                                <div class="col-xs-6 nopadding text-right">
                                     <span><s:property value="#userOrderListGroup.taxVal" /></span>
                                </div>
                            </div>

                            <div class="widget-row col-xs-12">
                                <div class="col-xs-6 nopadding">
                                    <span>Discount:</span>
                                </div>
                                <div class="col-xs-6 nopadding text-right">
                                     <span>- <s:property value="#userOrderListGroup.discountMoney" /></a></span>
                                </div>
                            </div>

                            <div class="widget-row col-xs-12">
                                <div class="col-xs-6 nopadding">
                                    <span class="subtitle">Total Paid:</span>
                                </div>
                                <div class="col-xs-6 nopadding text-right">
                                     <span><b><s:property value="#userOrderListGroup.paidMoney" /></b></span>
                                </div>
                            </div>
                        </form>
                    </section>
					</s:iterator>
                </section>
            </div>

        </div>
    </div>

    <footer>
        <div class="container">
            <div class="row">
                <div class="footer-block footer-band-wrapper col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <img src="images/icons/logo_footer.png" />
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
                        <a href="#"><img src="images/icons/icon_facebook.png" /></a>
                        <a href="#"><img src="images/icons/icon_twitter.png" /></a>
                        <a href="#"><img src="images/icons/icon_instagram.png" /></a>
                        <a href="#"><img src="images/icons/icon_linkedin.png" /></a>
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

    <script src="assets/js/jquery-1.12.3.min.js"></script>
    <script src="assets/js/moment.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/bootstrap-datetimepicker.min.js"></script>
    <script src="assets/js/tourist-page.js"></script>
    <script src="assets/js/main.js"></script>
    <script type="text/javascript">
    	function toCourseComment(courseIdentiNo, commentIdentiNo) {
    		document.getElementById('courseIdentiNo').value = courseIdentiNo;
    		document.getElementById('commentIdentiNo').value = commentIdentiNo;
    		if(commentIdentiNo==''){
				document.form1.action = "courseComment!load";
    		}else{
    			document.form1.action = "courseComment!edit";
    		}
			document.form1.submit();
		}
	</script>
</s:form>
</body>
</html>
