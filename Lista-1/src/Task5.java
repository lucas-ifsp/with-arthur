import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperatures = new double[7];
        double average = 0;
        int temperaturesHigherThanAverage = 0;

        for(int i = 1; i <= 7; i++){
            System.out.println("Qual a temperatura do dia "+i+"? ");
            temperatures[i-1] = scanner.nextDouble();
            average += temperatures[i-1];
        }
        average /= 7;
        for (double temperature : temperatures){
            if (temperature > average){
                temperaturesHigherThanAverage++;
            }
        }
        System.out.println(temperaturesHigherThanAverage);
    }
}
