INSERT INTO `agence` (`idagence`, `datecreation`, `nomagence`) VALUES
('1', '2018-04-03', 'Agence Lourcines');
INSERT INTO `conseiller` (`idconseiller`, `nom`, `prenom`, `login`, `mdp`, `idagence`) VALUES
(1, 'Scymezak', 'Clothilde', 'login', 'test', '1'),
(2, 'Avci', 'Ozlem', 'Oz', 'test', '1');


INSERT INTO `client` (`idclient`, `nom`, `prenom`, `adresse`, `codepostal`, `ville`, `telephone`, `idconseiller`) VALUES
(1, 'Blanc', 'Jean-Baptiste', '4 rue Villa Lourcine', 75014, '', '0011223344', 1),
(2, 'Joumard', 'Sébastien', '4 rue Poulard', 98000, 'Longuy', '9988776655', 1);



