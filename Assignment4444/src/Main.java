
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner loginScanner = new Scanner();
	
		User loggedInUser = loggedInUSERnull;
		int loginAttempts = 1;
		while (loggedInUser == null && loginAttempts < 5) {
			System.out.println("Enter your email:");
			String username = loginScanner.nextLine();
			System.out.println("Enter your password: ");
			String password = loginScanner.nextLine();
			
			loggedInUser = userService.getValidUser(username, password);
			if (loggedInUser == null) {
				System.out.println("Invalid login, please try again");
				loginAttempts++;
				if (loginAttempts >= 5) {
					System.out.println("Too many failed login attempts, you are now locked out.");
				}
			}
		}
		
		if (loggedInUser != null) {
			int option = 0;
			while (option != 4) {
				System.out.println("Welcome: " + loggedInUser.getName());
				option = promptOptions(loggedInUser);
				if (option == 0 && "super_user".equals(loggedInUser.getRole())) {
					String usernameToUpdate = promptUsernameToUpdate();
					User userToUpdate = userService.getUserByUsername(usernameToUpdate);
					if (userToUpdate == null) {
						System.out.println("Invalid username.");
					} else {
						loggedInUser = userToUpdate;
					}
				} else if (option == 1) {
					promptUpdateUsername(loggedInUser);
				} else if (option == 2) {
					promptUpdatePassword(loggedInUser);
				} else if (option == 3) {
					promptUpdateName(loggedInUser);
				} else if (option != 4) {
					System.out.println("Invalid input, try again");
				}
			}
			
	
	
}