package uk.co.dcc.userservice.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import uk.co.dcc.userservice.repository.entity.User;

@Repository
public interface UserDao {
	
	public List<User> findAll();
	
	public User save(User user);
	
	public User findOne(int id);
	
	public User deleteById(int id);
}
