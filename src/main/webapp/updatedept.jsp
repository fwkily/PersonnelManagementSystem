<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>部门管理</title>
<script src="${pageContext.request.contextPath}/js/WebCalendar.js" type="text/javascript"></script>
<SCRIPT language=JavaScript>
function sousuo(){
	window.open("gaojisousuo.htm","","depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
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

function link(){
    document.getElementById("fom").action="addrenwu.htm";
   document.getElementById("fom").submit();
}
function link1(){
     location.href="adddept.jsp";
}
function link2(){
      if (document.fom.delid.onchick==true){
	  alert("您的选择没有可执行的操作！");
	  }else {
	   location.href="multimod.html";
	  }
}

</SCRIPT>
</head>

<body>
<div id="man_zone">
<form name="fom" id="fom" method="post" action="${pageContext.request.contextPath}/skdept/updateSkdeptSubmit">
<table width="100%" border="0" cellspacing="0" cellpadding="0" >
  
  <tr>
    <td height="30">      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="62" background="${pageContext.request.contextPath}/images/nav04.gif">
            
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		    <tr>
			  <td width="21">&nbsp;</td>
			  <td width="538"><strong>修改部门信息</strong></td>
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
                <td height="40" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
				 <tr class="CTitle" >
                    	<td height="22" colspan="9" align="center" style="font-size:16px"> 部 门 修 改</td>
                  </tr>
                  <tr bgcolor="#EEEEEE">
                    <td width="11%"><div align="center">部门名称*</div></td>
					
                    <td width="11%"><div align="center">电话</div></td>
					<td width="9%"><div align="center">传真</div></td>
					<td width="9%"><div align="center">描述</div></td>
					
					<td width="13%"><div align="center">成立日期</div></td>
					<td width="19%"><div align="center">操作</div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                       <input type="hidden" name="id" value="${skdept.id}"/>
                    <td ><div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>
                      <label>
                      <input name="name" type="text" value="${skdept.name }" size="10" />
                      </label>
                    </div></td>
					
                    <td><div align="center">
                      <label>
                      <input name="tele" type="text" value="${skdept.tele }" size="10" />
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="fax" type="text" value="${skdept.fax }" size="10" />
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="discrip" type="text" value="${skdept.discrip }" size="12" />
                      </label>
                    </div></td>
                    
                    <td><div align="center">
                      <label>
                      <input name="createtime" type="text" value="<fmt:formatDate value="${skdept.createtime}" pattern="yyyy-MM-dd" />"  size="16" readonly onclick="selectDate(this,'yyyy-MM-dd')"/>
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="Submit" type="submit" value="保存" /> 
                      </label>
                      <label>
                      <input name="reset" type="reset" value="取消" onclick="location='${pageContext.request.contextPath}/skdept/querySkdept'"/>
                      </label>
                    </div></td>
                  </tr>
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="../images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                <td width="49%">共 1 页 | 第 <span class="right-text09">1</span> 页</td>
                <td width="48%" align="right">&nbsp;</td>
                <td width="5%">&nbsp;</td>
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</td>
</tr>
</table>
</form>


 
 
</div>
</body>
</html>
