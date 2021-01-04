package codingExercises.decimalComparator;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1846, -3.184));
        System.out.println(areEqualByThreeDecimalPlaces(-3.184, -3.185));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

    }

    public static boolean areEqualByThreeDecimalPlaces(double valA, double valB) {

        int intA = (int) (valA * 1000);
        int intB = (int) (valB * 1000);
        return intA == intB;
    }
}
