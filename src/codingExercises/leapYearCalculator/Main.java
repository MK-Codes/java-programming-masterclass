package codingExercises.leapYearCalculator;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1992));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(0));
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(2020));
    }

    /*
    Leap Year Calculator

    Write a method isLeapYear with a parameter of type int named year.
    The parameter needs to be greater than or equal to 1, and less than or equal to 9999.
    If the parameter is not within that range, return false.

    Otherwise, if it is in the valid range, calculate if the year is a leap year. Return true if so, false if not.
     */

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
