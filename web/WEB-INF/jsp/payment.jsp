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
        <div class="left-column col-lg-9 col-md-9 col-sm-12 col-xs-12">

            <section class="section section-small">

                <form id="form1" class="form-horizontal row" action="tourist!save" onSubmit="return false;" method="post">

                    <div class="widget-row col-sm-12">

                        <div class="form-group form-group-sm">
                            <div class="col-sm-2 text-left control-label ">Card Number</div>
                            <div class="col-sm-9">
                                <input type="text" name="cardNumber" class="form-control gray" id="cardNumber"
                                       placeholder="" required>
                            </div>
                        </div>

                        <div class="form-group form-group-sm">
                            <div class="col-sm-2 text-left control-label">Expiration</div>

                            <div class="col-sm-2">
                                <input type="text" name="expiration" class="form-control gray" id="expiration"
                                       placeholder="MM/YYYY" required>
                            </div>

                            <div class="col-sm-1 text-left inputDefault control-label">CVC</div>

                            <div class="col-sm-2">
                                <input type="text" name="cvc" class="form-control inputDefault gray" id="cvc" required>
                            </div>

                            <div class="col-sm-2 control-label inputDefault">Postal Code</div>

                            <div class="col-sm-2">
                                <input type="text" name="postalCode" class="form-control inputDefault gray"
                                       id="postalCode" required>
                            </div>
                        </div>


                        <div class="form-group form-group-sm">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="checkbox inputDefault">
                                    <label>
                                        <input type="checkbox"> Remember me
                                    </label>
                                </div>
                            </div>
                        </div>



                        <div class="nested-section col-xs-offset-3 col-sm-6">
                            <p class="text-center">
                                <button onclick="save();" class="btn btn-lg btn-kootour-bold fullwidth">Pay (US
                                    $<s:property value="#request.userOrder.paidMoney"/>)
                                </button>
                            </p>
                        </div>
                    </div>
                </form>
            </section>
        </div>
        <%--<input type="hidden" id="touristIdentiNo" name="touristIdentiNo"--%>
               <%--value="<s:property value="#request.touristIdentiNo"/>">--%>
        <%--<input type="hidden" id="courseIdentiNo" name="courseIdentiNo"--%>
               <%--value="<s:property value="#request.courseIdentiNo"/>">--%>
        <%--<input type="hidden" id="langId" name="langId" value="<s:property value="#request.langId"/>">--%>
        <%--<input type="hidden" id="favoriteIdentiNo" name="favoriteIdentiNo"--%>
               <%--value="<s:property value="#request.favoriteIdentiNo"/>">--%>
        <%--<input type="hidden" id="curTouristIdentiNo" name="curTouristIdentiNo"--%>
               <%--value="<s:property value="#request.curTouristIdentiNo"/>">--%>
        <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
            <br>
            <br>
            <br>
            <p>Any questions?</p>
            <p><a href="#">Contract Us</a></p>
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
                <p><a href="/jsp/new.html">Terms & Conditions</a></p>
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
