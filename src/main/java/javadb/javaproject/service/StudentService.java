package javadb.javaproject.service;

import java.util.List;

import javadb.javaproject.entity.Student;
import javadb.javaproject.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService{ 

    @Autowired
    StudentRepository StudentRepository;

    public List<Student> getAllStudents(){
        return StudentRepository.findAll();
    }
    
}
