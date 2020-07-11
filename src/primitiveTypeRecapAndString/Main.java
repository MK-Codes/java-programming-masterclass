package primitiveTypeRecapAndString;

public class Main {

	public static void main(String[] args) {

		// Primitive types:
		// byte
		// short
		// int
		// long
		// float
		// double
		// char
		// boolean
		
		// String is not a primitive, but built-in
		String myString = "This is a string";
		System.out.println("myString: " + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString: " + myString);
		myString = myString + " \u00A9 2019";
		System.out.println("myString: " + myString);
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString); // Does not add numbers together, but concatenates Strings
		String lastString = "10";
		int myInt = 50;
		myInt = myInt + 16;
		lastString = lastString + myInt;
		System.out.println("lastString: " + lastString);
	}

}
