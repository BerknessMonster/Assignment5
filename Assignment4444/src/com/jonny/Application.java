package com.jonny;

import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Application {

	public static void main(String[] args) throws IOException {
		User[] users = new User[20];
		String lineBeingRead = "";
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("users.txt"));
			for(User user : users) {
			 user = new User();
				while ((lineBeingRead = bufferedReader.readLine()) != null) {
					String[] usersSplit = new String[4];
				//	String[] usersSplit = line.split(" , ");
				//	if (usersSplit.equals(lineBeingRead[4]));
					String userInfo;
					userInfo.split(lineBeingRead);
				//	userInfo.split(", ");
				//	lineBeingRead.split(userInfo);
					 user.setName(lineBeingRead);
					System.out.println(user.getName());
				}	
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not read");
			e.printStackTrace();
		}
			finally {
				if (bufferedReader != null)
					bufferedReader.close();
			}
	}
//	 String promptUsernameToUpdate() {
//		System.out.println("Which user would you like to login as? (Type in a valid username)");
//		String usernameToUpdate = scanner.nextLine();
//		return usernameToUpdate;
//	}
//
//	 promptUpdateName(User loggedInUser) {
//		System.out.println("Please type in your new name: ");
//		String name = scanner.nextLine();
//		loggedInUser.setName(name);
//	}
//
//	promptUpdatePassword(User loggedInUser) {
//		System.out.println("Please type in your new password: ");
//		String password = scanner.nextLine();
//		loggedInUser.setPassword(password);
//	}
//
//	 promptUpdateUsername(User loggedInUser) {
//		System.out.println("Please type in your new username: ");
//		String username = scanner.nextLine();
//		loggedInUser.setUsername(username);
//	}
//
//	 int promptOptions(User loggedInUser) {
//		System.out.println("----------");
//		System.out.println("Please choose from the following options:");
//		if (loggedInUser instanceof SuperUser) {
//			System.out.println("(0) Log in as another user ");
//		}
//		System.out.println("(1) Update username");
//		System.out.println("(2) Update password");
//		System.out.println("(3) Update name");
//		System.out.println("(4) Exit");
//		String option = scanner.nextLine();
//		
//		return Integer.parseInt(option);
//	}
}