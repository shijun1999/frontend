<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>Change your password | Kootour</title>
    <link rel="icon" href="images/favicon.ico" type="image/x-icon"/>

    <!-- Bootstrap -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="assets/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <link href="assets/css/kootour.css" rel="stylesheet">
    <script src="assets/js/uploader.js"></script>

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
                <section class="text-center section">
                    <ul class="indicators">
                        <li data-step="step-1" class="active"><a href="#"></a></li>
                        <li data-step="step-2"><a href="#"></a></li>
                    </ul>

                    <!-- Display step-1 and step-2 if email not confirmed -->
                    <div id="step-1">
                        <label class="title black"><b>Change your password</b></label>

                        <p>Change your password by typing it twice.</p>

                        <div class="phone-icon">
                            <img class="" src="images/icons/icon_email.png" />
                        </div>

                        <div class="row">
                            <div class="col-lg-offset-3 col-md-offset-3 col-sm-offset-2 col-xs-offset-2 col-lg-6 col-md-6 col-sm-8 col-xs-8">
                                <form id="password-form" action="changePassword!changePassword" onSubmit="return false;" method="post">
                                    <div  class="strength-wrapper form-group required">
                                        <!--<label for="loginPassword">Password</label>-->
                                        <input type="password" name="password" class="form-control input-lg gray" id="signupPassword" placeholder="Password" required>
                                    </div>

                                    <div class="form-group required">
                                        <!--<label for="loginPassword">Password</label>-->
                                        <input type="password" name="confirmPassword" class="form-control input-lg gray" id="signupRePassword" placeholder="Re-enter Password" required>
                                    </div>

                                    <button id="signupButton" type="submit" class="btn btn-kootour-bold fullwidth">Change</button>
                                </form>
                            </div>
                        </div>
                    </div>

                    <div id="step-2">
                        <label class="title black"><b>Congrats!</b></label>

                        <p>Your password changed successfuly.</p>

                        <div class="phone-icon">
                            <img class="" src="images/icons/icon_email.png" />
                        </div>

                        <div class="row">
                            <div class="col-lg-offset-4 col-md-offset-4 col-sm-offset-3 col-xs-offset-3 col-lg-4 col-md-4 col-sm-6 col-xs-6">
                                <a href="tourist!load" class="btn btn-kootour-bold fullwidth">Done</a>
                            </div>
                        </div>
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
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/lib/indicator.js"></script>
    <script src="assets/js/strength.js"></script>
    <script src="assets/js/signup.js"></script>
    <script src="assets/js/change-password.js"></script>
    <script src="assets/js/main.js"></script>
</body>
</html>

