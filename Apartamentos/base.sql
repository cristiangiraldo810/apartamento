CREATE DATABASE IF NOT EXISTS `motocicle` ;peliculas
USE `motocicle`;

CREATE TABLE IF NOT EXISTS `peliculas` (
  `id` int(11) NOT NULL,
  `titulo` varchar(100) DEFAULT NULL,
  `genero` varchar(100) DEFAULT NULL,
  `autor` varchar(100) DEFAULT NULL,
  `copias` int(11) DEFAULT NULL,
  `novedad` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=LATIN1;

INSERT INTO `peliculas` (`id`, `titulo`, `genero`, `autor`, `copias`, `novedad`) VALUES
	(1, 'The Shape of Water', 'Romance/Fantasía', 'Guillermo del Toro', 5, 0),
	(2, 'El laberinto del fauno', 'Fantasía/Bélico', 'Guillermo del Toro', 6, 1),
	(3, 'El callejón de las almas perdidas', 'Suspenso/Drama', 'Guillermo del Toro', 7, 0),
	(4, 'El orfanato', 'Terror/Suspenso', 'Juan Antonio Bayona', 2, 0),
	(5, 'El Hobbit: Un viaje inesperado', 'Aventura/Fantasía', 'Peter Jackson', 10, 1),
	(6, 'Splice: experimento mortal', 'Ciencia ficción/Terror', 'Vincenzo Natali', 6, 0),
	(7, 'Depredador: La presa', 'Acción/Ciencia ficción', 'Dan Trachtenberg', 10, 0),
	(8, 'Candyman: El Dominio de la Mente', 'Terror/Suspenso', 'Bernard Rose', 4, 0),
	(9, 'Candyman: Farewell to the Flesh', 'Terror/Slasher', 'Bill Condon', 8, 1),
	(10, 'Hellraiser III: Hell on Earth', 'Terror/Slasher', 'Anthony Hickox', 4, 1),
	(11, 'Quicksilver Highway', 'Terror/Comedia de terror', 'Mick Garris', 4, 1),
	(12, 'Cuentos de terror 2', 'Terror/Fantasía', 'Michael Gornick', 5, 0),
	(13, 'El resplandor', 'Terror', 'Stephen King', 8, 0),
	(14, 'Graveyard Shift', 'Terror', 'Ralph S. Singleton', 6, 0),
	(15, 'Thinner', 'Terror/Guion adaptado', 'Tom Holland', 3, 0),
	(16, 'It (Eso)', 'Terror/Suspenso', 'Andrés Muschietti', 6, 0),
	(17, 'En la hierba alta', 'Terror/Drama', 'Vincenzo Natali', 2, 1),
	(18, 'The Shining', 'Terror/Misterio', 'Stanley Kubrick', 3, 0),
	(19, 'Room 237', 'Documental', 'Rodney Ascher', 4, 0),
	(20, 'The Silence of the Lambs', 'Suspenso/Terror', 'Jonathan Demme', 6, 0);
	
CREATE TABLE IF NOT EXISTS `usuarios` (
  `username` varchar(100) NOT NULL,
  `contrasena` varchar(100) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellidos` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `saldo` double(22,2) DEFAULT NULL,
  `premium` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=LATIN1;

CREATE TABLE IF NOT EXISTS `alquiler` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `fecha` datetime NOT NULL,
  PRIMARY KEY (`id`,`username`,`fecha`) USING BTREE,
  KEY `FK__usuarios` (`username`),
  CONSTRAINT `FK__peliculas` FOREIGN KEY (`id`) REFERENCES `peliculas` (`id`),
  CONSTRAINT `FK__usuarios` FOREIGN KEY (`username`) REFERENCES `usuarios` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=LATIN1;