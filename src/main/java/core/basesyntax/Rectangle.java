package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int legC, int legD, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width
                + ", height: " + height
                + ", color: " + getColor());
    }
}
