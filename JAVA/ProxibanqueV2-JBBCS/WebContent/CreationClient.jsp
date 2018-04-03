<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Création client</title>
</head>
<body>
	<form action="CreationClient" method="post">
		<fieldset>
			<legend>Création Client</legend>
			<input type="text" name="nom" placeholder="Nom"><br /> <input
				type="text" name="prenom" placeholder="Prénom"><br /> <input
				type="text" name="adresse" placeholder="Adresse"><br /> <input
				type="text" name="codePostal" placeholder="Code Postal"><br />
			<input type="text" name="ville" placeholder="Ville"><br /> <input
				type="text" name="telephone" placeholder="Téléphone"><br />
			<p />
			<input type="submit" value="Créer"> <input type="reset"
				value="Effacer">
		</fieldset>
	</form>
</body>
</html>