<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
    <title>Login | Kootour</title>
    <link rel="icon" href="/images/favicon.ico" type="image/x-icon"/>

	<!-- bootstrap & fontawesome -->
	<link rel="stylesheet" href="/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/font-awesome/css/font-awesome.min.css">

	<!-- page specific plugin styles -->
	<link rel="stylesheet" href="/css/bootstrap-dialog.min.css" />

	<!-- kootour stles -->
	<link rel="stylesheet" href="/css/kootour-user.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript" src="https://js.stripe.com/v2/"></script>
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

            <div class="col-lg-offset-3 col-md-offset-2 col-lg-6 col-md-8 col-sm-12 col-xs-12">
           <h2 class="text-center title-page blue">Become Our Partner</h2>
                <section class="section">

                    <form action="" method="POST" id="payment-form" class="form-horizontal">
                     <!--   <span class="payment-errors"></span> -->

                        <div class="form-validator form-group">
                                <label class="nomargin text-left blue">Card Number</label>
                            </div>

                                <div class="clearfix">
                                    <input style="width: 100%" type="text" class="form-control" data-stripe="number" id="cardNumber" name="cardNumber" > <!-- value="4242424242424242" -->
                        </div>



                        <div class="form-group">
                                <label class="nomargin text-left blue">Expiration (MM/YY)</label>
                            <div class="clearfix">
                                <select style="width: 40%" data-stripe="exp_month" id="expMonth" name="expMonth">
                                    <option value=""> </option>
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                                /
                                <select style="width: 40%"  data-stripe="exp_year" id="expYear" name="expYear">
                                    <option value=""> </option>
                                    <option value="2016">16</option>
                                    <option value="2017">17</option>
                                    <option value="2018">18</option>
                                    <option value="2019">19</option>
                                    <option value="2020">20</option>
                                    <option value="2021">21</option>
                                    <option value="2022">22</option>
                                    <option value="2023">23</option>
                                    <option value="2024">24</option>
                                    <option value="2025">25</option>
                                    <option value="2026">26</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="nomargin text-left blue">CVC</label>
                            <input style="width: 100%" type="number" class="clearfix" data-stripe="cvc" id="cvc" name="cvc" >
                        </div>

                        <div class="form-group">
                                <label class="nomargin text-left blue">Postal Code</label>
                                <input style="width: 100%" type="text" class="clearfix" size="20" data-stripe="address_zip" id="zip" name="zip">
                            </div>

                        <div class="form-group">
                                <label class="nomargin text-left blue">Amount (USD)</label>

                            <div class="fclearfix">
                                <input style="width: 100%" type="number" class="clearfix" data-stripe="amount" id="amount" name="amount">
                            </div>
                        </div>



                        <div class="form-group">
                                <label class="nomargin text-left blue">Description</label>
                            <div class="clearfix">
                                <input style="width: 100%" type="text" data-stripe="description" id="description" name="description">
                            </div>
                        </div>

                        <div class="form-group">
                        <input type="submit" class="btn btn-kootour-bold fullwidth" value="Submit Payment" id="submitPayment">
                            </div>
                    </form>
                    <br/>

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
                    <p><a href="about.html">About Us</a></p>
                    <p><a href="help.html">Help</a></p>
                    <p><a href="contact.html">Contact Us</a></p>
                    <p><a href="#">Terms & Privacy</a></p>
                </div>


                <div class="footer-block col-lg-3 col-md-3 col-sm-4 col-xs-12">

                    <p><b><a href="#">Blog</a></b></p>

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



		<!--[if !IE]> -->
		<script src="/js/jquery-2.2.0.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script src="/js/jquery-2.2.0.min.js"></script>
		<![endif]-->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='/js/jquery.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='/js/jquery1x.min.js'>"+"<"+"/script>");
		</script>
		<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="/js/bootstrap.min.js"></script>

		<!-- page specific plugin scripts -->
		<script src="/js/stripePayment.js"></script>
        <script src="/js/jquery.validate.min.js"></script>
		<script src="/js/bootstrap-dialog.min.js"></script>

</body>
</html>

