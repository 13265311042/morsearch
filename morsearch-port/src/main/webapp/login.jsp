<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="zn">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>后台管理系统</title>


<link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath }/css/styles.css">
<!--引入LOGO图标-->
<link rel="icon" href="/favicon.ico" type="image/x-icon" />
</head>
<body>
<div class="wrapper">
	<div class="container">
		<h1>后台管理系统</h1>
		<form method="post" id="loginform" name="loginform" class="form" action="${pageContext.servletContext.contextPath}/login.shtml">
			<input type="text" placeholder="账号" name="username" value="">
			<input type="password" placeholder="密码" name="password" value="">
			<button type="submit" id="login-button">登录</button>
			
		</form>
	</div>
	<!--背景动态效果-->
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul><!--./背景动态效果-->
	
</div>

<script type="text/javascript">
		if ("${msg}" != "") {
			alert("${msg}");
		};
		function checkUserForm() {
			document.loginform.submit();
		}
		
	</script>

</body>
</html>