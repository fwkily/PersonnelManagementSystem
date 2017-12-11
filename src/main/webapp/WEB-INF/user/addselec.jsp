<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> --%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>部门管理</title>
<SCRIPT language=JavaScript>

function link1(){
     alert("该部门下有员工，不能删除！");
}
function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
	}
}

function unselectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			if (obj[i].checked==true) obj[i].checked = false;
			else obj[i].checked = true;
		}
	}
}

</SCRIPT>

<style type="text/css">
<!--
.STYLE1 {color: #0000FF}
-->
</style>
</head>

<body>
<div id="man_zone">
<form name="fom" id="fom" method="post" action="${pageContext.request.contextPath}/skdept/querySkdepts">
<table width="100%" border="0" cellspacing="0" cellpadding="0" >
  
  <tr>
    <td height="30">      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="62" background="${pageContext.request.contextPath}/images/nav04.gif">
            
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		    <tr>
			  <td width="21"><img src="${pageContext.request.contextPath}/images/ico07.gif" width="20" height="18" /></td>
			  <td width="538">查看部门信息</td>
			  <td width="144" align="left"><a href="#" onclick="sousuo()"></a></td>	
		    </tr>
          </table></td>
        </tr>
    </table></td></tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
          	 <tr>
               <td height="20"><span class="newfont07">批处理：<a href="#" class="right-font08 STYLE1" onclick="selectAll();">全选</a>-<a href="#" class="right-font08 STYLE1 " onclick="unselectAll();">反选 </a><a href="multidel.html" class="STYLE1" > 删除</a></span></td>
          	   <td align="right"></td>
          	 </tr>
              <tr>
                <td height="40" colspan="2" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
				 <tr class="CTitle" >
                    	<td height="22" colspan="10" align="center" style="font-size:16px">部门详细列表</td>
                  </tr>
                  <tr bgcolor="#EEEEEE">
				    <td width="4%" align="center" height="30"><div align="center">选择</div></td>
                    <td width="8%"><div align="center">部门编号</div></td>
                    <td width="10%"><div align="center">部门名称</div></td>
				
                    <td width="11%"><div align="center">电话</div></td>
					<td width="9%"><div align="center">传真</div></td>
					<td width="9%"><div align="center">描述</div></td>
					
					<td width="13%"><div align="center">成立日期</div></td>
					<td width="19%"><div align="center">操作</div></td>
                  </tr>
                 
                 
                 
      <c:forEach var="skdept" items="${skdeptList}" varStatus="state" >
	      <tr 
	          <c:if test="${state.index%2!=0}">class="rows even"</c:if>
      	      <c:if test="${state.index%2==0}">class="rows"</c:if>
      	   >
      	   <td height="20"><div align="center">
				      <input type="checkbox" name="delid"/>
				      </div></td>
      	    <td class="list-wd">${skdept.id}</td>
	        <td><a href="国书" title="">${skdept.name}</a></td>
	        <td class="list-wd">${skdept.tele}</td>
	        <td class="list-wd">${skdept.fax}</td>
	        <td class="list-wd">${skdept.discrip}</td>
	        <td>
	        	<fmt:formatDate value="${skdept.createtime}" pattern="yyyy-MM-dd"/>
	        </td>
	        <td >	         
	            &nbsp;<a href="${pageContext.request.contextPath}/skdept/updateSkdept/${skdept.id}" title="修改">修改</a>&nbsp;|&nbsp;
	            <a href="${pageContext.request.contextPath}/skdept/deleteSkdept/${skdept.id}" title="删除" >删除</a>&nbsp;|&nbsp;
	            <a href="${pageContext.request.contextPath}/auction/deleteAuction/${auction.auctionid}" title="查询部门下员工" >查询部门下员工</a>
	        </td>
	      </tr>
	 </c:forEach>
                  
            </table></td>
        </tr>
      </table>
      
      <div class="page">
                            【当前第${pageInfo.pageNum}页,总共${pageInfo.pages}页】
        <a href="${pageContext.request.contextPath}/skdept/querySkdepts?pageNo=1">首页</a>
        <a href="${pageContext.request.contextPath}/skdept/querySkdepts?pageNo=${pageInfo.prePage}">上一页</a>
        <a href="${pageContext.request.contextPath}/skdept/querySkdepts?pageNo=${pageInfo.nextPage}">下一页</a>
        <a href="${pageContext.request.contextPath}/skdept/querySkdepts?pageNo=${pageInfo.pages}">尾页</a> 
        </div>
      <!--  
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="${pageContext.request.contextPath}/images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                <td width="49%">共 <span class="right-text09">5</span> 页 | 第 <span class="right-text09">1</span> 页</td>
                <td width="48%" align="right">[<a href="#" class="right-font08">首页</a> | <a href="#" class="right-font08">上一页</a> | <a href="#" class="right-font08">下一页</a> | <a href="#" class="right-font08">末页</a>] 转至：</td>
                <td width="5%"><table width="20" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="1%"><input name="textfield3" type="text" class="right-textfield03" size="3" /></td>
                      <td width="87%"><input name="Submit23222" type="button" class="button08" value="GO" />
                      </td>
                    </tr>
                </table></td>
              </tr>
          </table></td>
        </tr>
      </table>-->
      
      </td>
  </tr>
</table>
</td>
</tr>
</table>
</form>

</div>
</body>
</html>
