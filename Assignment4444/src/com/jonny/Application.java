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
					String userInfo;
					userInfo.split(lineBeingRead);
					 user.setName(lineBeingRead);
					System.out.println(user.getName());
				}	
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not read");
			e.printStackTrace();
		}
	}

}