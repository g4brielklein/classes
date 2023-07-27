CREATE TABLE tbappointment (
  idAppointment integer NOT NULL,
  date date NOT NULL,
  price decimal(6,2),
  fkCodDoc integer,
  fkCodPat integer,
  fkCodExa integer,
  PRIMARY KEY(idAppointment)
);

ALTER TABLE tbappointment ADD CONSTRAINT tbappointment_fkcoddoc
FOREIGN KEY(fkCodDoc)
REFERENCES tbdoctor(idDoctor);

ALTER TABLE tbappointment ADD CONSTRAINT tbappointment_fkcodpat
FOREIGN KEY(fkCodPat)
REFERENCES tbpatient(idPatient);

ALTER TABLE tbconstbappointmentulta ADD CONSTRAINT tbappointment_fkcodexa
FOREIGN KEY(fkCodExa)
REFERENCES tbexam(idExam);

INSERT INTO tbappointment VALUES (1, '2023-07-23');
INSERT INTO tbappointment VALUES (2, '2023-07-23', 1);
INSERT INTO tbappointment VALUES (3, '2023-07-23', 199.00, 2);
INSERT INTO tbappointment VALUES (4, '2023-07-24', 89.00, 4);
INSERT INTO tbappointment VALUES (5, '2023-07-25', 400.00, 3, 2);
INSERT INTO tbappointment VALUES (6, '2020-05-06', 50.00, 3, 3);
INSERT INTO tbappointment VALUES (9, '2023-05-06', 500.00, 2, 2, 2);
INSERT INTO tbappointment VALUES (10, '2023-07-06', 100.00, 4, 3, 1);
INSERT INTO tbappointment VALUES (11, '2023-07-06', 100.00, 4, 2, 1);
INSERT INTO tbappointment VALUES (12, '2023-07-06', 100.00, 4, 4, 1);

INSERT INTO tbappointment VALUES (15, '2020-09-06', 100.00, 4, 4, 1);
INSERT INTO tbappointment VALUES (16, '2020-07-06', 100.00, 4, 4, 1);
INSERT INTO tbappointment VALUES (17, '2020-07-08', 300.00, 4, 4, 1);
INSERT INTO tbappointment VALUES (18, '2020-07-17', 400.00, 4, 4, 1);
INSERT INTO tbappointment VALUES (19, '2020-09-30', 500.00, 4, 4, 1);
INSERT INTO tbappointment VALUES (20, '2020-09-30', 500.00, 4, 4, 1);

INSERT INTO tbappointment VALUES (21, '2020-09-06', 100.00, 4, 2, 2);
INSERT INTO tbappointment VALUES (22, '2020-07-06', 100.00, 4, 2, 2);
INSERT INTO tbappointment VALUES (23, '2020-07-08', 300.00, 4, 2, 2);
INSERT INTO tbappointment VALUES (24, '2020-07-17', 400.00, 4, 2, 2);
INSERT INTO tbappointment VALUES (25, '2020-09-30', 500.00, 4, 2, 2);
INSERT INTO tbappointment VALUES (26, '2020-09-30', 500.00, 4, 2, 2);

INSERT INTO tbappointment VALUES (27, '2023-04-25', 250.00, 6, 4, 2);
INSERT INTO tbappointment VALUES (28, '2023-05-30', 250.00, 6, 4, 2);

SELECT * FROM tbappointment;

CREATE TABLE tbdoctor(
  idDoctor integer NOT NULL,
  name VARCHAR(100) NOT NULL,
  speciality VARCHAR(100) NOT NULL,
  primary key(idDoctor)
);

INSERT INTO tbdoctor VALUES (1, 'Michael Scott', 'Pediatrician');
INSERT INTO tbdoctor VALUES (2, 'Dwight Schrute', 'Surgeon');
INSERT INTO tbdoctor VALUES (3, 'Jim Halpert', 'Psychiatrist');
INSERT INTO tbdoctor VALUES (4, 'Pam Beesly', 'Neurologist');
INSERT INTO tbdoctor VALUES (5, 'Andy Bernard', 'Cardiologist');
INSERT INTO tbdoctor VALUES (6, 'Ryan Howard', 'Dermatologist');

SELECT * FROM tbdoctor ORDER BY idDoctor;

CREATE TABLE tbpatient (
  idPatient integer NOT NULL,
  name varchar(100) NOT NULL,
  email varchar(50),
  gender varchar(50),
  PRIMARY KEY(idPatient)
);

INSERT into tbpatient values (1, 'Creed Bratton','creedbratton@email.com', 'M');
INSERT into tbpatient values (2, 'Meredith Palmer','meredithpalmer@email.com', 'F');
INSERT into tbpatient values (3, 'Oscar Martinez','oscarmartinez@email.com', 'M');
INSERT into tbpatient values (4, 'Kevin Malone','kevinmalone@email.com', 'M');
INSERT into tbpatient values (105, 'Angela Martin','angelamartin@email.com', 'F');
INSERT into tbpatient values (107, 'Kelly Kapoor','kellykapoor@email.com', 'F');

SELECT * FROM tbpatient;
