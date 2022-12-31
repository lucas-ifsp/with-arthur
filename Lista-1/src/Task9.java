import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite o dinheiro que Xozé possui: ");
        double money = scanner.nextDouble();

        System.out.print("Digite o preço do chocolate: ");
        double price = scanner.nextDouble();

        System.out.print("Digite embalagens para um chocolate grátis: ");
        int wrappersPerChocolate = scanner.nextInt();

        if(wrappersPerChocolate <= 1) {
            System.out.println("Erro! O número de embalagens deve ser maior que um.");
            return;
        }

        //This solution is simples, but still have a bug. Can you find it?
        //How many free chocolates would Xoze get if he purchases 100 chocolates and the
        //promotion gives him a free chocolate of every 10 wrappers?
        int paidChocolates = (int) (money / price);
        int freeChocolates = paidChocolates / wrappersPerChocolate;

        System.out.printf("Xozé comprou %d chocolates e ganhou %d chocolates de graça.\n", paidChocolates, freeChocolates);

        /*if (price > money){
            System.out.println("Xozé ta duro e n pode comprar nenhum chocolate");
        } else if (price == money) {
            System.out.println("Parabens, Xozé conseguiu comprar um chocolate");
        } else {
            int quantity = (int) Math.round(money / price);
            if (quantity >= wrappersPerChocolate){
                System.out.println("Xozé pode comprar: " + quantity + " Chocolates, e se devolver as embalagens " +
                        "conseguirá mais: " + Math.round(quantity/wrappersPerChocolate));
            }
        }*/
    }
}
