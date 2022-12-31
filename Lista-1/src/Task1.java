import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        final int[] integers = new int[5];
        final Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < integers.length; i++) {
            System.out.print("Write an int number: ");
            integers[i] = scanner.nextInt();
        }
        scanner.close();

        int biggestNumber = integers[0];
        int smallerNumber = integers[0];

        for (int number : integers) {
            if (number > biggestNumber) biggestNumber = number;
            if (number < smallerNumber) smallerNumber = number;
        }
        System.out.println("Biggest number: " + biggestNumber);
        System.out.println("Smallest number: " + smallerNumber);
    }
}
