package operatorChallenge;

public class Main {

	public static void main(String[] args) {

		double valueOne = 20.00d;
		double valueTwo = 80.00d;
		double totalVal = (valueOne + valueTwo) * 100.00d;
		double totalRemainderForty = totalVal % 40.00d;
		boolean isRemainderZero = (totalRemainderForty == 0) ? true: false;
		System.out.println(isRemainderZero);
		if (!isRemainderZero) {
			System.out.println("Got some remainder");
		}
	}

}
