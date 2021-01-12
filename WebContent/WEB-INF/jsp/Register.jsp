<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員情報登録画面</title>
</head>
<body>
<form action="/社員情報管理システム/RegisterServlet" method="post">
名前:<input type ="text" name ="name"><br>
ふりがな:<input type ="text" name ="call"><br>
性別:
男:<input type ="radio" name="gender" value="0">
女:<input type ="radio" name="gender" value="1">
<input type ="submit" value="登録">
</form>>
</body>
</html>