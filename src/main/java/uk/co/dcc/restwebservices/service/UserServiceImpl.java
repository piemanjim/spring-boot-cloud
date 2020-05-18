package uk.co.dcc.restwebservices.service;

import org.springframework.stereotype.Service;

import uk.co.dcc.restwebservices.repository.UserDao;

@Service
public class UserServiceImpl {
	
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

}
