package com.lti.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext appCon=new ClassPathXmlApplicationContext("StudentConfig.xml");
      StudentBean factory=(StudentBean)appCon.getBean("Stubean");
      factory.display();
    }
}



