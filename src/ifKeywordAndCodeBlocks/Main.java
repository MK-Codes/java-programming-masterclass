package ifKeywordAndCodeBlocks;

public class Main {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

		System.out.println("Your final score was " + highScore);

		score = 1_000;
		levelCompleted = 8;
		bonus = 200;

		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		int position = calculateHighScorePosition(1_500);
		displayHighScorePosition("MK", position);

		position = calculateHighScorePosition(900);
		displayHighScorePosition("MK", position);

		position = calculateHighScorePosition(400);
		displayHighScorePosition("MK", position);

		position = calculateHighScorePosition(50);
		displayHighScorePosition("MK", position);
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
		}
		return -1;
	}

	public static void displayHighScorePosition(String playerName, int position) {

		System.out.println(playerName + " finished with a position of " + position
				+ " on the high score table.");
	}

	public static int calculateHighScorePosition(int highScore) {

		int highScorePosition = 4;

		if (highScore >= 1_000) {
			highScorePosition = 1;
		} else if (highScore >= 500) {
			highScorePosition = 2;
		} else if (highScore >= 100) {
			highScorePosition = 3;
		}
s
		return highScorePosition;
	}
}
