package br.ifsp.ic.figures;

public abstract class Figure {

    private final int x;
    private final int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
