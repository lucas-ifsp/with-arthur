import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {
        final var statistics = new HashMap<Integer, Integer>();
        for (int i = 2; i <= 12; i++) {
            statistics.put(i, 0);
        }

        for (int i = 0; i < 100_000; i++) {
            int firstDice = throwDice();
            int secondDice = throwDice();
            int sum = firstDice + secondDice;
            statistics.putIfAbsent(sum, 0); //initialize key if absent
            statistics.replace(sum, statistics.get(sum) + 1);
            //we can do even better with map.merge and method references. Wait for it! (next commit)
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
