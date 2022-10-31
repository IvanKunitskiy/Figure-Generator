package org.example.Figures;

import org.example.Figure;

public class Triangle extends Figure {
    private final double base;
    private final double height;
    private final double area;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
        this.area = base * height / 2;
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Figure: Triangle | Area: " + area
                        + " | Base: " + base
                        + " | Height: " + height
                        + " | Color: " + color);
    }
}
