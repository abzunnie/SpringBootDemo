package com.example.demo;

public class User 
{
	public User(String name, int age, String emailID) {
		super();
		this.name = name;
		this.age = age;
		this.emailID = emailID;
	}
	private String name;
	private int age;
	private String emailID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	

}
