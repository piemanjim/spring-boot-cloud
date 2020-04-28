package uk.co.dcc.restwebservices.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.co.dcc.restwebservices.model.GreetingBean;

@RestController
public class SimpleGreetingController {
	
	@GetMapping("/hello-user")
	public String getGreeting() {
		return "Hello User!";
	}
	
	@GetMapping("/hello-user-bean")
	public GreetingBean getGreetingBean() {
		return new GreetingBean("Welcome, User!");
	}

}
