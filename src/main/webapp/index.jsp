<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery.min.js"></script>
  </head>

    <body>
       <form action="" method="post" id="myform">
           请输入电话： <input type="text" name="mobileNumber" id="num"><br>
            <input id="searchBtn" onclick="sech()" type="button" value="查询"><br>
           归属地： <input type="text" name="mobileArea" id="mobileArea" value="${mobile.mobileArea }"><br>
           类型： <input type="text" name="mobileType" id="mobileType" value="${mobile.mobileType }"><br>
       </form>
   
   <script type="text/javascript">
       function sech(){
            var mobileNumber=$("#num").val();
            $.ajax({
                 type:'post',
                 url:${pageContext.request.contextPath}/getByNum,
                 data:mobileNumber,
                 success:function(data){
                    if(data==null){
                      alert('号码在号段库暂时不存在');
                    }
                 }
                 
            });
            
       
       }
   </script>
  </body>
</html>
