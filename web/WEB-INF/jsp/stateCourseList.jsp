<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">

    <title>Welcome! | Kootour</title>

    <link rel="icon" href="images/favicon.ico" type="image/x-icon"/>

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
    <div class="cover">
        <nav class="navbar navbar-kootour transparent nomargin">
            <div class="container-fluid">

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
                        <a href="stateCourseList!load">Kootour</a>
                    </p>
                </div>


                <!-- Collect the nav links, forms, and other content for toggling -->
                <form id="form0"  onSubmit="return false;">
	                <div class="collapse navbar-collapse"  id="navbar-kootour-collapse">
	                    <!--<form class="navbar-form navbar-left" role="search">
	                        <div class="form-group">
	                            <select type="text" class="form-control white">
	                                <option value="vancouver" selected>Vancouver</option>
	                            </select>
	                        </div>
	                    </form>-->
	
	                    <ul class="nav navbar-nav navbar-right">
	                        <jsp:include page="header2.jsp" />
	                    </ul>
	                </div><!-- /.navbar-collapse -->
                </form>
            </div><!-- /.container-fluid -->
        </nav>

        <div class="cover-content">
            <h1 class="slogan">Explore our world like never before</h1>

            <form id="form2" action = "stateCourseList!search" onSubmit="return false;"  class="form-inline form-cover">
              <div class="form-group">
                <select type="text" id="cityCondition" name="city" class="input-lg form-control" >
                    <option value="" disabled selected>select a city</option>
                    <s:iterator var="cityGroup" value="#request.cityList" status="status">
                    	<option value="<s:property value="#cityGroup" />"><s:property value="#cityGroup" /></option>
                    </s:iterator>
                </select>                      
              </div>
	          <div class="form-group" style="position:relative">
	              <input type="text" id="dateCondition" name="searchDate" class="input-lg form-control datetimepicker" value="" placeholder="pick a date">
	          </div>
              <button onClick="searchByCondition()" class="btn btn-lg btn-kootour-bold">Explore</button>
        	</form>
    </div>
</div>

<div class="container">
    <h1 class="text-center title-page blue">Explore Our Cities</h1>

    <div class="row">

        <div class="form-cover-mobile-wrapper text-center col-xs-12">
            <form action="all_tours.html" class="form-inline form-cover-mobile">
                <div class="form-group">
                    <select type="text" class="input-lg form-control" >
                        <option value="" disabled selected>select a city</option>
                        <option value="vancouver">Vancouver</option>
                        <option value="Beijing">Beijing</option>
                        <option value="Paris">Paris</option>
                        <option value="Bagan">Bagan</option>
                        <option value="Tokyo">Tokyo</option>
                    </select>                     
                </div>
                <div class="form-group" style="position:relative">
                    <input type="text" class="input-lg form-control datetimepicker" value="" placeholder="pick a date">
                </div>
                <button type="submit" class="btn btn-lg btn-kootour-bold">Explore</button>
            </form>
        </div>
        <form id="form1" action = "stateCourseList!search">
        <s:iterator var="locationGroup" value="#request.locationMstList" status="status">
			<s:if test="#status.first">
            	<div class="city-wrapper col-lg-8 col-md-6 col-sm-12 col-xs-12"
            		onclick="toCityCourselist('<s:property value="#locationGroup.cityName" />','');">
		            <a class="city-link" href="#">
		                <div class="city-illustration" style="background-image:url('<s:property value="#locationGroup.photo" />')">
		                    <span><s:property value="#locationGroup.cityName" /></span>
		                </div>
		            </a>
		        </div>
			</s:if>
			<s:else>
				<div class="city-wrapper col-lg-4 col-md-6 col-sm-12 col-xs-12"
					onclick="toCityCourselist('<s:property value="#locationGroup.cityName" />','');">
		            <a class="city-link" href="#">
		                <div class="city-illustration" style="background-image:url('<s:property value="#locationGroup.photo" />')">
		                    <span><s:property value="#locationGroup.cityName" /></span>
		                </div>
		            </a>
		        </div>
			</s:else>
        </s:iterator>
        <s:hidden id="selectCity" name="city" value="" />
		<s:hidden id="selectDate" name="searchDate" value="" />
        </form>
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
<script src="/assets/js/moment.js"></script>
<script src="/assets/js/bootstrap.min.js"></script>
<script src="/assets/js/bootstrap-datetimepicker.min.js"></script>
<script src="/assets/js/main.js"></script>
<script src="/assets/js/index.js"></script>
<script type="text/javascript">
	function toCityCourselist(cityName, searchDate) {
		document.getElementById('selectCity').value = cityName;
		document.getElementById('selectDate').value = searchDate;
		document.getElementById("form1").submit();
	}
	
	function searchByCondition() {
		var cityCondition = document.getElementById('cityCondition').value;
		var dateCondition = document.getElementById('dateCondition').value;
		if(cityCondition==''){
			alert("please select a city");
			return false;
		}
		if(dateCondition==''){
			alert("please select a date");
			return false;
		}
		document.getElementById("form2").submit();
	}
</script>
</body>
</html>

