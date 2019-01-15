package javadb.javaproject.repository;

import javadb.javaproject.entity.CourseRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, Long>{
    
}