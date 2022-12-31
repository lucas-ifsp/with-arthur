import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Type a number: ");

        final var scanner = new Scanner(System.in); //yes, Java has type inference for local variables
        int number = scanner.nextInt();
        scanner.close();

        while (number != 1) {
            if (number % 2 == 0){
                number = number / 2;
                System.out.println(number);
            } else {
                number = number * 3 + 1;
                System.out.println(number);
            }
        }
    }
}
