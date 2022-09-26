package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius;
    }

    @Override
    public void pritnInfo() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: " + radius + "units, color: " + getColor());
    }
}
