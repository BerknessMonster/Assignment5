package com.jonny;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) throws IOException {
		User[] users = new User[20];
		User user = new User();
		PopulateUsers populateUsers = new PopulateUsers();
		UserService userService = new UserService();
		
		/////////// INSTANTIATIONS///////////////////
		populateUsers.populateUsersFromFile(users, user, userService);
		userService.inputsAndComparingUserByUsernameAndPassword(user);

		
	}
}