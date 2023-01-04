package ClassFourImplementationExercise;

public class Rectangle extends Figure {

    private double width;
    private double length;

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
