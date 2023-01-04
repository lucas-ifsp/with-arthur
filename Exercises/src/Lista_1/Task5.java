package Lista_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        final double[] temperatures = new double[7];
        double sumOfTemperatures = 0;

        final var scanner = new Scanner(System.in);
        for(int i = 0; i < 7; i++){
            System.out.print("Digite a temperatura do dia " + (i + 1) +": ");
            temperatures[i] = scanner.nextDouble();
            sumOfTemperatures += temperatures[i];
        }
        scanner.close();

        final double averageTemperature = sumOfTemperatures / 7;
        int temperaturesHigherThanAverage = 0;

        for (double temperature : temperatures){
            if (temperature > averageTemperature) temperaturesHigherThanAverage++;
        }
        System.out.println(temperaturesHigherThanAverage);
    }
}
