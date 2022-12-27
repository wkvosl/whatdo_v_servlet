<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>

<form action="/" method="post">
	아이디<input name="user_id">
	비밀번호<input type="password" name="user_pw">
	<input type="submit" value="로그인">
</form>

<a href="/signUp">회원가입</a>

</body>
</html>