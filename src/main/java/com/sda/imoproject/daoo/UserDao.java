package com.sda.imoproject.daoo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sda.imoproject.dao.entity.User;

@Repository
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public List<User> getAllUsers() {
		Query<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

	public User getUserByUsername(String username) {
		Query<User> query = sessionFactory.getCurrentSession()
				.createQuery("FROM User WHERE username = '" + username + "'");
		return query.uniqueResult();
	}

	public boolean loginUser(String username, String password) {
		boolean login = false;
		Query<String> query = sessionFactory.getCurrentSession()
				.createQuery("SELECT password FROM User WHERE username = '" + username + "'");

		if (password.equals(query.uniqueResult()))
			login = true;

		return login;
	}

	public void deleteUser(User user) {
		sessionFactory.getCurrentSession().delete(user);

	}

	public User getUserById(int id) {
		Query<User> query = sessionFactory.getCurrentSession().createQuery("FROM User WHERE id = '" + id + "'");
		return query.uniqueResult();
	}

}
