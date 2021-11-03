package com.jonny;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PopulateUsers {
	public void PopulateUsersFromFile(User[] users) throws IOException {
		String lineBeingRead = "";
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("users.txt"));
			int i = 0;
			while ((lineBeingRead = bufferedReader.readLine()) != null) {
				i = populateUserArray(users, lineBeingRead, i);
			}
			for (User user : users) {
				//System.out.println(user); this proves users is being read from the file
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not read");
			e.printStackTrace();
		} finally {
			if (bufferedReader != null)
				bufferedReader.close();

		}

	}

/////////////////////////DON'T TOUCH BELOW///////////////////////////////////////////
	private static int populateUserArray(User[] users, String lineBeingRead, int i) {
		String[] usersSplit = new String[4];
		User user = new User();
		usersSplit = lineBeingRead.split(",");
		user.setName(usersSplit[2].trim());
		user.setUsername(usersSplit[0].trim());
		user.setPassword(usersSplit[1].trim());
		user.setRole(usersSplit[3].trim());
		users[i] = user;
		i++;
		return i;
	}
}