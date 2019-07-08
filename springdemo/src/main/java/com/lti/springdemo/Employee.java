package com.lti.springdemo;

public class Employee {
 private int id;
 private String name;
 private Address address;
public Employee(int id, String name) {
	
	this.id = id;
	this.name = name;
}
public Employee(int id, String name, Address address) {
	
	this.id = id;
	this.name = name;
	this.address = address;
}
 void display()
 {
	 System.out.println(id+" "+name);
	 System.out.println(address);
 }
}
