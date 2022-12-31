import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double[] temperatures = new double[7];
        double average = 0;
        int temperaturesHigherThanAverage = 0;

        final var scanner = new Scanner(System.in);
        for(int i = 0; i < 7; i++){
            System.out.print("Digite a temperatura do dia " + (i + 1) +": ");
            temperatures[i] = scanner.nextDouble();
            // notice that the variable 'average' is lying here. This is the current sum, not the average.
            // we will fix it in the next commit.
            average += temperatures[i];
        }
        scanner.close();

        average /= 7;
        for (double temperature : temperatures){
            if (temperature > average){
                temperaturesHigherThanAverage++;
            }
        }
        System.out.println(temperaturesHigherThanAverage);
    }
}
