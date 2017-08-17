package com.zhaolei.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhaolei.model.User;
import com.zhaolei.service.UserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("spring.xml");

		UserService us = (UserService) a.getBean("userServiceImpl");
		User u = new User();
		u.setEmail("11");
		u.setName("aa");
		u.setPassword("sdsd");
		u.setNickName("sss");
		u.setRegDate(new Date());
		System.out.println(u);
		us.save(u);
	}

}
