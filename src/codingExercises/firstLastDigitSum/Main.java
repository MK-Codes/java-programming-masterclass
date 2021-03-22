package codingExercises.firstLastDigitSum;

public class Main {

	/*
	First and Last Digit Sum

	Write a method named sumFirstAndLastDigit with one int param called number
	The method needs to find the first and last digit of the paramet number
		using a loop, and return the sum of those two values.
	If the number is negative, the method should return -1.
	 */
	public static void main(String[] args) {

		System.out.println(sumFirstAndLastDigit(12393));
	}

	public static int sumFirstAndLastDigit(int number) {

		if (number < 0) {
			return -1;
		}

		int response = 0;
		boolean isFirst = true;
		while (number != 0) {
			if (isFirst) {
				response += number % 10;
				isFirst = false;
			}
			if (number / 10 == 0) {
				response += number;
			}
			number = number / 10;
		}
		return response;
	}
}
