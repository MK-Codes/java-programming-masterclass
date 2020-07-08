package byteShortIntLong;

public class Main {

	public static void main(String[] args) {

		int myValue = 10_000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer min val: " + myMinIntValue);
		System.out.println("Integer max val: " + myMaxIntValue);
		System.out.println("Busted min val (underflow): " + (myMinIntValue - 1));
		System.out.println("Busted max val: (overflow)" + (myMaxIntValue + 1));
	}

}
