package codingExercises.sumOdd;

public class Main {

	/*
	Sum Odd exercise

	Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
	Check that number is > 0, if not return false.
	If number is odd, return true; otherwise, return false.

	Write a second method called sumOdd that has 2 int parameters (start and end) which represent a range of numbers.
	The method should use a foor loop to sum all odd numbers in that range, including the end, and return the sum.
	It should call the method isOdd to check if each number is odd.
	The parameter end needs to be greater than or equal to start, and both parameters must be greater than 0.
	If these conditions are not satisfied, return -1 to indicate invalid input.
	 */

	public static void main(String[] args) {


	}

	public static boolean isOdd(int number) {

		return number % 2 == 1;
	}

	public static int sumOdd(int start, int end) {

		if (start > end || start < 1) {
			return -1;
		}

		int totalSum = 0;

		for(int i = start; i <= end; i++) {
			if (isOdd(i)) {
				totalSum += i;
			}
		}
		return totalSum;
	}
}
