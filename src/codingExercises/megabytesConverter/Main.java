package codingExercises.megabytesConverter;

public class Main {

    public static void main(String[] args) {

        printMegabytesAndKilobytes(1024);
        printMegabytesAndKilobytes(0);
        printMegabytesAndKilobytes(22000);
    }

    /*
    Write a method called printMegabytesAndkilobytes that has 1 parameter of type int with the name kilobytes.

    The method should not return anything and it needs to calculate the megabytes and remaining kilobytes from the
    kilobytes parameter.

    Then it needs to print a message in the format "xx KB = yy MB and zz KB".
     */
    public static void printMegabytesAndKilobytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else if (kilobytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        } else {
            int megaBytes = kilobytes/1024;
            int remainingkilobytes = (kilobytes - (megaBytes*1024));
            System.out.println(kilobytes + " KB = " + megaBytes + " MB and " + remainingkilobytes + " KB");
        }
    }
}
