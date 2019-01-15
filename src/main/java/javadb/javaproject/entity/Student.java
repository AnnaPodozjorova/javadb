package javadb.javaproject.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    @OneToMany(mappedBy = "student")
    private List<CourseRegistration> registrations;

    public Student(){
    }

    public Student(long id, String firstname, String lastname, String eriala, List<CourseRegistration> registrations) {
        this.id = id;
         this.eriala = eriala;
        this.firstname = firstname;
        this.lastname = lastname;
        this.registrations = registrations;
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

    public List<CourseRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<CourseRegistration> registrations) {
        this.registrations = registrations;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", eriala=" + eriala + '}';
    }

 
    
}