$(document).ready(function(){
	$("#up").click(function(){
	$.ajax({url: "signUp", success: function(result){
	console.log(result);

	} });
  		}); 	

});
