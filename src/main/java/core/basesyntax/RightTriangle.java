package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int legA, int legB, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg
                + ", color: " + getColor());
    }
}
