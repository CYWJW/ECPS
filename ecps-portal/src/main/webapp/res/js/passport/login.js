var flag = false;
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

	$(".bg_text input").blur(function() {
		var type = $(this).attr("name");
		var val = $(this).val().trim();
		if (val == "") {
			if (type == "username") {
				$("#errorName").html("请输入用户名");
				$("#errorName").show();

			} else if (type == "password") {
				$("#errorName").html("请输入密码");
				$("#errorName").show();

			} else if (type == "captcha") {
				$("#errorName").html("请输入验证码");
				$("#errorName").show();

			}
		} else {
			$("#errorName").hide();
		}

	}

	)
	var tip = $("#tip").val();
	// 如果提示不为空
	if (tip.trim() != "") {
		if (tip == "cap_error") {
			$("#errorName").html("验证码错误");
			$("#errorName").show();
		} else if (tip == "userpass_error") {
			$("#errorName").html("用户名或密码错误");
			$("#errorName").show();
		}

		else {
			$("#errorName").html("未知错误");
			$("#errorName").show();
		}

	}

});

function changeImgs() {
	$("#getImage").attr("src", path + "/user/getImage.do?d=" + new Date());
}

function login() {
	window.location.href = "../phoneClassification.jsp";
}
