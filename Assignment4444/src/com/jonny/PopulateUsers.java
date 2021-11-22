package com.jonny;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PopulateUsers {
	public User[] populateUsersFromFile() throws IOException {
		User[] users = new User[20];
		UserService userService = new UserService();
		String lineBeingRead = "";
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("users.txt"));
			int i = 0;
			while ((lineBeingRead = bufferedReader.readLine()) != null) {
				User user = new User();
				String[] usersSplit = new String[4];
				usersSplit = lineBeingRead.split(",");
				user.setName(usersSplit[2].trim());
				user.setUsername(usersSplit[0].trim());
				user.setPassword(usersSplit[1].trim());
				user.setRole(usersSplit[3].trim());
				users[i] = user;
				i++;
			}
	//		User currentUser = userService.inputsAndComparingUserByUsernameAndPassword(users);

		} catch (FileNotFoundException e) {
			System.out.println("file not read");
			e.printStackTrace();
		} finally {
			if (bufferedReader != null)
				bufferedReader.close();
		}
		// for (User x : users) {
		// System.out.println(x);
		// }
		return users;
	}

/////////////////////////DON'T TOUCH BELOW///////////////////////////////////////////

}