var text=function(){
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
	      url: "signin?userName="+userName+"&password="+Password, 
	      method: "post",
	      success: function(result){
	      console.log(result);
	    },error:function(){
	   alert("error occured")
	   }
     });
});
 
}	
       

$(document).ready(function(){
    text();
});
