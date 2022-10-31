package org.example.Figures;

import org.example.Figure;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private final double radius;
    private final double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.area = Math.PI * (radius * radius);
    }

    @Override
    public void showInfo() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(
                "Figure: Circle | Area: " + df.format(area)
                        + " | Radius: " + radius
                        + " | Color: " + color);
    }
}
