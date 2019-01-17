package javadb.javaproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javadb.javaproject.entity.Course;
import javadb.javaproject.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    CourseRepository cRepository;

    public List<Course> getAllCourses(){
        return cRepository.findAll();}

    public Course findByID(long id){
        return cRepository.findById(id);
    }

    public List<Course> getCoursesByTitle(String title){
        return cRepository.findByTitleLikeIgnoreCase(title);
    }
    public List<Course> getCourseByCode(String code){
        return cRepository.findByCodeLikeIgnoreCase(code);
    }
    
    @Transactional 
    public int updateCoursetitle(long id, String title)
    {
        return cRepository.setNewTitle(title, id);
    }

    
}
