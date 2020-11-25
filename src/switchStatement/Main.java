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
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			case 3: case 4: case 5:
				System.out.println("Value was 3, 4, or 5");
				break;
			default:
				System.out.println("Value was not 1-5");	
		}

		// Create a new switch statement using char instead of int
		// Create a new char variable
		// Create a siwtch statement testing for A-E
		// Display a message if any are found
		// Add a default displaying message "not found"

		char character = 'A';
		
		switch (character) {
		case 'A': case 'B': case 'C': case 'D': case 'E':
			System.out.println("Got one!");
			break;
		default:
			System.out.println("Not found");
		}

		// We can now do switches on String. Cool.
		
		String month = "January";
		
		// We can use .toLowerCase() to match easier
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "february":
			System.out.println("Feb");
			break;
		case "march": case "april": case "may":
			System.out.println("One of the other first few");
			break;
		default:
				System.out.println("Nah not up to May");
		}
	}
}
