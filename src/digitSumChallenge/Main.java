package digitSumChallenge;

public class Main {

	/*
	Digit Sum Challenge

	Write a method with the name sumDigits that has one int parameter called number.
	If parameter is >= 10, the method should process the number and return sum of all digits, otherwise
		return -1 to indicate an invalid value.
	The numbers 0-9 have 1 digit, so we don't want to process them. Also, we don't want to process
		negative numbers, so return -1 for those.
	Example: sumDigits(125) should return 8, since 1 + 2 + 5 = 8.

	Add some code to the main method to test out the sumDigits method to determine that it is working
		correctly for valid and invalid values passed as arguments.

	Hint:
		Use n % 10 to extract the least significant digit.
		Use n = n / 10 to discard the least significant digit.
		The method needs to be static.
	 */
	public static void main(String[] args) {

		System.out.println(sumDigits(8));
		System.out.println(sumDigits(-255));
		System.out.println(sumDigits(12));
		System.out.println(sumDigits(193));
		System.out.println(sumDigits(233_234));
		System.out.println(sumDigits(5_000_234));
	}

	public static int sumDigits(int value) {

		if (value < 10) {
			return -1;
		}

		int response = 0;

		while (value != 0) {
			response += value % 10;
			value = value / 10;
		}
		return response;
	}
}
