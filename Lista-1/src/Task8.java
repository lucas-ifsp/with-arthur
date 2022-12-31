import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {
        final var statistics = new HashMap<Integer, Integer>();

        //this chunk of code was not necessary in the previous commit (neither in this one)
        /*for (int i = 2; i <= 12; i++) {
            statistics.put(i, 0);
        }*/

        for (int i = 0; i < 100_000; i++) {
            int sumOfDices = throwDice() + throwDice();
            //take a look in Java functional programming to better understand :: and some additional stuff
            statistics.merge(sumOfDices, 1, Integer::sum);
        }

        for (Integer key : statistics.keySet()){
            double percentual = (double) statistics.get(key) / 1000;
            double realPercentual = Math.round(percentual * 100.0)/100.0;
            System.out.println("Percentual of sum " + key + ": " + realPercentual +"% (" + statistics.get(key) + " cases)");
        }
    }

    public static int throwDice(){
        return (int) (1 + (Math.random() * 6));
    }
}
