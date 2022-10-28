package org.example.Figures;

import org.example.Figure;

public class Triangle extends Figure {
    private final double legA;
    private final double legB;
    private final double area;

    public Triangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.legA = firstLeg;
        this.legB = secondLeg;
        this.area = firstLeg * secondLeg / 2;
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Figure: Triangle | Area: " + area
                        + " | First leg: " + legA
                        + " | Second leg: " + legB
                        + " | Color: " + color);
    }
}
