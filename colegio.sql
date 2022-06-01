-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2022 a las 00:43:38
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `colegio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

CREATE TABLE `cursos` (
  `id_curso` int(11) NOT NULL,
  `curso` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`id_curso`, `curso`) VALUES
(1, 'Matemática 1'),
(2, 'Matemática 2'),
(3, 'Matemática 3'),
(4, 'Idiomas'),
(5, 'Deportes'),
(6, 'Música 1'),
(7, 'Música 2'),
(8, 'Química 1'),
(9, 'Química 2'),
(10, 'Química 3'),
(11, 'Física 1'),
(12, 'Física 2'),
(13, 'Física 3'),
(14, 'Biología 1'),
(15, 'Biología 2'),
(16, 'Ética');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE `estudiantes` (
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `documento` mediumtext NOT NULL,
  `codigo_estudiante` mediumtext NOT NULL,
  `cursos` varchar(200) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `id_estudiante` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estudiantes`
--

INSERT INTO `estudiantes` (`nombres`, `apellidos`, `documento`, `codigo_estudiante`, `cursos`, `correo`, `id_estudiante`) VALUES
('Luis', 'Salgado Fernandez', '122457896', '100001', 'Idiomas', 'luije@misena.edu.co', 1),
('Sofia Maria', 'Sarmiento Palma', '11487953', '100002', 'Idiomas', 'sofis@misena.edu.co', 2),
('Jennny Andrea', 'Alvarez Lugo', '9908164587', '100004', 'Matemática 1', 'jalvarez@misena.edu.co', 3),
('Valentina', 'Marquez Perez', '990478453', '100005', 'Deportes', 'valmarquez@misena.edu.co', 4),
('Valeria Andrea', 'de la Espriella Martinez', '991203457', '100006', 'Química 2', 'vespriella@misena.edu.co', 5),
('Omar Enrique', 'Montalvo Valdez', '100254789', '100007', 'Música 1', 'oemvaldez@misena.edu.co', 6),
('Yuribeth Sofia', 'Bayona Gomez', '1125468932', '100008', 'Música 2', 'ybayona@misena.edu.co', 7),
('Camilo Andrés', 'Florez Martins', '114358974', '100009', 'Física 1', 'florezcamilo@misena.edu.co', 8),
('Hortensia', 'Paredes Vargas', '10125478', '100010', 'Biología 1', 'hparedesv@misena.edu.co', 9),
('Ignacia ', 'Giner Zambrano', '1140256874', '100011', 'Matemática 1', 'ginerignacia@misena.edu.co', 10),
('Mariam Carolina', 'Lema Muñoz', '1143168754', '100012', 'Matemática 1', 'lemamm@misena.edu.co', 11),
('Rosana Rociel', 'Veiga Natera', '1143159784', '100013', 'Matemática 1', 'rrveiga@misena.edu.co', 12),
('Rafael Francisco', 'Roldan Mendoza', '1143169857', '100014', 'Matemática 1', 'rmendoza@misena.edu.co', 13),
('Nicolas', 'Huertas Molinero', '1126874523', '100015', 'Matemática 1', 'hertasmn@misena.edu.co', 14),
('Joaquin', 'Clavijo Marquez', '1142568794', '100016', 'Matemática 1', 'jocalvijo@misena.edu.co', 16),
('Andrea Carolina', 'Triviño Villegas', '11425324478', '100017', 'Matemática 1', 'andreatv34@misena.edu.co', 17),
('Cristina Inés', 'Brotons Fidalgo', '101235745', '100018', 'Matemática 1', 'cristinabro74@misena.edu.co', 18),
('Eva', 'Peñas Mariño', '11143154563', '100019', 'Matemática 1', 'peñase@misena.edu.co', 19),
('Ricardo David', 'Viana Abella', '1001523784', '100020', 'Matemática 1', 'vianaabellar@misena.edu.co', 20),
('Jose Carlos', 'Sedano Ortin', '1141563247', '100021', 'Matemática 2', 'sojose@misena.edu.co', 21),
('Lorenzo', 'Aragón Cabanes', '1001425874', '100022', 'Matemática 2', 'lorenzoac@misena.edu.co', 22),
('Jose Antonio', 'Teruel Llacer', '1145765864', '100023', 'Matemática 2', 'joseteruell@misena.edu.co', 23),
('Luis Alberto', 'Romo Chinchilla', '1142812945', '100024', 'Matemática 2', 'romocl@misena.edu.co', 24),
('Ismael ', 'Bastida Mengual', '10102578', '100025', 'Matemática 2', 'bastidaismael43@misena.edu.co', 25),
('José Miguel', 'Corredor Plaza', '1147320456', '100026', 'Matemática 2', 'josemiguelc7@misena.edu.co', 26),
('Silvia Esther', 'Canals Espinar', '100489632', '100027', 'Matemática 2', 'silviac95@misena.edu.co', 27),
('Lorena Deiret', 'Polo Pariente', '1243254763', '100028', 'Matemática 2', 'pplorena@misena.edu.co', 28),
('Josep Milán', 'Nogues Lopez', '1002598742', '100029', 'Matemática 2', 'noguesjosep8@misena.edu.co', 29),
('Olga María', 'Porta Guillamon', '1145932513', '100030', 'Matemática 2', 'pgolga@misena.edu.co', 30),
('Margarita', 'Gomez Queralt', '122038561', '100031', 'Idiomas', 'margaritago@misena.edu.co', 31),
('Ana Belén', 'Manso Duarte', '1153295784', '100032', 'Idiomas', 'mansoduartea@misena.edu.co', 32),
('Rosa Luz', 'Paz Quiroga', '114020014', '100033', 'Idiomas', 'pazrosa75@misena.edu.co', 33),
('Jesús Sog', 'Lemos Gibert', '10303548', '100034', 'Idiomas', 'jesuslgibert@misena.edu.co', 34),
('Alfonso Andrés', 'Arques Pardo', '1145214796', '100035', 'Idiomas', 'aaarques@misena.edu.co', 35),
('Claudia María', 'Pujol Acuña', '1141697452', '100036', 'Idiomas', 'claudiap9@misena.edu.co', 36),
('Sara Elene', 'Amengual Lima', '1141236963', '100037', 'Idiomas', 'saralima@misena.edu.co', 37),
('Pedro', 'Hermosilla Sabater', '1140235941', '100038', 'Idiomas', 'pedrohermosilla@misena.edu.co', 38),
('Rafael Manuel', 'Robledo Merino', '1140200456', '100039', 'Deportes', 'rafaelrm@misena.edu.co', 39),
('Jose Ignacio', 'Oliveira Olivera', '1043167852', '100040', 'Deportes', 'oliveiraojose@misena.edu.co', 40),
('María Pilar', 'Pineda Del Valle', '1253428750', '100041', 'Deportes', 'mariapineda@misena.edu.co', 41),
('Veronica Daniela', 'Murillo Vasile', '123795412', '100042', 'Deportes', 'murillovv@misena.edu.co', 42),
('María José', 'Tabares Lama', '100136984', '100043', 'Deportes', 'tabaresmariaj@misena.edu.co', 43),
('Jose Luis', 'Fandiño Centeno', '153169847', '100044', 'Deportes', 'josefandiño23@misena.edu.co', 44),
('María Jesus', 'Briones Del Toro', '1353168523', '100045', 'Deportes', 'brionesdeltorom@misena.edu.co', 45),
('Luis David', 'Argimenez John', '1001521763', '100046', 'Música 1', 'luisargimenez@misena.edu.co', 46);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `id_profesor` int(11) NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `cc` mediumtext NOT NULL,
  `codigo` varchar(10) NOT NULL,
  `cursos` varchar(100) NOT NULL,
  `correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `profesores`
--

INSERT INTO `profesores` (`id_profesor`, `nombres`, `apellidos`, `cc`, `codigo`, `cursos`, `correo`) VALUES
(1, 'Daniel Elias', 'Almanza Martinez', '1143169847', '2397136', 'Física 1', 'dealmanza74@misena.edu.co'),
(2, 'Carlos Andres', 'Marx Pane', '22428759', '2397137', 'Literatura 2', 'carlosm@misena.edu.co'),
(3, 'Maria Eugenia', 'Perez Sosa', '32617458', '2397138', 'Deportes 2', 'mperez@misena.edu.co'),
(4, 'Daniel Elias', 'Almanza Martinez', '1143169847', '2397139', 'Matemática 3', 'dealmanza74@misena.edu.co'),
(5, 'Daniel Elias', 'Almanza Martinez', '1143169847', '2397140', 'Química 3', 'dealmanza74@misena.edu.co'),
(6, 'Justina Luz', 'Martinez', '32618457', '2397141', 'Ética', 'jmartinez@misena.edu.co'),
(7, 'Alexandru ', 'Mera', '32645798', '2397142', 'Matemática 1', 'AMera@misena.edu.co'),
(8, 'Dario Andrés', 'Gimenez Lora', '224258874', '2397143', 'Matemática 2', 'darigimenez@misena.edu.co'),
(9, 'Yasmina Yuri', 'Nieves Perez', '1140569874', '2397144', 'Idiomas', 'nievesy@misena.edu.co'),
(10, 'Uxue Carolina', 'Hernández', '22569874', '2397145', 'Deportes', 'uxuehernandez@misena.edu.co'),
(11, 'Arturo Emmanuel', 'Oliveira López', '10023547', '2397146', 'Música 1', 'aoliveira@misena.edu.co'),
(12, 'Omar Enrique', 'Montalvo Valdés', '1143168745', '2397147', 'Música 2', 'oenriquem@misena.edu.co'),
(13, 'Cayetano Ernesto', 'Prieto Bolivar', '22569832', '2397148', 'Química 1', 'prietocaye@misena.edu.co'),
(14, 'Denis', 'de Castro Angarita', '224255984', '2397149', 'Química 2', 'ddecastro@misena.edu.co'),
(15, 'Javier Julio', 'Mendoza Martínez', '72698738', '2397150', 'Química 3', 'jjmendoza@misena.edu.co'),
(16, 'Muhammad Salem', 'Mora Bayona', '1110132458', '2397151', 'Física 1', 'mmora@misena.edu.co'),
(17, 'Manuel Jesus', 'Valdes Peña', '32615874', '2397152', 'Física 2', 'manuelvaldes@misena.edu.co'),
(18, 'Antonio Luis', 'Ramiro Ramirez', '32465812', '2397153', 'Física 3', 'rrantonio@misena.edu.co'),
(19, 'Violeta Hortensia', 'Casanova Paredes', '1141169834', '2397154', 'Biología 1', 'hparedes@misena.edu.co');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `pass` blob NOT NULL,
  `rol` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `usuario`, `pass`, `rol`) VALUES
(1, 'JulioCastano', 0x313233343536373839, 'Rector'),
(2, 'dealmanza', 0x393930383137, 'Profesor'),
(3, 'JCamargo', 0x3534333231, 'Estudiante'),
(4, 'MPerez', 0x31323334, 'Profesor');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`id_curso`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
