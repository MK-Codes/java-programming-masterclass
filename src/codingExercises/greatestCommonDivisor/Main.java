package codingExercises.greatestCommonDivisor;

public class Main {

	/*
	Greatest Common Divisor Exercise

	Write a method named getGreatestCommonDicisor with two int parameters named first and second.
	If one of the parameters is <10, return -1.
	The method should return the greatest common divisor of the two numbers.
	The greatest common divisor is the largest positive integer that can fully divide each of the integers
		(without leaving a remainder).

	For example, 12 and 30:
	12 can be divided by 1, 2, 3, 4, 6, and 12
	30 can be divided by 1, 2, 3, 5, 6, 10, 15, and 30
	The greatest common divisor is 6.
	 */

	public static void main(String[] args) {

		System.out.println(getGreatestCommonDivisor(10,45));
		System.out.println(getGreatestCommonDivisor(9,45));
		System.out.println(getGreatestCommonDivisor(200,45));
		System.out.println(getGreatestCommonDivisor(23,183));
		System.out.println(getGreatestCommonDivisor(40,990));

	}


	public static int getGreatestCommonDivisor(int first, int second) {

		if (first < 10 || second < 10) {
			return -1;
		}

		int divisor = 1;
		int minimum = Math.min(first, second);

		while (minimum > 1) {
			if ((first % minimum == 0) && (second % minimum == 0)) {
				divisor = minimum;
				break;
			} else {
				minimum -= 1;
			}
		}
		return divisor;
	}
}
