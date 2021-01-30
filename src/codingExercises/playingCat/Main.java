package codingExercises.playingCat;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,50));
        System.out.println(isCatPlaying(true, 40));
        System.out.println(isCatPlaying(false,40));
        System.out.println(isCatPlaying(false, 30));
        System.out.println(isCatPlaying(true,20));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int minTemp = 25;
        int maxTemp = summer ? 45 : 35;
        return temperature >= minTemp && temperature <= maxTemp;
    }
}
