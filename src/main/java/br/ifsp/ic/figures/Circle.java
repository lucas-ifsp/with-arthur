package br.ifsp.ic.figures;

public class Circle extends Figure {

    private double raio;

    public Circle(int x, int y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI * (2 * raio);
    }

}
