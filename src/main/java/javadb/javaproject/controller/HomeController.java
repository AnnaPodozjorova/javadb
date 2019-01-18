package javadb.javaproject.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javadb.javaproject.entity.Course;
import javadb.javaproject.repository.CourseRepository;
import javadb.javaproject.service.CourseService;
import javadb.javaproject.service.StudentService;


/**
 *
 * @author
 */

@Controller
public class HomeController {

    @Autowired 
    private CourseService courseService;
    @Autowired
    private CourseRepository crep;

    
   @RequestMapping(value = "/")
        public String getCourses(Model model) {
            List<Course> list=courseService.getAllCourses();
        //model.addAttribute("courses", courseService.getAllCourses());
       // return "index11";
        return list.get(0).getTitle();
        }
 
       @ResponseBody
        @RequestMapping(value = "/result.html?name={id}", method = RequestMethod.POST)      
        public String getCourse(@PathVariable("id") String code,Model model) {
            for(Course c:courseService.getAllCourses()) {
                if (c.getCode().equals(code))
                    model.addAttribute("course", c);
            }
        return "result";
        }  

        /*
        @RequestMapping(value = "/result.html?name={id}, method = RequestMethod.POST")      
        public String getCourseByID(@PathVariable("id") short id,Model model) {
             model.addAttribute("course", courseService.getCourseByID(id));
             return "result";

            }*/
       
       /*	@RequestMapping(value = "/result.html?name={id}/")
        public String getStudents(@PathVariable("id") String id,Model model) {
            List<Student> students=new ArrayList<Student>();
            for(Student s:studentService.getAllStudents()) {
                if (s.getCourses().contains(id))
                    students.add(s);
            }
        model.addAttribute("students", students);
        return "result";
        }*/


}
