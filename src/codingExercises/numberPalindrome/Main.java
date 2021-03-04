package codingExercises.numberPalindrome;

public class Main {

	/*
	Write a method called isPalindrome with one int parameter called number.
	The method needs to return a boolean.
	It should return true if the number is a palindrome, false if not.

	Ex.:
		isPalindrome(-1221) should return true
		isPalindrome(707) should return true
		isPalindrome(183) should return false
	 */

	public static void main(String[] args) {

		System.out.println(isPalindrome(11));
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(183));
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(5_222_482));

	}

	public static boolean isPalindrome(int value) {

		int reversedValue = 0;
		int initVal = value;
		while (value != 0) {
			reversedValue += value % 10;
			value /= 10;
			if (value != 0) {
				reversedValue *= 10;
			}
		}
		return reversedValue == initVal;
	}
}
