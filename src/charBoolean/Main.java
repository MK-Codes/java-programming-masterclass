package charBoolean;

public class Main {

	public static void main(String[] args) {

		char charOne = 'ᚠ'; // single character, letter, number, symbol, etc.
		char charTwo = '\u16A2'; // Unicode referencing
		char charThree = 0x16A3; // Referencing hex Unicode directly
		
		System.out.println(charOne);
		System.out.println(charTwo);
		System.out.println(charThree);
		
		char copyrightChar = '\u00A9';
		System.out.println(copyrightChar);
		
		boolean myTrueBoolean = true;
		boolean myFalseBoolean = false;
		
		System.out.println(myTrueBoolean);
		System.out.println(myFalseBoolean);
		
		System.out.println(charTwo + charThree); // returns 11589 - int val!
	}

}
