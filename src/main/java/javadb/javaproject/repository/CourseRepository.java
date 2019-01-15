package javadb.javaproject.repository;
import java.util.List;
import javadb.javaproject.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    List<Course> findByTitle(String title);
    Course findById(long id);
    List<Course> findByTitleIgnoreCase(String title);
    List<Course> findByTitleOrderByTitleAsc(String title);

    @Query("select id from Course b where lower(b.title) like %:title%")
    List<Course> findByTitleLikeIgnoreCase(@Param("title")String title);
  
}