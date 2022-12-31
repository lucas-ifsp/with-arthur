import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        class Fibonacci {

            //Recursive method
            public static int fibonacci(int number) {
                if (number == 0 || number == 1)
                    return number;
                return fibonacci(number - 1) + fibonacci(number - 2);
            }

            //Iterative method
            public static int fibonacciInterative(int number) {
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
        System.out.println("Type a number: ");
        Scanner scanner = new Scanner(System.in);
        int fibonacciNumber = scanner.nextInt();
        scanner.close();

        //Recursive method
        for (int i = 0; i < fibonacciNumber; i++) {
            System.out.println("Result (Recursive): " + Fibonacci.fibonacci(i));
        }

        System.out.println();

        //Iterative method
        for (int j = 0; j < fibonacciNumber; j++) {
            System.out.println("Result (Iterative): " + Fibonacci.fibonacciInterative(j));
        }
    }
}
