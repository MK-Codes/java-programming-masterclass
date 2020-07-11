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
		
		// result = result + 1 can be abbreviated
		result++; // 1 + 1 = 2
		System.out.println("1 + 1 = " + result);
		
		result--; // 2 - 1 = 1
		System.out.println("2 - 1 = " + result);
		
		result += 2;
		System.out.println("1 + 2 = " + result);
		
		result *= 10;
		System.out.println("3 * 10 = " + result);
		
		result /= 3;
		System.out.println("30 / 3 = " + result);
		
		result -= 2;
		System.out.println("10 - 2 = " + result);
	}

}
