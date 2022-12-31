import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vectorA = new int[5];
        int[] vectorB = new int[5];
        long[] vectorC = new long[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Type a number for the first vector: ");
            vectorA[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Type a number for the second vector: ");
            vectorB[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < 5; i++) {
            //if we sum two very big ints, the result can be bigger than an int variable can hold.
            //solution 1: use long to store the result of summing two ints
            //solution 2: check if the sum is bigger and, in this case, throw a runtime exception.
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        System.out.println(Arrays.toString(vectorC));
    }
}
