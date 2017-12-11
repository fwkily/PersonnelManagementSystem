<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>管理导航区域</title>
</head>
<script  type="text/javascript">
var preClassName = "man_nav_1";
function list_sub_nav(Id,sortname){
   if(preClassName != ""){
      getObject(preClassName).className="bg_image";
   }
   if(getObject(Id).className == "bg_image"){
      getObject(Id).className="bg_image_onclick";
      preClassName = Id;
	  showInnerText(Id);
	  window.top.frames['leftFrame'].outlookbar.getbytitle(sortname);
	  window.top.frames['leftFrame'].outlookbar.getdefaultnav(sortname);
   }
}

function showInnerText(Id){
    var switchId = parseInt(Id.substring(8));
	var showText = "对不起没有信息！";
	switch(switchId){
	    case 1:
		   showText =  "维护人事系统的部门及岗位情况！";
		   break;
	    case 2:
		   showText =  "员工入职，试用期及离职管理";
		   break;
	    case 3:
		   showText =  "在职人员岗位调动管理";
		   break;		   
	    case 4:
		   showText =  "系统使用成员的管理";
		   break;	
		   case 5:
		   showText =  "报表下载";
		   break;			 
	    case 6:
		   showText =  "安全退出系统";
		   break;
            case 7:		   	
		  showText =  "xxxxxx退出系统";
		   break;
	}
	getObject('show_text').innerHTML = showText;
}
 //获取对象属性兼容方法
 function getObject(objectId) {
    if(document.getElementById && document.getElementById(objectId)) {
	// W3C DOM
	return document.getElementById(objectId);
    } else if (document.all && document.all(objectId)) {
	// MSIE 4 DOM
	return document.all(objectId);
    } else if (document.layers && document.layers[objectId]) {
	// NN 4 DOM.. note: this won't find nested layers
	return document.layers[objectId];
    } else {
	return false;
    }
}
</script>
<body>
<div id="nav">
    <ul><li id="man_nav_1" onclick="list_sub_nav(id,'组织管理')"  class="bg_image_onclick">组织管理</li>
	<li id="man_nav_2" onclick="list_sub_nav(id,'人员管理')"  class="bg_image">人员管理</li>
	<li id="man_nav_3" onclick="list_sub_nav(id,'调动管理')"  class="bg_image">调动管理</li>
	<li id="man_nav_4"  onclick="list_sub_nav(id,'信息管理')"  class="bg_image">信息管理</li>
        <li id="man_nav_5"  onclick="list_sub_nav(id,'报表管理')"  class="bg_image">报表管理</li>
        <li id="man_nav_6" onclick="list_sub_nav(id,'系统管理')"  class="bg_image">系统管理</li>
    </ul>
</div>
<div id="sub_info">&nbsp;&nbsp;<img src="${pageContext.request.contextPath}/images/hi.gif" />&nbsp;<span id="show_text">欢迎splendid人事管理系统!</span></div>
</body>
</html>
