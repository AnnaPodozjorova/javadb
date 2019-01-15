package javadb.javaproject.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Course {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String title;
    private String cdescription;
    @OneToMany(mappedBy = "course")
    private List<CourseRegistration> registrations;

    public Course() {
    }

    public Course(Long id, String title, String description, List<CourseRegistration> registrations) {
        this.id = id;
        this.title = title;
        this.cdescription = description;
        this.registrations=registrations;
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

    public String getDescription() {
        return cdescription;
    }

    public void setDescription(String description) {
        this.cdescription = description;
    }

    public List<CourseRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<CourseRegistration> registrations) {
        this.registrations = registrations;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Course: #");
        sb.append(id);
        sb.append(", Title: ");
        sb.append(title);
        sb.append(" Description: ");
        sb.append(cdescription.toString());
        return sb.toString();
    }
}


 

