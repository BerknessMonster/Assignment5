package com.jonny;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) throws IOException {
		PopulateUsers populateUsers = new PopulateUsers();
		boolean loggedInUserBoolean = false;
		UserService userService = new UserService();
		/////////// INSTANTIATIONS///////////////////
		User[] users = populateUsers.populateUsersFromFile();		
		User loggedInUser = userService.inputsAndComparingUserByUsernameAndPassword(users);
		Integer option =  userService.loggedInUserPromptOptions(loggedInUser,loggedInUserBoolean, loggedInUser);
		
		
		
	}
}