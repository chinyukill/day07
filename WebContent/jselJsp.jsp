<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
<body>
	<c:set scope="request" var="age" value="18"></c:set>
	${requestScope.age+1}
	<c:if test="${requestScope.age>=18}">
		<div>成年人</div>
	</c:if>
	<c:if test="${requestScope.age<18}">
		<div>未成年</div>
	</c:if>
	<c:choose>
		<c:when test="${requestScope.age>=18 }">
			<div>成年人</div>
		</c:when>
		<c:when test="${requestScope.age>18 }">
			<div>未成年人</div>
		</c:when>
	</c:choose>
	<select>
		<%
			for(int i=0;i<5;i++){
		%>
		<option><%=i %></option>
		<%
			}
		%>
	</select>
	<select>
		<c:forEach var="i" begin="1" end="5" step="2">
			<option>${i}</option>
		</c:forEach>
	</select>
</body>
</html>