-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mer. 04 avr. 2018 à 16:03
-- Version du serveur :  10.1.31-MariaDB
-- Version de PHP :  7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `proxibanquev2-jbbcs`
--

-- --------------------------------------------------------

--
-- Structure de la table `agence`
--

CREATE TABLE `agence` (
  `idagence` varchar(5) NOT NULL,
  `datecreation` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `agence`
--

INSERT INTO `agence` (`idagence`, `datecreation`) VALUES
('1111A', '2018-04-04');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `idclient` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `adresse` varchar(40) NOT NULL,
  `codepostal` int(11) NOT NULL,
  `ville` varchar(20) NOT NULL,
  `telephone` varchar(10) NOT NULL,
  `idconseiller` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`idclient`, `nom`, `prenom`, `adresse`, `codepostal`, `ville`, `telephone`, `idconseiller`) VALUES
(1, 'blanc', 'jb', '465 avenue de Paris', 45465, 'Angers', '0124643165', 2),
(2, 'Szymezak', 'Clothilde', '4 rue des chats', 77000, 'Melun', '0123456798', 1),
(3, 'Joumard', 'Sebastien', '98 avenue des fraises', 75007, 'Paris', '0123456789', 1),
(4, 'Blanc', 'JB', '56 impasse des oiseaux', 13000, 'Marseille', '0121364546', 1);

-- --------------------------------------------------------

--
-- Structure de la table `comptecourant`
--

CREATE TABLE `comptecourant` (
  `numcompte` int(11) NOT NULL,
  `solde` double NOT NULL,
  `dateouverture` date NOT NULL,
  `decouvertautorise` double NOT NULL,
  `cartevisa` varchar(20) DEFAULT NULL,
  `idclient` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `comptecourant`
--

INSERT INTO `comptecourant` (`numcompte`, `solde`, `dateouverture`, `decouvertautorise`, `cartevisa`, `idclient`) VALUES
(1, 15, '2018-04-04', 1000, 'Electron', 1),
(2, 4500, '2018-04-04', 1000, 'Premier', 2),
(3, 98000, '2018-04-04', 1000, 'Electron', 3);

-- --------------------------------------------------------

--
-- Structure de la table `compteepargne`
--

CREATE TABLE `compteepargne` (
  `numcompte` int(11) NOT NULL,
  `solde` double NOT NULL,
  `dateouverture` date NOT NULL,
  `tauxremuneration` double NOT NULL,
  `idclient` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `compteepargne`
--

INSERT INTO `compteepargne` (`numcompte`, `solde`, `dateouverture`, `tauxremuneration`, `idclient`) VALUES
(1, 6000, '2018-04-04', 3, 1),
(2, 15750, '2018-04-04', 3, 2),
(3, 60000, '2018-04-04', 3, 4);

-- --------------------------------------------------------

--
-- Structure de la table `conseiller`
--

CREATE TABLE `conseiller` (
  `idconseiller` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) DEFAULT NULL,
  `login` varchar(25) NOT NULL,
  `mdp` varchar(25) NOT NULL,
  `idagence` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `conseiller`
--

INSERT INTO `conseiller` (`idconseiller`, `nom`, `prenom`, `login`, `mdp`, `idagence`) VALUES
(1, 'Dark', 'Vador', 'DarkVador', 'luc', '1111A'),
(2, 'Lucky', 'Luke', 'Luke', 'rantanplan', '1111A');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `agence`
--
ALTER TABLE `agence`
  ADD PRIMARY KEY (`idagence`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`idclient`),
  ADD KEY `FK_Client_idconseiller` (`idconseiller`);

--
-- Index pour la table `comptecourant`
--
ALTER TABLE `comptecourant`
  ADD PRIMARY KEY (`numcompte`),
  ADD UNIQUE KEY `idclient` (`idclient`),
  ADD KEY `FK_CompteCourant_idclient` (`idclient`);

--
-- Index pour la table `compteepargne`
--
ALTER TABLE `compteepargne`
  ADD PRIMARY KEY (`numcompte`),
  ADD UNIQUE KEY `idclient` (`idclient`),
  ADD KEY `FK_CompteEpargne_idclient` (`idclient`);

--
-- Index pour la table `conseiller`
--
ALTER TABLE `conseiller`
  ADD PRIMARY KEY (`idconseiller`),
  ADD KEY `FK_Conseiller_idagence` (`idagence`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `idclient` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT pour la table `comptecourant`
--
ALTER TABLE `comptecourant`
  MODIFY `numcompte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `compteepargne`
--
ALTER TABLE `compteepargne`
  MODIFY `numcompte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT pour la table `conseiller`
--
ALTER TABLE `conseiller`
  MODIFY `idconseiller` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `FK_Client_idconseiller` FOREIGN KEY (`idconseiller`) REFERENCES `conseiller` (`idconseiller`);

--
-- Contraintes pour la table `comptecourant`
--
ALTER TABLE `comptecourant`
  ADD CONSTRAINT `FK_CompteCourant_idclient` FOREIGN KEY (`idclient`) REFERENCES `client` (`idclient`) ON DELETE CASCADE;

--
-- Contraintes pour la table `compteepargne`
--
ALTER TABLE `compteepargne`
  ADD CONSTRAINT `FK_CompteEpargne_idclient` FOREIGN KEY (`idclient`) REFERENCES `client` (`idclient`) ON DELETE CASCADE;

--
-- Contraintes pour la table `conseiller`
--
ALTER TABLE `conseiller`
  ADD CONSTRAINT `FK_Conseiller_idagence` FOREIGN KEY (`idagence`) REFERENCES `agence` (`idagence`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
