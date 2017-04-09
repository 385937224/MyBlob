<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加文章页面</title>
</head>
<body>
	<center><h2>编辑文章页面</h2></center>
	<ul>
		<li>修改文章</li>
	</ul>
	

	<form action="${pageContext.request.contextPath }/update.action" method="post">
		<input type="hidden" name="id" value="${article.id }">
		<input type="text" name="title" value="${article.title }"/><br>
		<textarea name="content" rows="9" cols="20" >${article.content }</textarea><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>