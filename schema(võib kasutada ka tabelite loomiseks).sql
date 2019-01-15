--eraldi db loos seostega
CREATE TABLE course (
 id INTEGER NOT NULL,
 title VARCHAR(50) NOT NULL,
 cdescription VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
)ENGINE=InnoDB;


CREATE TABLE student (
 id INTEGER NOT NULL,
 firstname VARCHAR(50) NOT NULL,
 lastname VARCHAR(50) NOT NULL,
 eriala varchar(6) not null,
 PRIMARY KEY (id)
)ENGINE=InnoDB;


CREATE TABLE course_registration (
 id INTEGER NOT NULL AUTO_INCREMENT,   
 course_id INTEGER NOT NULL,
 student_id integer not null,
 PRIMARY KEY (id,course_id, student_id),
constraint f1 FOREIGN KEY (course_id) REFERENCES course (id) ON DELETE CASCADE
		ON UPDATE RESTRICT,
 constraint f2 FOREIGN KEY (student_id) REFERENCES student (id) ON DELETE CASCADE
		ON UPDATE RESTRICT
)ENGINE=InnoDB; 



