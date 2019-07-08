package com.lti.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjection {

	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("country.xml");
		Softwares soft=(Softwares)app.getBean("s1");
       soft.printListOfLanguages();
	}

}
