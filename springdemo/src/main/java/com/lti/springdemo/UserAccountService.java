package com.lti.springdemo;

public class UserAccountService {
private String name;
private String desc;
private String details;

public UserAccountService() {
	
	this.name = "Raj";
	this.desc = "Account is activated for equity trading with enough funds.";
	this.details ="PPPP0.00";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}




}


