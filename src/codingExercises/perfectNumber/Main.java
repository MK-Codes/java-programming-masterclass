package codingExercises.perfectNumber;

public class Main {

    /*
    Perfect Number Exercise

    A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
    Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder
        and exclude the perfect number itself.
    For example, the number 6. Its proper divisors are 1, 2, and 3. 1 + 2 + 3 = 6, so this is a perfect number.

    Write a method named isPerfectNumber with one parameter of type int named number.
    If the number is < 1, return false.
    The method must calculate if the number is perfect. If it is, return true; otherwise, return false.
     */

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(4));
        System.out.println(isPerfectNumber(-2));
        System.out.println(isPerfectNumber(200));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(496));
    }

    public static boolean isPerfectNumber(int input) {

        if (input < 1) return false;
        int incr = 1;
        int totalOfDivisors = 0;
        while (incr < input) {
            if (input % incr == 0) {
                totalOfDivisors += incr;
            }
            incr++;
        }
        return totalOfDivisors == input;
    }
}
