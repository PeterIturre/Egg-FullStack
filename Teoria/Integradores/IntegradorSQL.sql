USE nba;
SELECT * FROM nba.estadisticas; 
SELECT * FROM nba.jugadores;

/*CANDADO A*/

SELECT jugador, Asistencias_por_partido
FROM estadisticas
WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido) FROM estadisticas);

-- 34 asistencias, jugador 361 y 300

SELECT COUNT(jugador) AS POS
FROM estadisticas
WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido) FROM estadisticas);

-- POS 2

SELECT SUM(j.peso) AS CODIGO
FROM jugadores j
INNER JOIN equipos e ON j.Nombre_equipo = e.nombre
WHERE e.conferencia = "East" AND j.posicion LIKE "%c%";

-- CODIGO 14043

/*CANDADO B*/

SELECT COUNT(jugador) AS POS
FROM estadisticas
WHERE Asistencias_por_partido > (SELECT COUNT(Nombre_equipo) FROM jugadores WHERE Nombre_equipo = "Heat");

-- POS 3

SELECT COUNT(temporada) AS CODIGO
FROM partidos
WHERE temporada LIKE "%99%";

-- CODIGO 3480

/*CANDADO C*/

SELECT count(*) /(SELECT  COUNT(*) FROM  jugadores  j WHERE  j.Peso  >=  195   ) +  0.9945 AS jugadores_michugan  
FROM jugadores j 
JOIN equipos e ON j.Nombre_equipo=e.Nombre 
WHERE j.Procedencia= 'michigan' AND e.Conferencia='west'; 

-- POS 1

SELECT AVG(estadisticas.puntos_por_partido) + COUNT(estadisticas.asistencias_por_partido) + SUM(estadisticas.tapones_por_partido) 
FROM estadisticas 
INNER JOIN jugadores ON jugadores.codigo = estadisticas.jugador 
INNER JOIN equipos ON jugadores.nombre_equipo = equipos.nombre 
WHERE equipos.division LIKE '%central%';


-- CODIGO 631

/*CANDADO D*/

SELECT ROUND(est.Tapones_por_partido) AS POS
FROM estadisticas est
INNER JOIN jugadores jug ON est.jugador = jug.codigo
WHERE jug.nombre = "Corey Maggette" AND est.temporada = "00/01";

-- POS 4

SELECT FLOOR(SUM(puntos_por_partido)) AS CODIGO
FROM estadisticas est
INNER JOIN jugadores jug ON est.jugador = jug.codigo
WHERE jug.Procedencia = "Argentina";

-- CODIGO 191