-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 09, 2017 at 12:00 AM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `projectit355-novi2`
--

-- --------------------------------------------------------

--
-- Table structure for table `ponuda`
--

CREATE TABLE IF NOT EXISTS `ponuda` (
  `ID_PONUDE` int(11) NOT NULL,
  `USER` varchar(110) COLLATE armscii8_bin DEFAULT NULL,
  `TIP` int(11) DEFAULT NULL,
  `NASLOV_PONUDE` text COLLATE armscii8_bin,
  `CENA_PONUDE` decimal(10,0) DEFAULT NULL,
  `KOLICINA_PONUDE` decimal(10,0) DEFAULT NULL,
  `BR_TEL_PONUDE` varchar(50) COLLATE armscii8_bin DEFAULT NULL,
  `LOK_PONUDE` varchar(50) COLLATE armscii8_bin DEFAULT NULL,
  `EMAIL_PONUDE` varchar(255) COLLATE armscii8_bin DEFAULT NULL,
  `opis` text COLLATE armscii8_bin
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

--
-- Dumping data for table `ponuda`
--

INSERT INTO `ponuda` (`ID_PONUDE`, `USER`, `TIP`, `NASLOV_PONUDE`, `CENA_PONUDE`, `KOLICINA_PONUDE`, `BR_TEL_PONUDE`, `LOK_PONUDE`, `EMAIL_PONUDE`, `opis`) VALUES
(15, 'user', 1, 'Nudim lesnik po najboljoj ceniii', '500', '10000', '06333543', 'Beograd', 'ppp@gmail.com', 'jkfdsfhbdsohvbvoudfhbvofhdvohbxohbxdofhbvohdfvohdxfgbdfoivhuofixuhfngiduxbidfbgidfbvidufbgvidfhuvdfiuhidfu'),
(16, 'sara', 2, 'Nudim 1000kg lesnika', '1000', '1000', '06549382', 'Beograd', 'ggg@gmail.com', 'Lesnik je plod leske, biljke koja raste u vidu razgranatog zbuna. Prosecna visina koju dostize je 3-8 metara, ali u posebno dobrim uslovima moze dostici i visinu od cak 15 metara.\r\nPored opste poznatog ploda leske, lesnika, u prehrambenoj industriji koriste se i kora i list ove biljke, jer se iz njih dobija tanin'),
(17, 'user', 1, 'Nudim lesnik po najboljoj ceni', '500', '10000', '06333543', 'Beograd', 'ppp@gmail.com', 'Lesnik je plod leske, biljke koja raste u vidu razgranatog zbuna. Prosecna visina koju dostize je 3-8 metara, ali u posebno dobrim uslovima moze dostici i visinu od cak 15 metara.\r\nPored opste poznatog ploda leske, lesnika, u prehrambenoj industriji koriste se i kora i list ove biljke, jer se iz njih dobija tanin'),
(18, 'sara', 2, 'Nudim 1000kg lesnika', '1000', '1000', '06549382', 'Beograd', 'ggg@gmail.com', 'Lesnik je plod leske, biljke koja raste u vidu razgranatog zbuna. Prosecna visina koju dostize je 3-8 metara, ali u posebno dobrim uslovima moze dostici i visinu od cak 15 metara.\r\nPored opste poznatog ploda leske, lesnika, u prehrambenoj industriji koriste se i kora i list ove biljke, jer se iz njih dobija tanin');

-- --------------------------------------------------------

--
-- Table structure for table `potraznja`
--

CREATE TABLE IF NOT EXISTS `potraznja` (
  `ID_POTRAZNJE` int(11) NOT NULL,
  `USER` varchar(110) COLLATE armscii8_bin DEFAULT NULL,
  `TIP` int(11) DEFAULT NULL,
  `NASLOV_POTRAZNJE` text COLLATE armscii8_bin,
  `CENA_POTRAZNJE` decimal(10,0) DEFAULT NULL,
  `KOLICINA_POTRAZNJE` decimal(10,0) DEFAULT NULL,
  `BR_TEL_POTRAZNJE` varchar(50) COLLATE armscii8_bin DEFAULT NULL,
  `LOK_POTRAZNJE` varchar(50) COLLATE armscii8_bin DEFAULT NULL,
  `EMAIL_POTRAZNJE` varchar(255) COLLATE armscii8_bin DEFAULT NULL,
  `opis` text COLLATE armscii8_bin
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

--
-- Dumping data for table `potraznja`
--

INSERT INTO `potraznja` (`ID_POTRAZNJE`, `USER`, `TIP`, `NASLOV_POTRAZNJE`, `CENA_POTRAZNJE`, `KOLICINA_POTRAZNJE`, `BR_TEL_POTRAZNJE`, `LOK_POTRAZNJE`, `EMAIL_POTRAZNJE`, `opis`) VALUES
(15, 'user', 1, 'Trazim rimski lesnik', '1000', '100', '064323123', 'Beograd', 'beo@gmail.com', 'Lesnik je plod leske, biljke koja raste u vidu razgranatog zbuna. Prosecna visina koju dostize je 3-8 metara, ali u posebno dobrim uslovima moze dostici i visinu od cak 15 metara.\r\nPored opste poznatog ploda leske, lesnika, u prehrambenoj industriji koriste se i kora i list ove biljke, jer se iz njih dobija tanin'),
(16, 'sara', 2, 'Trasim 200 kila lesnika', '500', '500', '06325453', 'Beograd', 'bbb@gmail.com', 'Lesnik je plod leske, biljke koja raste u vidu razgranatog zbuna. Prosecna visina koju dostize je 3-8 metara, ali u posebno dobrim uslovima moze dostici i visinu od cak 15 metara.\r\nPored opste poznatog ploda leske, lesnika, u prehrambenoj industriji koriste se i kora i list ove biljke, jer se iz njih dobija tanin');

-- --------------------------------------------------------

--
-- Table structure for table `tip`
--

CREATE TABLE IF NOT EXISTS `tip` (
  `ID` int(11) NOT NULL,
  `NAZIV_TIPA` varchar(50) COLLATE armscii8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

--
-- Dumping data for table `tip`
--

INSERT INTO `tip` (`ID`, `NAZIV_TIPA`) VALUES
(1, 'Dzin'),
(2, 'Rimski');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `ID` int(11) NOT NULL,
  `USERNAME` varchar(50) COLLATE armscii8_bin DEFAULT NULL,
  `PASSWORD` varchar(50) COLLATE armscii8_bin DEFAULT NULL,
  `ENABLED` tinyint(1) DEFAULT NULL,
  `adresa` varchar(20) COLLATE armscii8_bin DEFAULT NULL,
  `telefon` varchar(12) COLLATE armscii8_bin DEFAULT NULL,
  `ime` varchar(12) COLLATE armscii8_bin DEFAULT NULL,
  `prezime` varchar(12) COLLATE armscii8_bin DEFAULT NULL,
  `user_role` varchar(255) COLLATE armscii8_bin DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `USERNAME`, `PASSWORD`, `ENABLED`, `adresa`, `telefon`, `ime`, `prezime`, `user_role`) VALUES
(7, 'user', 'user', 1, 'user', 'user', 'user', 'user', 'ROLE_USER'),
(8, 'admin', 'admin', 1, 'admin', 'admin', 'admin', 'admin', 'ROLE_ADMIN'),
(9, 'sara', 'sara', 1, 'sara', 'sara', 'sara', 'sara', 'ROLE_USER'),
(11, 'lesnik', 'lesnik', 1, 'lesnik', 'lesnik', 'lesnik', 'lesnik', 'ROLE_USER'),
(12, 'drugi', 'drugi', 1, 'drugi', 'drugi', 'drugi', 'drugi', 'ROLE_ADMIN'),
(13, 'admin2', 'admin2', 1, 'admin2', 'admin2', 'admin2', 'admin2', 'ROLE_ADMIN');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ponuda`
--
ALTER TABLE `ponuda`
  ADD PRIMARY KEY (`ID_PONUDE`), ADD KEY `FK_nbgkrytgusnrj8wmrhq6at8l5` (`TIP`);

--
-- Indexes for table `potraznja`
--
ALTER TABLE `potraznja`
  ADD PRIMARY KEY (`ID_POTRAZNJE`), ADD KEY `FK_76nrun8iokvlu6p9e1m58ktf4` (`TIP`);

--
-- Indexes for table `tip`
--
ALTER TABLE `tip`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ponuda`
--
ALTER TABLE `ponuda`
  MODIFY `ID_PONUDE` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `potraznja`
--
ALTER TABLE `potraznja`
  MODIFY `ID_POTRAZNJE` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `ponuda`
--
ALTER TABLE `ponuda`
ADD CONSTRAINT `FK_nbgkrytgusnrj8wmrhq6at8l5` FOREIGN KEY (`TIP`) REFERENCES `tip` (`ID`);

--
-- Constraints for table `potraznja`
--
ALTER TABLE `potraznja`
ADD CONSTRAINT `FK_76nrun8iokvlu6p9e1m58ktf4` FOREIGN KEY (`TIP`) REFERENCES `tip` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
