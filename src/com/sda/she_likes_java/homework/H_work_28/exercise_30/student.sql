DROP TABLE IF EXISTS STUDENT;
CREATE TABLE STUDENTS
(ID INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(255) NOT NULL, SURNAME VARCHAR(255) NOT NULL, AGE INT NOT NULL DEFAULT 0, SEX VARCHAR(255));
INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Mariss', 'Alvares', 23, 'MALE');
INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Anita', 'Helen', 17, 'FEMALE');
INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Elina', 'Sun', 15, 'FEMALE');
INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Eva', 'Lewis', 55, 'FEMALE');
INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Olaf', 'Wood', 10, 'MALE');
DELETE FROM STUDENTS WHERE ID = 8;