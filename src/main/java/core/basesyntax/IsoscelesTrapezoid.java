package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(int width, int height, Color color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2.0 * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + base1
                + ", base2: " + base2
                + ", height: " + height
                + ", color: " + getColor());
    }
}
