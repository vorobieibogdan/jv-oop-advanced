package core.basesyntax;

public class Main {

    public static <Figure> void main(String[] args) {

        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].printInfo();
            }
            else {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].printInfo();
            }
        }
    }
}
