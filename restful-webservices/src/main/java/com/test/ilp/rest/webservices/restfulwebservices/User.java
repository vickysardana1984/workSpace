package com.test.ilp.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

public class User {
	
	
	private int id;
	@Size(min=3,message="Min 3 characters required")
	private String name;
	private Date dob;
	private ArrayList<String> posts;
	
	public ArrayList<String> getPosts() {
		return posts;
	}
	public void setPosts(ArrayList<String> posts) {
		this.posts = posts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public User(int id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
