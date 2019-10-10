<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
application.setAttribute("sid",10);
application.setAttribute("sname","陈雪");
application.setAttribute("age",10);
application.setAttribute("home","四川");

%>
<table>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>age</td>
            <td>home</td>
        </tr>
	<tr>
        <td>${applicationScope.sid}</td>
        <td>${applicationScope.sname}</td>
        <td>${applicationScope.age}</td>
        <td>${applicationScope.home}</td>
    </tr>
</table>
</body>
</html>