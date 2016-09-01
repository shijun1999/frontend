<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>Share | Kootour</title>
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
        <div class="container">

            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-kootour-collapse" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand navbar-brand-img" href="index.html">
                    <img  alt="Brand" src="images/icons/logo.svg" />
                </a>

                <p class="navbar-text kootour-link">
                    <a href="index.html">Kootour</a>
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
                    <li><a href="#"><b>Become a Guide</b> <img class="icon" src="images/icons/icon_guide.png" /></a></li>
                    <li class="message-link-mobile"><a href="dashboard.html">Messages <img class="icon" src="images/icons/icon_message.png" /></a></li>
                    <li class="message-link-desktop dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Messages <img class="icon" src="images/icons/icon_message.png" /></a>
                      <ul class="dropdown-menu dropdown-dashboard">
                        <li class="dashboard-divider">
                            <span>Notifications</span>
                        </li>
                        <li>
                            <a href="dashboard.html">
                            <div class="message-list-wrapper">
                                <div class="illustration">
                                    <img src="images/icons/icon_notification.png" class="icon-notification">
                                </div>
                                <div>
                                    <div class="message-list">
                                        <p>Comfirm your email</p>
                                    </div>
                                </div>
                            </div>
                            </a>
                        </li>
                        <li class="dashboard-divider">
                            <span>Messages (2)</span>
                        </li>
                        <li>
                            <a href="tchat.html">
                            <div class="message-list-wrapper">
                                <div class="illustration">
                                    <img src="images/faces/face_1.jpg" alt="profile" class="icon-notification img-circle">
                                </div>
                                <div>
                                    <div class="message-list">
                                        <div class="name">
                                            <span class="blue">Clark Jones</span>
                                        </div>

                                        <div class="content">
                                            <p>See you</p>
                                        </div>

                                        <div class="date">
                                            04/02/206
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </a>
                        </li>
                        <li>
                            <a href="tchat.html">
                            <div class="message-list-wrapper">
                                <div class="illustration">
                                    <img src="images/faces/face_2.jpg" alt="profile" class="icon-notification img-circle">
                                </div>
                                <div>
                                    <div class="message-list">
                                        <div class="name">
                                            <span class="blue">Mike Jones</span>
                                        </div>

                                        <div class="content">
                                            <p>Thanks for coming...</p>
                                        </div>

                                        <div class="date">
                                            01/02/206
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </a>
                        </li>
                        <li>
                            <a href="dashboard.html">
                            <div class="text-center">
                                <span class="see-all">See All</span>
                            </div>
                            </a>
                        </li>
                      </ul>
                    </li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Spencer <img class="icon" src="images/icons/icon_account.png" /></a>
                      <ul class="dropdown-menu">
                        <li><a href="tourist_page.html">Profile</a></li>
                        <li><a href="tourist_edit_page.html">Edit my profile</a></li>
                        <li><a href="index.html">Log out</a></li>
                      </ul>
                    </li>
                    <!--<li><a href="#">Messages <img class="icon" src="images/icons/account_active_192X192.png" /></a></li>-->
                    <!--<li><a href="#"><img class="icon-navbar" src="images/icons/language_icon_white.png" /></a></li>-->
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

    <div class="container">
        <div class="row">

            <div class="col-lg-offset-2 col-md-offset-2 col-lg-8 col-md-8 col-sm-12 col-xs-12 text-center">
                <section class="section row">

                    <span class="title">Share this tour!</span>

                    <div class="nested-section col-lg-offset-3 col-md-offset-3 col-sm-offset-2 col-xs-offset-2 col-lg-6 col-md-6 col-sm-8 col-xs-8">
                        <input type="text" value="kootour/index.html" class="text-center form-control input-lg gray" id="link" readonly="readonly">
                    </div>

                    <div class="clearfix"></div>

                    <p class="subtitle nomargin">Share this with email!</p>
                    
                    <div class="nested-section col-lg-offset-3 col-md-offset-3 col-sm-offset-2 col-xs-offset-2 col-lg-6 col-md-6 col-sm-8 col-xs-8">
                        <a href="#" class="btn btn-lg btn-kootour-bold fullwidth">Email</a>
                    </div>

                    <div class="clearfix"></div>

                    <p class="subtitle nomargin">Share this on social media!</p>

                    <div class="lg-social-links">
                        <a href="#"><img src="images/icons/icon_facebook_color.png"></a>
                        <a href="#"><img src="images/icons/icon_twitter_color.png"></a>
                        <a href="#"><img src="images/icons/icon_instagram_color.png"></a>
                        <a href="#"><img src="images/icons/icon_linkedin_color.png"></a>
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
    <script src="assets/js/main.js"></script>
</body>
</html>
