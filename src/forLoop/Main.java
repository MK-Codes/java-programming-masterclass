package forLoop;

public class Main {

	public static void main(String[] args) {
		// without a for loop - tedious, mountains of code
		System.out.println("10,000 at 2% interest = " + calculateInterest(10_000.0, 2.0));
		System.out.println("10,000 at 3% interest = " + calculateInterest(10_000.0, 3.0));
		System.out.println("10,000 at 4% interest = " + calculateInterest(10_000.0, 4.0));
		System.out.println("10,000 at 5% interest = " + calculateInterest(10_000.0, 5.0));

		// using a for loop
		// Structure:
		/*
		for (init; limit; increment) {
			do task
		}
		init = a value, often initialised here, used to count a no. of iterations
		limit = when said value breaks this limit - strictly, when this statement becomes false - end the loop
		increment = modifier to apply to init each round

		 */
		for (int i = 0; i <= 5; i++) {
			System.out.println("Loop iterations = " + i);
		}

		// Challenge task:

		// Using a for statement, call the calculateInterest method with the amount of 10_000 with an interestRate of
		// 2, 3, 4, 5, 6, 7, and 8 and print the results to the console window.

		for (int i = 2; i <= 8; i++) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(
					10_000, i)));
			// The String.format() takes in two parameters - a formatter, and a value - and ensures the value matches
			// the given format. In this case, we're ensuring the returned output is returned to two decimal places
		}

		// Challenge task:

		// Modify the statement above to work back from 8% down to 2%
		for (int i = 8; i >= 2; i--) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(
					10_000, i)));
		}

		// Challenge task:

		// Create a for statement using any range of numbers
		// Determine if the number is a prime using the isPrime method
		// If it's prime, print it out and increment a count of the number of primes found
		// If three prime numbers have been found, exit the loop
		// (Hint: the break keyword)

		int totalPrimes = 0;

		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println("Prime found: " + i);
				totalPrimes++;
				if (totalPrimes == 3) {
					break;
				}
			}
		}
		System.out.println("Total primes found: " + totalPrimes);
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate/100));
	}

	public static boolean isPrime(int n) {

		if (n == 1) {
			return false;
		}

		// This is a nice optimisation - you can use n/2 instead of Math.sqrt, but this involves less looping and
		// therefore less processing power. (Less loops!)
		for (int i=2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
