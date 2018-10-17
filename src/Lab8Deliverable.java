import java.util.Scanner;

public class Lab8Deliverable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] studentNames = { "Beyonce", "Gaga", "Justin", "Janet", "Sean", "Britney", "Madonna" };
		String[] favoriteFood = { "Pizza", "Tacos", "Thai", "Italian", "Seaford", "Soul Food", "Mexican" };
		String[] studentHomeTown = { "Houston", "New York", "Tennessee", "Gary", "New York", "Tennessee", "Bay City" };
		String cont = "yes";

		System.out.println("Welcome to our Java class. There are " + studentNames.length + " students. They are: ");

		int counter = 0;
		for (int i = 0; i < studentNames.length; i++) {
			System.out.println(++counter + ". " + studentNames[i]);
		}
		System.out.println();

		while (cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("ye")) {
			int userInput = Validator.getInt(scan, "Which student would you like to learn more about?", 1,
					studentNames.length); 	// Prompts user to enter student number and loops as long as they
											// opt to continue

			System.out.println();

			if (userInput > 0 && userInput < studentNames.length) { // user selects from list of students
				System.out.println();
				System.out.println("Student " + (userInput) + " is " + studentNames[userInput - 1]
						+ ". What would you like to know about " + studentNames[userInput - 1]
						+ "? (enter hometown or favorite food):");

				String userInput2 = scan.next();
				if (userInput2.equalsIgnoreCase("h")) { // if user inputs any word beginning with h they get info on
														// hometown.
					System.out.println();
					System.out.println(
							studentNames[userInput - 1] + "'s hometown is " + studentHomeTown[userInput - 1] + ".");
					System.out.println();

					System.out.println("Would you like to know more? (enter yes or no): ");
					System.out.println();
					cont = scan.next();

				} else { // provides info on favorite food instead of hometown
					System.out.println();
					System.out.print(
							studentNames[userInput - 1] + "'s favorite food is " + favoriteFood[userInput - 1] + ".");
					System.out.println();
					System.out.println();
					System.out.println("Would you like to know more?"); // Asks if the user wants to continue
					cont = scan.next();
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("Thanks!");
		{
			scan.close();
		}
	}
}