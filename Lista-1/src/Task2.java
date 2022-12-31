import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Recursive method
        class Factorial {
            public static int factorial(int number) {
                if (number == 1) {
                    return 1;
                }
                if (number == 0) {
                    return 0;
                }
                return number * factorial(number - 1);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a Number:");
        int factorialNumber = scanner.nextInt();
        int resultFactorialMethod = Factorial.factorial(factorialNumber);
        System.out.println("Result of Factorial (recursive method): " + resultFactorialMethod);


        //Iterative method
        int factorialResult = factorialNumber;
        scanner.close();
        for (int i = 1; i < factorialNumber; factorialNumber--) {
            factorialResult *= factorialNumber - 1;
        }
        System.out.println("Result of Factorial (iterative method): " + factorialResult);
    }
}
