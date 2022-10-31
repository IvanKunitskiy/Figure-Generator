package org.example.Figures;

import org.example.Figure;

public class Square extends Figure {
    private final double side;
    private final double area;

    public Square(String color, double side) {
        super(color);
        this.side = side;
        this.area = side * side;
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Figure: Square | Area: " + area
                        + " | Side: " + side
                        + " | Color: " + color);
    }
}
