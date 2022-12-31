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
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                sumOfEvens += numbers[i];
            } else {
                sumOfOdds += numbers[i];
            }
        }
        System.out.println("Sum of pair numbers: " + sumOfEvens + "\t Sum of odd numbers: " + sumOfOdds);
    }
}
