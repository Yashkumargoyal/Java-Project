package com.example.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Course;

@Repository
public class CourseJdbcRepo {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	// in this class we have defined 3 methods -> insert, deleteById, findById
	// notice below that we directly run SQL so there is no need of model class currently.
	// compare classes of CourseJdbcRepo (we write SQL) and CourseJpaRepo (we dont write SQL, we use JPA functions of EntityManager)
	
	private static String INSERT_QUERY = 
			"""
			insert into course (id, name, author) values (1, 'Yash', 'Same as this') ;
			""";
	
	// notice below that we dont directly run SQL so there is need of model class currently.
	private static String INSERT_QUERY2 = 
			"""
			insert into course (id, name, author) values (?, ?, ?) ;
			""";
	
	private static String DELETE_QUERY = 
			"""
			delete from course where id = ? ;
			""";
	
	private static String SELECT_QUERY = 
			"""
			select * from course where id = ? ;
			""";
	
	public void insert(Course c1) {
//		springJdbcTemplate.update(INSERT_QUERY);
		springJdbcTemplate.update(INSERT_QUERY2, c1.getId(), c1.getFirst(), c1.getSecond());
	}
	
	public void deleteById(Long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(Long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
		// we need to map result set of SQL into Bean with help of row mapper
	}
	

}
