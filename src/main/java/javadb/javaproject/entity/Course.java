package javadb.javaproject.entity;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Course {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String code;
    private String title;
    private String cdescription;
    @ManyToMany (mappedBy = "Courses")
    private Set<Student> students;

    public Course() {
    }

    public Course(Long id, String code, String title, String description) {
        this.id = id;
        this.title = title;
        this.cdescription = description;
        this.code=code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getDescription() {
        return cdescription;
    }

    public void setDescription(String description) {
        this.cdescription = description;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Course: #");
        sb.append(id);
        sb.append(", Title: ");
        sb.append(title);
        sb.append(", Code: ");
        sb.append(code);
        sb.append(" Description: ");
        sb.append(cdescription.toString());
        return sb.toString();
    }
}


 

