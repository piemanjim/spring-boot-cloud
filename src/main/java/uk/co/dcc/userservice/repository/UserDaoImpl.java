package uk.co.dcc.userservice.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import uk.co.dcc.userservice.repository.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	private static List<User> users = new ArrayList<User>();
	private static int userCount = 4;
	
	static {
		users.add(new User(1, "John", new Date()));
		users.add(new User(2, "Bob", new Date()));
		users.add(new User(3, "Steve", new Date()));
		users.add(new User(4, "Dave", new Date()));
	}
	
	@Override
	public List<User> findAll() {
		return users;
	}
	
	@Override
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	@Override
	public User findOne(int id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
