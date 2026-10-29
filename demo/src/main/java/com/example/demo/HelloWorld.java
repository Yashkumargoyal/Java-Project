package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.HelloWorldBean;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class HelloWorld {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world") can use this also, but used below one --> 
	
	@GetMapping(path = "/hello-world")
	public String demoTest() {
		
		return "Hello-World";
		
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hello-World-Bean-Test-Value");
		
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable( @PathVariable String name ) {
		
		return new HelloWorldBean("Hello World to you " + name + " !!!!!");
		
	}
	
	@GetMapping(path = "/hello-world/multiply-operation/{number}")
	public HelloWorldBean helloWorldPathVariableNumber( @PathVariable int number ) {
		
		number = number * 7;
		String numValueStr = String.valueOf(number);
		return new HelloWorldBean("Hello World to you, number sent by you was multiply by 7, then answer is " + numValueStr + " !");
		
	}

}
