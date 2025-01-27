
USE mapa_videojuegos;

CREATE TABLE match_participants(
match_id int NOT NULL PRIMARY KEY ,
avatar_id int NOT NULL
);

CREATE TABLE confrotations(
id int8  NOT NULL PRIMARY KEY,
match_id int8 NOT NULL,
avatar1_id int8 NOT NULL,
avatar2_id int8 NOT NULL,
result int8,
foreign key(match_id)References matches(id)
);

CREATE TABLE matches(
id int8  NOT NULL PRIMARY KEY,
game_id int8 NOT NULL,
name text NOT NULL,
password text,
created_at text,
status text NOT NULL,
creator_avatar_id text NOT NULL
);

CREATE TABLE avatars(
id int8  NOT NULL PRIMARY KEY,
user int8 NOT NULL,
game_id int8 NOT NULL,
appearence text,
result text
);

CREATE TABLE users(
id int8  NOT NULL PRIMARY KEY,
name text NOT NULL,
email text NOT NULL UNIQUE,
nick text NOT NULL UNIQUE,
login text NOT NULL UNIQUE,
password text NOT NULL,
birthdate date
);

CREATE TABLE games(
id int8  NOT NULL PRIMARY KEY ,
game_id int8 NOT NULL,
name text NOT NULL,
description text,
rules text
);

