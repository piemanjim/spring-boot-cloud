package uk.co.dcc.restwebservices.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import uk.co.dcc.restwebservices.repository.model.User;
import uk.co.dcc.restwebservices.service.UserService;

@RestController
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	// GET /users
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	// GET /users/{id}
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}
}
