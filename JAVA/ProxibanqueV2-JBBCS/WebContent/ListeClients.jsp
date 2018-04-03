<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des clients</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Nom</th>
			<th>Code Postal</th>
			<th>Téléphone</th>
			<th>Afficher</th>
			<th>Modifier</th>
			<th>Supprimer</th>
		</tr>
		<c:forEach items="${listeclients}" var="client">
			<tr>
				<td><c:out value="${client.idClient}" /></td>
				<td><c:out value="${client.nom}" /></td>
				<td><c:out value="${client.codePostal}" /></td>
				<td><c:out value="${client.telephone}" /></td>
				<td><a href="AffichageClient?idclient=${client.idClient}">a</a></td>
				<td><a
					href="LienModificationClient?idclient=${client.idClient}">m</a></td>
				<td><a href="LienSuppressionClient?idclient=${client.idClient}">x</a></td>
			</tr>

		</c:forEach>
	</table>
	<a href="Accueil.jsp">Retour à l'accueil</a>
</body>
</html>