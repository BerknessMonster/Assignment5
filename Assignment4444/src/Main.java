
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static User[] users = new User[20];
	private static UserService userService = new UserService();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("src/users.txt"));

			String line = null;
			int i = 0;
			while ((line = reader.readLine()) != null) {
				String[] values = line.split(", ");
				if ("super_user".equals(values[3])) {
					users[i++] = new SuperUser(values[0], values[1], values[2]);
				} else {
					users[i++] = new NormalUser(values[0], values[1], values[2]);
				}
			}

		} finally {
			if (reader != null)
				reader.close();
		}
		
		User loggedInUser = null;
		int loginAttempts = 1;
		while (loggedInUser == null && loginAttempts < 5) {
			System.out.println("Enter your email:");
			String username = scanner.nextLine();
			System.out.println("Enter your password: ");
			String password = scanner.nextLine();

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
				option = UserClientChoices.choiceOptions(loggedInUser);
				if (option == 0 && "super_user".equals(loggedInUser.getRole())) {
					String usernameToUpdate = UserClientChoices.choicesUsernameUpdate();
					User userToUpdate = userService.getUserByUsername(usernameToUpdate);
					if (userToUpdate == null) {
						System.out.println("Invalid username.");
					} else {
						loggedInUser = userToUpdate;
						return;
					}
				} else if (option == 1) {
					UserClientChoices.choicesUpdateUsername(loggedInUser);
				} else if (option == 2) {
					UserClientChoices.choicesUpdatePassword(loggedInUser);
				} else if (option == 3) {
					UserClientChoices.choicesUpdateName(loggedInUser);
				} else if (option != 4) {
					System.out.println("Invalid input, try again");
				}
			}
		}
	}
}
