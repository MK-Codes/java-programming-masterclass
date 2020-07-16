package ifKeywordAndCodeBlocks;

public class Main {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 5_000;
		int levelCompleted = 5;
		int bonus = 100;

		if (score < 5_000) {
			System.out.println("Your score was less than 5,000.");
		} else if (score < 10_000) {
			System.out.println("Your score was less than 10,000.");
		} else { 
			System.out.println("Your score was 10,000 or more.");
		}

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
		score = 10_000;
		levelCompleted = 8;
		bonus = 200;
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Challenge score was " + finalScore);
		}
	}

}
