import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstVetor = new int[5];
        int[] secondVetor = new int[5];
        int[] thirdVetor = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Type a number for the first Vetor: ");
            firstVetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Type a number for the second Vetor: ");
            secondVetor[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < 5; i++) {
            thirdVetor[i] = firstVetor[i] + secondVetor[i];
        }
            System.out.println(Arrays.toString(thirdVetor));
    }
}
