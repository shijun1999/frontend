$(document).ready(function(){
	
	$("#load-more").on("click", function() {
//		$("#kootour-tchat").children().remove();
		//path1 more than 10 messages
		var leftHtml ='<div><div class="message-wrapper"><div class="message-content drt-left"><span>LocalHos1</span></div></div></div>'; 
		$("#kootour-tchat").children().eq(0).append(leftHtml);
		//path2 less than 10 messages
		
//		$ajax(){
//			
//		}
		
	})
	
	var guide = {
//		    thumbnail: "images/faces/face_2.jpg"
		}

		var tourist = {
//		    thumbnail: "images/faces/face_1.jpg"
		}

		var formElement = document.getElementById('kootour-form-tchat');

		var tchat = new Tchat(document.getElementById('kootour-tchat'), guide, tourist);

		formElement.addEventListener("submit", function (e) {
		    e.preventDefault();
		    var obj = new Object();
		    obj.messageText = $("#message").val();
		    obj.langId = document.getElementById('langId').value;
		    obj.touristIdentiNo = document.getElementById('touristIdentiNo').value;
		    obj.localhostIdentiNo = document.getElementById('localhostIdentiNo').value;
		    if(obj.messageText!=''){
		    	$.ajax({
					url: 'sendMessageAjax/createCourseMessage',
					type: 'post',
					dataType: 'json',
					data: {"jsonFromWeb": JSON.stringify(obj)},
					success: function(json) {
						var obj = JSON.parse(json);
						/*if (obj.result == 'success') {*/
							/*window.location.href="localhostCourseList!load";*/
							/*var t = obj.data;*/
							var mText = obj.messageText;
							var mTime = obj.messageTime;
							var message = {
						        date: new Date(mTime.substring(0,4), mTime.substring(4,6), mTime.substring(6,8)),
						        from: tourist,
						        content: mText
						    }
						    tchat.addMessage(message);
						    formElement.reset();
						    
						/*} else {
							alert("errorcc")
						}*/
					},
					error: function(res) {
						alert("error")
					}
				});
		    }else{
		    	alert("empty message")
		    }
		    
		    /*var message = {
		        date: new Date(),
		        from: tourist,
		        content: this.elements[0].value
		    }
		    tchat.addMessage(message);
		    formElement.reset();*/
		    return false;
		});
		var messages = document.getElementsByName("messages");
		if (typeof(messages) == "undefined") { 
			   alert("no message"); 
		}else{
			for (var i=0; i< messages.length; i++)
			{	
				var date = document.getElementById('messageTime'+i).value;
				var type = document.getElementById('messageType'+i).value;
				var message = document.getElementById('messageText'+i).value;
				if(type=='L'){
					tchat.addMessage({
					    date: new Date(date.substring(0,4), date.substring(4,6), date.substring(6,8)),
					    from: guide,
					    content: message
					});
				}else{
					tchat.addMessage({
					    date: new Date(date.substring(0,4), date.substring(4,6), date.substring(6,8)),
					    from: tourist,
					    content: message
					});
				}
				
			}
		}


		/*$.ajax({
			url: 'localhostCourseCreate/createCourse',
			type: 'post',
			dataType: 'json',
			data: {"jsonFromWeb": JSON.stringify(obj)},
			success: function(json) {
				var obj = JSON.parse(json);
				if (obj.result == 'success') {
					window.location.href="localhostCourseList!load";
				} else {
					alert("error")
				}
			},
			error: function(res) {

			}
		});
		<% %>
		<s:iterator value="#request.list" id="item">
		alert("<s:property value="#item.property" />");
		  </s:iterator>*/

		/*tchat.addMessage({
		    date: new Date(2016, 05, 21),
		    from: guide,
		    content: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut a luctus lectus. Mauris mattis sapien vel nunc aliquet volutpat. Nulla eget dui ut erat pretium maximus nec id sapien."
		});

		tchat.addMessage({
		    date: new Date(2016, 05, 23),
		    from: tourist,
		    content: "Hello"
		});

		tchat.addMessage({
		    date: new Date(2016, 05, 23),
		    from: tourist,
		    content: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut a luctus lectus. Mauris mattis sapien vel nunc aliquet volutpat. Nulla eget dui ut erat pretium maximus nec id sapien."
		});*/

});
