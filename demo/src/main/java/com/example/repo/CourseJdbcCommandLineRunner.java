package com.example.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepo repo;
	
	// in this class we have used 3 methods -> insert, deleteById, findById

	public void run(String... args) throws Exception {

		repo.insert(new Course(1l, "Yash Jdbc", "From Java"));
		repo.insert(new Course(2l, "Yash Jdbc 2", "From Springboot"));
		repo.insert(new Course(3l, "Yash Jdbc 3", "From SQL"));
		
		repo.deleteById(2l);
		
		repo.findById(1l);
		System.out.println("Inside CourseJdbcCommandLineRunner class ->" + repo.findById(1l));
		
	}
	
}
