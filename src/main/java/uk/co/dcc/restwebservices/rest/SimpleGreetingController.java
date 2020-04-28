package uk.co.dcc.restwebservices.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleGreetingController {
	
	@GetMapping("/hello-user")
	public String getGreeting() {
		return "Hello User!";
	}

}
