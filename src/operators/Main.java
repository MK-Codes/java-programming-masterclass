package operators;

public class Main {

	public static void main(String[] args) {

		// + is operator
		// 1 & 2 are operands
		// (Comments are ignored by compiler; just for humans)
		int result = 1 + 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);
		int previousResult = result;
		System.out.println("previousResult = " + previousResult);
		result = result - 1; // 3 - 1 = 2
		System.out.println("3 - 1 = " + result);
		
		result = result * 10;
		System.out.println("2 * 10 = " + result);
		
		result = result / 5;
		System.out.println("20 / 5 = " + result);
		
		result = result % 3; // modulo (remainder)
		System.out.println("4 % 3 = " + result);
	}

}
