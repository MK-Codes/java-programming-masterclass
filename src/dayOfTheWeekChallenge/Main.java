package dayOfTheWeekChallenge;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        System.out.println("Days of week: switch statement followed by a failure");
        for (int i=0; i <= 7; i++) {
            printDayOfTheWeek(i);
        }
        System.out.println("Days of week: if-else statement followed by a failure");
        for (int i=0; i <= 7; i++) {
            printDayOfTheWeekIfElse(i);
        }

    }

    /*
    Challenge
    Using a switch statement, print "Sunday", "Monday", etc. if the int parameter "day" is 0-6.
    Otherwise, print "Invalid day"
     */
    public static void printDayOfTheWeek(int day) {

        String dayName;
        switch (day) {

            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = null;
        }
        System.out.println(Objects.requireNonNullElse(dayName, "Invalid day"));

    }

    /*
    Bonus challenge
    As above, but use if-else instead of switch
     */

    public static void printDayOfTheWeekIfElse(int day) {

        String dayName;
        if (day == 0) {
            dayName = "Sunday";
        } else if (day == 1) {
            dayName = "Monday";
        } else if (day == 2) {
            dayName = "Tuesday";
        } else if (day == 3) {
            dayName = "Wednesday";
        } else if (day == 4) {
            dayName = "Thursday";
        } else if (day == 5) {
            dayName = "Friday";
        } else if (day == 6) {
            dayName = "Saturday";
        } else {
            dayName = null;
        }

        System.out.println(Objects.requireNonNullElse(dayName, "Invalid day"));
    }
}
