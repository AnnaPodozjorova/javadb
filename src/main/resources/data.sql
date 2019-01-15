
INSERT INTO course(id, title, cdescription) VALUES (1,'Algebra','kirjeldus');
INSERT INTO course(id, title, cdescription) VALUES (2,'Programmeerimine','kirjeldus');
INSERT INTO course(id, title, cdescription) VALUES (3,'Eesti keel','kirjeldus');
INSERT INTO student(id, firstname, lastname, eriala) VALUES(1,'Alina', 'Ollo', 'RDIR12');
INSERT INTO student(id, firstname, lastname, eriala) VALUES(2,'Mark', 'Rebane', 'RDBR12');
INSERT INTO student(id, firstname, lastname, eriala) VALUES(3,'Salem', 'Ronn', 'RDIR41');
INSERT INTO course_registration(course_id,student_id) VALUES(2,1);
INSERT INTO course_registration(course_id,student_id) VALUES(2,2);
INSERT INTO course_registration(course_id,student_id) VALUES(3,1);