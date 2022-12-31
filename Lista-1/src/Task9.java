import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite o dinheiro que Xozé possui: ");
        double money = scanner.nextDouble();

        System.out.print("Digite o preço do chocolate: ");
        double price = scanner.nextDouble();

        System.out.print("Digite embalagens para um chocolate grátis?: ");
        int freeGift = scanner.nextInt();

        if(freeGift <= 1) {
            System.out.println("Erro! O número de embalagens deve ser maior que um.");
            return; //returns from main. In other words, ends the program.
        }

        if (price > money){
            System.out.println("Xozé ta duro e n pode comprar nenhum chocolate");
        } else if (price == money) {
            System.out.println("Parabens, Xozé conseguiu comprar um chocolate");
        } else {
            int quantity = (int) Math.round(money / price);
            if (quantity >= freeGift){
                System.out.println("Xozé pode comprar: " + quantity + " Chocolates, e se devolver as embalagens " +
                        "conseguirá mais: " + Math.round(quantity/freeGift));
            }
        }
    }
}
