package byteShortIntLong;

public class Main {

	public static void main(String[] args) {

		int myValue = 10_000; 
		System.out.println(myValue);
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer min val: " + myMinIntValue);
		System.out.println("Integer max val: " + myMaxIntValue);
		System.out.println("Busted min val (underflow): " + (myMinIntValue - 1));
		System.out.println("Busted max val: (overflow)" + (myMaxIntValue + 1));
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte min val: " + myMinByteValue);
		System.out.println("Byte max val: " + myMaxByteValue);

		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short min val: " + myMinShortValue);
		System.out.println("Short max val: " + myMaxShortValue);

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long min val: " + myMinLongValue);
		System.out.println("Long max val: " + myMaxLongValue);
		
		int myTotal = (myMinIntValue / 2);
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		System.out.println("Min int divided by two: " + myTotal);
		System.out.println("Min byte divided by two: " + myNewByteValue);
		
		short myNewShortValue = (short) (myMinShortValue / 2);
		
		System.out.println("Min short divided by 2: " + myNewShortValue);
		
		// Challenge - creaate byte, short, int - then create long that is 50,000 plus 10 times the rest
		
		byte myByte = 23;
		short myShort = 1337;
		int myInt = 80081;
		
		long myFinalLong = 50_000L + (10 * (myByte + myShort + myInt));
		System.out.println("Value of myLong: " + myFinalLong);
	}

}
