USE trial1;
CREATE TABLE Persons1 (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255),
    Primary key (PersonID)
);

INSERT INTO Persons1 (PersonID,LastName,FirstName, Address, City)
VALUES ('5964', 'Skywalker', 'Shmi', 'Tatooine', 'Anchorhead');
INSERT INTO Persons1 (PersonID,LastName,FirstName, Address, City)
VALUES ('5965', 'Skywalker', 'Anakin', 'Naboo', 'The Resolute');
INSERT INTO Persons1 (PersonID,LastName,FirstName, Address, City)
VALUES ('6986', 'Skywalker', 'Luke', 'Tatooine', 'Xwing');
INSERT INTO Persons1 (PersonID,LastName,FirstName, Address, City)
VALUES ('6885', 'Organa-solo', 'Leia', 'Alderaan', 'Millenium');


