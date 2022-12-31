import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //avoid using inner classes (it is not a good practice in most cases)
        //class Factorial {
        //}

        System.out.println("Write a number:");

        final Scanner scanner = new Scanner(System.in);
        final int factorialNumber = scanner.nextInt();
        scanner.close();

        System.out.println("Result of Factorial (recursive method): " + recursiveFactorial(factorialNumber));
        System.out.println("Result of Factorial (iterative method): " + iterativeFactorial(factorialNumber));
    }

    //notice that good method name makes comments explaining chunks of code unnecessary
    public static int iterativeFactorial(int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
             result *= i;
        }
        return result;
    }

    public static int recursiveFactorial(int number) {
        if (number == 0 || number == 1) return 1;
        return number * recursiveFactorial(number - 1);
    }
}

