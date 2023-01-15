package br.ifsp.ic.figures;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //It is better to declare variables with interface types,
        //so you can change which implementation you want to use.
        //List<Figure> will work no matter it is an ArrayList or
        //an LinkedList.
        List<Figure> figures = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            figures.add(new Circle(i, i, i));
            figures.add(new Rectangle(i, i, i, i));
            figures.add(new Triangle(i, i, i, i, i));
        }

        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.area();
            System.out.println(figure);
        }
        System.out.println("Sum of figure areas: " + totalArea);
    }
}
