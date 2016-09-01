<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>Edit my profil | Kootour</title>
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
</head>
<body>
     <!-- Begin navbar -->
    <nav class="navbar navbar-kootour">
    	<jsp:include page="header.jsp" />
    </nav>

    <div class="container">
        <div class="row">
            <div class="col-lg-offset-2 col-md-offset-2 col-lg-8 col-md-8 col-sm-12 col-xs-12">
                <section class="section section-small">
                    <table class="table-header">
                        <tr>
                            <td>
                                <span class="subtitle"><b>Profile</b></span>
                            </td>
                            <td>
                            	<form id="form0" onSubmit="return false;">
                                	<a class="btn btn-lg btn-kootour-gray pull-right"  href="accountSummary!load">View Profile</a>
                                </form>
                            </td>
                        </tr>
                    </table>
                    
                    <form id="form1" class="form-horizontal row" action="tourist!save" onSubmit="return false;" method="post">
                        <div class="col-xs-12">
                            <p class="subtitle">General</b></p>

                            <div class="form-group uploader-from-group">
                                <label class="col-xs-12 col-sm-3 text-left control-label">Picture</label>
                                <div class="uploader nopadding col-xs-12 col-sm-8">
                                    <div class="col-xs-12 col-sm-6">
                                        <div class="user-thumbnail img-circle nomargin" id="output-uploader" style="background-image:url('<s:property value="#request.picture" />')"></div>
                                    </div>
                                    <div class="col-xs-12 col-sm-6">
                                        <input class="file-input" type='file'  id="output" accept="image/*" onchange="loadFile(event)"/>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group required">
                                <label for="firstName" class="col-sm-3 text-left control-label">First Name</label>
                                <div class="col-sm-9">
                                    <input type="text" name="firstName" value="<s:property value="#request.firstName" />" class="form-control input-lg gray" id="firstName" required>
                                </div>
                            </div>

                            <div class="form-group required">
                                <label for="lastName" class="col-sm-3 text-left control-label">Last Name</label>
                                <div class="col-sm-9">
                                    <input type="text" name="lastName" value="<s:property value="#request.lastName" />" class="form-control input-lg gray" id="lastName" required>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="location" class="col-sm-3 text-left control-label">Location</label>
                                <div class="col-sm-9">
                                    <input type="text" name="location" value="<s:property value="#request.location" />" class="form-control input-lg gray" id="location">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="password" class="col-sm-3 text-left text-left control-label">Password</label>
                                <div class="col-sm-4">
                                    <input type="password" value="<s:property value="#request.password" />" class="form-control input-lg transparent" id="password" readonly>
                                </div>
                                <div class="col-sm-4">
                                    <a href="changePassword!load" class="btn btn-lg btn-kootour fullwidth">Change Password</a>
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-12 divider"></div>

                        <div class="col-xs-12">

                            <p class="subtitle">Private Information</b></p>

                            <div class="form-group">
                                <label for="location" class="col-sm-3 text-left control-label">Gender</label>
                                <div class="col-sm-2">
                                    <div class="radio">
                                        <input type="radio" name="sex" id="radio1" value="1" <s:if test='#request.sex=="1"'> checked </s:if>>
                                        <label for="radio1">Male</label>
                                    </div>
                                </div>
                                <div class="col-sm-2">
                                    <div class="radio">
                                        <input type="radio" name="sex" id="radio2" value="2" <s:if test='#request.sex=="2"'> checked </s:if>>
                                        <label for="radio2">Female</label>
                                    </div>
                                </div>
                                <div class="col-sm-2">
                                    <div class="radio">
                                        <input type="radio" name="sex" id="radio3" value="3" <s:if test='#request.sex=="3"'> checked </s:if>>
                                        <label for="radio3">Other</label>
                                    </div>
                                </div>
                            </div>
                           
                            <div class="form-group">
                                <label for="location" class="col-sm-3 text-left control-label">Birth Date</label>
                                <div class="col-sm-3 radio" >
                                    <select id="selectMonth" class="form-control gray input-lg">
                                    	<option value=""></option>
                                    	<s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="01"'>
                                        		<option value="01" selected>January</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="01">January</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="01">January</option>
                                        </s:else> 
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="02"'>
                                        		<option value="02" selected>February</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="02">February</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="02">February</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="03"'>
                                        		<option value="03" selected>March</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="03">March</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="03">March</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="04"'>
                                        		<option value="04" selected>April</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="04">April</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="04">April</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="05"'>
                                        		<option value="05" selected>May</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="05">May</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="05">May</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="06"'>
                                        		<option value="06" selected>June</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="06">June</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="06">June</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="07"'>
                                        		<option value="07" selected>July</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="07">July</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="07">July</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="08"'>
                                        		<option value="08" selected>August</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="08">August</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="08">August</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="09"'>
                                        		<option value="09" selected>September</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="09">September</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="09">September</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="10"'>
                                        		<option value="10" selected>October</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="10">October</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="10">October</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="11"'>
                                        		<option value="11" selected>November</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="11">November</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="11">November</option>
                                        </s:else>
                                        <s:if test='#request.birthday!=""'>
                                        	<s:if test='#request.birthday.substring(4,6)=="12"'>
                                        		<option value="12" selected>December</option>
                                        	</s:if>
                                        	<s:else>
                                        		<option value="12">December</option>
                                        	</s:else> 
                                        </s:if>
                                        <s:else>
                                        	<option value="12">December</option>
                                        </s:else>
                                    </select>
                                </div>
                                <div class="col-sm-3 radio">
                                    <select id="selectDay" class="form-control gray input-lg">
                                    	<option value=""></option>
                                    	<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="01"'>
												<option value="01" selected>1</option>
											</s:if>
											<s:else>
												<option value="01">1</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="01">1</option>
										</s:else>
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="02"'>
												<option value="02" selected>2</option>
											</s:if>
											<s:else>
												<option value="02">2</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="02">2</option>
										</s:else>
                                    	<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="03"'>
												<option value="03" selected>3</option>
											</s:if>
											<s:else>
												<option value="03">3</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="03">3</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="04"'>
												<option value="04" selected>4</option>
											</s:if>
											<s:else>
												<option value="04">4</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="04">4</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="05"'>
												<option value="05" selected>5</option>
											</s:if>
											<s:else>
												<option value="05">5</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="05">5</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="06"'>
												<option value="06" selected>6</option>
											</s:if>
											<s:else>
												<option value="06">6</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="06">6</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="07"'>
												<option value="07" selected>7</option>
											</s:if>
											<s:else>
												<option value="07">7</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="07">7</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="08"'>
												<option value="08" selected>8</option>
											</s:if>
											<s:else>
												<option value="08">8</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="08">8</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="09"'>
												<option value="09" selected>9</option>
											</s:if>
											<s:else>
												<option value="09">9</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="09">9</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="10"'>
												<option value="10" selected>10</option>
											</s:if>
											<s:else>
												<option value="10">10</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="10">10</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="11"'>
												<option value="11" selected>11</option>
											</s:if>
											<s:else>
												<option value="11">11</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="11">11</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="12"'>
												<option value="12" selected>12</option>
											</s:if>
											<s:else>
												<option value="12">12</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="12">12</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="13"'>
												<option value="13" selected>13</option>
											</s:if>
											<s:else>
												<option value="13">13</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="13">13</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="14"'>
												<option value="14" selected>14</option>
											</s:if>
											<s:else>
												<option value="14">14</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="14">14</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="15"'>
												<option value="15" selected>15</option>
											</s:if>
											<s:else>
												<option value="15">15</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="15">15</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="16"'>
												<option value="16" selected>16</option>
											</s:if>
											<s:else>
												<option value="16">16</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="16">16</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="17"'>
												<option value="17" selected>17</option>
											</s:if>
											<s:else>
												<option value="17">17</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="17">17</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="18"'>
												<option value="18" selected>18</option>
											</s:if>
											<s:else>
												<option value="18">18</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="18">18</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="19"'>
												<option value="19" selected>19</option>
											</s:if>
											<s:else>
												<option value="19">19</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="19">19</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="20"'>
												<option value="20" selected>20</option>
											</s:if>
											<s:else>
												<option value="20">20</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="20">20</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="21"'>
												<option value="21" selected>21</option>
											</s:if>
											<s:else>
												<option value="21">21</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="21">21</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="22"'>
												<option value="22" selected>22</option>
											</s:if>
											<s:else>
												<option value="22">22</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="22">22</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="23"'>
												<option value="23" selected>23</option>
											</s:if>
											<s:else>
												<option value="23">23</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="23">23</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="24"'>
												<option value="24" selected>24</option>
											</s:if>
											<s:else>
												<option value="24">24</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="24">24</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="25"'>
												<option value="25" selected>25</option>
											</s:if>
											<s:else>
												<option value="25">25</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="25">25</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="26"'>
												<option value="26" selected>26</option>
											</s:if>
											<s:else>
												<option value="26">26</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="26">26</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="27"'>
												<option value="27" selected>27</option>
											</s:if>
											<s:else>
												<option value="27">27</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="27">27</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="28"'>
												<option value="28" selected>28</option>
											</s:if>
											<s:else>
												<option value="28">28</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="28">28</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="29"'>
												<option value="29" selected>29</option>
											</s:if>
											<s:else>
												<option value="29">29</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="29">29</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="30"'>
												<option value="30" selected>30</option>
											</s:if>
											<s:else>
												<option value="30">30</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="30">30</option>
										</s:else>
										
										<s:if test='#request.birthday!=""'>
											<s:if test='#request.birthday.substring(6,8)=="31"'>
												<option value="31" selected>31</option>
											</s:if>
											<s:else>
												<option value="31">31</option>
											</s:else> 
										</s:if>
										<s:else>
											<option value="31">31</option>
										</s:else>
										

                                    </select>
                                </div>
                                <div class="col-sm-3 radio">
                                    <select id="selectYear" class="form-control gray input-lg">
                                    	<s:iterator var="yearListGroup" value="#request.yearListDisp" status="status">
                                    		<s:if test='#request.birthday!=""'>
                                    			<s:set var="myVar"><s:property value="#yearListGroup" /></s:set>
	                                        	<s:if test='#request.birthday.substring(0,4)== #yearListGroup'>
	                                        		<option value="<s:property value="#yearListGroup" />" selected><s:property value="#yearListGroup" /></option>
	                                        	</s:if>
	                                        	<s:else>
	                                        		<option value="<s:property value="#yearListGroup" />"><s:property value="#yearListGroup" /></option>
	                                        	</s:else> 
	                                        </s:if>
	                                        <s:else>
	                                        	<option value="<s:property value="#yearListGroup" />"><s:property value="#yearListGroup" /></option>
	                                        </s:else>
                                    	</s:iterator>
                                    </select>
                                </div>
                                <input type="hidden" id="myBirthday" name="birthday"/>
                                <s:hidden id="localhostIdentiNo" name="localhostIdentiNo" value="" />
                            </div>

                            <div class="form-group">
                                <label for="email" class="col-sm-3 text-left control-label">Email</label>
                                <div class="col-sm-4">
                                    <input type="text" name="email" value="<s:property value="#request.email" />" class="form-control input-lg transparent" id="phoneNumber" readonly="readonly">
                                </div>
                                <div class="col-sm-4">
                                    <a href="confirm_email.html" class="btn btn-lg btn-kootour fullwidth">Verify</a>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="phoneNumber" class="col-sm-3 text-left control-label">Phone Number</label>
                                <div class="col-sm-4">
                                    <input type="text" name="telNo" value="<s:property value="#request.telNo" />" class="form-control input-lg transparent" id="phoneNumber" readonly="readonly">
                                </div>
                                <div class="col-sm-4">
                                    <a href="confirm_phone.html" class="btn btn-lg btn-kootour fullwidth">Verify</a>
                                    <!--<button class="btn btn-lg btn-kootour fullwidth">Change</button>-->
                                </div>
                            </div>
                        </div>

                        <div class="nested-section col-xs-offset-3 col-xs-6">
                            <p class="text-center">
                                <button onclick="save();" class="btn btn-lg btn-kootour-bold fullwidth">Save</button>
                            </p>
                        </div>
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
    <script src="assets/js/main.js"></script>
    <script type="text/javascript">
		function save() {
			var year = document.getElementById('selectYear').value;
			var month = document.getElementById('selectMonth').value;
			var day = document.getElementById('selectDay').value;
			document.getElementById('myBirthday').value = year+month+day;
			document.getElementById("form1").submit();
		}
    </script>
</body>
</html>
