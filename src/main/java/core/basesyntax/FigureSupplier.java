package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class FigureSupplier {
    public static final int figure_count = 5;
    public static final int max_value = 50;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Circle getRandomCircle() {
        int radius = random.nextInt(max_value);
        Color color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(max_value);
        Color color = colorSupplier.getRandomColor();
        return new Square(side, color);
    }

    private RightTriangle getRandomRightTriangle() {
        int legA = random.nextInt(max_value);
        int legB = random.nextInt(max_value);
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(legA, legB, color);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int width = random.nextInt(max_value);
        int height = random.nextInt(max_value);
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(width, height, color);
    }

    private Rectangle getRandomRectangle() {
        int legC = random.nextInt(max_value);
        int legD = random.nextInt(max_value);
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(legC, legD, color);
    }

    public <Figure> Figure getRandomFigure() {
    }
}
