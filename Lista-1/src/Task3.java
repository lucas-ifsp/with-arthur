import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Type a Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 1) {
            if (number % 2 == 0){
                number = number/2;
                System.out.println(number);
            } else {
                number = number*3 +1;
                System.out.println(number);
            }
        }
    }
}
