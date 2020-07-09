package floatAndDouble;

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
		
		int myIntValue = 5;
		float myFloatValue = 5.25f; // or cast with (float)
		double myDoubleValue = 5.75d;
	}

}
