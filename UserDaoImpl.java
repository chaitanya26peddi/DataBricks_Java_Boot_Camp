package com.ums.dao.impl;
import java.util.Scanner;
import com.ums.dao.UserDAO;
import com.ums.model.User;

public class UserDaoImpl implements UserDAO {
	private static User[] addUsers= null;
	Scanner sc = new Scanner(System.in);

	@Override
	public void register() {
		// TODO Auto-generated method stub
		addUsers = new User[3];
		for(int i=0;i<3;i++ ) {
		System.out.println("\nEnter the user id:");
		int id = sc.nextInt();
		System.out.println("\nEnter the user first name:");
		String firstName = sc.next();
		System.out.println("\nEnter the user last name:");
		String lastName = sc.next();
		System.out.println("\nEnter the user email:");
		String emailName = sc.next();
		System.out.println("\nEnter the user user name:");
		String userName = sc.next();
		System.out.println("\nEnter the user password:");
		String password = sc.next();
		User us = new User(id,firstName,lastName,emailName,userName,password);
		addUsers[i] = us;
		System.out.println("\nuser registered successfully");
		}

	}

	@Override
	public boolean verifyUserNameAndPassword(String uname, String password) {
		// TODO Auto-generated method stub
		if(addUsers!=null) {
			for(User usc: addUsers) {
				if(usc!=null) {
					if(usc.getUserName().equals(uname) && usc.getPassword().equals(password)) {
						System.out.println("\nthe user name and password matches\n verification successful ");
						return true;
					}
						
				}
			}
		}
		System.out.println("\nInvalid Credentials");
		return false;
		
	}

	@Override
	public String forgotPassword(String uname) {
		// TODO Auto-generated method stub
		
		if(addUsers!=null) {
			boolean userFound = false;
			for (User usc : addUsers) {
				if(usc!=null) {
					if(usc.getUserName().equals(uname)) {
						System.out.println("\nThe passowrd is:"+ usc.getPassword());
						userFound=true;
					}
				}
			}
			if(!userFound) 
				System.out.println("\nInvalid Credentials");
		}
		else
	        System.out.println("\nNo users registered.");
		return null;
	}

}
