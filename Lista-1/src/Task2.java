import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //avoid using inner classes (it is not a good practice in most cases)
        //class Factorial {
        //}

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a Number:");
        int factorialNumber = scanner.nextInt();
        int resultFactorialMethod = recursiveFactorial(factorialNumber);
        System.out.println("Result of Factorial (recursive method): " + resultFactorialMethod);


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

