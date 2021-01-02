package codingExercises.barkingDog;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 12));
        System.out.println(shouldWakeUp(false, 12));
        System.out.println(shouldWakeUp(true, 2));
        System.out.println(shouldWakeUp(true, 256));
    }

    /*
    Write a method shouldWakeUp that has two parameters.

    The first parameter should be a boolean named barking. This represents if our dog is currently barking.
    The second parameter should be an int named hourOfDay. This represents, er, the hour of the day.

    We have to wake up if the dog is barking before 8 or after 22 hours.
    In all other cases, return false.
     */

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return barking && hourOfDay < 8 || hourOfDay > 22;
    }
}
