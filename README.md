
*************************************************************
*															*
*				Projet ProxiBanque- V2						*
*	Auteur : Clothilde SZYMEZAK  & Jean-Baptiste BLANC		*
*															*
*************************************************************	

1. Description de l'application

Le projet permet la gestion de clients via une interface web.
Pour cela, les ressources utilisées sont : 
- un navigateur web (au choix),
- un serveur TOMCAT,
- une base de données MySql.



L'application comprend plusieurs fonctionnalités : 
	- Authentification du conseiller bancaire;
	- Afficher la liste des clients affectés au conseiller connecté;
	- Affichage des données (personnelles et comptes) d'un client;
	- Modification de clients;
	- Ajout de nouveaux clients;
	- Suppression de clients et des comptes associés;
	- Ajout de comptes bancaires : courant et/ou epargne;
	- Déconnexion de l'application;

	
	
	
	
2. Livrables

Le dossier "proxiBanque-JBBCS" contient les livrables suivants:
 - un fichier texte : "README.md" : description global de l'application;
 - un dossier "BDD" : contient un fichier "proxibanquev2-jbbcs.sql". Ce fichier contient la base de données et un jeu de données associé;
 - un dossier "JAVA" : contient le dossier "ProxibanqueV2-JBBCS". Ce dernier comprend : 
		. Un dossier "doc". Se positionner dans le dossier puis lancer le fichier index.html pour consulter la javadoc;
		. Un dossier "src". Contient le code de l'application.
 - un dossier "Modelisation" : contient :
		. Diagrammedeclasses_proxibanqueV2 - JBBCS.PNG
		. Diagramme de déploiement_proxibanqueV2 - JBBCS.PNG
		. Un dossier "Ecrans_proxibanqueV2 - JBBCS" contenant les écrans de conceptions des vues utilisateurs
Tous ces fichiers sont fournis sous forme d'images.
		
		
		
		
3. Installation du projet 

---------------- Démarrage  serveur APACHE, MySql --------------------------
- Ouvrir l'application XAMPP control panel
- Cliquer sur Start pour les applications APACHE et MySql

Le serveur Apache est en service et la base de données est accessible.


---------------- Import de la BDD --------------------------
- Dans un navigateur, se positionner dans : http://localhost/phpmyadmin/ ;
- Cliquer sur "Nouvelle base de données";
- Dans le champ "nom de base de données, renseigner : proxibanquev2-jbbcs;
- Cliquer sur la base de données nouvellement créée;
- Cliquer sur "importer", puis "choisir un fichier";
- Dans le dossier BDD, sélectionner le fichier proxibanquev2-jbbcs.sql;
- Cliquer sur le bouton "Exécuter".

La base de données est importée.

---------------- Import du dossier Eclipse -----------------

IMPORT DU PROJET ECLIPSE
- Aller dans le dossier "JAVA"
- Copier le dossier "ProxibanqueV2-JBBCS" dans votre workspace Eclipse.
- Ouvrir Eclipse. Dans la barre de navigation, cliquer sur "File" puis "Open Projects from File System..."
- Cliquer sur le bouton "Directory", et récupérer  le dossier précédemment  déplacé dans votre workspace. Cliquer sur le bouton "Finish".

AJOUT DU SERVEUR
- Dans la barre de navigation, cliquer sur "File" puis "New" et "Other..."
- Sélectionner le dossier Server, puis "Server". Cliquer sur next, puis Apache et sélectionner votre version de Tomcat"
- Cliquer sur Browse et récupérer  votre serveur Tomcat présent sur votre ordinateur;
- Cliquer sur "Finish.
- Démarrer  le serveur en cliquant sur le projet, puis "Run as", "Run on server".

LANCEMENT DE L'APPLICATION
- Ouvrir un navigateur web
- Indiquer l'URL : http://localhost:8080/ProxibanqueV2-JBBCS/Login.jsp



4. Disponibilité du projet sur GitHub

Le projet est disponible en ligne sur le lien suivant : https://github.com/jbeydu03/proxiBanque-JBBCS