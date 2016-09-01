<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Vancouver Tours | Kootour</title>

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
						<li><a href="<s:property value="#menuInfo.menuClassName" />!<s:property value="#menuInfo.menuMethodName" />"><s:property value="#menuInfo.menuDispName" /></a></li>
					</s:else>
            	</s:iterator>
            </ol>
        </div>
    </nav>

    <div class="container">
        <div class="row">

            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <section class="section section-small col-xs-12">
                    <form id="form1" onSubmit="return false;" method="post" class="form-horizontal row">
                        <div class="col-xs-12">
                            <div class="col-xs-6 nopadding">
                                <span class="subtitle">Calendar:</span>
                            </div>
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <input type="text" name="searchDate" class="form-control" id='filter-calendar' placeholder="pick a date">
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-12">
                            <div class="col-xs-6 nopadding">
                                <span class="subtitle">Categories:</span>
                            </div>
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <select id="selectCategory" name="category" class="form-control" type="text">
                                    	<s:if test='#request.category==0'>
                                    		<option value="0" selected>All</option>
										</s:if>
										<s:else>
                                    		<option value="0">All</option>
										</s:else>
										<s:if test='#request.category==1'>
                                    		<option value="1" selected>Adventure</option>
										</s:if>
										<s:else>
                                    		<option value="1">Adventure</option>
										</s:else>
                                        <s:if test='#request.category==2'>
                                    		<option value="2" selected>Culture & Arts</option>
										</s:if>
										<s:else>
                                    		<option value="2">Culture & Arts</option>
										</s:else>
										<s:if test='#request.category==3'>
                                    		<option value="3" selected>Festival & Events</option>
										</s:if>
										<s:else>
                                    		<option value="3">Festival & Events</option>
										</s:else>
										<s:if test='#request.category==4'>
                                    		<option value="4" selected>Food & Drink</option>
										</s:if>
										<s:else>
                                    		<option value="4">Food & Drink</option>
										</s:else>
										<s:if test='#request.category==5'>
                                    		<option value="5" selected>Historical</option>
										</s:if>
										<s:else>
                                    		<option value="5">Historical</option>
										</s:else>
										<s:if test='#request.category==6'>
                                    		<option value="6" selected>Leisure Sports</option>
										</s:if>
										<s:else>
                                    		<option value="6">Leisure Sports</option>
										</s:else>
										<s:if test='#request.category==7'>
                                    		<option value="7" selected>Nature & Rural</option>
										</s:if>
										<s:else>
                                    		<option value="7">Nature & Rural</option>
										</s:else>
										<s:if test='#request.category==8'>
                                    		<option value="8" selected>Nightlife & Party</option>
										</s:if>
										<s:else>
                                    		<option value="8">Nightlife & Party</option>
										</s:else>
										<s:if test='#request.category==9'>
                                    		<option value="9" selected>Shopping & Market</option>
										</s:if>
										<s:else>
                                    		<option value="9">Shopping & Market</option>
										</s:else>
                                    </select>
                                </div>  
                            </div>
                        </div>

                        <div class="col-xs-12">
                            <div class="col-xs-6 nopadding">
                                <span class="subtitle">Languages:</span>
                            </div>
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <select id="selectLanguage" name="langSelect" class="form-control" type="text">
                                    	<s:if test='#request.langSelect==0'>
                                    		<option value="0" selected>English</option>
										</s:if>
										<s:else>
                                    		<option value="0">English</option>
										</s:else>
										<s:if test='#request.langSelect==1'>
                                    		<option value="1" selected>Chinese</option>
										</s:if>
										<s:else>
                                    		<option value="1">Chinese</option>
										</s:else>
										<s:if test='#request.langSelect==2'>
                                    		<option value="2" selected>Japanese</option>
										</s:if>
										<s:else>
                                    		<option value="2">Japanese</option>
										</s:else>
                                    </select>
                                </div>  
                            </div>
                        </div>

                        <div class="text-center col-xs-12">
                            <button onClick="searchByCondition();" class="btn btn-lg btn-kootour-bold btn-search" type="submit">Search</button>
                        </div>
                    </form>
                </section>

                <section class="section widget noborder section-small col-xs-12 text-center">
                    <s:property value="#request.courseList.size()"/> Activities found!
                </section>
            </div>

            <div class="nopadding col-lg-8 tours-wrapper col-md-8 col-sm-12 col-xs-12">
				<s:iterator var="courseGroup" value="#request.courseList" status="status">
                <div class="tours col-md-6 col-sm-6 col-xs-12">
                    <a href="#" >
                    <section class="section section-small">
                        <div class="tours-content tours-content-fixed">
                            <div class="tours-illustration" 
                            	onclick="courselist('<s:property value="#courseGroup.courseIdentiNo" />','<s:property value="#courseGroup.localhostIdentiNo" />');"
                            	style="background-image: url('<s:property value="#courseGroup.coursePictureListDisp.get(0).fullPath" />')">
                                <div class="tours-price-wrapper">
                                    <div><h2 class="tours-price"><s:property value="#courseGroup.discountPrice" /></h2></div> 
                                    <div><s:if test='#courseGroup.price!=""'><span class="tours-price-discount"><s:property value="#courseGroup.price" /></span></s:if><s:property value="#courseGroup.personOrGroup" /></div>
                                </div>
                                <input type="hidden" id="favorite_<s:property value="#status.index" />" name="favoriteIdentiNo" value="<s:property value="#courseGroup.favoriteIdentiNo" />">
								<s:if test='#courseGroup.favoriteIdentiNo!=""'>
									<div id="div_<s:property value="#status.index" />" class="add-favorited" onclick="saveOrCancelWish('<s:property value="#status.index" />','<s:property value="#courseGroup.courseIdentiNo" />');event.cancelBubble=true;"></div>
								</s:if>
								<s:else>
									<div id="div_<s:property value="#status.index" />" class="add-favorite" onclick="saveOrCancelWish('<s:property value="#status.index" />','<s:property value="#courseGroup.courseIdentiNo" />');event.cancelBubble=true;"></div>
								</s:else>
                            </div>

                            <p class="subtitle nomargin"><s:property value="#courseGroup.fullName" /></p>
                            <p><s:property value="#courseGroup.localhostNameDisp" /></p>
                            <p><s:property value="#courseGroup.courseContent"  escape="false" /></p>
                        </div>
                    </section>
                    </a>
                </div>
                </s:iterator>
                <input type="hidden" id="touristIdentiNo" name="touristIdentiNo" value="<s:property value="#request.touristIdentiNo"/>">
				<input type="hidden" id="langId" name="langId" value="<s:property value="#request.langId"/>">
				<input type="hidden" id="curTouristIdentiNo" name="curTouristIdentiNo" value="<s:property value="#request.curTouristIdentiNo"/>">
            </div>
		<s:hidden id="courseIdentiNo" name="courseIdentiNo" value="" />
		<s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />
        </div>
    </div>

   <footer>
        <div class="container">
            <div class="row">
                <div class="footer-block footer-band-wrapper col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <img src="/images/icons/logo_footer.png" />
                    <span class="footer-band">Kootour</span>
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
    <script src="/assets/js/all-tours.js"></script>
    
    <script type="text/javascript">
	    function courselist(courseIdentiNo, localhostIdentiNo) {
	    	document.getElementById("form1").action = "courseDetail!load?courseIdentiNo="+courseIdentiNo+"&localhostIdentiNo="+localhostIdentiNo;
	    	document.getElementById("form1").submit();
		}
	    
		function searchByCondition() {
			var selectCalendar = document.getElementById('filter-calendar').value;
			var selectCategory = document.getElementById('selectCategory').value;
			var selectLanguage = document.getElementById('selectLanguage').value;
			if(selectCalendar==''){
				alert("please select a date");
				return false;
			}
			
			document.getElementById("form1").action = "cityCourseList!courseFilter";
			document.getElementById("form1").submit();
		}
		function saveOrCancelWish(index, courseIdentiNo){
			var obj = new Object();
		    obj.courseIdentiNo = courseIdentiNo;
		    obj.touristIdentiNo = document.getElementById("touristIdentiNo").value;
		    obj.langId = document.getElementById("langId").value;
		    obj.favoriteIdentiNo = document.getElementById("favorite_"+index).value;
		    var curTouristIdentiNo = document.getElementById("curTouristIdentiNo").value;
		    if(curTouristIdentiNo=="AI999999999"){
				document.getElementById("form1").action = "touristLogin!load";
				document.getElementById("form1").submit();
		    }else{
		    	$.ajax({
					url: 'WishAjaxJason/wishStatusSave',
					type: 'post',
					dataType: 'json',
					data: {"jsonFromWeb": JSON.stringify(obj)},
					success: function(json) {
						var obj = JSON.parse(json);
						var result = obj.result;
						var className = document.getElementById("div_"+index).className;
						if(className == "add-favorited"){
							var div = document.getElementById("div_"+index); 
							div.className = 'add-favorite'; 
						}else if(className == "add-favorite"){
							var div = document.getElementById("div_"+index); 
							div.className = 'add-favorited';
						}
						document.getElementById("favorite_"+index).value = result;
						/*alert(mText);*/
					},
					error: function(res) {
						alert("error")
					}
				});
		    }
		}
	</script>
</body>
</html>

