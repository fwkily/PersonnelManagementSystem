<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录界面</title>
<script language="javascript">
function yanzheng(){
var xm=document.form1.name.value;
if(xm==''){                                                                                                                            
alert("请填写用户名");
return false;  }
if(document.form1.pass.value==''){                                                                                                                            
alert("请填写密码");
return false;  }  
return true;
}
</script>
<style type="text/css">
<!--
*{overflow:hidden; font-size:9pt;}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(images/bg.gif);
	background-repeat: repeat-x;
}
-->
</style>
</head>

<body>
  <DIV id="Layer1" style="position:absolute; left:782px;  
   top:335px; width:446px; height:173px; z-index:1; " >
  
  
<!-- <object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="446" height="168">
    <param name="movie" value="images/63.swf">
    <param name="quality" value="high">
		<param name="wmode" value="transparent"> 
    <embed src="images/63.swf" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="746" height="168"></embed>
  </object> -->
   

</DIV>
    
  
  <table width="100%"  height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="561" style="background:url(images/lbg.gif)"><table width="940" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td height="238" style="background:url(images/login01.jpg)">&nbsp;</td>
          </tr>
          <tr>
            <td height="190"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="208" height="190" style="background:url(images/login02.jpg)">&nbsp;</td>
                <td width="518" style="background:url(images/login03.jpg)">
                
                
				<form name="form1" method="post" onSubmit=" return yanzheng();"  action="${pageContext.request.contextPath}/user/login" >
                  <table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
                    <tr>
                      <td width="40" height="50"><img src="images/user.gif" alt="a" width="30" height="30"></td>
                      <td width="38" height="50">用户</td>
                      <td width="242" height="50">
					  <input type="text" name="name" id="textfield" style="width:164px; height:32px; line-height:34px; background:url(images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; font-family:Verdana, Geneva, sans-serif;">
					  </td>
                    </tr>
                    <tr>
                      <td height="50"><img src="images/password.gif" alt="a" width="28" height="32"></td>
                      <td height="50">密码</td>
                      <td height="50">
					  <input type="password" name="pass" id="textfield2" style="width:164px; height:32px; line-height:34px; background:url(images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; ">
					  </td>
                    </tr>
                    <tr>
                      <td height="40">&nbsp;</td>
                      <td height="40">&nbsp;</td>
                      <td height="60"><label>
                        <input type="submit" name="Submit"  style=" border:0px; width:95px; height:40px; line-height:40px; background:url(images/login.gif) repeat-x;  font-size:9pt; " value="登录系统">
                        </label>
                      </td>
                    </tr>
                  </table>
                 </form>
                </td>
                <td width="214" style="background:url(images/login04.jpg)" >&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="133" style="background:url(images/login05.jpg)">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
