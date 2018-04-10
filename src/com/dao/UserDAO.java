package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.User;

public class UserDAO {
	private List<User> userList;
	private Map<String,String> map;
	public void addUser(User user){
		System.out.println("Ö´ÐÐÌí¼Ó²Ù×÷");
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
}
