package codingExercises.lastDigitChecker;

public class Main {

	/*
	Last Digit Checker challenge

	Write a method names hasSameLastDigit with three int parameters.
	Each number should be within the range of 10-1_000 inclusive. Return false otherwise.
	The method should return true if at least two of the numbers share the same rightmost digit.
	 */

	public static void main(String[] args) {

		System.out.println(hasSameLastDigit(126,23,291));
		System.out.println(hasSameLastDigit(20,990,452));
		System.out.println(hasSameLastDigit(201,22,992));
		System.out.println(hasSameLastDigit(1_000,20,239));
		System.out.println(hasSameLastDigit(1_000,21,239));
		System.out.println(hasSameLastDigit(1_001,298,232));
	}

	public static boolean hasSameLastDigit(int valOne, int valTwo, int valThree) {

		if (isValid(valOne) && isValid(valTwo) && isValid(valThree)) {
			int lastDigitOne = valOne % 10;
			int lastDigitTwo = valTwo % 10;
			int lastDigitThree = valThree % 10;
			return lastDigitOne == lastDigitTwo || lastDigitOne == lastDigitThree || lastDigitTwo == lastDigitThree;
		}
		return false;
	}

	public static boolean isValid(int value) {
		return value >= 10 && value <= 1_000;
	}
}
