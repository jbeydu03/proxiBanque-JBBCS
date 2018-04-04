<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Création Compte</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<br />
	<br />
	<fieldset>
		<legend>Fiche Client</legend>
		ID : ${client.idClient}<br />Nom : ${client.nom}<br /> Prénom :
		${client.prenom}<br /> Adresse : ${client.adresse}<br /> Code Postal
		: ${client.codePostal}<br /> Ville : ${client.ville}<br /> Téléphone
		: ${client.telephone}<br />
	</fieldset>
	<form action="CreationCompte" method="post">
		<fieldset>
			<legend>Création Compte</legend>
			<input type="hidden" name="idclient" value="${client.idClient}">
			<input type="checkbox" name="compteC" value="courant">Compte
			courant<br />Quel montant voulez-vous mettre sur le compte ? <input
				type="text" name="soldecourant"> €<br />Découvert autorisé
			: <input type="text" name="decouvert" value="1000"> €
			<div class="cartevisa">
				Voulez-vous ajouter une carte bleue ?<br /> <input type="radio"
					name="cartevisa" value="electron">Carte Visa Electron<br />
				<input type="radio" name="cartevisa" value="premier">Carte
				Visa Premier<br />
			</div>
			<input type="radio" name="cartevisa" value="aucune">Non<br />
			<input type="checkbox" name="compteE" value="epargne">Compte
			épargne<br /> Quel montant voulez-vous mettre sur le compte ? <input
				type="text" name="soldeepargne"> €<br /> Taux rémunération
			: <input type="text" name="tauxremuneration" value="3"> %<br />
			<input type="submit" value="Créer">
		</fieldset>
	</form>

	<a href="Accueil.jsp">Retour à l'accueil</a>

	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>