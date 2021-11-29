package com.jonny;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

public class WritingToFiles {
	public void writeToFile(User[] users) {
		BufferedWriter writer = null;
		UserService userServiceWritingToFiles = new UserService();
		try {
			writer = new BufferedWriter(new FileWriter(FileInterface.standardFileName));

			for (User user : users) {

				writer.write(userServiceWritingToFiles.getCurrentUser(user));
				if (user.getRole().equals("super_user")) {
				Arrays.sort(users);
				System.out.println(user);
				System.out.println("--------");
				user.compareTo(user);
				System.out.println(user);}
				else {
					Arrays.sort(users);
					System.out.println(user);
					user.compareTo(user);
					System.out.println(user);
				}
			}
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}
}
