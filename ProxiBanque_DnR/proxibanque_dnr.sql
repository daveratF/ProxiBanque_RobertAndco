-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 13 Septembre 2017 à 14:46
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `proxibanque_dnr`
--

-- --------------------------------------------------------

--
-- Structure de la table `agence`
--

CREATE TABLE IF NOT EXISTS `agence` (
  `idAgence` int(11) NOT NULL AUTO_INCREMENT,
  `numAgence` varchar(32) DEFAULT NULL,
  `dateCreation` date DEFAULT NULL,
  PRIMARY KEY (`idAgence`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `agence`
--

INSERT INTO `agence` (`idAgence`, `numAgence`, `dateCreation`) VALUES
(1, '98GT546FV3', '2017-09-13');

-- --------------------------------------------------------

--
-- Structure de la table `carte`
--

CREATE TABLE IF NOT EXISTS `carte` (
  `idCarte` int(11) NOT NULL AUTO_INCREMENT,
  `numCarte` int(11) DEFAULT NULL,
  `compte_Id` int(11) DEFAULT NULL,
  `idPremier` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCarte`),
  KEY `fk_compte_idCompte` (`compte_Id`),
  KEY `fk_carte_premier` (`idPremier`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `idClient` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(32) DEFAULT NULL,
  `prenom` varchar(32) DEFAULT NULL,
  `telephone` int(11) DEFAULT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `ville` varchar(32) DEFAULT NULL,
  `codePostal` varchar(32) DEFAULT NULL,
  `plafond` decimal(10,0) DEFAULT NULL,
  `conseillerClient_Id` int(11) NOT NULL,
  `idParticulier` int(11) DEFAULT NULL,
  PRIMARY KEY (`idClient`),
  KEY `fk_conseillerClient_idEmploye` (`conseillerClient_Id`),
  KEY `fk_employe_particulier` (`idParticulier`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE IF NOT EXISTS `compte` (
  `idCompte` int(11) NOT NULL AUTO_INCREMENT,
  `numCompte` varchar(32) DEFAULT NULL,
  `dateOuverture` date DEFAULT NULL,
  `decouvert` decimal(10,0) DEFAULT NULL,
  `taux` decimal(10,0) DEFAULT NULL,
  `compteClient_Id` int(11) NOT NULL,
  `solde` decimal(10,0) DEFAULT NULL,
  `idEpargne` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCompte`),
  KEY `fk_compteClient_idClient` (`compteClient_Id`),
  KEY `fk_compte_epargne` (`idEpargne`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

CREATE TABLE IF NOT EXISTS `employe` (
  `idEmploye` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(32) DEFAULT NULL,
  `prenom` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `login` varchar(32) DEFAULT NULL,
  `mdp` varchar(32) DEFAULT NULL,
  `agenceEmploye_Id` int(11) NOT NULL,
  `idGerant` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEmploye`),
  KEY `fk_agenceEmploye_idAgence` (`agenceEmploye_Id`),
  KEY `fk_employe_gerant` (`idGerant`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `employe`
--

INSERT INTO `employe` (`idEmploye`, `nom`, `prenom`, `email`, `login`, `mdp`, `agenceEmploye_Id`, `idGerant`) VALUES
(1, 'Robert', 'Desfoins', 'Rob.tuttur64@hotmail.com', 'patate', '1234azer', 1, 1);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `carte`
--
ALTER TABLE `carte`
  ADD CONSTRAINT `fk_carte_premier` FOREIGN KEY (`idPremier`) REFERENCES `carte` (`idCarte`),
  ADD CONSTRAINT `fk_compte_idCompte` FOREIGN KEY (`compte_Id`) REFERENCES `compte` (`idCompte`) ON DELETE CASCADE;

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `fk_conseillerClient_idEmploye` FOREIGN KEY (`conseillerClient_Id`) REFERENCES `employe` (`idEmploye`),
  ADD CONSTRAINT `fk_employe_particulier` FOREIGN KEY (`idParticulier`) REFERENCES `client` (`idClient`);

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `fk_compteClient_idClient` FOREIGN KEY (`compteClient_Id`) REFERENCES `client` (`idClient`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_compte_epargne` FOREIGN KEY (`idEpargne`) REFERENCES `compte` (`idCompte`);

--
-- Contraintes pour la table `employe`
--
ALTER TABLE `employe`
  ADD CONSTRAINT `fk_agenceEmploye_idAgence` FOREIGN KEY (`agenceEmploye_Id`) REFERENCES `agence` (`idAgence`),
  ADD CONSTRAINT `fk_employe_gerant` FOREIGN KEY (`idGerant`) REFERENCES `employe` (`idEmploye`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
