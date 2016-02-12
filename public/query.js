$(document).ready(function(){
	$("#signInForm").submit(function(e) {
  	var email = $("#userName1").val();
	var Password=$("#password1").val();
  	      	alert(email);	
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
			      	alert("loged in");
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

	      		
	      	$.ajax({
		      url: "/signUp", 
		      data:{
		        userName:userName,
		      	Email:email,
		      	password:Password
		      },
		      method: "post",
		      success: function(result){ 
			      if(status){
					window.location.href = "home.html";
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
});
