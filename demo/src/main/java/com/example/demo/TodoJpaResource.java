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
public class TodoJpaResource {
	
	@Autowired
	private TodoJpaRepo todoJpaRepo;
	
	
	@GetMapping(path = "/jpa/users/{username}/todos")
	public List<TodoModel> getAllTodos(@PathVariable String username){
		return todoJpaRepo.findByUsername(username);
	}
	
	
	@GetMapping(path = "/jpa/users/{username}/todos/{id}")
	public TodoModel getTodos(@PathVariable String username, @PathVariable Long id){
		return todoJpaRepo.findById(id).get();
	}
	
	
	@DeleteMapping(path = "/jpa/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable Long id){
		todoJpaRepo.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	
	@PutMapping(path = "/jpa/users/{username}/todos/{id}")
	public ResponseEntity<TodoModel> updateTodo(@PathVariable String username, @PathVariable Long id, @RequestBody TodoModel todo){
		TodoModel todoUpdated =  todoJpaRepo.save(todo);
		return new ResponseEntity<TodoModel>(todoUpdated, HttpStatus.OK);
	}
	
	
	
}
