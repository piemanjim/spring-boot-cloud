package uk.co.dcc.restwebservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import uk.co.dcc.restwebservices.repository.model.User;


@Service
public interface UserService {
	
	List<User> getAllUsers();
	
	User saveUser(User user);
	
	User getUserById(int id);

}
