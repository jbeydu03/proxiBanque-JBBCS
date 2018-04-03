<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accueil</title>
</head>
<body>
	<h1>Bonjour ${conseiller.nom}, ${conseiller.prenom},
		${conseiller.login}</h1>

	<form action="DeconnexionConseiller">
		<input type="submit" value="déconnexion">
	</form>

	<a href="CreationClient.jsp">Créer un nouveau client</a>
	<br />
	<a href="SelectAllClients">Gérer vos clients</a>




</body>
</html>