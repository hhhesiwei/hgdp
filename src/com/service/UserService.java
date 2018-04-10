package com.service;

import com.dao.UserDAO;
import com.entity.User;

public class UserService {
	//使用UserDAO的对象作为UserService的属性
	private UserDAO userDAO;
	
	public void addUser(User user){
		userDAO.addUser(user);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
