import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int sumPairs = 0;
        int sumOdds = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Type a number for the Vetor: ");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                sumPairs += vetor[i];
            } else {
                sumOdds =+ vetor[i];
            }
        }
        System.out.println("Sum of pair numbers: " + sumPairs + "\t Sum of odd numbers: " + sumOdds);
    }
}
