package br.ifsp.ic.list;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Type a number: ");

        final var scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        while (number != 1) {
            number = (number % 2 == 0) ? number / 2 : number * 3 + 1;
            var possibleComma = number != 1 ? ", " : "";
            System.out.print(number + possibleComma);
        }
    }
}
