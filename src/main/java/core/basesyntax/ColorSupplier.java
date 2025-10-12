package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "black", "white", "purple"};

    private Random random = new Random();

    public Color getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
