package com.test.ilp.rest.webservices.restfulwebservices;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class MyFirstController {
		
		@Autowired
		private UserService userService ;
		@GetMapping("/hello")
		public String displayHello() {
			return "test";	
		}
		
		@GetMapping(path="/helloBean/{name}")
		public HelloWorldBean getBean(@PathVariable String name) {
			return new HelloWorldBean("vishal"+name, new Date());
		}
		
//		@GetMapping(path="/helloBean",params= {name})
//		public HelloWorldBean getBean(@PathVariable String names[]) {
//			String completeName = null;
//			for(String name : names)
//				completeName=completeName + name;
//			return new HelloWorldBean("vishal"+completeName, new Date());
//		}
		
		
		@GetMapping(path="/users")
		public ArrayList<User> getAllUsers() {
			return userService.getAll();			 
		}
		
//Save without returning any status (200)
//		@PostMapping("/user")
//		public void saveUser(@RequestBody User user) {
//			userService.saveUser(user);	
//		}
//		

		//Save and return the saved user url
		@PostMapping("/user")
		public ResponseEntity<Object> saveUser(@Valid @RequestBody User user) {
			User userReturned = userService.saveUser(user);	
			URI uri = null;
			//Append Id string to the curent request and also add the id into it.
			uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userReturned.getId()).toUri();
			return ResponseEntity.created(uri).build();
			
		}
		
		@GetMapping("/users/{id}")
		public  Resource<User> getSpecificUser(@PathVariable int id) {
			User user = userService.getUser(id);
			Resource<User> resource = new Resource<User>(user);
			ControllerLinkBuilder linkTo = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getAllUsers());
			resource.add(linkTo.withRel("all-users"));
			return resource; 
			
		}
		
		@PostMapping("/users/{id}/Addposts")
		public ResponseEntity<Object> addSpecificUserPosts(@PathVariable int id, @RequestBody String post) {
			userService.addUserPosts(id, post);
			//How to add multiple uri
			URI uri = null;
			//
			uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{abc}").buildAndExpand("getPosts").toUri();
			System.out.println(uri.toString());
			return ResponseEntity.created(uri).build();
		}
		
		@GetMapping("/users/{id}/getPosts")
		public  ArrayList<String> getSpecificUserPosts(@PathVariable int id) {
			ArrayList<String> posts = userService.getUser(id).getPosts();
			Resource<ArrayList<String>> resource = new Resource<>(posts);
//			ControllerLinkBuilder linkTo = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getAllUsers());
//			resource.add(linkTo.withRel("all-users"));
			return posts; 
			
		}
		
		@PostMapping("/deleteuser/{id}")
		public ResponseEntity<Object> deleteUser(@PathVariable int id) {
			URI uri = null;
			//Append Id string to the curent request and also add the id into it.
			uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").build(uri);
			return ResponseEntity.created(uri).build();
			
		}
		
}
