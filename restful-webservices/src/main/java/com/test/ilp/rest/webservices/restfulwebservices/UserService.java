package com.test.ilp.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	private static ArrayList<User> users = new ArrayList<User>(10);
	static {
		String post1 = "test 1";
		String post2 = "test2";
		ArrayList<String> posts = new ArrayList<String>();
		posts.add(post1);
		posts.add(post2);
		User user1 = new User(1,"vishal1",new Date());
		user1.setPosts(posts);
		User user2  = new User(2,"vishal2",new Date());
		users.add(user1);
		
		users.add(user2);
	}
	
	public ArrayList<User> getAll(){
		return users;
	}

	public User saveUser(User user) {
		users.add(user);
		return user;
	}
	
	public User deleteUser(int id) {
		User deleteUser = getUser(id);
		users.remove(deleteUser);
		return deleteUser;
	}
	
	public User getUser(int id) {
		User userFound = null;
		for(User user : users) {
			 if(user.getId()==id) {
				 userFound = user;
				 break;
			 }
		}
		if (userFound == null) 
			throw new UserNotFoundException("No user found with this id -- " + id);
		return userFound;
	}
	
	public ArrayList<String> getuserPosts(int userId) {
		ArrayList<String> posts = null;
		User user = getUser(userId);
		if(getUser(userId) !=null) {
			posts= user.getPosts();
			if(posts== null) 
				posts = new ArrayList<String>();
		} else {
			throw new UserNotFoundException("No user found with this id ,hence no posts-- " + userId);
		}
		return posts;
	}
	
	public ArrayList<String> addUserPosts(int userId, String post) {
		ArrayList<String> posts = getuserPosts(userId);
		if (posts !=null) {
			User user = getUser(userId);
			posts.add(post);
			user.setPosts(posts);
			
		} else {
			throw new UserNotFoundException("No user found with this id ,post cannot be added-- " + userId);
		}
		return posts;
	}
}
