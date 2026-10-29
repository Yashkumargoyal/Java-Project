package com.example.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.Course;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepo repo;

	// in this class we have used 3 methods -> save, deleteById, findById -> all 3 are pre-defined, so no need to define in CourseSpringDataJpaRepo now
	// now we dont use entity manager, as spring data jpa has lot of methods which we can use like save, deleteById, etc
	
	
	public void run(String... args) throws Exception {

		repo.save(new Course(7l, "Yash spring data JPA", "From Java"));
		repo.save(new Course(8l, "Yash spring data JPA 2", "From Springboot"));
		repo.save(new Course(9l, "Yash spring data JPA 3", "From SQL"));
		
		repo.deleteById(8l);
		
		repo.findById(7l);
		System.out.println("Inside CourseSpringDataJpaCommandLineRunner class -> findById ->" + repo.findById(7l));
		
		System.out.println("Inside CourseSpringDataJpaCommandLineRunner class -> findAll ->" + repo.findAll());
		
		System.out.println("Inside CourseSpringDataJpaCommandLineRunner class -> count ->" + repo.count());
		
		// below is custom method which we mention in CourseSpringDataJpaRepo ->
		System.out.println("Inside CourseSpringDataJpaCommandLineRunner class -> findByAuthor ->" + repo.findByAuthor("From Java"));
		System.out.println("Inside CourseSpringDataJpaCommandLineRunner class -> findByAuthor empty case ->" + repo.findByAuthor(""));
		
		
	}

}
