//上传图片 用ajax方式
function submitUpload() {
	var option = {
		async : false,
		url : path + "/upload/uploadPic.do",// 上传的url
		dataType : "text",// 回调值的数据类型
		success : function(responseText) {
			// {"realPath":"http://...", "relativePath":"/upload/.."}
			var jsonObj = $.parseJSON(responseText);
			$("#imgsImgSrc").attr("src", jsonObj.realPath);
			$("#imgs").val(jsonObj.relativePath);
			$("#lastRealPath").val(jsonObj.realPath);
		},
		error : function() {
			alert("系统错误");
		}
	}
	$("#form111").ajaxSubmit(option);
}

function validName(name) {
	var isOk = 'yes'
	var option = {
		async : false,
		url : path + "/item/validateName.do",// 上传的url
		dataType : "text",// 回调值的数据类型
		data : {
			brandName : name
		},
		success : function(responseText) {
			isOk = responseText;
		},
		error : function() {
			alert("系统错误");
		}
	}
	$.ajax(option);
	return isOk;
}

$(function() {
	var i = 1
	$("#form111").submit(function() {
		/*--------------必选----------------------*/
		var isSubmit = true;
		// 找出必填的
		$(this).find("[reg2]").each(function() {
			// 找出正则
			var reg = $(this).attr("reg2");
			// 找出提示
			var tip = $(this).attr("tip");
			// 提出内容
			var val = $(this).val();
			// 转换为正则对象
			var regExp = new RegExp(reg);
			// 验证正则
			if (!regExp.test(val)) {
				$(this).next().html("<font color='red'>" + tip + "</font>");
				isSubmit = false;
				return isSubmit;
			} else {
				if ($(this).attr("name") == 'brandName') {
					// ajax 校验
					var isOk = validName(val);
					if (isOk != 'yes') {
						$(this).next().html("<font color='red'>品牌名重复</font>");
						isSubmit = false;
						return isSubmit;
					} else {
						$(this).next().html("");
					}
				} else {
					$(this).next().html("");
				}

			}
		})
		/*--------------非必填----------------------*/
		// 找出必填的
		$(this).find("[reg1]").each(function() {
			// 找出正则
			var reg = $(this).attr("reg1");
			// 找出提示
			var tip = $(this).attr("tip");
			// 提出内容
			var val = $(this).val();
			// 转换为正则对象
			var regExp = new RegExp(reg);
			// 验证正则
			if (val != null && val != "" && !regExp.test(val)) {
				$(this).next().html("<font color='red'>" + tip + "</font>");
				isSubmit = false;
				return isSubmit;
			} else {
				$(this).next().html("");
			}
		})
		//防止表单二次提交
		if(isSubmit){
			tipShow("#refundLoadDiv");
		}
		return isSubmit;
	}

	)

})