package br.ifsp.ic.figures;

public class Triangle extends Figure {

    private final double l1;
    private final double l2;
    private final double l3;

    public Triangle(int x, int y, double l1, double l2, double l3) {
        super(x, y);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double area(){
        //https://pt.wikipedia.org/wiki/Teorema_de_Herão
        double p = (l1 + l2 + l3)/2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }
}
