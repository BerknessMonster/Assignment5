package com.jonny;

import java.util.Scanner;

public class UserService {
	public User inputsAndComparingUserByUsernameAndPassword(User[] users, boolean loggedInUser) {
		Scanner scanner = new Scanner(System.in);
		String userInputEmail;
		String userInputPassword;
		boolean loggedInUser = false;

	final User findLoggedInUser(User[] users, Scanner scanner, boolean loggedInUser) {
		String userInputEmail = null;
		String userInputPassword = null;
		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				System.out.println("Too many attempts, you are locked out.");
				System.exit(i);
			} else {
				System.out.println("Enter your email");
				userInputEmail = scanner.next();
				System.out.println("Enter your password");
				userInputPassword = scanner.next();
			}
			for (User user : users) {
				if (userInputEmail.equalsIgnoreCase(user.getUsername()) && userInputPassword.equals(user.getPassword()))
					System.out.println("Welcome " + user.getName());
				loggedInUser = true;
				break;

			}
			if (loggedInUser = false) {
				System.out.println("Please enter a valid username and password");
			}

		}
		return null;

//return findLoggedInUser(users, scanner, loggedInUser); {
//	While (LoggedinUser == true && super user == true) {
//		give super prompts..
//		private void loginAsAnotherUser () {
//		System.out.println("Who would you like to login as?");
//		
//	}
//		private void updateUsername () {
//		System.out.println("What would you like your new username to be?");
//	}
//		private void updatePassword () {
//		System.out.println("What would you like your new password to be?");
//	}
//		private void updateName () {
//		System.out.println("What would you like your new name to be?");
//	}
//		optionExit () {
//		System.exit
//	}
//
//		else if (loggedInUser == true && super user = false) {
//		private void updateUsername () {
//	}
//		private void updatePassword () {
//	}
//		private void updateName () {
//	}
//		optionExit () {
//	}
//}     
//}
	}
}