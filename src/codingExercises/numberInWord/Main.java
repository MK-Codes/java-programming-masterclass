package codingExercises.numberInWord;

public class Main {

    /*
    Write a method called printNumberInWord. The method has one parameter number which is the whole number.
    The method needs to print "ZERO", "ONE", ..., "NINE", "OTHER", etc., if the parameter is valid (including negative
    values). Either an if-else or a switch statement is acceptable.
     */

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            printNumberInWord(i);
        }
    }

    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}