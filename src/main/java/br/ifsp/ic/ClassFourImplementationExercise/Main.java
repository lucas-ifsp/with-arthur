package br.ifsp.ic.ClassFourImplementationExercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            Figure circle = new Circle(i, i, i);
            figures.add(circle);
            Figure rectangle = new Rectangle(i, i, i, i);
            figures.add(rectangle);
            Figure triangle = new Triangle(i, i, i, i, i);
            figures.add(triangle);
        }

        for (Figure figure : figures) {
            System.out.println(figure.area());
        }
    }
}
