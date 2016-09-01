<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>About the guide | Kootour</title>
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
<s:form id="form1" onSubmit="return false;">
     <!-- Begin navbar -->
    <nav class="navbar navbar-kootour">
    	<jsp:include page="header.jsp" />
    </nav>

    <div class="container">
        <div class="row">

            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <section class="section section-small col-xs-12">
                    <div class="nopadding col-lg-offset-0 col-lg-10 col-md-offset-0 col-md-12 col-sm-offset-3 col-sm-6 col-md-offset-12 col-xs-12">
                        
                        <table class="table-guide-desc">
                            <tr>
                                <td></td>
                                <td>
                                    <div class="user-thumbnail img-circle" style="background-image:url('<s:property value="#request.localhost.photo" />')"></div>
                                    <p class="subtitle nomargin"><s:property value="#request.localhost.fullName" /></p>
                                    
                                    <div class="vote-wrapper vote-wrapper-block">
                                        <ul class="vote">
                                            <s:iterator var="scoreIconItem" value="#request.scoreIconListDisp" status="status">
				                            	<li><img src="<s:property value="scoreIconItem" />"></li>
				                            </s:iterator>
                                        </ul>
                                        <span class="vote-label"><s:property value="#request.courseCommentList.size()" /> reviews</span>
                                    </div>

                                    <ul class="list-style-none">
                                        <li><s:property value="#request.localhost.addr1" />, <s:property value="#request.localhost.addr2" /></li>
                                        <li>Member since April, 2016</li>
                                    </ul>
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
                                <td><img class="icon" src="images/icons/language_green.png" /></td>
                                <td><span class="subtitle">Languages</span></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <ul class="list-style-none">
                                        <li><s:property value="#request.localhost.useLangId" /></li>
                                    </ul>
                                </td>
                            </tr>
                        </table>

                        <table class="table-guide-desc">
                            <tr>
                                <td><img class="icon" src="images/icons/message.png" /></td>
                                <td><a  class="subtitle" href="sendMessage!load?localhostIdentiNo=<s:property value="#request.localhostIdentiNo" />">Message Me</a></td>
                            </tr>
                        </table>
                    </div>
                </section>

                <section class="section section-small col-xs-12">
                    <span class="title">Listings (<s:property value="#request.courseList.size()" />)</span> 
					<s:iterator var="courseGroup" value="#request.courseList" status="status">
	                    <div class="tours nopadding col-xs-12">                        
	                        <a href="courseDetail!load?courseIdentiNo=<s:property value="#courseGroup.courseIdentiNo" />&localhostIdentiNo=<s:property value="#courseGroup.localhostIdentiNo" />">
	                            <div class="tours-content">
	                                <div class="tours-illustration" 
	                                	style="background-image: url('<s:property value="#courseGroup.coursePictureListDisp.get(0).fullPath" />')">
	                                    <div class="tours-price-wrapper">
	                                        <div><h2 class="tours-price"><s:property value="#courseGroup.discountPrice" /></h2></div> 
	                                        <div><s:if test='#courseGroup.price!=""'><span class="tours-price-discount"><s:property value="#courseGroup.price" /></span></s:if><s:property value="#courseGroup.personOrGroup" /></div>
	                                    </div>
	                                </div>
	
	                                <p class="subtitle nomargin"><s:property value="#courseGroup.fullName" /></p>
	                                <div class="vote-wrapper">
	                                    <ul class="vote">
	                                        <s:iterator var="scoreIconItem" value="#courseGroup.scoreIconListDisp" status="status">
				                            	<li><img src="<s:property value="scoreIconItem" />"></li>
				                            </s:iterator>
	                                    </ul>
	                                    <span class="vote-label"><s:property value="#courseGroup.reviewNumDisp"/> reviews</span>
	                                </div>
	                            </div>
	                        </a>
	                    </div>
                    </s:iterator>
                </section>
            </div>
            <s:hidden id="courseIdentiNo" name="courseIdentiNo" value="" />
			<s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />

            <div class="col-lg-8 tours-wrapper col-md-8 col-sm-12 col-xs-12">
                <section class="section col-xs-12">
                    <span class="title">About the Guide</span>
                    <p><s:property value="#request.localhost.memo"  escape="false" /></p>
                    <span class="title">Videos</span>

                    <div>
                    <iframe class="video" src="https://www.youtube.com/embed/hU6a-b6ADSE?controls=1&showinfo=0" frameborder="0" allowfullscreen></iframe>
                    </div>
                </section>`

                <section class="section col-xs-12 nopadding reviews">
                    <span class="title">Recommended Reviews</span>
					<s:iterator var="courseCommentGroup" value="#request.courseCommentList" status="status">
	                    <div class="col-xs-12 review">
	                        <div class="illustration">
	                            <div class="user-small-thumbnail img-circle" style="background-image:url('<s:property value="#courseCommentGroup.touristPicture" />')"></div>
	                        </div>
	
	                        <div class="details">
	                            <p class="subtitle nomargin"><s:property value="#courseCommentGroup.touristFirstName" /></p>
	
	                            <div class="vote-wrapper">
	                                <ul class="vote">
	                                    <s:iterator var="scoreIconItem" value="#courseCommentGroup.scoreIconListDisp" status="status">
			                            	<li><img src="<s:property value="scoreIconItem" />"></li>
			                            </s:iterator>
	                                </ul>
	                                <span class="vote-label"><s:property value="#courseCommentGroup.commentDate" /></span>
	                            </div>
	
	                            <p><i><s:property value="#courseCommentGroup.comment" /></i></p>
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
    <script src="assets/js/all-tours.js"></script>
    <script src="assets/js/main.js"></script>
    <script type="text/javascript">
	    function courselist(courseIdentiNo, localhostIdentiNo) {
			document.getElementById('courseIdentiNo').value = courseIdentiNo;
			document.getElementById('localhostIdentiNo').value = localhostIdentiNo;
			document.form1.action = "courseDetail!load";
			document.form1.submit();
		}
    </script>
</s:form> 
</body>
</html>

