package codingExercises.allFactors;

public class Main {

	/*
	All Factors exercise

	Write a method named printFactors with an int parameter called number.
	If number is <1, the method should print "Invalid Value".
	The method should print all factors of the number.
		Ex.: factors of 12 are 1, 2, 3, 4, 6, and 12.
	 */

	public static void main(String[] args) {


		printFactors(10);
		printFactors(12);
		printFactors(-12);
		printFactors(203);
	}

	public static void printFactors(int number) {

		if (number < 1) System.out.println("Invalid Value");

		int factorTest = 1;

		while (factorTest <= number) {
			if (number % factorTest == 0) {
				System.out.println(factorTest);
			}
			factorTest += 1;
		}
	}
}
