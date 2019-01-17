package javadb.javaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"javadb.javaproject.controller.HomeController"})
public class JavaApplication{

	public static void main(String[] args) { 
		SpringApplication.run(JavaApplication.class, args);
	}
	

}

