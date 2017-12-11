<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>管理区域</title>
<style type="text/css">
<!--
.STYLE3 {font-size: 10; }
-->
</style>
<script language="javascript" type="text/javascript">

function link1(){                                                                                                  
	location.href="ygxx.html"
	 
		}    

</script>
</head>

<body>
<div id="man_zone">
  <form action="tianjia.html" onsubmit="return link();" method="post" name="fom" id="fom" target="manFrame" >
    <div class="MainDiv">
      <table width="97%" border="0" cellpadding="0" cellspacing="0" class="CContent">
       <c:forEach var="skemp" items="${skempList}" varStatus="state" >
        <tr>
          <th class="tablestyle_title" ><div align="left">在职人员信息页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="95%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
            <tr class="CTitle" >
              <td height="22" colspan="11" align="center" style="font-size:16px"><p>在职人员信息表</p>                </td>
            </tr>
            
           
            <tr bgcolor="#EEEEEE">
              <td rowspan="5" align="center"><div align="center"><p>员工基本信息</p></div></td>
              <td width="84">员工编号</td>
              <td width="107"><label>${skemp.id}</label></td>
              <td width="84">姓名</td>
              <td width="87"><label>${skemp.name}</label></td>
              <td width="84">性别</td>
              <td width="89"><label>${skemp.sex}</label></td>
              <td width="84">出生日期*</td>
              <td width="88"><label><fmt:formatDate value="${skemp.bir}" pattern="yyyy-MM-dd"/></label></td>
              
              <td width="84">身份证号*</td>
              <td width="179"><label>${skemp.idcard}</label></td></tr>
             
              <tr bgcolor="#EEEEEE">
              <td>部门*</td>
              <td><label></label></td>
              <td>岗位*</td>
              <td><label></label></td>
              <td>民族*</td>
              <td><label>${skemp.national}</label></td>
              <td>入职日期*</td>
              <td><label></label></td>
              <td>参加工作日期*</td>
              <td><label></label></td></tr>
            
              <tr bgcolor="#EEEEEE">
              <td>用工形式*</td>
              <td><label></label></td>
              <td>人员来源*</td>
              <td><label></label></td>
              <td>政治面貌</td>
              <td><label>${skemp.zzmm}</label></td>
              <td>出生地</td>
              <td><label>${skemp.birthplace}</label></td>
              <td>籍贯</td>
              <td><label>${skemp.natives}</label></td></tr>
            
              <tr bgcolor="#EEEEEE">
              <td>联系电话</td><td>${skemp.tele}</td>
              <td>电子邮件</td><td>${skemp.mail}</td>
              <td>身高</td><td>${skemp.height}</td>
              <td>血型</td><td><label>${skemp.bloodtype}</label></td>
              <td>婚姻状况</td><td><label></label></td> </tr>
            
              <tr bgcolor="#EEEEEE">
              <td>户口所在地</td><td>${skemp.hkplace}</td>
              <td>最高学历</td><td><label>${skemp.xl}</label></td>
              <td>最高学位</td><td><label>${skemp.degree}</label></td>
              <td>毕业院校</td><td>${skemp.graduateschool}</td>
              <td>所学专业</td><td>${skemp.professional}</td></tr>
			  
             
             
              <tr bgcolor="#EEEEEE">
              <td width="55" rowspan="8" align="center">其他信息</td>
              <td colspan="10"><strong>职业生涯</strong></td></tr>
            
              <tr bgcolor="#EEEEEE">
              <td>起始年月*</td>
              <td>截至年月*</td>
              <td>所在单位</td>
              <td>工作内容</td>
              <td>担任职务</td>
              <td>月薪/年薪</td>
              <td>证明人</td>
              <td>证明人职务</td>
              <td>证明人电话</td>
              <td><p>备注</p>                </td></tr>
             
             <tr bgcolor="#EEEEEE">
              <td>2008-02-10</td>
              <td>2010-10-12</td>
              <td>化为网络科技</td>
              <td>ssh框架搭建</td>
              <td>java工程师</td>
              <td>6000</td>
              <td>王涛</td>
              <td>项目经理</td>
              <td>12345678911</td>
              <td colspan="3">负责oa项目</td></tr>
            
            <tr bgcolor="#EEEEEE">
              <td colspan="2"><strong>外国语种*</strong></td>
              <td colspan="3"><label>英语 </label></td>
              <td colspan="2">外国语种熟练程度</td>
              <td colspan="5"><label>一般，业务沟通仍受少量限制</label></td> </tr>
            
            <tr bgcolor="#EEEEEE">
              <td colspan="12"><strong>家庭成员及社会关系</strong></td></tr>
           
            <tr bgcolor="#EEEEEE">
              <td colspan="2">与本人关系*</td>
              <td colspan="2">姓名*</td>
              <td colspan="3">所在单位</td>
              <td>职位</td>
              <td colspan="4">联系电话</td></tr>
          
            <tr bgcolor="#EEEEEE">
              <td colspan="2"><label>父亲</label></td>
              <td colspan="2">李元芳</td>
              <td colspan="3">村委会</td>
              <td>村主任</td>
              <td colspan="4">111111111111</td>
              </tr>
            
          </table></td>
        </tr>
         </c:forEach>
      </table>
	  <br>
      
    </div>
  </form>
</div>
</body>
</html>
