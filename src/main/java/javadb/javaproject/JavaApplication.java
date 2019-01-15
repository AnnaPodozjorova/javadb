package javadb.javaproject;

import javadb.javaproject.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan
@ComponentScan
public class JavaApplication implements CommandLineRunner{

	public static void main(String[] args) { 
		SpringApplication.run(JavaApplication.class, args);
	}
	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
	CourseRepository repository;

	@Override
	public void run(String... args) throws Exception {
		//logger.info("Course id 1 -> {}", repository.findById(1L));
	
		logger.info("All Courses -> {}", repository.findAll());//tagastab k[ik info kursusest

	}

}

