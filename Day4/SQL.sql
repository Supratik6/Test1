CREATE DATABASE STUDENT;
CREATE DATABASE TEMP;
DROP DATABASE TEMP;

USE STUDENT;
create table CSE (
ID INT primary key,
NAME varchar(50),
AGE INT NOT NULL
);

insert INTO CSE 
(ID,NAME,AGE)
Values
(1,'A',20),
(2,'B',24);

SELECT * FROM CSE;

insert INTO CSE 
(ID,NAME,AGE)
Values
(3,'C',28),
(4,'D',33);

SELECT * FROM CSE;

SELECT NAME FROM CSE;

CREATE TABLE CS (
    ID INT PRIMARY KEY,
    NAME VARCHAR(100),
    ROLL VARCHAR(20) UNIQUE,
    AGE INT NOT NULL,
    EMAIL VARCHAR(100),
    PHONE VARCHAR(15),
    BRANCH VARCHAR(10),
    ADDRESS TEXT
);
SELECT * FROM CS;
INSERT INTO CS (ID, NAME, ROLL, AGE, EMAIL, PHONE, BRANCH, ADDRESS)
VALUES 
(1, 'A', 'CSE2025_001', 20, 'a@cse.com', '9123456781', 'CSE', 'Address A'),
(2, 'B', 'CSE2025_002', 21, 'b@cse.com', '9123456782', 'CSE', 'Address B'),
(3, 'C', 'CSE2025_003', 22, 'c@cse.com', '9123456783', 'CSE', 'Address C'),
(4, 'D', 'CSE2025_004', 23, 'd@cse.com', '9123456784', 'CSE', 'Address D'),
(5, 'E', 'CSE2025_005', 24, 'e@cse.com', '9123456785', 'CSE', 'Address E'),
(6, 'F', 'CSE2025_006', 25, 'f@cse.com', '9123456786', 'CSE', 'Address F'),
(7, 'G', 'CSE2025_007', 22, 'g@cse.com', '9123456787', 'CSE', 'Address G'),
(8, 'H', 'CSE2025_008', 21, 'h@cse.com', '9123456788', 'CSE', 'Address H'),
(9, 'I', 'CSE2025_009', 20, 'i@cse.com', '9123456789', 'CSE', 'Address I'),
(10, 'J', 'CSE2025_010', 23, 'j@cse.com', '9123456790', 'CSE', 'Address J');

 
 USE STUDENT;
 SELECT * FROM CS;
 
 SELECT * from CS WHERE AGE>22;
 
 SELECT * from CS WHERE AGE BETWEEN 21 AND 22;
 SELECT * from CS WHERE AGE>22;
 
SELECT * FROM CS WHERE AGE>20 order by AGE ASC;
SELECT max(AGE) FROM CS;
SELECT COUNT(AGE) FROM CS; 
SELECT avg(AGE) FROM CS;