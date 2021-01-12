<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.User" %>
<%
User registerUser = (User) session.getAttribute("registerUser");
%>
<%--ユーザー登録確認画面を出力するビュー --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員登録確認画面</title>
</head>
<body>
<p>下記の社員を登録します</p>
<p>
メールアドレス：<%= registerUser.getMail() %>
</p>
<a href ="/社員情報管理システム/RegisterUser">戻る</a>
<a href ="/社員情報管理システム/RegisterUser?action=done">登録</a>
</body>
</html>