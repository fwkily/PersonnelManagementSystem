<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>管理区域</title>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script language="javascript">
function yanzheng(){
var xm=document.form1.name.value;
if(xm==''){
alert("请输入用户名");
return false;
}
//-----
var mima=document.form1.pass.value;
var mima1=document.form1.pass1.value;
if(mima==''){
alert("请输入密码");
return false;
}
if(mima1==''){
alert("请确认密码");
return false;
}
if(mima!=mima1){
alert("两次密码输入不一致");
return false;
}

}
</script>
<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
-->
</style>
</head>

<body>
<div id="man_zone">
  <form action="${pageContext.request.contextPath}/user/addAdmin"  onsubmit="return yanzheng();" method="post" name="form1" id="form1" >
    <div class="MainDiv">
      <table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">添加管理员页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
              <tr class="CTitle" >
                <td height="22" colspan="8" align="center" style="font-size:16px">添加管理员</td>
              </tr>
              <tr bgcolor="#EEEEEE">
                <td height="30" align="center"><div align="center">管理员姓名<span class="STYLE1">*</span></div></td>
                <td width="160"><div align="center">登录密码<span class="STYLE1">*</span></div></td>
                <td width="123"><div align="center">确认密码<span class="STYLE1">*</span></div></td>
                <td width="219"><div align="center">操作</div></td>
              </tr>
              <tr bgcolor="#FFFFFF">
                <td height="40" align="center"><div align="center">
                    <label>
                    <input name="name" type="text" size="12" />
                    </label>
                </div></td>
                <td><div align="center">
                  <label>
                  <input name="pass" type="text" value="" size="10" />
                  </label>
                </div>             </td>
                <td><div align="center">
                    <label>
                    <input name="pass1" type="text" value="" size="10" />
                    </label>
                </div></td>
                <td><div align="center"><a href="#"></a>
                    <label>
                  <input type="submit" name="Submit" value="添加" />
                  </label>
                    <label>
                    <input type="reset" name="Submit2" value="重置" />
                    </label>
                    <label></label>
                </div></td>
              </tr>
          </table></td>
        </tr>
      </table>
    </div>
  </form>
</div>
</body>
</html>
