package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication

@SpringBootApplication(scanBasePackages = "com.example")
@ConfigurationPropertiesScan(basePackages = "com.example.model")
@EntityScan(basePackages = "com.example.model")
@EnableJpaRepositories(basePackages = "com.example")
public class DemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		
		// 2 types of scope of spring bean --> 1. singleton scope and 2. prototype scope 
		// 1. This means one bean instance per bean definition per Spring container, singleton does not automatically mean thread-safe.
		// 2. Spring creates a new instance when that bean is requested from the container
		
		// Dependency injection means an object receives the other objects it needs from an external source rather than creating them itself -->
		// 1. Constructor injection — recommended -> Dependencies are explicit, required fields can be final, and unit testing is straightforward.
		// 2. Setter injection -> Useful for optional or changeable dependencies, needs @Autowired
		// 3. Field injection -> Concise, but generally less suitable because dependencies are hidden and direct unit testing is harder, needs @Autowired
		
		// When the application starts, Spring creates and wires the beans. When a client sends a GET request to /employee, the controller calls the service, which calls the repository
		// Notice that no class manually creates its dependency using new. This is how IoC and DI simplify application design.
		
		// 2 ways to run project --> 1. by this file, 2. by JAR file also from command prompt
		
		// follow pattern -> 1. HelloWorld (@RestController) , 2. CourseController (@RestController) , 3. CurrencyConfigController (@RestController) , 
		//					 4. TodoResource (@RestController) and TodoHardcodedService (@Service) , 
		// 					 5. TodoJpaResource (@RestController) and TodoJpaRepo (@Repository)
		
		
	}

}
