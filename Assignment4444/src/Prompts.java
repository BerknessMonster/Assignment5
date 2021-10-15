import java.util.Scanner;

public class Prompts {
	Scanner promptScanner = new Scanner(System.in);
	private static String promptUsernameUpdate() {
		System.out.println("Which user would you like to login as? (Type in a valid username)");
		String usernameToUpdate = promptScanner.nextLine();
		return usernameToUpdate;
	}

	private static void promptUpdateName(User loggedInUser) {
		System.out.println("Please type in your new name: ");
		String name = promptScanner.nextLine();
		loggedInUser.setName(name);
	}

	private static void promptUpdatePassword(User loggedInUser) {
		System.out.println("Please type in your new password: ");
		String password = promptScanner.nextLine();
		loggedInUser.setPassword(password);
	}

	private static void promptUpdateUsername(User loggedInUser) {
		System.out.println("Please type in your new username: ");
		String username = promptScanner.nextLine();
		loggedInUser.setUsername(username);
	}

	private static int promptOptions(User loggedInUser) {
		System.out.println("................");
		System.out.println("Please choose from the following options:");
		if (loggedInUser instanceof SuperUser) {
			System.out.println("(0) Log in as another user ");
		}
		System.out.println("(1) Update username");
		System.out.println("(2) Update password");
		System.out.println("(3) Update name");
		System.out.println("(4) Exit");
		String option = promptScanner.nextLine();
		
	}

}