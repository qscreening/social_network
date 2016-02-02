$(document).ready(function(){
alert();
	$.ajax({url: "/user", success: function(result){
	console.log(result);
	} });
  		 	
}
