
Stripe.setPublishableKey('pk_test_AoafMzTRdKdAVZ5Fv97fGEbt');

$(document).ready(function(){
	$.validator.addMethod("numbersOnly", function (value, element) {
		return $.validator.addMethod("numbersOnly", function (value, element) {
			return /^[0-9]+(\.[0-9]{1,2})?$/.test(value);
			//return /^[0-9]+$/i.test(value);
		}, "The amount requires a decimal with a precision of 2.");
	});
	
	$('#payment-form').validate({
		errorElement: 'div',
		errorClass: 'help-block',
		focusInvalid: true,
		ignore: "",
		rules: {
			cardNumber: {
				required: true
			},
			expMonth:{
				required: true
			},
			expYear:{
				required: true
			},
			cvc: {
				required: true,
				minlength:3,
				maxlength:4,
				digits:true
			},
			amount:{
				required: true,
				numbersOnly: true
			}
		},

		messages: {
			cardNumber: "Please enter card number",
			cvc: {
				required: "Please provide cvc number",
				minlength: "Your cvc number must be 3 or 4 digits",
				maxlength: "Your cvc number must be 3 or 4 digits"
			},
			amount: {
				required: "Please enter amount"
			}
		},

		highlight: function (e) {
			$(e).closest('.form-validator').removeClass('has-info').addClass('has-error');
		},

		success: function (e) {
			$(e).closest('.form-validator').removeClass('has-error');//.addClass('has-info');
			$(e).remove();
		},

		submitHandler: function (form) {
			var $form = $('#payment-form');
			$form.submit(function(event) {
				// Disable the submit button to prevent repeated clicks:
				//$form.find('.submit').prop('disabled', true);

				// Request a token from Stripe:
				Stripe.card.createToken($form, stripeResponseHandler);

				// Prevent the form from being submitted:
				return false;
			});

			function stripeResponseHandler(status, response) {

				if (response.error) { // Problem!

					// Show the errors on the form:
					$form.find('.payment-errors').text(response.error.message);
					$form.find('.submit').prop('disabled', false); // Re-enable submission

				} else { // Token was created!

					// Get the token ID:
					var token = response.id;

					// Insert the token ID into the form so it gets submitted to the server:
					//$form.append($('<input type="hidden" name="stripeToken">').val(token));

					// Submit the form:
					//$form.get(0).submit();
					var obj = new Object();
					obj.token = token;
					obj.cardNumber = $("#cardNumber").val();
					obj.amount = $("#amount").val();
					obj.description = $("#description").val();
					obj.last4Number =obj.cardNumber.substring(obj.cardNumber.length-4);
					$.ajax({
						url: 'stripePaymentAjax!payment',
						type: 'post',
						dataType: 'json',
						data: {"jsonFromWeb": JSON.stringify(obj)},
						success: function(json) {
							var obj = JSON.parse(json);
							if (obj.result == 'success') {
								window.location.href="localhostLogin!load";
							} else {
								BootstrapDialog.show({
									title: 'Error',
									message: obj.data,
									buttons: [{
										label: 'Close',
										action: function(dialog) {
											dialog.close();
										}
									}]
								});
							}
						},
						error: function(res) {
							BootstrapDialog.show({
								title: 'Error',
								message: obj.data,
								buttons: [{
									label: 'Close',
									action: function(dialog) {
										dialog.close();
									}
								}]
							});
						}
					});
				}
			};
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
