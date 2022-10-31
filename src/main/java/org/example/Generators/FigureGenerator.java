package org.example.Generators;

import org.example.Figure;
import org.example.Figures.*;

import java.util.Random;

public class FigureGenerator {
    private static final short MAX_VALUE = 300;
    private static final byte MIN_VALUE = 10;
    private static final byte FIGURES_COUNT = 6;

    private final Random random = new Random();
    private final ColorGenerator colorSupplier = new ColorGenerator();

    public Figure getRandomFigure() {
        return switch (random.nextInt(1, FIGURES_COUNT)) {
            case 1 -> getCircle();
            case 2 -> getSquare();
            case 3 -> getTrapezoid();
            case 4 -> getTriangle();
            default -> getRightTriangle();
        };
    }

    public Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MIN_VALUE, MAX_VALUE));
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MIN_VALUE, MAX_VALUE));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MIN_VALUE, MAX_VALUE),
                random.nextInt(MIN_VALUE, MAX_VALUE));
    }

    public Trapezoid getTrapezoid() {
        return new Trapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MIN_VALUE, MAX_VALUE),
                random.nextInt(MIN_VALUE, MAX_VALUE),
                random.nextInt(MIN_VALUE, MAX_VALUE));
    }

    public Triangle getTriangle() {
        return new Triangle(colorSupplier.getRandomColor(),
                random.nextInt(MIN_VALUE, MAX_VALUE),
                random.nextInt(MIN_VALUE, MAX_VALUE));
    }
}
