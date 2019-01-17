package javadb.javaproject.repository;

import javadb.javaproject.entity.Course;
import javadb.javaproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    Student findById(long id);
   // void updateStudent(Student student, Student newStudent);
  //  void addStudent(Student student, Course course);
  //  void deleteStudent(Student student, Course course);

   // @Modifying
   // @Transactional(readOnly = false)
  //  @Query("UPDATE Student SET firstname= :firstname, lastname = :lastname, eriala = :eriala WHERE id = :id" )
  //  int setNewStudent(@Param("firstname ") String firstname ,@Param("eriala") String eriala , @Param("id") long id);
    

  }
