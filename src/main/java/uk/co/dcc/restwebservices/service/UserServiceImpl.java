package uk.co.dcc.restwebservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import uk.co.dcc.restwebservices.repository.UserDao;
import uk.co.dcc.restwebservices.repository.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	public User saveUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User getUserById(int id) {
		return userDao.findOne(id);
	}

}
