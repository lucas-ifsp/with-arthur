package br.ifsp.ic.ClassFourImplementationExercise;

public class Triangle extends Figure {

    private double l1;
    private double l2;
    private double l3;

    public Triangle(int x, int y, double l1, double l2, double l3) {
        super(x, y);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double area(){
        return Math.pow(l1, 2) * Math.sqrt(3) / 4;
    }
}
