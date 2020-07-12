package conditionalLogic;

public class Main {

	public static void main(String[] args) {

		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("It is not an alien.");
		}
		
		int topScore = 100;
		
		if (topScore >= 100) {
			System.out.println("You got the high score.");
		}
		int secondTopScore = 60;
		
		if (topScore > secondTopScore && topScore < 100) {
			System.out.println("Greater than second top score, less than 100");
		}
	}

}
