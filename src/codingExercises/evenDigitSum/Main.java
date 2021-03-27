package codingExercises.evenDigitSum;

public class Main {

	/*
	Even Digit Sum exercise

	Write a method names getEvenDigitSum with one int parameter called number.
	The method should return the sum of the even digits within the number.
	If the number is negative, the method should return -1.
	 */

	public static void main(String[] args) {

		System.out.println(getEvenDigitSum(-14));
		System.out.println(getEvenDigitSum(294));
		System.out.println(getEvenDigitSum(292));
		System.out.println(getEvenDigitSum(20));
		System.out.println(getEvenDigitSum(23_407));
		System.out.println(getEvenDigitSum(6_248_282));

	}

	public static int getEvenDigitSum(int number) {

		if (number < 0) {
			return -1;
		}

		int response = 0;

		while (number != 0) {
			if ((number % 10) % 2 == 0) {
				response += number % 10;
			}
			number = number / 10;
		}
		return response;
	}
}
