<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
</head>
<body>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10 ">
			<span> <s:submit method="facebook" value="FACEBOOK" cssClass="btn btn-primary" /> <s:submit method="linkedin" value="LINKEDIN"
					cssClass="btn btn-primary" /> <s:submit method="wechat" value="WECHAT" cssClass="btn btn-primary" /> <s:submit method="sinaWeibo" value="SINA WEIBO"
					cssClass="btn btn-primary" />
			</span>
		</div>
		<!--
		<div>
			<div class="fb-like" data-share="true" data-width="450" data-show-faces="true"></div>
		</div>
		-->
	</div>
	<script>
		function statusChangeCallback(response) {
			console.log('statusChangeCallback');
			console.log(response);
			// The response object is returned with a status field that lets the
			// app know the current login status of the person.
			// Full docs on the response object can be found in the documentation
			// for FB.getLoginStatus().
			if (response.status === 'connected') {
				// Logged into your app and Facebook.
				testAPI();
			} else if (response.status === 'not_authorized') {
				// The person is logged into Facebook, but not your app.
				document.getElementById('status').innerHTML = 'Please log ' + 'into this app.';
			} else {
				// The person is not logged into Facebook, so we're not sure if
				// they are logged into this app or not.
				document.getElementById('status').innerHTML = 'Please log ' + 'into Facebook.';
			}
		}
		function checkLoginState() {
			FB.getLoginStatus(function(response) {
				statusChangeCallback(response);
			});
		}
		window.fbAsyncInit = function() {
			FB.init({
				appId : '240155409656041',
				cookie : true,
				xfbml : true,
				version : 'v2.5'
			});
			FB.getLoginStatus(function(response) {
				statusChangeCallback(response);
			});
		};

		//Load the SDK asynchronously
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id)) {
				return;
			}
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_US/sdk.js";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));

		// Here we run a very simple test of the Graph API after login is
		// successful.  See statusChangeCallback() for when this call is made.
		function testAPI() {
			console.log('Welcome!  Fetching your information.... ');
			FB.api('/me', function(response) {
				loadFacebookId(response.id, response.name);
				console.log('Successful login name for: ' + response.name);
				console.log('Successful login id for: ' + response.id);
				//document.getElementById('status').innerHTML = 'Thanks for logging in, ' + response.name + '!';
			});
		}
		function loadFacebookId(facebookid, facebookname) {
			var xmlhttp = new XMLHttpRequest();
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					document.getElementById('status').innerHTML = 'responseText, ' + xmlhttp.responseText + '!';
				}
			}
			xmlhttp.open("GET", "/KooTour/quicklySignUp!facebooklogin?loginId="+facebookid+"&firstName="+facebookname+"&loginType=11", true);
			xmlhttp.send();
		}
	</script>
	<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
	</fb:login-button>
	<div id="status"></div>
</body>
</html>