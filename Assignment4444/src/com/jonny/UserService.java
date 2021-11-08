package com.jonny;

import java.util.Scanner;

public class UserService {
	public User inputsAndComparingUserByUsernameAndPassword(User[] users) {
		Scanner scanner = new Scanner(System.in);
		String userInputEmail;
		String userInputPassword;

		for (int i = 0; i < 6; i++)
			if (i == 5) {
				System.out.println("Too many attempts, you are locked out.");
				System.exit(i);
			} else if (i < 6) {
				System.out.println("Enter your email");
				userInputEmail = scanner.next();
				System.out.println("Enter your password");
				userInputPassword = scanner.next();
				for (User user : users) {
					if (userInputEmail.equalsIgnoreCase(user.getUsername()) && userInputPassword.equals(user.getPassword())) {
						System.out.println("Welcome " + user.getName());
						return user;
						User loggedInUser = new User();
						user = loggedInUser;
					}
				} else {
					System.out.println("Invalid login attempt please try again");
				 
				}
			}
		return null;
	}
}
