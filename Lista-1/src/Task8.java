import java.util.HashMap;

public class Task8 {

    public static final int NUMBER_OF_THROWS = 100_000;

    public static void main(String[] args) {
        final var statistics = new HashMap<Integer, Integer>();

        for (var i = 0; i < NUMBER_OF_THROWS; i++) {
            int sumOfDices = throwDice() + throwDice();
            statistics.merge(sumOfDices, 1, Integer::sum);
        }

        for (var key : statistics.keySet()){
            double percentage = (double) statistics.get(key) / NUMBER_OF_THROWS * 100;
            System.out.printf("Percentage of sum %d: %.2f%% (%d cases)\n", key, percentage, statistics.get(key));
        }
    }

    public static int throwDice(){
        return (int) (1 + (Math.random() * 6));
    }
}
