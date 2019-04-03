$(function() {
	// 对页数进行操作
	var pageNo = $("#pageNo").val();
	var pageCount = $("#pageCount").val();
	// 对情况进行分类
	if (pageCount == '1') {
		$("#previous").hide();
		$("#before").hide();
		$("#next").hide();
		$("#last").hide();

	}
	// 如果不止一页 但是最后一页
	else if (pageCount != '1' && pageCount == pageNo) {
		$("#previous").show();
		$("#before").show();
		$("#next").hide();
		$("#last").hide();
	}
	// 如果不止一页 但是首
	else if (pageCount != '1' && pageNo == '1') {
		$("#previous").hide();
		$("#before").hide();
		$("#next").show();
		$("#last").show();
	}
	// 如果不止一页 不是头 不是尾
	else {
		$("#previous").show();
		$("#before").show();
		$("#next").show();
		$("#last").show();
	}

	$("#previous").click(function() {
		pageNo = 1;
		$("#pageNo").val(pageNo);
		$("#form1").submit();

	})

	$("#before").click(function() {
		pageNo--;
		$("#pageNo").val(pageNo);
		$("#form1").submit();
	})
	$("#jump").click(function() {
		pageNo = $("#jumpVal").val();
		$("#pageNo").val(pageNo);
		$("#form1").submit();
	})
	$("#next").click(function() {
		pageNo++;
		$("#pageNo").val(pageNo);
		$("#form1").submit();
	})
	$("#last").click(function() {
		pageNo=pageCount;
		$("#pageNo").val(pageNo);
		$("#form1").submit();
	})
	
	$("#addItemNoteConfirm").click(function(){
		var notes = $("#itemNote").val();
		$("#notes").val(notes);
		//提交表单
		$("#showForm").submit();
	});
})

var isShow= function(itemId,showStatus)
{
	//把itemId和auditStatus给表单
	$("#itemId").val(itemId);
	$("#showStatus1").val(showStatus);
	
	$("#itemNote").val("");
	tipShow("#addItemNote");
}

function publish(itemId){
	tipShow("#refundLoadDiv");
	$.ajax({
		url:path+"/item/publishItem.do",
		type:"post",
		dataType:"text",
		data:{
			itemId:itemId
		},
		success:function(responseText){
			if(responseText == "success"){
				alert("发布成功");
			}else{
				alert("发布失败");
			}
			tipHide("#refundLoadDiv");
		}
	})
}
