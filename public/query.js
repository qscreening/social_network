$(document).ready(function(){
	alert();
	$.ajax({url: "Social_networkController", success: function(result){
	alert(1);
	console.log(result);
	} });
  		 	

});
