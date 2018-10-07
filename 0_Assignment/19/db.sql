--CREATE DATABASE studentData;

USE studentData;

CREATE TABLE Records(
	name VARCHAR(20),
	roll_no INT,
	marks FLOAT(5,2)
);

INSERT INTO Records (name,roll_no,marks) VALUES ('ruturaj',66,78.0);

SELECT * FROM Records;
