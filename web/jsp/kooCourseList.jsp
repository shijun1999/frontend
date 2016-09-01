<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta charset="utf-8">
		<title>Kootour</title>

		<meta name="description" content="overview &amp; stats">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" href="css/font-awesome/css/font-awesome.min.css">

		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="css/bootstrap-dialog.min.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="fonts/fonts.kootour-mst.css">

		<!-- ace styles -->
		<link rel="stylesheet" href="css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style">

		<!-- kootour stles -->
		<link rel="stylesheet" href="css/kootour-mst.css">

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="css/ace-part2.min.css" class="ace-main-stylesheet" />
		<![endif]-->

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->
		<script src="js/ace-extra.min.js"></script>

		<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

		<!--[if lte IE 8]>
		<script src="js/html5shiv.min.js"></script>
		<script src="js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body class="no-skin">
	    <nav class="navbar navbar-kootour">
        <div class="container">

            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-kootour-collapse" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand navbar-brand-img" href="#">
                            <img  alt="Brand" src="images/icons/logo.svg" />
                </a>

                <p class="navbar-text kootour-link">
                    <a href="#">Kootour</a>
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

            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
		<div class="main-container container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-content">
				<div class="main-content-inner">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="ace-icon fa fa-home home-icon"></i>
								<a href="systemLocalhostList.html">System Home</a>
							</li>
                            <li>
                                <a href="#">Course List</a>
                            </li>
						</ul>
					</div>

					<div class="page-content">
					<div class="widget-box widget-color-dark">
					<div class="widget-header">
						<div class="widget-title bigger lighter">
							<a href="kootourMonInfo!load"><Strong style="color:white">Monthly Summary&nbsp;|&nbsp;</Strong></a>
							<a href="kooLocalhostList!load"><Strong style="color:white">Localhost List&nbsp;|&nbsp;</Strong></a>
							<a href="kooTouristList!load"><Strong style="color:white">Tourist List&nbsp;|&nbsp;</Strong></a>
							<a href="#"><Strong style="color:white">Course List&nbsp;</Strong></a>
							<br>
						</div>
					</div>
					</div>
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<div class="widget-box kootour-widget-color-main light-border">
								<div class="widget-header">
									<h4 class="widget-title lighter">
										<span class="white">Course List</span>
									</h4>
								</div>
								<div class="widget-body kootour-widget-color-main">
									<div class="widget-main">
									<div class="table-responsive">
										<table class="table table-striped table-bordered table-hover">
										<thead>
										<tr>
										<th>Course name</th>
										<th>Localhost name</th>
										<th>Create Date</th>
										<th>Status</th>
										<th>Score</th>
										<th>Rank</th>
										<th>Number of Tourist</th>
										<th>Sales in this month</th>
                                        <th>orders in this month</th>
										</tr>
										</thead>
										<tbody>
										<s:iterator var="kooCourseInfoGroup" value="#request.kooCourseInfoList" status="status">
											<tr class="">
												<td>
													<s:property value="#kooCourseInfoGroup.courseName" />
												</td>
												<td>
													<s:property value="#kooCourseInfoGroup.localhostName" />
												</td>
												<td>
													<s:property value="#kooCourseInfoGroup.createDate" />
												</td>
												<td>
													<s:property value="#kooCourseInfoGroup.status" />
												</td>
												<td>
													<s:property value="#kooCourseInfoGroup.score" />
												</td>
												<td>
													<s:property value="#kooCourseInfoGroup.rank" />
												</td>
												<td>
													<s:property value="#kooCourseInfoGroup.monthlyTouristNum" />
												</td>
												<td>
													<s:property value="#kooCourseInfoGroup.monthlySale" />
												</td>
												<td>
													<s:property value="#kooCourseInfoGroup.monthlyOrder" />
												</td>
											</tr>
                                        </s:iterator>
										</tbody>
										</table>
									</div><!-- /.widget-main -->
								</div><!-- /.widget-body -->
							</div><!-- /.widget-box -->
						</div><!-- /.col -->
					</div>
					</div>
					</div><!-- /.page-content -->
				</div>
			</div><!-- /.main-content -->

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
                <p><a href="#">Contact Us</a></p>
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

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script src="js/jquery-2.2.0.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script src="js/jquery.1.11.1.min.js"></script>
		<![endif]-->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='js/jquery.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='js/jquery1x.min.js'>"+"<"+"/script>");
		</script>
		<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="js/bootstrap.min.js"></script>


		<!-- ace scripts -->
		<script src="js/ace-elements.min.js"></script>
		<script src="js/ace.min.js"></script>

		<!-- page specific plugin scripts -->
		<script src="js/systemLocalhostList.js"></script>
		<script src="js/bootstrap-dialog.min.js"></script>

		<!-- inline scripts related to this page -->
</body>
</html>