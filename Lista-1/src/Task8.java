import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {

        ArrayList<Integer> results = new ArrayList<>();
        Map<Integer, Integer> statistics = new HashMap<>();
        for (int i = 2; i <= 12; i++) {
            statistics.put(i, 0);
        }



        for (int i = 0; i < 100000; i++) {
            int firstDice = throwDice();
            int secondDice = throwDice();
            int sum = firstDice + secondDice;
            results.add(sum);
        }

        for (int number : results){
            statistics.replace(number, statistics.get(number) + 1);
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
