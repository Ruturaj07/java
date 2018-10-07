CREATE DATABASE studentLogin;

USE studentLogin;

CREATE TABLE userpass(
	user VARCHAR(20),
	pass VARCHAR(20)
);

INSERT INTO userpass (user,pass) VALUES ('ruturaj','sawant');

SELECT * FROM userpass;