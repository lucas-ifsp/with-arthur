import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // >> only use comments for things that cannot be inferred directly by reading a good code. <<

        Scanner scanner = new Scanner(System.in);
        // notice that we don't need a global counting variable (we can simply use 'for' scoped variable "i")
        //int totalNumbers = 0;
        //int smallerNumber = 1000000000; // what would happen if the smallest number turned to be 1000000001?
        //int higherNumber = 0; // what would happen if the biggest number turned to be -1?

        int[] integers = new int[5];

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

        int biggestNumber = integers[0]; // the first is always the biggest when only the first is known
        int smallerNumber = integers[0]; // same idea

        for (int number : integers) {
            if (number > biggestNumber) biggestNumber = number;
            if (number < smallerNumber) smallerNumber = number;
        }
        System.out.println("Biggest number: " + biggestNumber);
        System.out.println("Smallest number: " + smallerNumber);
    }
}
