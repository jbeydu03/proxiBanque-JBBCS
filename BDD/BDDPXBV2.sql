#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Conseiller
#------------------------------------------------------------

CREATE TABLE Conseiller(
        idconseiller Int NOT NULL AUTO_INCREMENT,
        nom          Varchar (20) NOT NULL ,
        prenom       Varchar (20) ,
        login        Varchar (25) NOT NULL ,
        mdp          Varchar (25) NOT NULL ,
        idagence     Varchar (5) NOT NULL ,
        PRIMARY KEY (idconseiller )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Client
#------------------------------------------------------------

CREATE TABLE Client(
        idclient     Int NOT NULL AUTO_INCREMENT ,
        nom          Varchar (20) NOT NULL ,
        prenom       Varchar (20) NOT NULL ,
        adresse      Varchar (40) NOT NULL ,
        codepostal   Int NOT NULL ,
		ville		 Varchar (20) NOT NULL ,
        telephone    Varchar (10) NOT NULL ,
        idconseiller Int NOT NULL ,
        PRIMARY KEY (idclient )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Agence
#------------------------------------------------------------

CREATE TABLE Agence(
        idagence     Varchar (5) NOT NULL ,
        datecreation Date NOT NULL ,
		`nomagence` varchar(30) NOT NULL,
        PRIMARY KEY (idagence )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: CompteEpargne
#------------------------------------------------------------

CREATE TABLE CompteEpargne(
        numcompte        Int NOT NULL ,
        solde            Double NOT NULL ,
        dateouverture    Date NOT NULL ,
        tauxremuneration Double NOT NULL ,
        idclient         Int NOT NULL ,
        PRIMARY KEY (numcompte )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: CompteCourant
#------------------------------------------------------------

CREATE TABLE CompteCourant(
        numcompte         Int NOT NULL ,
        solde             Double NOT NULL ,
        dateouverture     Date NOT NULL ,
        decouvertautorise Double NOT NULL ,
        cartevisa         Varchar (20) ,
        idclient          Int NOT NULL ,
        PRIMARY KEY (numcompte )
)ENGINE=InnoDB;

        
ALTER TABLE Conseiller ADD CONSTRAINT FK_Conseiller_idagence FOREIGN KEY (idagence) REFERENCES Agence(idagence);
ALTER TABLE Client ADD CONSTRAINT FK_Client_idconseiller FOREIGN KEY (idconseiller) REFERENCES Conseiller(idconseiller);
ALTER TABLE CompteEpargne ADD CONSTRAINT FK_CompteEpargne_idclient FOREIGN KEY (idclient) REFERENCES Client(idclient);
ALTER TABLE CompteCourant ADD CONSTRAINT FK_CompteCourant_idclient FOREIGN KEY (idclient) REFERENCES Client(idclient);
