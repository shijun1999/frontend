$(document).ready(function(){
	$('#system_login_form').validate({
		errorElement: 'div',
		errorClass: 'help-block',
		focusInvalid: true,
		ignore: "",
		rules: {
			loginId: {
				required: true,
				email:true ,
				minlength: 5,
				maxlength: 20
			},
			password: {
				required: true,
				minlength: 5,
				maxlength: 20
			},
		},

		messages: {
		},

		highlight: function (e) {
			$(e).closest('.form-validator').removeClass('has-info').addClass('has-error');
		},

		success: function (e) {
			$(e).closest('.form-validator').removeClass('has-error');//.addClass('has-info');
			$(e).remove();
		},

		submitHandler: function (form) {
			window.location.href="kootourLogin!login";
		},

		invalidHandler: function (form) {
			BootstrapDialog.show({
				title: 'Error',
			    message: 'You missed some fields. They have been highlighted below.',
			    buttons: [{
			   		label: 'Close',
			        action: function(dialog) {
			        	dialog.close();
			        }
			    }]
			});
		}
	});

	$('#system_reg_form').validate({
		errorElement: 'div',
		errorClass: 'help-block',
		focusInvalid: false,
		ignore: "",
		rules: {
			firstName: {
				required: true,
				minlength: 5,
				maxlength: 20
			},
			lastName: {
				required: true,
				minlength: 5,
				maxlength: 20
			},
			email: {
				required: true,
				email:true ,
				minlength: 5,
				maxlength: 20
			},
			reemail: {
				required: true,
				email:true ,
				minlength: 5,
				maxlength: 20
			},
			password: {
				required: true,
				minlength: 5,
				maxlength: 20
			},
			repassword: {
				required: true,
				minlength: 5,
				maxlength: 20,
				equalTo: "#password"
			},
		},

		messages: {
		},

		highlight: function (e) {
			$(e).closest('.form-validator').removeClass('has-info').addClass('has-error');
		},

		success: function (e) {
			$(e).closest('.form-validator').removeClass('has-error');//.addClass('has-info');
			$(e).remove();
		},

		submitHandler: function (form) {
			window.location.href="kootourLogin!login";
		},

		invalidHandler: function (form) {
			BootstrapDialog.show({
				title: 'Error',
			    message: 'You missed some fields. They have been highlighted below.',
			    buttons: [{
			   		label: 'Close',
			        action: function(dialog) {
			        	dialog.close();
			        }
			    }]
			});
		}
	});
});
