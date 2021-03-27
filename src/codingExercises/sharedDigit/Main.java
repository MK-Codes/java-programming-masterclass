package codingExercises.sharedDigit;

public class Main {

	/*
	Shared Digit exercise

	Write a method named hasSharedDigit with two int parameters.
	Each number shouyld be 10-99 (inclusive). If one is not, return false.
	The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23.
	Otherwise, return false.
	 */

	public static void main(String[] args) {

		System.out.println(hasSharedDigit(12,13));
		System.out.println(hasSharedDigit(6,13));
		System.out.println(hasSharedDigit(15,99));
		System.out.println(hasSharedDigit(29,27));
		System.out.println(hasSharedDigit(92,34));

	}

	public static boolean hasSharedDigit(int valOne, int valTwo) {

		if (valOne >= 10 && valOne <= 99 && valTwo >= 10 && valTwo <= 99) {
			while (valOne != 0) {
				int toCheckOne = valOne % 10;
				int toCheckTwo = valTwo;
				while (toCheckTwo != 0) {
					if (toCheckOne == (toCheckTwo % 10)) {
						return true;
					}
					toCheckTwo /= 10;
				}
				valOne /= 10;
			}
		}
		return false;
	}
}
