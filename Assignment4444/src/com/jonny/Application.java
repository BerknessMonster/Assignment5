package com.jonny;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) throws IOException {
		User[] users = new User[20];
		User user = new user();
		PopulateUsers populateUsers = new PopulateUsers();
		Scanner scanner = new Scanner(System.in);
		String userInputEmail;
		String userInputPassword;
		///////////INSTANTIATIONS///////////////////
		populateUsers.PopulateUsersFromFile(users);
		
		
		
		System.out.println("Welcome");
		System.out.println("Enter your email");
		userInputEmail = scanner.next();
		System.out.println("Enter your password");
		userInputPassword = scanner.next();
		if (userInputEmail.equalsIgnoreCase(user.getUsername())) {
			System.out.println("Welcome" + user.getName());
		}
		
		
		
		
	}
}