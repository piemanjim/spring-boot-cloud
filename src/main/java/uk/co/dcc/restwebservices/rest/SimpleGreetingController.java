package uk.co.dcc.restwebservices.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import uk.co.dcc.restwebservices.model.GreetingBean;

@RestController
public class SimpleGreetingController {
	
	// Simple string
	@GetMapping("/hello-user")
	public String getGreeting() {
		return "Hello User!";
	}
	
	// Complex bean
	@GetMapping("/hello-user-bean")
	public GreetingBean getGreetingBean() {
		return new GreetingBean("Welcome, User!");
	}
	
	// Path variable
	@GetMapping("/hello-user/{name}")
	public GreetingBean getGreetingBean(@PathVariable String name) {
		return new GreetingBean(String.format("Welcome, %s", name));
	}

}
