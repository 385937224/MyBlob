<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章列表</title>
</head>
<body>
	<center><h1>文章列表页面</h1></center>
	<ul>
		<li>所以文章遍历</li>
		<li>分页</li>
	</ul>


	<table border="1" align="center">
		<tr>
			<th>文章编号</th>
			<th>标题</th>
			<th>内容</th>
			<th>个数</th>
		</tr>
		<c:forEach items="${allArticles}" var="arti" varStatus="varSta">
			<tr>
				<td>${arti.id}</td>
				<td>${arti.title}</td>
				<td>${arti.content}</td>
				<td>${varSta.count}</td>
				<td><a href="${pageContext.request.contextPath }/delete.action?id=${arti.id}" target="blank">删除</a></td>
				<td><a href="${pageContext.request.contextPath }/viewUpdate.action?id=${arti.id}" >编辑</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>