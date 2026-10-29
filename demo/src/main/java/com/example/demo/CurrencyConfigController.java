package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CurrencyServiceConfig;

@RestController
public class CurrencyConfigController {
	
	// Spring Boot -> Provides auto-configuration -> configures many components based on the dependencies and configuration it detects
	// @SpringBootApplication -> combines 3 -> @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan
	
	// Dependency injection (DI) is the technique used to supply an object's dependencies
	// DI --> dependency injection --> case 1 . Example using constructor injection -->
	//	private final EmployeeRepository repository;
	//	public EmployeeService(EmployeeRepository repository) {
	//        this.repository = repository;
	//    }
	// Here, Spring supplies the EmployeeRepository bean when creating EmployeeService, assuming a suitable repository bean exists.
	
	// IoC (Inversion of Control): The framework manages object creation and life cycle rather than leaving all management to application code.
	// Bean: An object managed by the Spring container.
	// @Service: A specialization of @Component, typically used for business logic.
	// @Component: its like utility class 
	// @Repository: Typically marks data-access components.
	// @RestController: Defines a controller whose return values are written to the HTTP response body by default
	// @Configuration --> used for Java-based configuration
	
	// case 2 . @Autowired: Can be used for dependency injection, though it is often unnecessary on a single constructor.
	
	
	@Autowired
	private CurrencyServiceConfig conf;
	
	@RequestMapping("/curr-config")
	public CurrencyServiceConfig getCourses(){
		
		return conf;
		
	}
	
	

}
