package floatAndDouble;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float min val: " + myMinFloatValue);
		System.out.println("Float max val: " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double min val: " + myMinDoubleValue);
		System.out.println("Double max val: " + myMaxDoubleValue);
		
		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f; // or cast with (float)
		double myDoubleValue = 5d / 3d;
		System.out.println("My int value: " + myIntValue);
		System.out.println("My float value: " + myFloatValue);
		System.out.println("My double value: " + myDoubleValue);

		// Challenge - convert a given number of points to kilograms

		double ratio = 0.45359237d;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many pounds to convert to kgs?");
		double poundValue = scanner.nextDouble();
		scanner.close();
		double noOfKilos = poundValue * ratio;

		System.out.println(poundValue + "lbs is equal to " + noOfKilos + "kgs.");
	}

}
