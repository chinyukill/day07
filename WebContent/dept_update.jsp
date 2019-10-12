<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.chenxue.bean.Dept"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
+ request.getContextPath() + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Dept deptItem=(Dept)request.getAttribute("deptItem");%>
<form action="dept/update.do">
	<table border="2">
		<tr>
			<td>部门编号</td>
			<td><input type="text" name="deptNo" value="<%=deptItem.getDeptNo()%>" readOnly></td>
		</tr>
		<tr>
			<td>部门名称</td>
			<td><input type="text" name="dName" value="<%=deptItem.getdName()%>"></td>
		</tr>
		<tr>
			<td>部门位置</td>
			<td><input type="text" name="loc" value="<%=deptItem.getLoc()%>"></td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="更新" >
			</td>
			<td>
				<input type="reset">
			</td>
		</tr>
	</table>
	<br>
	<br>
	<table border="2">
		<tr>
			<td>部门编号</td>
			<td><input type="text" name="deptNo" value="${deptItem.deptNo}" readOnly></td>
		</tr>
		<tr>
			<td>部门名称</td>
			<td><input type="text" name="dName" value="${deptItem.dName}"></td>
		</tr>
		<tr>
			<td>部门位置</td>
			<td><input type="text" name="loc" value="${deptItem.loc}"></td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="更新" >
			</td>
			<td>
				<input type="reset">
			</td>
		</tr>
	</table>
</form>
</body>
</html>