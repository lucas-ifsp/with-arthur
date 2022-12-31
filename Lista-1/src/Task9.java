import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dinheiro que Xozé possui: ");
        double money = scanner.nextDouble();
        System.out.println("Digite o preço do Chocolate: ");
        double price = scanner.nextDouble();
        System.out.println("Quantas embalagens para um chocolate grátis?: ");
        int freeGift = scanner.nextInt();
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
