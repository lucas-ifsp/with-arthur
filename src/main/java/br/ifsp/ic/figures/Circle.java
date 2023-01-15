package br.ifsp.ic.figures;

public class Circle extends Figure {

    private final double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * (2 * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle (%d, %d) with radius %.2f. Area = %.2f", getX(), getY(), radius, area());
    }
}
