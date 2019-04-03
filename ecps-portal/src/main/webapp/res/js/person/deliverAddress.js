$(function() {

	$("#loginAlertIs").click(function() {
		tipShow('#loginAlert');
	});

	$("#promptAlertIs").click(function() {
		tipShow('#promptAlert');
	});

	$("#transitAlertIs").click(function() {
		tipShow('#transitAlert');
	});

});

function modify(id) {
	// 发送ajax查询回显
	$.ajax({
		async : false,
		url : path + "/user/login/ajaxGetShipAddr.do",
		type : 'post',
		data : {
			shipAddrId : id
		},
		success : function(backdata) {
			var data = $.parseJSON(backdata);
			$("#username").val(data.shipName);
			$("#nick").val(data.addr);
			$("#phone").val(data.phone);
			$("#zipCode").val(data.zipCode);
			if(data.defaultAddr==1)
				{
					$("#defaultAddr").attr("checked","checked");
				}
			$("#update").val(id);
		},
		error : function() {// 响应不成功时返回的函数
			alert('请求失败！');
		}

	})
}
function getChild(doc, type) {
	var id = $(doc).find("option:selected").attr("id");

	$.ajax({
		async : false,
		url : path + "/user/login/ajaxGetAddr.do",
		type : 'post',
		data : {
			shipAddrId : id
		},
		success : function(backdata) {
			var data = $.parseJSON(backdata);
			var op = ""
			// 拼接
			for (var i = 0; i < data.length; i++) {
				op = op + "<option value=" + data[i].areaName + " id='"
						+ data[i].areaId + "'>" + data[i].areaName
						+ "</option> ";
			}

			// 如果传递城市
			if (type == "province") {
				$("#areacity").append(op);
			} else {
				$("#district").append(op);
			}

		},
		error : function() {// 响应不成功时返回的函数
			alert('请求失败！');
		}

	})

}
