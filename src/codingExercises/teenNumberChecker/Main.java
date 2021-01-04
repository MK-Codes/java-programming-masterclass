package codingExercises.teenNumberChecker;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean hasTeen(int valA, int valB, int valC) {
        return isTeen(valA) || isTeen(valB) || isTeen(valC);
    }

    public static boolean isTeen(int check) {
        return check >= 13 && check <= 19;
    }
}
