<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*,com.chenxue.bean.Dept"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
+ request.getContextPath() + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<Dept> deptList=(ArrayList)request.getAttribute("dept");%>
<table border="2">
	<tr>
		<td>部门编号</td>
		<td>部门名称</td>
		<td>部门位置</td>
		<td>操作</td>
	</tr>
	<!-- 数据行 -->
	<%for(Dept deptItem:deptList){ %>
		<tr>
			<td><%=deptItem.getDeptNo() %></td>
			<td><%=deptItem.getdName() %></td>
			<td><%=deptItem.getLoc() %></td>
			<td>
				<a href="dept/delete.do?deptno=<%=deptItem.getDeptNo()%>">删除</a>
				<a href="dept/findById.do?deptno=<%=deptItem.getDeptNo()%>">更新</a>
			</td>
		</tr>
	<%} %>
</table>
</body>
</html>