package javadb.javaproject.repository;
import javadb.javaproject.entity.Course;
import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    List<Course> findByCode(String code);
    List<Course> findByTitle(String title);
    Course findById(long id);
    List<Course> findByCodeIgnoreCase(String code);
    List<Course> findByCodeOrderByCodeAsc(String code);
    @Query("select b from Course b where lower(b.code) like %:code%")
    List<Course> findByCodeLikeIgnoreCase(@Param("code")String code);
    @Query("select b from Course b where lower(b.code) like %:title%")
    List<Course> findByTitleLikeIgnoreCase(@Param("title")String title);
    @Query(nativeQuery = true, 
            value="SELECT Course.* FROM Course,Student" +
                   "WHERE Course.student_id=Student.id AND Course.student_id=?1")
    List<Course> findCourseVyStudentId(long id);

    @Modifying
    @Transactional(readOnly = false)
    @Query("UPDATE Course SET title = :title WHERE id = :id" )
    int setNewTitle(@Param("title") String title, @Param("id") long id);
       

}
