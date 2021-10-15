import java.util.Scanner;

public class Cases {
	Scanner caseScanner = new Scanner(System.in);
	private static String caseUsernameUpdate() {
		System.out.println("Which user would you like to login as? (Type in a valid username)");
		String usernameUpdate = caseScanner.nextLine();
		return usernameUpdate;
	}

	private static void caseUpdateName(User loggedInUser) {
		System.out.println("Please type in your new name: ");
		String name = caseScanner.nextLine();
		loggedInUser.setName(name);
	}

	private static void caseUpdatePassword(User loggedInUser) {
		System.out.println("Please type in your new password: ");
		String password = caseScanner.nextLine();
		loggedInUser.setPassword(password);
	}

	private static void caseUpdateUsername(User loggedInUser) {
		System.out.println("Please type in your new username: ");
		String username = caseScanner.nextLine();
		loggedInUser.setUsername(username);
	}

	private static int caseOptions(User loggedInUser) {
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