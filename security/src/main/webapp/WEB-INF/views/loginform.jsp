<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.min.js" ></script>
<script>
$(document).ready(function(){

});
</script>

</head>
<body>

<h1>로그인 페이지</h1>
<hr/>
<!-- 시큐리티는 x-www-form-url-encoded 타입만 인식 -->
<form action="/loginProc" method="post">
	<input type="text" name="username" />
	<input type="password" name="password" />
	<button>로그인</button>
</form>

<br />

	<h1>Social Login</h1>
	<br />
	<!-- javascript:; 는 클릭해도 반응을 없게 하는 키워드 -->
	<a href="/oauth2/authorization/google" > 
	<img src="https://pngimage.net/wp-content/uploads/2018/06/google-login-button-png-1.png"
		alt="google" width="357px" height="117px">
	</a>
	<br />
	<a href="/oauth2/authorization/facebook"> 
	<img src="https://pngimage.net/wp-content/uploads/2018/06/login-with-facebook-button-png-transparent-1.png"
		alt="facebook" width="357px" height="117px">
	</a>
	<br />
	
	<a href="/oauth2/authorization/naver"> 
	<img src="https://blogfiles.pstatic.net/MjAyMDA4MDRfMzMg/MDAxNTk2NTEyOTY4MDMx.vhXHCulffijGUnvlaBR2jW4__Lkz8R3ZTaEDcTeNV2gg.Wt_HNl_zktUJUMrYGkVmqJ-PhxKv_s4A7gG1uPKMZaQg.PNG.getinthere/naver_button.png"
		alt="naver" width="357px" height="50px">
	</a>
	<br />




</body>
</html>