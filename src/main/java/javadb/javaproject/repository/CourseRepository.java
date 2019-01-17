package javadb.javaproject.repository;
import javadb.javaproject.entity.Course;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    List<Course> findByCode(String code);
    List<Course> findByTitle(String title);
    Course findById(long id);
    List<Course> findByCodeIgnoreCase(String code);
    List<Course> findByCodeOrderByCodeAsc(String code);
    @Query("select b from Course b where lower(b.code) like %:code%")
    List<Course> findByCodeLikeIgnoreCase(@Param("code")String code);
       

}
