package com.jonny;

import java.util.Scanner;

public class UserService {
	private Scanner scanner = new Scanner(System.in);


	public User inputsAndComparingUserByUsernameAndPassword(User[] users) {
		boolean loggedInUser = false;
		String userInputEmail = null;
		String userInputPassword = null;
		for (int i = 0; i < 6; i++) {
			if (i >= 5) {
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
				return user;
				
			}
			if (loggedInUser == false) {
				System.out.println("Please enter a valid username and password");
			}

		}
		return null;

	}
//   public void loggedInUserPrompts (User users, Scanner scanner, User loggedInUser) {
//    int option = 0;	
//	While (loggedinUser == true && super user == true && option != 4) {
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
//		While (loggedInUser == true && super user = false) {
//		private void updateUsername () {
//	System.out.println("Please type in your new username: ");
//	String username = scanner.nextLine();
//	loggedInUser.setUsername(username);
//	}
	
//		private void updatePassword () {
//	}
//		private void updateName () {
//	}
//		optionExit () {
//	}
//}     
//}
//	//private int loggedInUserPromptOptions(User loggedInUser) {
//	System.out.println("----------");
//	System.out.println("Please choose from the following options:");
//	if (loggedInUser instanceof SuperUser) {
//	  System.out.println("(0) Log in as another user ");
//	}
//	System.out.println("(1) Update username");
//	System.out.println("(2) Update password");
//	System.out.println("(3) Update name");
//	System.out.println("(4) Exit");
//	String option = scanner.nextLine();
//	
//	return Integer.parseInt(option);
//}
}
