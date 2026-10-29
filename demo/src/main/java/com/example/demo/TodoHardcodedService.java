package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.TodoModel;

@Service
public class TodoHardcodedService {
	
	// this class will give list of Todos in hardcoded way. We can also use Database also in place of this class. 
	// this class is used as @Service and not @Component. Notice that this class dont have any REST mapping getting called.
	
	private static List<TodoModel> todos = new ArrayList<>();
	private static Long idCount = 0l;
	
	static {
		todos.add(new TodoModel(++idCount, "Yash", "Java Developer", new Date(), false));
		todos.add(new TodoModel(++idCount, "Raj", "Angular Developer", new Date(), true));
		todos.add(new TodoModel(++idCount, "Tarun", "Python Developer", new Date(), false));
	}
	
	public List<TodoModel> findAll(){
		
		return todos;
		
	}
	
	public TodoModel deleteById(Long id) {
		
		System.out.println("The id that was sent -->" + id);
		TodoModel todo = findById(id);
		if(todo == null) { return null; }
		todos.remove(todo);
		return todo;
		
	}

	public TodoModel findById(Long id) {
		
		for(TodoModel todoCheck : todos) {
			if (todoCheck.getId() == id) {
				return todoCheck;
			}
		}
		return null;
		
	}

	// below code was done for practice on 10 Oct 2026 only -->
	
	public TodoModel createNewTodo(String username, String description, Boolean isDone) {
		
		TodoModel newTodo = new TodoModel(++idCount, username, description, new Date(), isDone);
		todos.add(newTodo);
		return newTodo;
	
	}

	public TodoModel updateTodo(Long id, String username, String description, Boolean isDone) {
		
		System.out.println("The id that was sent -->" + id);
		TodoModel todo = findById(id);
		if(todo == null) { return null; }
		todo.setUsername(username);
		todo.setDescription(description);
		todo.setDone(isDone);
		return todo;
		
	}
	
	// above code was done for practice on 10 Oct 2026 only -->
	
	
	public TodoModel save (TodoModel todo) {
		
		if(todo.getId()==-1 || todo.getId()==0) {			// if todo is not found out
			todo.setId(++idCount);
			todos.add(todo);
		} else {						// if todo is found out
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
		
	}
	
	
	

}
