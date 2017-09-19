<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>Adopte un Job - Log in</title>
</head>
<body>
	<h1>Log in</h1>
	<form method="POST" action="login">
		<div class="text">
			<label for="username">Username</label>
			<input type="text" name="username" id="username" />
		</div>
		<div class="text">
			<label for="password">Password</label>
			<input type="password" name="password" id="password" />
		</div>
		<div class="actions"></div>
			<input type="submit" value="log in" />
			<a href="signin" title="Sign in">Sign in</a>
		</div>
		<div>
			<input type="checkbox" name="remember" id="rememberme" /> <label for="rememberme">Remember me</label>
		</div>
	</form>
</body>
</html>