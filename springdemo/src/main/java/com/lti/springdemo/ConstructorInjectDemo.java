package com.lti.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectDemo {
public static void main(String[] args) {
         String s="She Sells Sea Shells on the Sea Shore";	
	
	ApplicationContext apcon=new ClassPathXmlApplicationContext("Country.xml");
	Country countryBean=(Country) apcon.getBean("c1");
	System.out.println("Displaying data from Business Component");
	System.out.println("Country Name"+countryBean.getName());
	System.out.println("Country Population"+countryBean.getPopulation());
	
	System.out.println("Displaying from Client App");
	System.out.println(s);
	
} 
}
