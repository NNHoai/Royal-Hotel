(function($) {
	$('#register-form').validate({
		rules: {
			name: {
				required: true,
			},
			username: {
				required: true,
			},
			password: {
				required: true
			},
			email: {
				required: true,
				email: true
			},
			phone_number: {
				required: true,
			}
		},
		onfocusout: function(element) {
			$(element).valid();
		},
	});

	jQuery.extend(jQuery.validator.messages, {
		required: "",
		remote: "",
		email: "",
		url: "",
		date: "",
		dateISO: "",
		number: "",
		digits: "",
		creditcard: "",
		equalTo: ""
	});
})(jQuery);

(function($) {  
    $('#login-form').validate({
      rules : {
          name : {
              required: true,
          },
          username : {
              required: true,
          },
          password : {
              required: true
          },
          email : {
              required: true,
              email : true
          },
          phone_number : {
              required: true,
          }
      },
      onfocusout: function(element) {
          $(element).valid();
      },
  });
  
      jQuery.extend(jQuery.validator.messages, {
          required: "",
          remote: "",
          email: "",
          url: "",
          date: "",
          dateISO: "",
          number: "",
          digits: "",
          creditcard: "",
          equalTo: ""
      });
  })(jQuery);


