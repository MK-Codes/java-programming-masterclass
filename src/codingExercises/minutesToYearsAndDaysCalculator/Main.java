package codingExercises.minutesToYearsAndDaysCalculator;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(1_920);
        printYearsAndDays(203_555_493);
        printYearsAndDays(12);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes == 0) {
            System.out.println("0 min = 0 y and 0 d");
        } else {
            int hours = (int) minutes / 60;
            int days = hours / 24;
            int years = days / 365;
            int daysTotal = (years != 0 ? days % (years * 365) : days);
            System.out.println(minutes + " min = " + years + " y and " + daysTotal + " d");
        }
    }
}
