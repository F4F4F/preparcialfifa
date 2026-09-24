-- =========================================================
-- COUNTRIES
-- =========================================================

INSERT INTO country (id, name, code, confederation) VALUES
                                                        (1, 'Portugal', 'POR', 'UEFA'),
                                                        (2, 'Colombia', 'COL', 'CONMEBOL'),
                                                        (3, 'England', 'ENG', 'UEFA'),
                                                        (4, 'Croatia', 'CRO', 'UEFA'),
                                                        (5, 'Ghana', 'GHA', 'CAF'),
                                                        (6, 'DR Congo', 'COD', 'CAF'),
                                                        (7, 'Spain', 'ESP', 'UEFA'),
                                                        (8, 'Germany', 'GER', 'UEFA'),
                                                        (9, 'Italy', 'ITA', 'UEFA'),
                                                        (10, 'Saudi Arabia', 'KSA', 'AFC'),
                                                        (11, 'United States', 'USA', 'CONCACAF');


-- =========================================================
-- CLUBS
-- =========================================================

INSERT INTO club (id, name, city, founded, country_id) VALUES
                                                           (1, 'Real Madrid', 'Madrid', '1902-03-06', 7),
                                                           (2, 'Manchester United', 'Manchester', '1878-01-01', 3),
                                                           (3, 'Liverpool', 'Liverpool', '1892-06-03', 3),
                                                           (4, 'Bayern Munich', 'Munich', '1900-02-27', 8),
                                                           (5, 'Juventus', 'Turin', '1897-11-01', 9),
                                                           (6, 'Porto', 'Porto', '1893-09-28', 1),
                                                           (7, 'Al Nassr', 'Riyadh', '1955-10-24', 10),
                                                           (8, 'Minnesota United', 'Saint Paul', '2010-01-01', 11);


-- =========================================================
-- PLAYERS
-- =========================================================

INSERT INTO player
(id, name, birth_date, position, fifa_score, country_id)
VALUES

-- PORTUGAL
(1, 'Cristiano Ronaldo', '1985-02-05', 'Forward', 88, 1),
(2, 'Bruno Fernandes', '1994-09-08', 'Midfielder', 87, 1),
(3, 'Diogo Jota', '1996-12-04', 'Forward', 85, 1),

-- COLOMBIA
(4, 'James Rodriguez', '1991-07-12', 'Midfielder', 82, 2),
(5, 'Luis Diaz', '1997-01-13', 'Forward', 86, 2),
(6, 'Juan Cuadrado', '1988-05-26', 'Midfielder', 81, 2),
(7, 'Yerry Mina', '1994-09-23', 'Defender', 79, 2),

-- ENGLAND
(8, 'Harry Kane', '1993-07-28', 'Forward', 90, 3),

-- REAL MADRID - OTROS PAISES
(9, 'Vinicius Jr', '2000-07-12', 'Forward', 91, 7),
(10, 'Rodrygo Goes', '2001-01-09', 'Forward', 86, 7),
(11, 'Federico Valverde', '1998-07-22', 'Midfielder', 89, 7),
(12, 'Kylian Mbappe', '1998-12-20', 'Forward', 92, 7),
(13, 'Jude Bellingham', '2003-06-29', 'Midfielder', 90, 3),
(14, 'Luka Modric', '1985-09-09', 'Midfielder', 88, 4);


-- =========================================================
-- MATCHES
-- =========================================================

-- Consulta 3:
-- Bayern Munich debe devolver:
-- ENG vs CRO
-- ENG vs GHA
-- COL vs COD
-- COL vs POR

INSERT INTO match
(id, match_date, stadium, home_country_id, away_country_id)
VALUES
    (60, '2026-06-10', 'Stadium A', 3, 4),
    (61, '2026-06-11', 'Stadium B', 3, 5),
    (62, '2026-06-12', 'Stadium C', 2, 6),
    (63, '2026-06-13', 'Stadium D', 2, 1),

-- Consulta 4:
-- Partido 70 = Portugal vs Colombia
    (70, '2026-06-20', 'MetLife Stadium', 1, 2);


-- =========================================================
-- PLAYERCLUB
-- =========================================================
-- PK COMPUESTA:
-- player_id + club_id + start_date
--
-- end_date NULL = pertenece actualmente


-- =========================================================
-- CONSULTA 1
-- Real Madrid debe devolver exactamente:
--
-- Vinicius Jr
-- Rodrygo Goes
-- Federico Valverde
-- Kylian Mbappe
-- Cristiano Ronaldo
-- James Rodriguez
-- Jude Bellingham
-- Luka Modric
-- =========================================================

INSERT INTO playerclub
(player_id, club_id, start_date, end_date)
VALUES

-- Cristiano Ronaldo -> Real Madrid
(1, 1, '2009-07-01', '2018-07-10'),

-- James Rodriguez -> Real Madrid
(4, 1, '2014-07-22', '2017-07-11'),

-- Vinicius
(9, 1, '2018-07-12', NULL),

-- Rodrygo
(10, 1, '2019-07-01', NULL),

-- Valverde
(11, 1, '2016-07-01', NULL),

-- Mbappe
(12, 1, '2024-07-01', NULL),

-- Bellingham
(13, 1, '2023-07-01', NULL),

-- Modric
(14, 1, '2012-08-27', NULL);


-- =========================================================
-- CONSULTA 2
-- Colombia + Bayern Munich
-- debe devolver:
-- Luis Diaz
-- James Rodriguez
-- =========================================================

INSERT INTO playerclub
(player_id, club_id, start_date, end_date)
VALUES

-- James estuvo en Bayern
(4, 4, '2017-07-12', '2019-06-30'),

-- Luis Diaz actualmente Bayern
(5, 4, '2025-07-01', NULL);


-- =========================================================
-- CONSULTA 3
-- Bayern Munich
--
-- Para que Inglaterra y Colombia tengan jugadores
-- ACTUALES en Bayern
-- =========================================================

INSERT INTO playerclub
(player_id, club_id, start_date, end_date)
VALUES

-- Harry Kane -> England -> Bayern ACTUAL
(8, 4, '2023-08-12', NULL);


-- =========================================================
-- CONSULTA 4
-- Match 70 Portugal vs Colombia
--
-- Debe retornar exactamente:
--
-- Real Madrid
-- Manchester United
-- Liverpool
-- Bayern Munich
-- Juventus
-- Porto
-- Al Nassr
-- Minnesota United
-- =========================================================

INSERT INTO playerclub
(player_id, club_id, start_date, end_date)
VALUES

-- PORTUGAL

-- Cristiano -> Manchester United
(1, 2, '2003-08-12', '2009-06-30'),

-- Cristiano -> Al Nassr
(1, 7, '2023-01-01', NULL),

-- Bruno -> Porto
(2, 6, '2012-07-01', '2013-06-30'),

-- Diogo -> Liverpool
(3, 3, '2020-09-19', NULL),


-- COLOMBIA

-- Luis Diaz -> Liverpool
(5, 3, '2022-01-30', '2025-06-30'),

-- Cuadrado -> Juventus
(6, 5, '2015-08-25', '2023-06-30'),

-- Yerry Mina -> Minnesota United
(7, 8, '2024-01-01', NULL);


-- =========================================================
-- CONSULTA 5
-- Top países según el jugador con mayor FIFA Score
--
-- Orden esperado:
-- Argentina
-- France
-- Norway
-- Belgium
-- England
-- Portugal
-- =========================================================


-- PAISES NUEVOS
INSERT INTO country (id, name, code, confederation) VALUES
                                                        (12, 'Argentina', 'ARG', 'CONMEBOL'),
                                                        (13, 'France', 'FRA', 'UEFA'),
                                                        (14, 'Norway', 'NOR', 'UEFA'),
                                                        (15, 'Belgium', 'BEL', 'UEFA');


-- JUGADORES PARA DEFINIR EL MAX FIFA SCORE DE CADA PAIS

INSERT INTO player
(id, name, birth_date, position, fifa_score, country_id)
VALUES

-- Argentina -> máximo 98
(20, 'Argentina Player 1', '1995-01-01', 'Forward', 98, 12),
(21, 'Argentina Player 2', '1997-01-01', 'Midfielder', 88, 12),

-- France -> máximo 97
(22, 'France Player 1', '1996-01-01', 'Forward', 97, 13),
(23, 'France Player 2', '1998-01-01', 'Defender', 87, 13),

-- Norway -> máximo 96
(24, 'Norway Player 1', '1999-01-01', 'Forward', 96, 14),
(25, 'Norway Player 2', '1997-01-01', 'Midfielder', 86, 14),

-- Belgium -> máximo 95
(26, 'Belgium Player 1', '1994-01-01', 'Midfielder', 95, 15),
(27, 'Belgium Player 2', '1998-01-01', 'Forward', 85, 15),

-- England ya existe como country_id = 3
-- Le damos máximo 94
(28, 'England Top Player', '1996-01-01', 'Forward', 94, 3),

-- Portugal ya existe como country_id = 1
-- Le damos máximo 93
(29, 'Portugal Top Player', '1996-01-01', 'Forward', 93, 1);