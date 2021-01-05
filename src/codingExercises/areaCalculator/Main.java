package codingExercises.areaCalculator;

public class Main {

    public static void main(String[] args) {

    }

    /*
    Write a method names area with one double parameter named radius.
    The method needs to return a double value representing the area of a circle.
    If the parameter radius is negative, return -1.0.

    Write another overloaded method with 2 parameters, x and y (both doubles), representing two sides of a rectangle.
    The method needs to return the area of a rectangle.
    If either parameter is negative, return -1.0.
     */
    public static double area(double radius) {
        return radius < 0 ? -1.0 : (radius * radius * Math.PI);
    }

    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1.0 : x*y;
    }
}
