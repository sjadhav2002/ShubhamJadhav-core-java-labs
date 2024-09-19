package com.deloitte.lab4.ex1;

public class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getPerson() {
		return "Name: "+name+" Age: "+age;
	}
	
}