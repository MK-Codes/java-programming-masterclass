package codingExercises.numberToWords;

import java.util.stream.Collectors;

public class Main {

    // Number to Words exercise
    //
    // Write a method called numberToWords with one int parameter, "number".
    // The method should print out the passed number using words for the digits.
    // If the number is negative, print "Invalid Value".
    //
    // Steps:
    //     Extract the last digit of the give number using the remainder operator
    //     Convert the value of the digit found to a word. There are ten possible values (0-9)
    //     Remove the last digit from the number
    //     Repeat steps until the number is 0
    //
    // This will current print the numbers in reverse order - so, write a second method called reverse.
    // The method reverse should have one int parameter and return the reversed number. For example, 234 -> 432. This
    //     should also return negative numbers.
    //
    // Another thing to keep in mind is any reversed number with leading zeroes (100 -> 001).
    // Write a third method called getDigitCount with one int parameter called number and return the count of digits in
    //     that number. If the number is negative, return -1 to indicate invalid value.
    //
    // Hint: use a for loop to print zeroes after reversing the number.
    //
    // Each word can be on its own line. They don't have to be separated by a space.

    public static void main(String[] args) {

        numberToWords(2);
        numberToWords(302);
        numberToWords(30);
        numberToWords(-348);
        numberToWords(0);

    }

    public static void numberToWords(int number) {

        if (number < 0) System.out.println("Invalid Value");

        int numberOfDigits = getDigitCount(number);
        number = reverse(number);

        while (numberOfDigits > 0) {
            int digit = number % 10;
            switch (digit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            numberOfDigits--;
            number /= 10;
        }
    }

    public static int reverse(int number) {


        int reversed = 0;

        while (number != 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = number == 0 ? 1 : 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}
