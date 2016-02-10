var Name="";
var Password="";

$(document).ready(function(){
    $("#submit").click(function(){
	Name =$("#name").val();
	Password =$("#password").val();
        alert("Name: "  + Name);
	alert("password: "  + Password);
	$.ajax({
		url: "Login",
		data: {
			username: Name,
			password: Password		
		}, 
	        method:"post",
		success: function(result){
	                console.log(result);
			alert("welcome");
	        }
	});
    });

    
});
