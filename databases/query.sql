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
INSERT INTO tbappointment VALUES (3, '2023-07-23', 2, 199.00);
INSERT INTO tbappointment VALUES (4, '2023-07-24', 4, 89.00);
INSERT INTO tbappointment VALUES (5, '2023-07-25', 3, 400.00, 2);
INSERT INTO tbappointment VALUES (6, '2020-05-06', 3, 50.00, 3);
INSERT INTO tbappointment VALUES (9, '2023-05-06', 2, 500.00, 2, 2);
INSERT INTO tbappointment VALUES (10, '2023-07-06', 4, 100.00, 3, 1);
INSERT INTO tbappointment VALUES (11, '2023-07-06', 4, 100.00, 2, 1);
INSERT INTO tbappointment VALUES (12, '2023-07-06', 4, 100.00, 4, 1);

INSERT INTO tbappointment VALUES (15, '2020-09-06', 4, 100.00, 4, 1);
INSERT INTO tbappointment VALUES (16, '2020-07-06', 4, 100.00, 4, 1);
INSERT INTO tbappointment VALUES (17, '2020-07-08', 4, 300.00, 4, 1);
INSERT INTO tbappointment VALUES (18, '2020-07-17', 4, 400.00, 4, 1);
INSERT INTO tbappointment VALUES (19, '2020-09-30', 4, 500.00, 4, 1);
INSERT INTO tbappointment VALUES (20, '2020-09-30', 4, 500.00, 4, 1);

INSERT INTO tbappointment VALUES (21, '2020-09-06', 4, 100.00, 2, 2);
INSERT INTO tbappointment VALUES (22, '2020-07-06', 4, 100.00, 2, 2);
INSERT INTO tbappointment VALUES (23, '2020-07-08', 4, 300.00, 2, 2);
INSERT INTO tbappointment VALUES (24, '2020-07-17', 4, 400.00, 2, 2);
INSERT INTO tbappointment VALUES (25, '2020-09-30', 4, 500.00, 2, 2);
INSERT INTO tbappointment VALUES (26, '2020-09-30', 4, 500.00, 2, 2);

INSERT INTO tbappointment VALUES (27, '2023-04-25', 6, 250.00, 4, 2);
INSERT INTO tbappointment VALUES (28, '2023-05-30', 6, 250.00, 4, 2);


SELECT * FROM tbappointment;
