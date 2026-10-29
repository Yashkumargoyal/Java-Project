package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "course")
public class Course {
	
	@Id
	private Long id; 
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "author")
	private String author; 
	
	public Course() {
		
	}
	
	public Course(Long id, String first, String second) {
		super();
		this.id = id;
		this.name = first;
		this.author = second;
	}

	@Override
	public String toString() {
		return "Course id ->" + id + " name ->" + name + " author ->" + author;
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirst() {
		return name;
	}
	public void setFirst(String first) {
		this.name = first;
	}
	
	public String getSecond() {
		return author;
	}
	public void setSecond(String second) {
		this.author = second;
	}
	

}
