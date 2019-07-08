package com.lti.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeLogic {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("Employee.xml");
		Employee e=(Employee)app.getBean("e1");
		Employee e1=(Employee)app.getBean("e2");
		
		
		
		
       e.display();
       e1.display();
	}

	}


