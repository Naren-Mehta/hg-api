package com.hg.service;

import org.springframework.stereotype.Service;

import com.hg.domain.User;
import java.util.*;

@Service
public class UserService {

	
	private List<User> userList= new ArrayList<User>(Arrays.asList(
		new User(1,"Naren","M","naren@gmail.com","1234567890",true),
		new User(2,"Deepak","K","deepak@gmail.com","1234567890",true),
		new User(3,"Hemraj","M","hemraj@gmail.com","1234567890",true),
		new User(4,"Prema","H","prema@gmail.com","1234567890",true)
	));
	
	public List<User> getAllUsers(){
		return userList;
	}
	
	public User getUser(Integer userId){
		return userList.stream().filter(u -> u.getUserId().equals(userId)).findFirst().get();
	}
	
	public void addUser(User user) {
		userList.add(user);
		System.out.println(userList);
	}
	
	public void updateUser(User user, Integer userId) {
		for(int i=0;i<userList.size();i++) {
			User u= userList.get(i);
			if(userList.get(i).getUserId().equals(userId)) {
				userList.set(i, user);
				return;
			}
		}
	}
	
	public void deleteUser(Integer userId) {
		
		userList.removeIf(u -> u.getUserId().equals(userId));
		
	}
	
}
