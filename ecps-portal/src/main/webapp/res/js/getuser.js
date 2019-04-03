$(function()
{
	$.ajax({
		  type: 'POST',
		  url: path+"/user/ajaxGetUser.do",
		  success: function(respose)
		  {
			  var jsonObj=$.parseJSON(respose);
			  
			  $("#loginAlertIs").html(jsonObj.user.username);
		  }
		});
		
}		
)
