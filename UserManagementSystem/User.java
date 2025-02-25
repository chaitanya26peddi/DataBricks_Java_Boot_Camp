package com.ums.model;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String emailName;
	private String userName;
	private String password;
	public User(int id, String firstName, String lastName, String emailName, String userName, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailName = emailName;
		this.userName = userName;
		this.password = password;
	}
	public User() {
		//default constructor
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailName() {
		return emailName;
	}
	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
