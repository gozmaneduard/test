package com.sda.imoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sda.imoproject.dao.entity.User;
import com.sda.imoproject.daoo.UserDao;

@Service
@Transactional
public class UserService {
	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private UserDao userDao;

	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Transactional
	public List<User> getAllUsers() {

		return userDao.getAllUsers();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	public boolean loginUser(String username, String pass) {
		return userDao.loginUser(username, pass);

	}

	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
}
