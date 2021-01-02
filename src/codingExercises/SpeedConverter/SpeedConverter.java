package codingExercises.SpeedConverter;

public class SpeedConverter {

	/*
	 * Example, Part 1: Speed Converter
	 * 
	 * Write a method called toMilesPerHour that has one parameter of type double with the name kilometersPerHour. The method needs to return the rounded value of the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value
	 * 
	 * Otherwise, if it is positive, calculate the value of miles per hour, round it, and return it.
	 */

	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		}
		return Math.round(kilometersPerHour / 1.609);
	}

	/*
	 * Example, Part 2: Print Conversion
	 * 
	 * Write another method called printCPonversion with 1 parameter of type double with the name kilometersPerHour. This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
	 * 
	 * Then it needs to print a message in the format "XX km/h = YY mi/h".
	 * 
	 * XX represents the original value kilometersPerHour.
	 * YY represents the rounded milesPerHour from the kilometersPerHour parameter.
	 * 
	 * If the parameter kilometersPerHour is less than 0, print the text "Invalid Value".
	 */

	public static void printConversion(double kilometersPerHour) {

		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
		}
	}
}
