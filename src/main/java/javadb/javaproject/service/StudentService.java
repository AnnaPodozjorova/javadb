package javadb.javaproject.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javadb.javaproject.entity.Course;
import javadb.javaproject.entity.Student;
import javadb.javaproject.repository.StudentRepository;


@Service
public class StudentService{ 
    @Autowired
    StudentRepository studentRepository;
    
    @PersistenceContext	
	private EntityManager entityManager;
    
    public Student getStudentById(long studentId) {
		return entityManager.find(Student.class, studentId);
	}
    
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    
    public Student findByID(long id){
        return studentRepository.findById(id);
    } 
    
  /*  public void updateStudent(Student student, Student newStudent) {
		Student stud = getStudentById(student.getId());
		stud.setFirstname(newStudent.getFirstname());
                stud.setLastname(newStudent.getLastname());
                stud.setEriala(newStudent.getEriala());
		entityManager.flush();
	}
    
    public void addStudent(Student student, Course course) {
		Student stud = getStudentById(student.getId());
		stud.getCourses().add(course);
		entityManager.flush();
	}
    
    public void deleteStudent(Student student, Course course) {
		Student stud = getStudentById(student.getId());
		stud.getCourses().remove(course);
		entityManager.flush();
	}
    */
}
