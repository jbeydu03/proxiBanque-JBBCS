<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Accueil</title>
<!-- Bootstrap -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<header> <img class="image" src="Logo.png" width=200px />

	<h1>PROXIBANQUE</h1>
	</header>
	<div class="milieu">
		<nav>
		<center>
			<h2>Menu</h2>
		</center>
		<p />
		<h3>Gestion client</h3>
		<ul>
			<li><a href="formulaireCreationClient.jsp">Créer un client</a></li>
			<li>Modifier un client</li>
			<li>Supprimer un client</li>
			<li>Chercher un client</li>
		</ul>
		<p />
		<h3>Opérations bancaires</h3>
		<ul>
			<li>Effectuer un virement</li>
			<li>Simuler un crédit</li>
			<li>Auditer une agence</li>
		</ul>
		<p />
		<div class="espace"></div>
		<center>
			<form action="DeconnexionConseiller" method="get">
				<input type="submit" value="Déconnexion" />
			</form>
		</center>
		</nav>
		<content>
		<div>
			<h2>Bonjour ${conseiller.login} !!</h2>
		</div>
		<div>Nous sommes le</div>

		<div>Vous avez X clients :</div>

		Liste clients </content>
	</div>
	<footer>&copy Copyright 2018</footer>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>