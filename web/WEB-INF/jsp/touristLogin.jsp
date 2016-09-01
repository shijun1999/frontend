<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>Login | Kootour</title>
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
    <nav class="navbar navbar-kootour nomargin">
        <div class="container">

                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-kootour-collapse" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand navbar-brand-img" href="index.html">
                        <img  alt="Brand" src="/images/icons/logo.svg" />
                    </a>

                    <p class="navbar-text kootour-link">
                        <a href="stateCourseList!load">Kootour</a>
                    </p>
                </div>


                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse"  id="navbar-kootour-collapse">
                    <!--<form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <select type="text" class="form-control white">
                                <option value="vancouver" selected>Vancouver</option>
                            </select>
                        </div>
                    </form>-->

                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Become a Guide</a></li>
                        <li><a href="touristLogin!load">Log In</a></li>
                        <li><a href="signup!load">Sign Up</a></li>
                        <!--<li><a href="#">Messages <img class="icon" src="images/icons/account_active_192X192.png" /></a></li>-->
                        <!--<li><a href="#"><img class="icon-navbar" src="images/icons/language_icon_white.png" /></a></li>-->
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
    </nav>

    <div class="container">
        <div class="row">

            <div class="col-lg-offset-3 col-md-offset-2 col-lg-6 col-md-8 col-sm-12 col-xs-12">
                <section class="section">
                    <div class="login-wrap">
                        <div class="login-container">
                            <p class="nomargin text-right blue"><b>Log In</b></p>
                        </div>
                        <div class="login-separator">
                            <p class="nomargin text-center blue">|</p>
                        </div>
                        <div class="login-container">
                            <p class="nomargin text-left blue"><a href="signup!load">Sign Up</a></p>
                        </div>
                    </div>

                    <div class="login-wrap login-wrap-collapse">
                        <div class="login-container">
                            <a class="btn btn-social fullwidth btn-social-facebook">
                                <img  alt="Brand" src="images/icons/facebook_signup.png" /> facebook
                            </a>
                        </div>
                        <div class="login-separator"></div>
                        <div class="login-container">
                            <a class="btn btn-social fullwidth btn-social-wechat">
                                <img  alt="Brand" src="images/icons/wechat.png" /> wechat
                            </a>
                        </div>
                    </div>

                    <div class="login-wrap">
                        <div class="login-container"></div>
                        <div class="login-separator"> 
                            <p class="nomargin text-center blue">OR</p>
                        </div>
                        <div class="login-container"></div>
                    </div>

                    <form id="form1" action = "touristLogin!login" onSubmit="return false;" class="login-form">
                        <div class="form-group">
                            <!--<label for="loginEmail">Email</label>-->
                            <input type="email" class="form-control input-lg gray" name="loginId" value="<s:property value="#request.loginId" />" id="loginEmail" placeholder="Email">
                        </div>
                        <div class="form-group">
                            <!--<label for="loginPassword">Password</label>-->
                            <input type="password" class="form-control input-lg gray" name="password" id="loginPassword" placeholder="Password">
                        </div>

                        <div class="form-actions">
                            <div class="form-group">
                                <input class="checkbox" id="loginRemember" type="checkbox">
                                <label for="loginRemember"></label> 
                                <label for="loginRemember">Remember me</label> 
                            </div>

                            <div class="form-group text-right">
                                <a href="forget-password.html">Forgot password?</a>
                            </div>
                        </div>

                        <button type="submit" onclick="loginBtnClick();" class="btn btn-kootour-bold fullwidth">Log me In</button>
                        

                    </form>

                    <br/>
                        
                    <p class="text-center">Don't have an account? <a href="signup!load"><b>Sign Up</b></a></p>
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
    <script src="/assets/js/bootstrap.min.js"></script>
    <script src="/assets/js/main.js"></script>
    <script type="text/javascript">
    function loginBtnClick() {
		var loginEmail = document.getElementById('loginEmail').value;
		var loginPassword = document.getElementById('loginPassword').value;
		if(loginEmail==''){
			alert("please input Email");
			return false;
		}
		if(loginPassword==''){
			alert("please input Password");
			return false;
		}
		/* document.getElementById('conditionCity').value = loginEmail;
		document.getElementById('conditionDate').value = loginPassword; */
		document.getElementById("form1").submit();
	}
    </script>
</body>
</html>

