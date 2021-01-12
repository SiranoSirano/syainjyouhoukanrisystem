<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 最初のユーザー登録画面を出力するビュー --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員登録</title>
</head>
<body>
<form action ="/社員情報管理システム/RegisterUser" method ="post">
<h1>登録内容を入力してください</h1>
メールアドレス:<input type = "text" name="mail"><br>
パスワード:<input type="password" name="pass"><br>
<input type ="submit" value="確認">
</form>
</body>
</html>