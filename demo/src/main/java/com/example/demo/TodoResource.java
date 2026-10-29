package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.model.TodoModel;

@RestController
public class TodoResource {
	
	@Autowired
	private TodoHardcodedService todoService;
	
	
	@GetMapping(path = "/users/{username}/todos")
	public List<TodoModel> getAllTodos(@PathVariable String username){
		return todoService.findAll();
	}
	
	
	@GetMapping(path = "/users/{username}/todos/{id}")
	public TodoModel getTodos(@PathVariable String username, @PathVariable Long id){
		return todoService.findById(id);
	}
	
	
	@DeleteMapping(path = "/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable Long id){
		
		TodoModel todoDeleted = todoService.deleteById(id);
		if(todoDeleted!=null) { 			// if id that was sent, that id was found out then this code will be running.
			System.out.println("Inside if condition ........" );
			return ResponseEntity.noContent().build();
		}
		System.out.println("Not inside if condition ........" );
		return ResponseEntity.notFound().build();
	}
	
	
	@PutMapping(path = "/users/{username}/todos/{id}")
	public ResponseEntity<TodoModel> updateTodo(@PathVariable String username, @PathVariable Long id, @RequestBody TodoModel todo){
	
		TodoModel todoUpdated =  todoService.save(todo);
		return new ResponseEntity<TodoModel>(todoUpdated, HttpStatus.OK);
		
	}
	
	
	// below code of createNewTodos() and updateTodos() was done for practice on 10 Oct only, both works fine also --> 
	
	@GetMapping(path = "/users/todos/{username}/{description}/{isDone}")
	public TodoModel createNewTodos(@PathVariable String username, @PathVariable String description, @PathVariable Boolean isDone){
		
		TodoModel todoCreated = todoService.createNewTodo(username, description, isDone);
		return todoCreated;
	
	}
	
	@GetMapping(path = "/users/todos/{id}/{username}/{description}/{isDone}")
	public TodoModel updateTodos(@PathVariable Long id, @PathVariable String username, @PathVariable String description, @PathVariable Boolean isDone){
		
		TodoModel todoUpdated = todoService.updateTodo(id, username, description, isDone);
		return todoUpdated;
	
	}
	
	// above code of createNewTodos() and updateTodos() was done for practice on 10 Oct only, both works fine also --> 
	
	
	

}
