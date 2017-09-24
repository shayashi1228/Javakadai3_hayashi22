<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% int count = (int)session.getAttribute("registCount"); %>
<% int total = (int)session.getAttribute("total"); %>

<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h1><%=count %>登録しました。</h1>
	<p>登録された英単語は<%=total %>です。</p>
	<a href="http://localhost:8080/WebLesson/index.jsp">トップページに戻る</a>
</body>
</html>