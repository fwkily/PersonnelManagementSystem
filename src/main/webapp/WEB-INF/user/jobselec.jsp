<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page isELIgnored="false"%>
<%--         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>组织管理</title>
<SCRIPT language=JavaScript>
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
     location.href="adddept.html";
}
function link2(){
      if (document.fom.delid.onchick==true){
	  alert("您的选择没有可执行的操作！");
	  }else {
	   location.href="multimod.html";
	  }
}

</SCRIPT>

<style type="text/css">
<!--
.STYLE2 {color: #0000FF}
-->
</style>
</head>

<body>
<div id="man_zone">
  <form name="fom" id="fom" method="post" action="${pageContext.request.contextPath}">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" >
      <tr>
        <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="62" background="${pageContext.request.contextPath}/images/nav04.gif"><table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td width="21"><img  src="${pageContext.request.contextPath}/images/ico07.gif"/></td>
                <td width="538">查看岗位信息</td>
                <td width="144" align="left"></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="20"><span class="newfont07">批处理：<a href="#" class="right-font08 STYLE2" onclick="selectAll();">全选</a>-<a href="#" class="right-font08 STYLE2" onclick="unselectAll();">反选 </a><a href="multidel.html" class="right-font08 STYLE2"> 删除</a></span> </td>
                <td align="right"></td>
              </tr>
              <tr>
                <td height="40" colspan="2" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" class="newfont03">
                  <tr class="CTitle" >
                    <td height="22" colspan="10" align="center" style="font-size:16px">岗 位 详 细 列 表</td>
                  </tr>
                  <tr bgcolor="#EEEEEE">
                    <td width="4%" align="center"><div align="center">选择</div></td>
                    <td width="5%" align="center" height="30"><div align="center">序号</div></td>
                    <td width="11%"><div align="center">岗位编号</div></td>
                    <td width="11%"><div align="center">岗位名称</div></td>
                    <td width="7%"><div align="center">类型</div></td>
                    <td width="11%"><div align="center">所属部门</div></td>
                    <td width="14%"><div align="center">部门编号</div></td>
                    <td width="8%"><div align="center">岗位编制</div></td>
                    <td width="8%"><div align="center">编制限定</div></td>
                    <td width="25%"><div align="center">操作</div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 1 </div></td>
                    <td ><div align="center">1</div></td>
                    <td ><div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>行政总监</div></td>
                    <td><div align="center">管理</div></td>
                    <td><div align="center">行政部</div></td>
                    <td><div align="center">1</div></td>
                    <td><div align="center">3</div></td>
                    <td><div align="center">是</div></td>
                    <td><div align="center"><a href="jobmod.html">编辑 </a>| <a href="deljob.html">删除</a> | <a href="jobemplist.html">查询岗位下员工</a></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 2</div></td>
                    <td ><div align="center">2</div></td>
                    <td ><div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>行政主管</div></td>
                    <td><div align="center">管理</div>
                              <div align="center"></div></td>
                    <td><div align="center">技术部</div></td>
                    <td><div align="center">2</div></td>
                    <td><div align="center">10</div></td>
                    <td><div align="center">是</div></td>
                    <td><div align="center"><a href="editrenwu.htm">编辑 | </a><a href="listrenwumingxi.htm">删除 | 查询岗位下员工</a></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 3</div></td>
                    <td ><div align="center">1</div></td>
                    <td ><div align="center">行政主管</div></td>
                    <td><div align="center">管理</div></td>
                    <td><div align="center">技术部</div></td>
                    <td><div align="center">2</div></td>
                    <td><div align="center">50</div></td>
                    <td><div align="center">是</div></td>
                    <td><div align="center"><a href="editrenwu.htm">编辑 | </a><a href="listrenwumingxi.htm">删除 | 查询岗位下员工</a></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 4</div></td>
                    <td ><div align="center">9</div></td>
                    <td ><div align="center">技术研发</div></td>
                    <td><div align="center">技术</div></td>
                    <td><div align="center">技术部</div></td>
                    <td><div align="center">2</div></td>
                    <td><div align="center">40</div></td>
                    <td><div align="center">否</div></td>
                    <td><div align="center"><a href="editrenwu.htm">编辑 | </a><a href="listrenwumingxi.htm">删除 | 查询岗位下员工</a></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 5</div></td>
                    <td ><div align="center">2</div></td>
                    <td ><div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>销售总监</div></td>
                    <td><div align="center">销售</div></td>
                    <td><div align="center">销售部</div></td>
                    <td><div align="center">3</div></td>
                    <td><div align="center">30</div></td>
                    <td><div align="center">否</div></td>
                    <td><div align="center"><a href="editrenwu.htm">编辑 | </a><a href="listrenwumingxi.htm">删除 | 查询岗位下员工</a></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 6 </div></td>
                    <td ><div align="center">3</div></td>
                    <td ><div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>销售人员</div></td>
                    <td><div align="center">销售</div></td>
                    <td><div align="center">销售部</div></td>
                    <td><div align="center">3</div></td>
                    <td><div align="center">30</div></td>
                    <td><div align="center">否</div></td>
                    <td><div align="center"><a href="editrenwu.htm">编辑 | </a><a href="listrenwumingxi.htm">删除 | 查询岗位下员工</a></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 7 </div></td>
                    <td ><div align="center">4</div></td>
                    <td ><div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>售后支持</div></td>
                    <td><div align="center">销售</div></td>
                    <td><div align="center">销售部</div></td>
                    <td><div align="center">3</div></td>
                    <td><div align="center">30</div></td>
                    <td><div align="center">否</div></td>
                    <td><div align="center"><a href="editrenwu.htm">编辑 | </a><a href="listrenwumingxi.htm">删除 | 查询岗位下员工</a></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 8 </div></td>
                    <td ><div align="center">5</div></td>
                    <td ><div align="center">销售客服</div></td>
                    <td><div align="center">销售</div></td>
                    <td><div align="center">销售部</div></td>
                    <td><div align="center">3</div></td>
                    <td><div align="center">30</div></td>
                    <td><div align="center">否</div></td>
                    <td><div align="center"><a href="editrenwu.htm"></a><a href="listrenwumingxi.htm"></a><a href="editrenwu.htm">编辑 | </a><a href="listrenwumingxi.htm">删除 | 查询岗位下员工</a></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 9 </div></td>
                    <td ><div align="center">1</div></td>
                    <td ><div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>生产经理</div></td>
                    <td><div align="center">管理</div></td>
                    <td><div align="center">生产部</div></td>
                    <td><div align="center">4</div></td>
                    <td><div align="center">30</div></td>
                    <td><div align="center">否</div></td>
                    <td><div align="center"><a href="editrenwu.htm">编辑 | </a><a href="listrenwumingxi.htm">删除 | 查询岗位下员工</a></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="center">
                        <input type="checkbox" name="delid"/>
                    </div></td>
                    <td height="20"><div align="center"> 10 </div></td>
                    <td ><div align="center">2</div></td>
                    <td ><div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>质检员</div></td>
                    <td><div align="center"> 技术 </div></td>
                    <td><div align="center">技术部</div></td>
                    <td><div align="center">2</div></td>
                    <td><div align="center">5</div></td>
                    <td><div align="center">是</div></td>
                    <td><div align="center"><a href="editrenwu.htm">编辑 | </a><a href="listrenwumingxi.htm">删除 | 查询岗位下员工</a></div></td>
                  </tr>
                </table></td>
              </tr>
            </table>
                  <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
                    <tr>
                      <td height="6"><img src="${pageContext.request.contextPath}/images/spacer.gif" width="1" height="1" /></td>
                    </tr>
                    <tr>
                      <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
                          <tr>
                            <td width="50%">共 <span class="right-text09">5</span> 页 | 第 <span class="right-text09">1</span> 页</td>
                            <td width="49%" align="right">[<a href="#" class="right-font08">首页</a> | <a href="#" class="right-font08">上一页</a> | <a href="#" class="right-font08">下一页</a> | <a href="#" class="right-font08">末页</a>] 转至：</td>
                            <td width="1%"><table width="20" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                  <td width="1%"><input name="textfield3" type="text" class="right-textfield03" size="3" /></td>
                                  <td width="87%"><input name="Submit23222" type="submit" class="right-button06" value="GO" />
                                  </td>
                                </tr>
                            </table></td>
                          </tr>
                      </table></td>
                    </tr>
                </table></td>
          </tr>
        </table></td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>
