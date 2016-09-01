<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="navbar-header">
	    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-kootour-collapse" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	    </button>
	    <a class="navbar-brand navbar-brand-img" href="stateCourseList!load">
	        <img  alt="Brand" src="images/icons/logo.svg" />
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
	        <li><a href="#"><b>Become a Guide</b> <img class="icon" src="images/icons/icon_guide.png" /></a></li>
	        <s:if test='#request.curTouristIdentiNo=="AI999999999"'>
	        	<li><a href="touristLogin!load">Log In</a></li>
	            <li><a href="signup!load">Sign Up</a></li>
	        </s:if>
	        <s:else>
		        <li class="message-link-mobile"><a href="messageList!load">Messages <img class="icon" src="images/icons/icon_message.png" /></a></li>
		        <li class="message-link-desktop dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Messages <img class="icon" src="images/icons/icon_message.png" /></a>
		          <ul class="dropdown-menu dropdown-dashboard">
		            <li class="dashboard-divider">
		                <span>Notifications</span>
		            </li>
		            <li>
		            	<s:if test='#request.kootourMessagelList.size()!=0'>
                        	<a href="messageList!load">
                        </s:if>
                        <s:else>
                        	<a>
                        </s:else>
		                <div class="message-list-wrapper">
		                    <div class="illustration">
		                        <img src="images/icons/icon_notification.png" class="icon-notification">
		                    </div>
		                    <div>
		                        <div class="message-list">
		                            <p>
		                            <s:if test='#request.kootourMessagelList.size()!=0'>
		                            	Comfirm your email
		                            </s:if>
		                            <s:else>
		                            	No new message
		                            </s:else>
		                            </p>
		                        </div>
		                    </div>
		                </div>
		                </a>
		            </li>
		            <li class="dashboard-divider">
		                <span>Messages (<s:property value="#request.localhostMessagelList.size()"/>)</span>
		            </li>
		            <s:iterator var="localhostMessageGroup" value="#request.localhostMessagelList" status="status">
		            	<li>
		                 <a href="sendMessage!load?localhostIdentiNo=<s:property value="#localhostMessageGroup.localhostIdentiNo" />">
		                 <div class="message-list-wrapper">
		                     <div class="illustration">
		                         <img src="<s:property value="#localhostMessageGroup.localhostPictureDisp" />" alt="profile" class="icon-notification img-circle">
		                     </div>
		                     <div>
		                         <div class="message-list">
		                             <div class="name">
		                                 <span class="blue"><s:property value="#localhostMessageGroup.localhostNameDisp" /></span>
		                             </div>
		
		                             <div class="content">
		                                 <p><s:property value="#localhostMessageGroup.messageText" /></p>
		                             </div>
		
		                             <div class="date">
		                                 <s:property value="#localhostMessageGroup.messageTime" />
		                             </div>
		                         </div>
		                     </div>
		                 </div>
		                 </a>
		             </li>
		            </s:iterator>
		            <li>
		                <a href="messageList!load">
		                <div class="text-center">
		                    <span class="see-all">See All</span>
		                </div>
		                </a>
		            </li>
		          </ul>
		        </li>
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><s:property value="#request.curTouristName"/> 
		          	<s:if test='#request.curTouristPicture!=""'>
                        <img class="icon" src="<s:property value="#request.curTouristPicture"/> " />
                    </s:if>
                    <s:else>
                    	<img class="icon" src="images/icons/icon_account.png" />
                    </s:else>
		          </a>
		          <ul class="dropdown-menu">
		        	<li><a href="accountSummary!load">Profile</a></li>
		            <li><a href="tourist!load">Edit my profile</a></li>
		            <li><a href="stateCourseList!logout">Log out</a></li>
		          </ul>
		        </li>
	        </s:else>
	        <!--<li><a href="#">Messages <img class="icon" src="images/icons/account_active_192X192.png" /></a></li>-->
	        <!--<li><a href="#"><img class="icon-navbar" src="images/icons/language_icon_white.png" /></a></li>-->
	    </ul>
	</div><!-- /.navbar-collapse -->
</div><!-- /.container-fluid -->