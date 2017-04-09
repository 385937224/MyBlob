<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyBlog首页</title>
</head>
<body>
	<center><h2>MyBlog首页</h2></center>
	
	<dl>
		<dt>博客功能</dt>
		<dd><a href="${pageContext.request.contextPath }/list.action">博主文章显示</a></dd>
		<dd><a href="${pageContext.request.contextPath }/viewAdd.action">添加文章</a></dd>
	</dl>
	
	<ol>
		<li><a href="/Begin/index.jsp">跳转另外一个项目页面</a>
	</ol>
</body>
</html>