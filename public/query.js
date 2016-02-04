$(document).ready(function(){
	alert();
	$.ajax({url: "Social_network", success: function(result){
	alert(1);
	console.log(result);
	} });
  		 	

});
