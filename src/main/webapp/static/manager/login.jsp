<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page language="java" pageEncoding="UTF-8" contentType="text/html; utf-8" %>
<!DOCTYPE html>
<html>
<head>
<title>香韵茶语后台登录</title>
<!-- Custom Theme files -->
<link href="/xycy/static/manager/css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="后台登录" />
<!--Google Fonts-->
<!--<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
--><!--Google Fonts-->
</head>
<body>
<!--header start here-->
<div class="login-form">
			<div class="top-login">
				<span><img src="/xycy/static/manager/images/xycylogo.jpg" alt=""/></span>
			</div>
			<h1>登录</h1>
			<div class="login-top">
			<form action="/zgjy_lih/mgr/login" method="post">
				<div class="login-ic">
					<i ></i>
					<input type="text"  placeholder="请输入用户名" name="name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.placeholder = '请输入用户名';}"/>
					<div class="clear"> </div>
				</div>
				<div class="login-ic">
					<i class="icon"></i>
					<input type="password"  placeholder="请输入密码" name="password" onFocus="this.value = '';" onBlur="if (this.value == '') {this.placeholder = '请输入密码';}"/>
					<div class="clear"> </div>
				</div>
			
				<div class="log-bwn">
					<input type="submit"  value="Login" >
				</div>
				</form>
			</div>
			<p class="copy">© 2018 香韵茶语V1.0</p>
</div>		
<!--header start here-->
</body>
</html>