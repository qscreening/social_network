$(document).ready(function(){
	$("#signInForm").submit(function(e) {
  	var email = $("#userName1").val();
	var Password=$("#password1").val();
	var passwordlen = $("#password1").length;
  	      	alert(email);
  	var atpos = email.indexOf("@");
	var dotpos = email.lastIndexOf(".com");
		if (atpos < 1 || ( dotpos - atpos < 6 )) {
			alert("Please, Enter a valid email");
			$("#userName1").focus();
		}
  	    if (Password === null || Password === "") {
			alert("Please enter the password (Min 5 & max 15 Charaters)");
		}
		if (passwordlen >= 5 && passwordlen <= 15) {
			alert('Login successful');
		}/*else{
			alert("password Must be between 5 and 15");
		}	*/
	      	$.ajax({
		      url: "/signin", 
		      data:
		      {
		      	Email:email,
		      	password:Password
		      },
		      method: "post",
		      success: function(result){ 
			      if(result){ 
			      	window.location.href="home.html";
			      	alert("logged in");
			      }
			      else{
			      	alert("user not exist");
			      }
		      	
		    	},error:function(){
		    		alert("error occured")
			 }
	     	});
	     	e.preventDefault();
 	});


$("#signUpForm").submit(function(e) {
		var userName = $("#fullName").val();
  		var email = $("#userName2").val();
        var Password=$("#password2").val();
        var cnfmPassword=$("#password3").val();
       
        var atpos = email.indexOf("@");
		var dotpos = email.lastIndexOf(".com");
        if (atpos < 1 || ( dotpos - atpos < 6 )) {
			alert("Please enter correct email ID");
			$("#userName2").focus();
		
		if (Password === null || Password === "") {
			alert("Please enter the password (Min 5 & max 15 Charaters)");
		
		if (Password > 5 && Password <= 15) {
			alert('correct password');
		
		var compare = Password.localeCompare(cnfmPassword);
        if (compare === 0){
			alert("Passwords matched.");
		

       

            		
	      	$.ajax({
		      url: "/signUp", 
		      data:{
		        userName:userName,
		      	Email:email,
		      	password:Password
		      },
		      method: "post",
		      success: function(result){ 
			      if(status === 0){
					
					window.location.href = "home.html";
				}
				else{
					alert("Invalid User ID or Password!!");
					
				}
			      
	    	},error:function(){
		    		alert("error occured")
			 }
	     	});
		e.preventDefault();
	}
}
}
}
	 });
});
