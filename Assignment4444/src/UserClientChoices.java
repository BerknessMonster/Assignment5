import java.util.Scanner;
/////get out of static
/////change name from cases to something easier to understand

public class UserClientChoices {
	private static Scanner choicesScanner = new Scanner(System.in);

	public static String choicesUsernameUpdate() {
		System.out.println("Which user would you like to login as? (Type in a valid username)");
		String usernameUpdate = choicesScanner.nextLine();
		return usernameUpdate;
	}

	public static void choicesUpdateName(User loggedInUser) {
		System.out.println("Please type in your new name: ");
		String name = choicesScanner.nextLine();
		loggedInUser.setName(name);
	}

	public static void choicesUpdatePassword(User loggedInUser) {
		System.out.println("Please type in your new password: ");
		String password = choicesScanner.nextLine();
		loggedInUser.setPassword(password);
	}

	public static void choicesUpdateUsername(User loggedInUser) {
		System.out.println("Please type in your new username: ");
		String username = choicesScanner.nextLine();
		loggedInUser.setUsername(username);
	}

	public static int choiceOptions(User loggedInUser) {
		System.out.println("................");
		System.out.println("Please choose from the following options:");
		if (loggedInUser instanceof SuperUser) {
			System.out.println("(0) Log in as another user ");
		}
		System.out.println("(1) Update username");
		System.out.println("(2) Update password");
		System.out.println("(3) Update name");
		System.out.println("(4) Exit");
		Integer option = choicesScanner.nextInt();
		
		return option;

	}

}
