package codingExercises;

public class Example {

	public static void main(String[] args) {

		/*
		 * Positive, Negative, or Zero
		 * Write a method called checkNumber with an int parameter number
		 * 
		 * The method should not return any value, and it needs to print out:
		 * 	"positive" if the number is > 0
		 * 	"negative" if the number is < 0
		 * "zero" if the parameter is equal to zero
		 * N.b.: the checkNumber method needs to be defined as public static
		 */

		int i = 0;
		checkNumber(i);
		i = 14;
		checkNumber(i);
		i = -40;
		checkNumber(i);
	}

	public static void checkNumber(int i) {

		if (i > 0) {
			System.out.println("positive");
		} else if (i < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
	}

}
