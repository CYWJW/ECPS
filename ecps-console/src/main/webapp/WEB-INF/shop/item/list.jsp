<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/ecps/console/common/taglibs.jsp"%>
<head>
<title>商品录入及上下架管理_商品管理</title>
<meta name="heading" content="商品录入及上下架管理" />
<meta name="menu" content="ItemMgmtMenu" />
<script type="text/javascript">
var path=${path}
</script>
<script type="text/javascript"
	src="<c:url value='/${system}/res/js/jquery.form.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='/${system}/res/js/jquery.tablesorter.js'/>"></script>
<%-- 	<script type="text/javascript" src="${path}/ecps/console/res/item/js/startPage.js"/> --%>

<script type="text/javascript"
	src="${path}/ecps/console/res/item/js/startPage.js"></script>
	
<script type="text/javascript">
	var path='${path}'
</script>
</head>

<body id="main">

	<div class="frameL">
		<div class="menu icon">
			<jsp:include page="${system}/common/itemmenu.jsp" />
		</div>
	</div>
	<form action="${path }/item/showItem.do" method="post" id="showForm">
		<input id="itemId" name="itemId" type="hidden"> <input
			id="showStatus1" name="showStatus" type="hidden"> <input
			id="notes" name="notes" type="hidden">
	</form>
	<div class="frameR">
		<div class="content">

			<div class="loc icon">
				<samp class="t12"></samp>
				当前位置：商品管理&nbsp;&raquo;&nbsp;<span class="gray" title="商品录入及上下架">商品录入及上下架</span>
			</div>

			<h2 class="h2_ch">
				<span id="tabs" class="l"> <!--  <a id="label3" href="${base}/item/listEntity.do?showStatus=2"   title="待上架实体商品" class="nor">待上架</a>  -->
					<a id="label6" href="${path}/item/listItems.do" title="全部实体商品"
					class="${(ebq.showStatus!=1 && ebq.showStatus!=0)? 'here':'nor'}">全部</a>
					<a id="label4" href="${path}/item/listItems.do?showStatus=1"
					title="未上架实体商品" class="${ebq.showStatus==1? 'here':'nor'}">未上架</a>
					<a id="label5" href="${path}/item/listItems.do?showStatus=0"
					title="已上架实体商品" class="${ebq.showStatus==0? 'here':'nor'}">已上架</a>
				</span>
			</h2>

			<form id="form1" name="form1" action="${path}/item/listItems.do"
				method="post">
				<div class="sch">
					<input type="hidden" id="showStatus" name="showStatus"
						value="${ebq.showStatus}" />
					<p>
						搜索：
						<ui:select name="catID" list="catList" rootId="0"
							defaulttext="所有分类" defaultvalue="" currentValue="${catID}" />
						<select id="brandId" name="brandId" value="">
							<option value="">全部品牌</option>
							<c:forEach items="${ebBrands}" var="brand">
								<option value="${brand.brandId }"
									<c:if test="${ebq.brandId == brand.brandId}">selected</c:if>>${brand.brandName}</option>
							</c:forEach>

						</select> <select id="auditStatus" name="auditStatus">
							<option value="" selected>全部审核状态</option>
							<option value="0"
								<c:if test="${ebq.auditStatus == 0}">selected</c:if>>待审核</option>
							<option value="1"
								<c:if test="${ebq.auditStatus == 1}">selected</c:if>>通过</option>
							<option value="2"
								<c:if test="${ebq.auditStatus == 2}">selected</c:if>>不通过</option>
						</select> <input type="text" id="searchText" value="${ebq.itemName}"
							name="itemName" title="请输入商品名称" class="text20 medium gray" /><input
							type="submit" id="goSearch" class="hand btn60x20" value="查询" />
					</p>
				</div>

				<div class="page_c">
					<span class="l"> </span> <span class="r inb_a"> <a
						href="${path}/item/toAddItem.do" class="btn80x20" title="添加商品">添加商品</a>
					</span>
				</div>

				<table cellspacing="0" summary="" class="tab" id="myTable">
					<thead>
						<tr>
							<th>商品编号</th>
							<th class="wp">商品名称</th>
							<th>图片</th>
							<th>新品</th>
							<th>推荐</th>
							<th>特价</th>
							<th>上下架</th>
							<th>审核状态</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${page.list}" var="item">
							<tr>
								<td>${item.itemNo}</td>
								<td>${item.itemName}</td>
								<td><img alt="" src="${request_file_path}${item.imgs}"
									width="50" height="50"></td>
								<c:if test="item.isNew==1?is:no"></c:if>
								<td><span class="${item.isNew==1?'is':'not'}"></span></td>
								<td><span class="${item.isGood==1?'is':'not'}"></span></td>
								<td><span class="${item.isHot==1?'is':'not'}"></span></td>
								<td><span class="${item.showStatus==1?'not':'is'}"></span></td>
								<td><c:if test="${item.showStatus==1}">审核通过</c:if> <c:if
										test="${item.showStatus==0}">待审核</c:if> <c:if
										test="${item.showStatus==2}">审核未通过</c:if></td>

								<td><a href="/ecps-console/shop/item/viewItem.jsp"
									title="查看">查看</a> <c:if test="${item.showStatus == 0 }">
										<a href="javascript:void(0);"
											onclick="isShow(${item.itemId}, 1)">下架</a>
										<a href="javascript:void(0);"  onclick="publish(${item.itemId})">发布</a>
									</c:if> <c:if test="${item.showStatus == 1 }">
										<a
											href="/ecps-console/ecps/console/item/editItem.do?type=1&itemId=2384">编辑</a>
										<a href="javascript:void(0);" onclick="singleDel('2384')">删除</a>
										<a href="javascript:void(0);"
											onclick="isShow(${item.itemId}, 0)">上架</a>
									</c:if></td>
						</c:forEach>
				</table>

				<div class="page_c">
					<span class="l inb_a"> </span> <span class="r page"> <input
						type="hidden" value="${page.pageNo}" id="pageNo" name="pageNo" />
						<input type="hidden" value="${page.pageCount}" id="pageCount"
						name="pageCount" /> 共<var id="pagePiece" class="orange">${page.count}</var>条<var
							id="pageTotal">${page.pageNo}/${page.pageCount}</var> <a
						href="javascript:void(0);" id="previous">首页</a> <a
						href="javascript:void(0);" id="before">上一页</a> <input type="text"
						size="2" id="jumpVal"> <a href="javascript:void(0);"
						id="jump">跳转到</a> <a href="javascript:void(0);" id="next">下一页</a>
						<a href="javascript:void(0);" id="last">尾页</a>
					</span>
				</div>
			</form>
		</div>
	</div>
</body>