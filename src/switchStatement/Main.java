package switchStatement;

public class Main {

	public static void main(String[] args) {

		int value = 3;

		if (value == 1) {
			System.out.println("Value was 1");
		} else if (value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("Value was not 1 or 2");
		}

		int switchValue = 1;

		switch (switchValue) {
			case 1 -> System.out.println("Value was 1");
			case 2 -> System.out.println("Value was 2");
			case 3, 4, 5 -> System.out.println("Value was 3, 4, or 5");
			default -> System.out.println("Value was not 1-5");
		}

		// Create a new switch statement using char instead of int
		// Create a new char variable
		// Create a switch statement testing for A-E
		// Display a message if any are found
		// Add a default displaying message "not found"

		char character = 'A';

		switch (character) {
			case 'A', 'B', 'C', 'D', 'E' -> System.out.println("Got one!");
			default -> System.out.println("Not found");
		}

		// We can now do switches on String. Cool.
		
		String month = "January";
		
		// We can use .toLowerCase() to match easier
		switch (month.toLowerCase()) {
			case "january" -> System.out.println("Jan");
			case "february" -> System.out.println("Feb");
			case "march", "april", "may" -> System.out.println("One of the other first few");
			default -> System.out.println("Nah not up to May");
		}
		// Calling next challenge to test
		printDayOfTheWeek(0);
		printDayOfTheWeek(3);
		printDayOfTheWeek(4);
		printDayOfTheWeek(5);
		printDayOfTheWeek(72);
	}

	// Extra challenge!
	// Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day
	// The method should not return any value
	// Using a switch statement, print "Sunday", "Monday", etc., if the int parameter "day"is 0, 1, etc., otherwise print "Invalid day"

	public static void printDayOfTheWeek(int day) {

		switch (day) {
			case 0 -> System.out.println("Sunday");
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			default -> System.out.println("Invalid day");
		}
	}
}
