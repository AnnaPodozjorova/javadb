package javadb.javaproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javadb.javaproject.entity.Course;
import javadb.javaproject.service.CourseService;


/**
 *
 * @author
 */

@Controller
public class MainController {

    @Autowired 
    private CourseService courseService;
    
    @RequestMapping(value = "/")
        public String getCourses(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "index";
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




}
