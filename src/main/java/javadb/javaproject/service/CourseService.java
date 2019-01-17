package javadb.javaproject.service;

import java.util.List;

import javadb.javaproject.entity.Course;
import javadb.javaproject.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService{ 

    @Autowired
    CourseRepository cRepository;

    public List<Course> getAllCourses(){
        return cRepository.findAll();
    }
}
