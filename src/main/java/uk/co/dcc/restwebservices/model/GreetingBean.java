package uk.co.dcc.restwebservices.model;

public class GreetingBean {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	public GreetingBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
