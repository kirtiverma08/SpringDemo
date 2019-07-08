package com.lti.springdemo;

public class StudentBean {
	String name;
	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Hello:"+name);
		System.out.println("HAI:"+city);
	}

}
