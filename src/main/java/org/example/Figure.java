package org.example;

public abstract class Figure implements FigureInfo{
    protected String color;
    public Figure(String color) {
        this.color = color;
    }
}
