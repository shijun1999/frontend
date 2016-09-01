<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>Tchat | Kootour</title>
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

            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <section class="section section-small col-xs-12">
                    <div class="col-xs-offset-2 col-xs-8">
                        <div class="user-thumbnail img-circle" style="background-image:url('<s:property value="#request.localhostPictureDisp" />')"></div>
                        <p class="subtitle nomargin"><s:property value="#request.localhostFullNameDisp" /></p>
                        
                        <div class="vote-wrapper vote-wrapper-block">
                            <ul class="vote">
                                <s:iterator var="scoreIconItem" value="#request.scoreDisp" status="status">
	                            	<li><img src="<s:property value="scoreIconItem" />"></li>
	                            </s:iterator>
                            </ul>
                            <span class="vote-label"><s:property value="#request.reviewNum"/> reviews</span>
                        </div>

                        <ul class="list-style-none">
                            <li><s:property value="#request.localhostAddrDisp" /></li>
                            <li><s:property value="#request.memberYearDisp" /></li>
                        </ul>
                    </div>
                </section>
            </div>

            <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
                <section class="section section-small col-xs-12">
                    <div id="kootour-tchat" class="tchat">
                        <div class="text-center">
                        	<s:if test='#request.messageList.size()!=0'>
                            	<span id="load-more" ><a href="#" class="subtitle">Loading previous message</a></span>
                            </s:if>
                        </div>
                    </div>

                    <form id="kootour-form-tchat" class="form-tchat">
                        <div class="form-group">
                            <textarea id="message" placeholder="Type a message" class="form-control gray" rows="5"></textarea>
                        </div>

                        <div class="text-right">
                            <button type="submit" class="btn btn-kootour">Send</button>
                        </div>
                    </form>
                </section>
            </div>
        </div>
    </div>
    <input type="hidden" id="touristIdentiNo" name="touristIdentiNo" value="<s:property value="#request.touristIdentiNo"/>">
    <input type="hidden" id="localhostIdentiNo" name="localhostIdentiNo" value="<s:property value="#request.localhostIdentiNo"/>">
    <input type="hidden" id="langId" name="langId" value="<s:property value="#request.langId"/>">
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
	<s:iterator var="messageGroup" value="#request.messageList" status="status2">
    	<input type="hidden" id="messageText<s:property value="#status2.index" />" name="messages" value="<s:property value="#messageGroup.messageText" />"/>
    	<input type="hidden" id="messageTime<s:property value="#status2.index" />" value="<s:property value="#messageGroup.messageTime" />" />
    	<input type="hidden" id="messageType<s:property value="#status2.index" />" value="<s:property value="#messageGroup.messageType" />" />
    </s:iterator>
    <script src="assets/js/jquery-1.12.3.min.js"></script>
    <script src="assets/js/moment.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/lib/tchat.js"></script>
    <script src="assets/js/kootour-tchat.js"></script>
    <script src="assets/js/main.js"></script>
</body>
</html>

