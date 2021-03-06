package codingExercises.numberOfDaysInMonth;

public class Main {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1,1992));
        System.out.println(getDaysInMonth(4,2019));
        System.out.println(getDaysInMonth(2,2000));
        System.out.println(getDaysInMonth(2,2001));
        System.out.println(getDaysInMonth(2,2004));
        System.out.println(getDaysInMonth(2,1900));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
// only reached when month == 2
            default -> (isLeapYear(year)) ? 29 : 28;
        };
    }
}
