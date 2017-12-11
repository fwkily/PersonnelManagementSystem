<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>显示/隐藏左侧导航栏</title>
</head>
<script language="JavaScript">
function Submit_onclick(){
	if(parent.myFrame.cols == "199,7,*") {
		parent.myFrame.cols="0,7,*";
		document.getElementById("ImgArrow").src="${pageContext.request.contextPath}/images/switch_right.gif";
		document.getElementById("ImgArrow").alt="打开左侧导航栏";
	} else {
		parent.myFrame.cols="199,7,*";
		document.getElementById("ImgArrow").src="${pageContext.request.contextPath}/images/switch_left.gif";
		document.getElementById("ImgArrow").alt="隐藏左侧导航栏";
	}
}

function MyLoad() {
	if(window.parent.location.href.indexOf("MainUrl")>0) {
		window.top.midFrame.document.getElementById("ImgArrow").src="${pageContext.request.contextPath}/images/switch_right.gif";
	}
}
</script>
<body onload="MyLoad()">
<div id="switchpic"><a href="javascript:Submit_onclick()"><img src="${pageContext.request.contextPath}/images/switch_left.gif" alt="隐藏左侧导航栏" id="ImgArrow" /></a></div>
</body>
</html>
