package codingExercises.Part1;

public class Main {

	public static void main(String[] args) {

		long miles = SpeedConverter.toMilesPerHour(10.5);
		System.out.println("10.5km = " + miles + "m");

		SpeedConverter.printConversion(17.5);
	}

}
