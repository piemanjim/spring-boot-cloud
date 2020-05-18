package uk.co.dcc.restwebservices.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import uk.co.dcc.restwebservices.repository.model.User;

@Repository
public interface UserDao {
	
	public List<User> findAll();
	
	public User save(User user);
	
	public User findOne(int id);
}
