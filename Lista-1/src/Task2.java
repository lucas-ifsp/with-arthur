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
}

