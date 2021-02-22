package sumThreeAndFiveChallenge;

public class Main {

	/*
	Sum Three and Five challenge

	Create a statement using a range of numbers from 1 to 1,000 inclusive
	Sum all the numbers that can be divided with both 3 and 5
	For numbers that meet the conditions, print out the number
	Break out of the loop once five numbers meet the condition
	After breaking out of the loop, print the sum of the numbers that met the criteria
	Type all code in the main method
	 */

	public static void main(String[] args) {

		int totalSum = 0;
		int totalCounter = 0;

		for (int i = 1; i <= 1_000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				totalSum += i;
				totalCounter += 1;
				System.out.println(i);
			}
			if (totalCounter == 5) {
				break;
			}
		}
		System.out.println("Total: " + totalSum);
	}

}
