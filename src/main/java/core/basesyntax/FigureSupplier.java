package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 50;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                return new Square(random.nextInt(MAX_VALUE) + 1, color);
            case 1:
                return new Rectangle(random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1, color);
            case 2:
                return new RightTriangle(random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1, color);
            case 3:
                return new Circle(random.nextInt(MAX_VALUE) + 1, color);
            default:
                return new IsoscelesTrapezoid(
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
