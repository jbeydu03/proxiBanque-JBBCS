<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

<img src="Logo.png"/>

	<form action="ConnexionConseiller" method="post">

		<fieldset>
			<legend>Connexion</legend>
			<input type="text" name="login" placeholder="Login"><br /> <input
				type="password" name="pwd" placeholder="Password"><br /> <input
				type="submit" value="Connexion"> <input type="reset"
				value="Effacer">
		</fieldset>
	</form>
</body>
</html>