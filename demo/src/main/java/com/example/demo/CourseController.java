package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;

@RestController
public class CourseController {
	
	
	@RequestMapping("/courses")
	public List<Course> getCourses(){
		
		return Arrays.asList(
				new Course(1l, "Course A", "First"), new Course(2l, "Course B", "Second"), new Course(3l, "Course C", "Third") );
		
	}
	
	

}
