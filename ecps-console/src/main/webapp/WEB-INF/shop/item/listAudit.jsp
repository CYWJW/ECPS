<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/ecps/console/common/taglibs.jsp"%>
<head>
<title>实体商品管理_商品审核</title>
<meta name="heading" content="商品审核"/>
<meta name="menu" content="ItemMgmtMenu"/>
<script type="text/javascript" src="<c:url value='/${system}/res/js/jquery.form.js'/>"></script>
<script type="text/javascript" src="<c:url value='/${system}/res/js/jquery.tablesorter.js'/>"></script>
<script type="text/javascript" src="${path}/ecps/console/res/item/js/listAudit.js"></script>
</head>
<body id="main">

<div class="frameL"><div class="menu icon">
    <jsp:include page="/${system}/common/itemmenu.jsp"/>
</div></div>

<div class="frameR"><div class="content">

    <div class="loc icon"><samp class="t12"><</samp>当前位置：商品管理&nbsp;&raquo;&nbsp;<span class="gray" title="商品审核">商品审核</span></div>

    <h2 class="h2_ch"><span id="tabs" class="l">
        <a id="label4" href="${path}/item/listAudit.do?showStatus=1"   title="全部实体商品" class="${(ebq.auditStatus!=0 && ebq.auditStatus!=1 && ebq.auditStatus!=2 )? 'here':'nor'}">全部</a>
        <a id="label1" href="${path}/item/listAudit.do?auditStatus=0&showStatus=1" title="待审核实体商品" class="${ebq.auditStatus==0 ? 'here':'nor'}">待审核</a>
        <a id="label2" href="${path}/item/listAudit.do?auditStatus=2&showStatus=1"  title="审核不通过实体商品" class="${ebq.auditStatus==2 ? 'here':'nor'}">审核不通过</a>
        <a id="label3" href="${path}/item/listAudit.do?auditStatus=1&showStatus=1"   title="已审核实体商品" class="${ebq.auditStatus==1 ? 'here':'nor'}">已审核</a>
    </span></h2>

<form action="${path}/item/auditItem.do" id="auditForm" method="post">
	<input type="hidden" id="itemId" name="itemId"> 
	<input type="hidden" id="auditStatus1" name="auditStatus"> 
	<input type="hidden" id="itemNotes" name="itemNote"> 
	
</form>


<form id="form1" name="form1" action="${path}/item/listAudit.do" method="post">
    <input type="hidden" id="deleteAction" name="deleteAction" value="${base}/item/deleteItem.do" />
    <input type="hidden" id="deleteCheckAction" name="deleteCheckAction" value="${base}/item/deleteCheck.do" />
    <input type="hidden" id="auditStatus" name="auditStatus" value="${ebq.auditStatus}" />
    <input type="hidden" id="showStatus" name="showStatus" value="${ebq.showStatus}" />
    <div class="sch">
        <input type="hidden" id="userSearch" name="userSearch" />
        <p>查询：
        <ui:select name="catID" list="catList" rootId="0" defaulttext="所有分类" defaultvalue="" currentValue="${catID}"/>
        <select id="brandId" name="brandId" value="${brandId}">
            <option value="">全部品牌</option>
            <c:forEach items='${brandList}' var="brand">
                <option value="${brand.brandId}"<c:if test='${brandId==brand.brandId}'> selected </c:if>>${brand.brandName}</option>
            </c:forEach>
        </select><select  id="stock" name="stock" style="display:none;">
            <option value="-1" selected="">全部库存</option>
            <option value="0"<c:if test='${stock==0}'> selected</c:if>>已缺货</option>
            <option value="1"<c:if test='${stock==1}'> selected</c:if>>即将缺货</option>
        </select><input type="text" id="searchText" name="searchText" value="${userSearch}" title="请输入商品编号或商品名称" class="text20 medium gray" /><input type="submit" id="goSearch" class="hand btn60x20" value="查询" />
    </p></div>


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
			<c:forEach items="${page.list }" var="item">
			
			<tr>
				<td>${item.itemNo }</td>
                <td >${item.itemName }</td>
                <td><img alt="" src="${request_file_path }${item.imgs}" width="50" height="50"></td>
				
				<td>
					<c:if test="${item.isNew == 1 }"><span class="is" ></span></c:if>
					<c:if test="${item.isNew == 0 }"><span class="not" ></span></c:if>
				</td>
				<td>
					<c:if test="${item.isGood == 1 }"><span class="is" ></span></c:if>
					<c:if test="${item.isGood == 0 }"><span class="not" ></span></c:if>
					
				</td>
				<td>
					<c:if test="${item.isHot == 1 }"><span class="is" ></span></c:if>
					<c:if test="${item.isHot == 0 }"><span class="not" ></span></c:if>
					
				</td>
                <td>
                	<c:if test="${item.showStatus == 1 }"><span class="not" ></span></c:if>
					<c:if test="${item.showStatus == 0 }"><span class="is" ></span></c:if>
					
                </td>
                <td>
                	<c:if test="${item.auditStatus == 0 }">待审核</c:if>
                	<c:if test="${item.auditStatus == 1 }">通过</c:if>
                	<c:if test="${item.auditStatus == 2 }">不通过</c:if>
					
                </td>
               
				<td>
							<a href="/ecps-console/shop/item/viewItem.jsp" title="查看">查看</a>
					  	
					  		<c:if test="${item.auditStatus == 0 }">
					  			<a href="javascript:void(0);" onclick="isPass(${item.itemId}, 1)">通过</a>
					  			<a href="javascript:void(0);" onclick="isPass(${item.itemId}, 2)">不通过</a>
					  		</c:if>
					  		<c:if test="${item.auditStatus == 1 }">
					  			<a href="javascript:void(0);" onclick="">修改</a>
					  			<a href="javascript:void(0);" onclick="">删除</a>
					  		</c:if>
					  		<c:if test="${item.auditStatus == 2 }">
					  			<a href="javascript:void(0);" onclick="">修改</a>
					  			<a href="javascript:void(0);" onclick="">删除</a>
					  		</c:if>
					  		
					  			
					  		
					  		
					  			
					  			
				</td>
			</tr>
			</c:forEach>
		
		
			

		
			
			
	</table>
    
	<div class="page_c">
	<span class="l inb_a"> </span> <span class="r page"> 
					<input type="hidden" value="${page.pageNo}" id="pageNo" name="pageNo" />
					<input type="hidden" value="${page.pageCount}" id="pageCount" name="pageCount" />
						共<var id="pagePiece" class="orange">${page.count}</var>条<var id="pageTotal">${page.pageNo}/${page.pageCount}</var>
						<a href="javascript:void(0);" id="previous">首页</a> 
						<a href="javascript:void(0);" id="before">上一页</a>
						<input type="text" size="2" id="jumpVal">
						<a href="javascript:void(0);" id="jump">跳转到</a>
						<a href="javascript:void(0);" id="next">下一页</a>
						<a href="javascript:void(0);" id="last">尾页</a>
					</span>
    </div>
</form>
</div></div>
 </body>