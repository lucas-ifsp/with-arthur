import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        // notice that we don't need a global counting variable (we can simply use 'for' scoped variable "i")
        //int totalNumbers = 0;
        int smallerNumber = 1000000000;
        int higherNumber = 0;
        int[] integers = new int[5];

        //prompt
/*        do {
            System.out.println("Write a Integer Number:");
            int typedInteger = scanner.nextInt();
            integers[totalNumbers] = typedInteger;
            totalNumbers++;
        } while (totalNumbers < 5);*/


        for (int i = 0; i < integers.length; i++) {
            System.out.print("Write an int number: "); // print keeps the cursor at line end instead of creating a new one.
            integers[i] = scanner.nextInt();
        }
        scanner.close();

        //Finding numbers
        for (int integer : integers) {
            if (integer > higherNumber) {
                higherNumber = integer;
            } else if (integer < smallerNumber) {
                smallerNumber = integer;
            }
        }

        //Printing results
        System.out.println("Higher Number: " + higherNumber);
        System.out.println("Smaller Number: " + smallerNumber);
    }
}
