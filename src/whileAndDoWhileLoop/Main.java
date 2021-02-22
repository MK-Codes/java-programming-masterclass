package whileAndDoWhileLoop;

public class Main {

	public static void main(String[] args) {

		// Looping through a count in a for loop

		for (int i = 1; i < 7; i++) {
			System.out.println("Count value is " + i);
		}

		// Looping through a count in a while loop
		int count = 0;
		while (count != 6) {
			System.out.println("Count value is " + count);
			// Variable is incrementing manually in here
			count++;
		}

		// Another option
		count = 0;
		while (true) {
			if (count == 6) {
				break;
			}
			System.out.println("Count value is " + count);
			count++;
		}

		// Do while loop - always executes at least once!
		count = 0;
		do {
			System.out.println("Count value = " + count);
			count++;
		} while (count != 6);
		// Be wary of while loops - if the incrementer doesn't increase and no conditional states change,
		// it can result in an infinite loop.

		// Challenge

		// Create a methjod called isEvenNumber that takes a parameter of type int
		// Its purpose is to deteermine if the argument passed to the method is an even number or not.
		// Return true if even, false if not.

		int number = 4;
		int finishNumber = 20;
		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				// continue tells the loop to stop the current iteration, and start again.
				// (whereas break will stop the loop entirely and not return)
				continue;
			}
			System.out.println("Even number: " + number);
		}

		// Challenge

		// Modify the while code above (I'll make a copy.)
		// Make it also record the total number of even numbers it's found
		// and break when 5 have been found.
		// At the end, display the total number of even numbers found.
		number = 4;
		finishNumber = 20;
		int totalEvens = 0;
		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				// continue tells the loop to stop the current iteration, and start again.
				// (whereas break will stop the loop entirely and not return)
				continue;
			}
			totalEvens++;
			System.out.println("Even number: " + number);
			if (totalEvens >=5) {
				break;
			}
		}
		System.out.println("Total number of evens: " + totalEvens);
	}

	public static boolean isEvenNumber(int input) {

		return input % 2 == 0;
	}
}
