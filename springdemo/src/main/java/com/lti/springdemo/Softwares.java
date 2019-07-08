package com.lti.springdemo;

import java.util.List;

public class Softwares {
 String softwareName;
 List<String> listOfLang;
public String getSoftwareName() {
	return softwareName;
}
public void setSoftwareName(String softwareName) {
	this.softwareName = softwareName;
}
public List<String> getListOfLang() {
	return listOfLang;
}
public void setListOfLang(List<String> listOfLang) {
	this.listOfLang = listOfLang;
}
 public void printListOfLanguages()
 {
	 System.out.println("Programming Languages: ");
	 for(String pl: listOfLang)
	 {
		 System.out.println(pl);
	 }
 }
}
