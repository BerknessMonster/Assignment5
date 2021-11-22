package com.jonny;

import java.util.Scanner;

public class UserService<user> {
	private Scanner scanner = new Scanner(System.in);
	User currentUser = new User();

	public User inputsAndComparingUserByUsernameAndPassword(User[] users) {
		boolean loggedInUserBoolean = false;
		String userInputEmail = null;
		String userInputPassword = null;
		for (int i = 0; i < 6; i++) {
			if (i >= 5) {
				System.out.println("Too many attempts, you are locked out.");
				System.exit(i);
			} else {
				System.out.println("Enter your email");
				userInputEmail = scanner.nextLine();
				System.out.println("Enter your password");
				userInputPassword = scanner.nextLine();
			}
			for (User user : users) {
				if (userInputEmail.equalsIgnoreCase(user.getUsername()) && userInputPassword.equals(user.getPassword()))
					System.out.println("Welcome " + user.getName());
				loggedInUserBoolean = true;
				user = currentUser;
				return currentUser;

			}
			if (loggedInUserBoolean == false) {
				System.out.println("Please enter a valid username and password");
			}

		}
		return null;

	}

	private void updateUsername(User loggedInUser) {
		System.out.println("What would you like your new username to be?");
		String username = scanner.nextLine();
		((User) loggedInUser).setUsername(username);
	}
	private void chooseAnotherUserToLoginAs(User loggedInUser) {
		System.out.println("Who would you to login as?");
		String username = scanner.nextLine();
	}

	private void updatePassword(User loggedInUser) {
		System.out.println("What would you like your new password to be?");
		String password = scanner.nextLine();
		((User) loggedInUser).setPassword(password);
	}

	private void updateName(User loggedInUser) {
		System.out.println("What would you like your new name to be?");
		String name = scanner.nextLine();
		((User) loggedInUser).setName(name);
	}

	public int loggedInUserPromptOptions(User loggedInUser, boolean loggedInUserBoolean) {
		String option = "";
		if (loggedInUserBoolean = true) {
			System.out.println("----------");
			System.out.println("Please choose from the following options:");
			if (loggedInUser instanceof SuperUser) {
				System.out.println("(0) Log in as another user ");
			}
			System.out.println("(1) Update username");
			System.out.println("(2) Update password");
			System.out.println("(3) Update name");
			System.out.println("(4) Exit");
			option = scanner.nextLine();
			if (option.trim().equals("")) {
				throw new RuntimeException("throwing runtime excpetion");
			} else if (Integer.parseInt(option) == 0) {

			} else if (Integer.parseInt(option) == 1) {
				updateUsername(loggedInUser);
			} else if (Integer.parseInt(option) == 2) {
				updatePassword(loggedInUser);
			} else if (Integer.parseInt(option) == 3) {
				updateName(loggedInUser);
			} else if (Integer.parseInt(option) == 4) {
				System.out.println("See you next time");
			}
		}
		return Integer.parseInt(option);

	}

}