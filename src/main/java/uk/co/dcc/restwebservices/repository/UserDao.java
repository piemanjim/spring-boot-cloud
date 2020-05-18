package uk.co.dcc.restwebservices.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import uk.co.dcc.restwebservices.model.User;

@Repository
public class UserDao {

	private static List<User> users = new ArrayList<User>();
	private static int userCount = 4;
	
	static {
		users.add(new User(1, "John", new Date()));
		users.add(new User(2, "Bob", new Date()));
		users.add(new User(3, "Steve", new Date()));
		users.add(new User(4, "Dave", new Date()));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
