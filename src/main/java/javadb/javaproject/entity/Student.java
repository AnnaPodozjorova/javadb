package javadb.javaproject.entity;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Student {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String firstname;
    private String lastname;
    private String eriala;
    @ManyToMany
    @JoinTable(
     name = "course_student", 
     joinColumns = @JoinColumn(name = "student_id"), 
     inverseJoinColumns = @JoinColumn(name = "course_id"))
     private Set<Course> Courses;

    public Student(){
    }

    public Student(long id, String firstname, String lastname, String eriala) {
        this.id = id;
         this.eriala = eriala;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEriala() {
        return eriala;
    }

    public void setEriala(String eriala) {
        this.eriala = eriala;
    }

    public Set<Course> getCourses() {
        return Courses;
    }

    public void setCourses(Set<Course> Courses) {
        this.Courses = Courses;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", eriala=" + eriala + '}';
    }

 
    
}