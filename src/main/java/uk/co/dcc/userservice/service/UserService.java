package uk.co.dcc.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import uk.co.dcc.userservice.repository.entity.User;


@Service
public interface UserService {
	
	List<User> getAllUsers();
	
	User saveUser(User user);
	
	User getUserById(int id);

}
