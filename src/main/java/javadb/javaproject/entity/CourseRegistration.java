package javadb.javaproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CourseRegistration {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;
 
    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;
   
    public CourseRegistration() {
    }
    
public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public Student getStudent() {
    return student;
}

public void setStudent(Student student) {
    this.student = student;
}

public Course getCourse() {
    return course;
}

public void setCourse(Course course) {
    this.course = course;
}

public String toString() {
    StringBuilder sb = new StringBuilder("Registration: #");
    sb.append(id);
    sb.append(", Course: ");
    sb.append(course.toString());
    sb.append(", Student: ");
    sb.append(student.toString());
    return sb.toString();
}
}