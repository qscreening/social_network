$(document).ready(function(){
	var userName="";
  	var Password="";
  	$("#userName1").on("keyup", function(){
  	userName = $("#userName1").val();
      //alert(userName);
	});	
          
 	$("#password1").on("keyup", function(){
        Password=$("#password1").val();
       //alert(Password);
   	});
  	$("#btn1").click(function(){
      	alert(userName);	
	      	$.ajax({
		      url: "signin", 
		      data:{userName:userName,password:Password},
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
 	});
 

$("#signUpForm").submit(function(e) {
  	var userName = $("#userName2").val();
  	var email = $("#userName3").val();
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
