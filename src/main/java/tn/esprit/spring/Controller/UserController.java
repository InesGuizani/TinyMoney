package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Services.Interfaces.UserServices;
import tn.esprit.spring.entities.User;

@RestController


public class UserController {
	
		@Autowired
		UserServices userService;
			
		// URL : http://localhost:8081/SpringMVC/getAllUserNamesJPQL
	    @GetMapping("getAllUserNamesJPQL")
	    public List<User> getNomsUserJPQL() {			
			return userService.retrieveAllUsers();
		}
	    
	    
	   
	    @GetMapping("retrieve-user/{user-id}")
	    public User retrieveUser(@PathVariable("user-id") Long userId) {
	    return userService.retrieveUser(userId);
	    } 
	    
	    
	    
		@PostMapping("/addUser")
		public User addUser(@RequestBody User user)
			{userService.addUser(user);
			return user;
			}
		
		
	

}
