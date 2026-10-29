package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.TodoModel;

@Repository
public interface TodoJpaRepo extends JpaRepository<TodoModel, Long> {

	
	// in order to use pre-defined functions of spring data JPA, we make use of JpaRepository now
	// notice here in this interface we have not defined any function 
	// <model class name, primary key data type> -> format to be followed
	
	// Hibernate vs JPA (jakarta persistence API) ->
	// JPA is interface -> defines specifications, 1. hibernate implements JPA, another example - 2. Toplink also implements JPA
	
	// so same annotation -> @Entity -> we can get by JPA or by Hibernate
	
	// but we can add our own custom methods also, as add-on in this interface, but follow naming conventions
	// notice that we have defined custom methods but we have not defined them, since then only its in interface
	
	
	List<TodoModel> findByUsername(String username);
	
	
}
