package com.service;

import com.dao.UserDAO;
import com.entity.User;

public class UserService {
	//ʹ��UserDAO�Ķ�����ΪUserService������
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
