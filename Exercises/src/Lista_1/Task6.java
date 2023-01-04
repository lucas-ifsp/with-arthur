package Lista_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var vectorA = new int[5];
        final var vectorB = new int[5];
        final var vectorC = new long[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Type a number for the first vector: ");
            vectorA[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Type a number for the second vector: ");
            vectorB[i] = scanner.nextInt();
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        scanner.close();
        System.out.println(Arrays.toString(vectorC));
    }
}
