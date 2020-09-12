package methodOverloading;

public class Main {

	public static void main(String[] args) {

		int newScore = calculateScore("MK", 9);
		System.out.println("New score is " + newScore + ".");
		int unnamedScore = calculateScore(12);
		System.out.println("Unnamed player score is " + unnamedScore + ".");
		calculateScore();

		calcFeetAndInchesToCentimeters(1, 4);
		calcFeetAndInchesToCentimeters(0, 12);
	}

	public static int calculateScore(String playerName, int score) {

		System.out.println("Player " + playerName + " scored " + score + " points.");
		return score * 1_000;
	}

	public static int calculateScore(int score) {

		System.out.println("Unnamed player scored " + score + " points.");
		return score * 1_000;
	}

	public static void calculateScore() {
		System.out.println("No name or score.");
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

		if ((feet < 0) || ((inches < 0) || (inches >= 12))) {
			System.out.println("Invalid parameters.");
			return -1;
		}

		double cm = calcFeetAndInchesToCentimeters((feet * 12) + inches);
		System.out.println(feet + " feet and " + inches + " inches is equal to " + cm + "cm.");
		return cm;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}
		return inches * 2.54;
	}
}
