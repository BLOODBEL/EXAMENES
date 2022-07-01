CREATE DATABASE examen1;
use examen;

CREATE TABLE `lugar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lugar` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `lugar` VALUES (1,'ESTADIO NACIONAL'),(2,'RICARDO SAPRISA'),(3,'MELICO SALASAR');

CREATE TABLE `ARTISTAS` (
  `nombre` varchar(45) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apellido1` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`lugar_idD`),
  KEY `fk_artista_lugar_idx` (`lugar_id`),
  CONSTRAINT `fk_artista_lugar` FOREIGN KEY (`lugar_id`) REFERENCES `lugar` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
 
 CREATE TABLE `ENTRADA` (
  `CAPACIDAD` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`CAPACIDAD`,`lugar_CAPACIDAD`),
  KEY `fk_artista_lugar_idx` (`lugar_CAPACIDAD`),
   Fecha_pedida date,
   Monto_de_entrad int 
) ;

INSERT INTO `artista` VALUES (1,'Ricardo','Arjona',1,2022-6-10,250000);
INSERT INTO `artista` VALUES (2,'Carlos','Liyue',3,2022-6-10,250000);
INSERT INTO `artista` VALUES (3,'Roxana','López',5,2022-6-10,250000);
