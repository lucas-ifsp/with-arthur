import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        final var scanner = new Scanner(System.in);

        System.out.print("Type five numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int number : numbers) {
            if (number % 2 == 0) sumOfEvens += number;
            else sumOfOdds += number;
        }

        System.out.println("Sum of even numbers: " + sumOfEvens + "\t Sum of odd numbers: " + sumOfOdds);
    }
}
