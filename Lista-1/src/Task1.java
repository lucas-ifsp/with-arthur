import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        final int[] numbers = new int[5];
        final Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Write an int number: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int biggest = numbers[0];
        int smallest = numbers[0];

        for (int number : numbers) {
            if (number > biggest) biggest = number;
            if (number < smallest) smallest = number;
        }
        System.out.println("Biggest number: " + biggest);
        System.out.println("Smallest number: " + smallest);
    }
}
