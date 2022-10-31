package org.example.Figures;

import org.example.Figure;

public class Trapezoid extends Figure {
    private final double baseA;
    private final double baseB;
    private final double height;
    private final double area;

    public Trapezoid(String color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.area = ((baseA + baseB) / 2) * height;
    }

    public void showInfo() {
        System.out.println(
                "Figure: Trapezoid | Area: " + area
                + " | Base a: " + baseA
                + " | Base b: " + baseB
                + " | Height: " + height
                + " | Color: " + color);
    }
}
