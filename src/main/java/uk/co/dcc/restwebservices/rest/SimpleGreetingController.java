package uk.co.dcc.restwebservices.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import uk.co.dcc.restwebservices.model.Greeting;

@RestController
public class SimpleGreetingController {
	
	// Simple string
	@GetMapping("/hello-user")
	public String getGreeting() {
		return "Hello User!";
	}
	
	// Complex bean
	@GetMapping("/hello-user-bean")
	public Greeting getGreetingBean() {
		return new Greeting("Welcome, User!");
	}
	
	// Path variable
	@GetMapping("/hello-user/{name}")
	public Greeting getGreetingBean(@PathVariable String name) {
		return new Greeting(String.format("Welcome, %s", name));
	}

}
