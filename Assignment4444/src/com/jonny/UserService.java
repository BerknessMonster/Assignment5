package com.jonny;
//////clean up args going in and out, be paranoid, make sure im consuming what im returning. Should I be passing everthing in, or not? Create at the last minute toi avoid multipole copies

import java.util.Scanner;

public class UserService {
	public User inputsAndComparingUserByUsernameAndPassword(User[] users) {
		Scanner scanner = new Scanner(System.in);
		String userInputEmail;
		String userInputPassword;

		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				System.out.println("Too many attempts, you are locked out.");
				System.exit(i);
			} else {
				System.out.println("Enter your email");
				userInputEmail = scanner.next();
				System.out.println("Enter your password");
				userInputPassword = scanner.next();
				for (User user : users) {
					System.out.println(user);
					if (userInputEmail.equalsIgnoreCase(user.getUsername()) && userInputPassword.equals(user.getPassword())) {
						System.out.println("Welcome " + user.getName());
						////not working above////Reads all users as last user.
					}
					User loggedInUser = new User();
					user = loggedInUser; 
					return user;
				}
			}
		}
		return null;
	}
}
