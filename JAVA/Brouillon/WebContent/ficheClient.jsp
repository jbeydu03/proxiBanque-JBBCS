<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Fiche Client :</h3>
	<p>idClient : ${Client.idClient}</p>
	<p>Nom : ${Client.nom}</p>
	<p>Prénom : ${Client.prenom}</p>
	<p>Adresse : ${Client.adresse}</p>
	<p>Ville : ${Client.ville}</p>
	<p>Code Postal : ${Client.codePostal}</p>
	<p>Téléphone : ${Client.telephone}</p>
</body>
</html>