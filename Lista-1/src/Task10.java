import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        // A LISTA É MODIFICAVEL, OBVIAMENTE;
        double[] moedas = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.1, 0.05, 0.01};
        Map<Double, Integer> coins = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que você deseja o troco");
        double money = scanner.nextDouble();
        int contOfCoins = 0;
        for (int i = 0; i < moedas.length; i++) {
            while ((money / moedas[i]) >= 1){
                if (coins.containsKey(moedas[i])){
                    coins.replace(moedas[i], coins.get(moedas[i]) + 1);
                } else {
                    coins.put(moedas[i], 1);
                }
                money -= moedas[i];
                contOfCoins++;
            }
        }

        System.out.println("Retorno de: "+ contOfCoins + " moedas" + "\t mais especificamente: " + coins);
        /*Estou com o problema do famoso 0.01 final não ser dividido, pq o java não salva o valor dele exato em
        binario pelo o que pesquisei, vi umas soluções mas da mt trampo, então vou deixar por assim mesmo
         */
    }
}
