package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac
		 = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		User user  //= ac.getBean(User.class);
				= (User) ac.getBean("user2");
		user.say();
	
	
	
	}

}
