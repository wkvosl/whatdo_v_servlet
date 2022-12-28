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



<div id="signup container">

	<h3> sign up</h3>
	
	${msg }
	
	<form action="/signUp" method="post" name="signUpForm">
	
	<h4>아이디</h4> <input type="text" id="user_id" name = "user_id" value=""> 
	<button>중복확인</button> ${id }
	<h4>비밀번호</h4> <input type="password" id="pw_input" name = "user_pw" > 
	<h4>비밀번호 확인</h4> <input type="password" id="pw_check_input" name = "user_pw_check" onblur="pwOnceCkeck(); "> 
		<p id="signup_innerHTML"></p>
	<h4>email</h4> <input type="email" name = "user_email" value="" 
					pattern="[a-zA-Z0-9_-]+[@][a-zA-Z0-9]+[.]+[a-zA-Z]+[.]*[a-zA-Z]*"> 
					<button>중복확인</button> ${email } 
	<br>
	<input type="submit" value="회원가입하기" onclick="signUp_check();">

	</form>

</div>


<script type="text/javascript">
	function pwOnceCkeck() {
		const pw = document.getElementById("pw_input");
		const pw_check = document.getElementById("pw_check_input");
		const signup_innerHTML = document.getElementById("signup_innerHTML");
		
		if(pw.value == pw_check.value){
			signup_innerHTML.innerHTML = "패스워드가 일치합니다.";
		}else{
			signup_innerHTML.innerHTML = "패스워드가 일치하지 않습니다. 다시 확인해 주세요.";
		}
	}
		//signUpForm의 제출 새로고침 기능 중지 -> 
		//중복화인 버튼을 눌러도 새로고침이 되지 않아 중복인지 아닌지 확인이 안됨.
		//->새창 열어보자.
	/* 	signUpForm.addEventListener('submit', function(e) {
			e.preventDefault();	
			console.log('제출');
		}) */
	function signUp_check() {
		
		
		if(document.signUpForm.user_id.value.length == 0){
			alert('아이디를 입력하세요');
			signUpForm.user_id.focus();
			const user_id = document.getElementById(user_id);
			user_id.value = user_id;			
			return false;
		}
		if(document.signUpForm.user_pw.value.length == 0){
			alert('비밀번호를 입력하세요');
			signUpForm.user_id.focus();
			return false;
		}
		if(document.signUpForm.user_pw_check.value.length == 0){
			alert('비밀번호를 확인하세요');
			signUpForm.user_id.focus();
			return false;
		}
		if(document.signUpForm.user_email.value.length == 0){
			alert('이메일을 입력하세요');
			signUpForm.user_id.focus();
			return false;
		}
		
		confirm('가입ㄱㄱ?');
		return true;
	}
</script>



</body>
</html>



