import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /**Esse é "difícil", está na lista de pegadinha. Dá para resolver com algoritmo guloso (greedy)
         * normal ou recursivo (o que não chega a uma solução ótima e caro computacionalmente) ou
         * com programação dinâmica (dynamic programming). Se você é masoquista, estude o problema
         * aqui https://en.wikipedia.org/wiki/Change-making_problem e
         * aqui:https://www.geeksforgeeks.org/coin-change-dp-7/
         */

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
