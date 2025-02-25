package com.ums.client;

import java.util.Scanner;
import com.ums.dao.impl.*;
public class UserClient {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserDaoImpl daoImpl = new UserDaoImpl();
		while(true) {
			System.out.println("\n====================================================================");
			System.out.println("\n							1)Register a user						");
			System.out.println("\n						2)Verify user name and password						");
			System.out.println("\n							3)Forgot password						");
			System.out.println("\n								4)Exit							");
		
			System.out.println("\n====================================================================");
			System.out.println("\nEnter a choice number");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				daoImpl.register();
				break;
			case 2:
				System.out.println("\nEnter user name you want to verify:");
				String uname = sc.next();
				System.out.println("\nEnter password you want to verify:");
				String password = sc.next();
				daoImpl.verifyUserNameAndPassword(uname, password);
				break;
			case 3:
				System.out.println("\nEnter user name for which you forgot password:");
				String usname = sc.next();
				daoImpl.forgotPassword(usname);
				break;
			case 4:
				System.out.println("\nExiting the application \n Thank you");
				System.exit(0);
			}
		}
		


		
		
		

		

	}

}
