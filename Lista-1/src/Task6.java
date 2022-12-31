import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vectorA = new int[5];
        int[] vectorB = new int[5];
        int[] vectorC = new int[5];

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
            vectorC[i] = vectorA[i] + vectorB[i]; // This code is prone to over and under flow. Can you notice?
            // We will fix it in the next commit!
        }
        System.out.println(Arrays.toString(vectorC));
    }
}
