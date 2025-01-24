DROP DATABASE mapa_videojuegos;

CREATE DATABASE mapa_videojuegos 
CHARACTER SET utf8mb4 
COLLATE utf8mb4_general_ci;

USE mapa_videojuegos;

CREATE TABLE games(
id int8  NOT NULL PRIMARY KEY ,
name text NOT NULL,
description text,
rules text
);

CREATE TABLE users(
id int8  NOT NULL PRIMARY KEY,
name text NOT NULL,
email varchar(100) NOT NULL UNIQUE,
nick varchar(10) NOT NULL UNIQUE,
login varchar(50) NOT NULL UNIQUE,
password text NOT NULL,
birthdate date
);

CREATE TABLE avatars(
id int8  NOT NULL PRIMARY KEY,
user_id int8 NOT NULL,
game_id int8 NOT NULL,
appearence text,
result text,
FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
FOREIGN KEY (game_id) REFERENCES games(id) ON DELETE CASCADE
);

CREATE TABLE matches(
id int8  NOT NULL PRIMARY KEY,
game_id int8 NOT NULL,
name text NOT NULL,
password text,
created_at datetime,
status text NOT NULL,
creator_avatar_id int8 NOT NULL,
FOREIGN KEY (game_id) REFERENCES games(id) ON DELETE CASCADE,
FOREIGN KEY (creator_avatar_id) REFERENCES avatars(id) ON DELETE CASCADE
);

CREATE TABLE match_participants(
match_id int8 NOT NULL PRIMARY KEY ,
avatar_id int8 NOT NULL,
FOREIGN KEY (match_id) REFERENCES matches(id) ON DELETE CASCADE,
FOREIGN KEY (avatar_id) REFERENCES avatars(id) ON DELETE CASCADE
);

CREATE TABLE confrontations(
id int8  NOT NULL PRIMARY KEY,
match_id int8 NOT NULL,
avatar1_id int8 NOT NULL,
avatar2_id int8 NOT NULL,
result text,
FOREIGN KEY (match_id) REFERENCES matches(id) ON DELETE CASCADE,
FOREIGN KEY (avatar1_id) REFERENCES avatars(id) ON DELETE CASCADE,
FOREIGN KEY (avatar2_id) REFERENCES avatars(id) ON DELETE CASCADE
);

