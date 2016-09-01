<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>My dashboard | Kootour</title>
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
     <!-- Begin navbar -->
    <nav class="navbar navbar-kootour">
    	<jsp:include page="header.jsp" />
    </nav>

    <div class="container">
        <div class="row">

            <div class="col-xs-12 notification-wrapper">
	            <s:iterator var="messageListGroup" value="#request.kooTourMessageList" status="status">
	                <section class="notification">
	                    <p><s:property value="#messageListGroup.messageText" /></p>
	                    <img src="images/icons/icon_close.png" class="close-icon" />
	                </section>
                </s:iterator>
            </div>

            <div class="col-xs-12 message-list-wrapper">
                <section class="section section-small nopadding">
                    <span class="title">All messages ( <s:property value="#request.localhostMessageList.size()"/>)</span>

                    <div class="message-list-wrapper">
                    	<s:iterator var="localhostMessageListGroup" value="#request.localhostMessageList" status="status">
	                        <a href="sendMessage!load?localhostIdentiNo=<s:property value="#localhostMessageListGroup.localhostIdentiNo" />">
	                            <div class="message-list">
	                                <div class="illustration">
	                                    <div class="user-small-thumbnail img-circle" style="background-image:url('<s:property value="#localhostMessageListGroup.localhostPictureDisp" />')"></div>
	                                </div>
	
	                                <div class="name">
	                                    <span class="subtitle"><s:property value="#localhostMessageListGroup.localhostNameDisp" /></span>
	                                </div>
	
	                                <div class="content">
	                                    <p><s:property value="#localhostMessageListGroup.messageText" /></p>
	                                </div>
	
	                                <div class="date">
	                                    <s:property value="#localhostMessageListGroup.messageTime" />
	                                </div>
	                            </div>
	                        </a>
                        </s:iterator>
                        <div class="text-center">
                            <button class="btn btn-lg btn-kootour" type="submit">See More (122)</button>
                        </div>
                    </div>
                </section>
            </div>
            <s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />
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
    <script src="assets/js/notifications.js"></script>
    <script src="assets/js/main.js"></script>
</body>
</html>


