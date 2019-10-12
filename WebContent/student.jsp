
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.chenxue.bean.Student"%>
<%
String path = request.getContextPath();String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<base href="<%=basePath%>">
	<title>??</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
</head>
<%
	Student stu = new Student(22,"chenxue");
	request.setAttribute("stuKey", stu);
	pageContext.setAttribute("num1",100);
	pageContext.setAttribute("num2",200);
	session.setAttribute("age", 16);
	%>
<body>
	
	${requestScope.stuKey.sid}<br/>
	${requestScope.stuKey.snameString}<br/>
	${stuKey.sid}<br/>
	${stuKey.snameString}<br/>
	${num1+num2}<br/>
	${sessionScope.age >= 18? "成年人":"未成年人" }<br/>
	${sessionScope.age ge 18? "成年人":"未成年人" }
</body>
</html>