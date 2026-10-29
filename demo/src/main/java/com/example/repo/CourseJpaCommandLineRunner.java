package com.example.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJpaRepo repo;

	// in this class we have used 3 methods -> insert, deleteById, findById
	
	public void run(String... args) throws Exception {

		repo.insert(new Course(4l, "Yash JPA", "From Java"));
		repo.insert(new Course(5l, "Yash JPA 2", "From Springboot"));
		repo.insert(new Course(6l, "Yash JPA 3", "From SQL"));
		
		repo.deleteById(5l);
		
		repo.findById(4l);
		System.out.println("Inside CourseJpaCommandLineRunner class ->" + repo.findById(4l));
		
	}
	
	
}
