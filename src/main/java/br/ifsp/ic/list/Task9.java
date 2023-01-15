package br.ifsp.ic.list;

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

        int paidChocolates = (int) (money / price);
        int wrappers = paidChocolates;
        int freeChocolates = 0;

        while(wrappers/wrappersPerChocolate >= 1){
            freeChocolates += wrappers/wrappersPerChocolate;
            wrappers = wrappers - (freeChocolates * wrappersPerChocolate) + freeChocolates;
        }

        System.out.printf("Xozé comprou %d chocolates e ganhou %d chocolate(s) de graça.\n", paidChocolates, freeChocolates);
    }
}
