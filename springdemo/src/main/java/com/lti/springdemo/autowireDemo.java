package com.lti.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowireDemo {

	public static void main(String[] args) {

		ApplicationContext app=new ClassPathXmlApplicationContext("account.xml");
	   UserAccountService u;
	   u=(UserAccountService) app.getBean("userAccountService");
	   System.out.println(u.getName());
	   System.out.println(u.getDesc());
	   System.out.println(u.getDetails());
	   
	}

}
