package br.ifsp.ic.figures;

public class Rectangle extends Figure {

    private final double width;
    private final double length;

    public Rectangle(int x, int y, double width, double length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area(){
        return width * length;
    }
}
