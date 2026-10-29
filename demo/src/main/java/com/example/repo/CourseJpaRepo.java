package com.example.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class CourseJpaRepo {

	// with JPA -> we map Course model class to Course table in database, we use JPA in this class
	// we use EntityManager to manage the database operations now, and we dont write SQL now 
	// in this class we have defined 3 methods -> insert, deleteById, findById
	// compare classes of CourseJdbcRepo (we write SQL) and CourseJpaRepo (we dont write SQL, we use JPA functions of EntityManager)
	
	// 4 diff. things -> JDBC, spring JDBC (CourseJdbcRepo), JPA (CourseJpaRepo uses EntityManager), spring data JPA (lesser code dont use EntityManager)
	
	
	@PersistenceContext					// @Autowired -> dont use here now
	private EntityManager em;
	
	public void insert(Course c1) {
		em.merge(c1);
	}
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	public void deleteById(Long id) {
		Course courseToBeRemoved = em.find(Course.class, id);
		em.remove(courseToBeRemoved);
	}
	
	
}
