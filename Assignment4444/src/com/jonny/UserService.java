package com.jonny;

import java.util.Scanner;

public class UserService {
	public void inputsAndComparingUserByUsernameAndPassword(User user) {
		Scanner scanner = new Scanner(System.in);
		String userInputEmail;
		String userInputPassword;
		int invalidLoginAttempts = 0;
		String loggedInUser = null;
		if (userInputEmail.equalsIgnoreCase(user.getUsername()) && userInputPassword.equals(user.getPassword())) {
			System.out.println("Welcome " + user.getName());
		} else {
			System.out.println("Please enter a valid username and password");
		invalidLoginAttempts++;
		}

	}

	private void While(boolean b) {
		 while (loggedInUser == null && invalidLoginAttempts <= 5) {
			System.out.println("Enter your email");
			userInputEmail = scanner.next();
			System.out.println("Enter your password");
			userInputPassword = scanner.next();
		 }	
	}

}