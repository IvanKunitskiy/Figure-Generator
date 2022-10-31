package org.example.Figures;

import org.example.Figure;

public class RightTriangle extends Figure {
    private final double legA;
    private final double legB;
    private final double area;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.legA = firstLeg;
        this.legB = secondLeg;
        this.area = firstLeg * secondLeg / 2;
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Figure: Right Triangle | Area: " + area
                        + " | Leg a: " + legA
                        + " | Leg b: " + legB
                        + " | Color: " + color);
    }
}
