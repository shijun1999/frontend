<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>Add my review | Kootour</title>
    <link rel="icon" href="images/favicon.ico" type="image/x-icon"/>

    <!-- Bootstrap -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="assets/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <link href="assets/css/kootour.css" rel="stylesheet">
    <link href="assets/css/star-rating.min.css" rel="stylesheet">
    <link href="assets/css/theme-star-kootour.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script>
      
    </script>
</head>
<body>
     <!-- Begin navbar -->
    <nav class="navbar navbar-kootour">
    	<jsp:include page="header.jsp" />
    </nav>

    <div class="container">
        <div class="row">

            <div class="col-lg-offset-2 col-md-offset-2 col-lg-8 col-md-8 col-sm-12 col-xs-12">
                <section class="section row">
                    <span class="title">
                    	<s:if test='#request.editFlg=="1"'>
                         	Edit my review
                         </s:if>
                         <s:else>
                         	Add a review
                         </s:else>
                    </span>

                    <form id="saveForm" class="form-horizontal" action="courseComment!save" onSubmit="return false;" method="post">
                        <div class="form-group">
                            <label for="accuracy" class="col-sm-3 text-left control-label">Accuracy</label>
                            <div class="col-sm-9">
                                <input id="accuracy" name="accuracy" value="<s:property value="#request.accuracy" />" type="text" class="star-rating-kootour rating">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="communication" class="col-sm-3 text-left control-label">Communication</label>
                            <div class="col-sm-9">
                                <input id="communication" name="communication" value="<s:property value="#request.communication" />" type="text" class="star-rating-kootour rating">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="services" class="col-sm-3 text-left control-label">Services</label>
                            <div class="col-sm-9">
                                <input id="services" name="services" value="<s:property value="#request.services" />" type="text" class="star-rating-kootour rating">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="knowledge" class="col-sm-3 text-left control-label">Knowledge</label>
                            <div class="col-sm-9">
                                <input id="knowledge" name="knowledge" value="<s:property value="#request.knowledge" />" type="text" class="star-rating-kootour rating">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="value" class="col-sm-3 text-left control-label">Value</label>
                            <div class="col-sm-9">
                                <input id="value" name="value" value="<s:property value="#request.value" />" type="text" class="star-rating-kootour rating">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-12">
                               <textarea id="commentTx" name="comment" class="form-control" placeholder="Write a review" rows="5" required><s:property value="#request.comment" /></textarea>
                            </div>
                        </div>
						<input type="hidden" name="courseIdentiNo" value="<s:property value="#request.courseIdentiNo" />"/>
						<input type="hidden" name="courseCommentIdentiNo" value="<s:property value="#request.courseCommentIdentiNo" />"/>
						<s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />
                        <button onclick="toCourseComment();" class="pull-right btn btn-kootour-bold">Submit</button>
                    </form>
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
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/star-rating.min.js"></script>
    <script src="assets/js/review-add.js"></script>
    <script src="assets/js/main.js"></script>
    <script type="text/javascript">
	    function toCourseComment() {
	    	if(document.getElementById("commentTx").value != ''){
				document.getElementById("saveForm").submit();
	    	}
		}
    </script>
</body>
</html>
