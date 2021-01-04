package codingExercises.equalSumChecker;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    /*
    Write a method hasEqualSum with three parameters of type int.
    The method should return boolean and it needs to return true if the sum of the first two parameters is equal to the
    third parameter. Else, false.
     */
    public static boolean hasEqualSum(int valA, int valB, int valC) {
        return valA + valB == valC;
    }
}
