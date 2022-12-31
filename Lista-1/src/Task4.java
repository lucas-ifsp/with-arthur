import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Type a number: ");

        final var scanner = new Scanner(System.in);
        final int fibonacciNumber = scanner.nextInt();
        scanner.close();

        //Recursive method
        for (int i = 0; i < fibonacciNumber; i++) {
            System.out.println("Result (Recursive): " + recursiveFibonacci(i));
        }

        System.out.println();

        //Iterative method
        for (int j = 0; j < fibonacciNumber; j++) {
            System.out.println("Result (Iterative): " + iterativeFibonacci(j));
        }
    }


    //Recursive method
    public static int recursiveFibonacci(int number) {
        if (number == 0 || number == 1) return number;
        return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
    }

    //Iterative method
    public static int iterativeFibonacci(int number) {
        int fibonacci = 0;
        int previousFibonacci = 0;

        for (int i = 1; i <= number; i++) {
            if (i == 1) {
                fibonacci = 1;
                previousFibonacci = 0;
            } else {
                fibonacci += previousFibonacci;
                previousFibonacci = fibonacci - previousFibonacci;
            }
        }
        return fibonacci;
    }
}
